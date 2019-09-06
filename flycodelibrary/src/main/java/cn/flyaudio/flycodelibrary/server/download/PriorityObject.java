package cn.flyaudio.flycodelibrary.server.download;

/**
 * ================================================
 * 作    者：彭冲
 * 描    述：具有优先级对象的公共类
 * ================================================
 */
public class PriorityObject<E> {

    public final int priority;
    public final E obj;

    public PriorityObject(int priority, E obj) {
        this.priority = priority;
        this.obj = obj;
    }
}
