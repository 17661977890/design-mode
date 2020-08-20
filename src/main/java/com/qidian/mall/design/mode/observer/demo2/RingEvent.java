package com.qidian.mall.design.mode.observer.demo2;

import java.util.EventObject;

/**
 * 事件对象
 * 用于封装事件源及一些与事件相关的参数
 * @Author binsun
 * @Date
 * @Description
 */
public class RingEvent extends EventObject {

    private static final long serialVersionUID=1L;
    //true表示上课铃声,false表示下课铃声
    private boolean sound;

    public RingEvent(Object source,boolean sound) {
        super(source);
        this.sound=sound;
    }
    public void setSound(boolean sound)
    {
        this.sound=sound;
    }
    public boolean getSound()
    {
        return this.sound;
    }
}
