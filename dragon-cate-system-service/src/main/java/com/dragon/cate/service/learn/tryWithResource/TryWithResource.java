package com.dragon.cate.service.learn.tryWithResource;

/**
 *jdk7开始,基于ARM(Auto Resource Management)机制,try-with-resource语句可以对实现了AutoCloseable接口的资源进行自动释放,从而简化IO等资源文件的释放逻辑.
 注意点:
 1.如果try语句块正常,close语句异常,catch到的是close的异常
 2.如果try语句块异常,close正常,catch到的是try语句块的异常
 3.如果try语句块异常,close异常,catch到的是try块的异常,close的异常被忽略
 */
public class TryWithResource {

    public static void main(String[] args) {

        try(MyResource resource = new MyResource()){
            // try语句块正常,close异常,catch到close的异常
            System.out.println("try 语句块正常执行");

            // try语句块异常, close异常,catch到try的异常,close的异常被忽略
            throw new Exception("try块异常");
        } catch (Exception e) {
            System.out.println("捕获异常: " + e.getMessage());

            // 找到被忽略的异常
            Throwable[] ts = e.getSuppressed();
            for(Throwable t : ts) {
                System.out.println("被忽略的异常: "+ t.getMessage());
            }
        }
    }

}

class MyResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("执行close方法，释放资源");
        throw new Exception("close方法异常");
    }
}
