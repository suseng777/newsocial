package cn.flyaudio.flycodelibrary.server.download;

/**
 * ================================================
 * 作    者：彭冲
 * 描    述：Runnable对象的优先级封装
 * ================================================
 */
public class PriorityRunnable extends PriorityObject<Runnable> implements Runnable {

    public PriorityRunnable(int priority, Runnable obj) {
        super(priority, obj);
    }

    @Override
    public void run() {
        this.obj.run();
    }
}
