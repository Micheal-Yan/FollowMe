package com.winorout.interfaces;

/**
 *通知接收到消息的接口
 * @author  ryzhang
 * @data 2016/10/20 17:11
 */
public interface OnMessgaeChange {
    /**
     * 接收到的对象
     * @param messageEvent
     */
    void receiveMessage(String messageEvent);

}
