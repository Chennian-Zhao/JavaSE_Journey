public class Singleton {
    // volatile保证，当uniqueInstance变量被初始化成Singleton实例时，
    // 多个线程可以正确处理uniqueInstance变量
    private volatile static Singleton uniqueInstance;

    // 私有的默认构造子，保证外界无法直接实例化
    private Singleton() {}

    // 提供全局访问点
    public static Singleton getInstance() {
        // 检查实例，如果不存在，就进入同步代码块
        if (uniqueInstance == null) {
            // 只有第一次才彻底执行这里的代码
            synchronized(Singleton.class) {
                // 进入同步代码块后，再检查一次，如果仍是null,才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    /*
    普通模式
    private volatile
     */
}