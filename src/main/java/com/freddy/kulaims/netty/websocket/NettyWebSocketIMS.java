package com.freddy.kulaims.netty.websocket;

import android.content.Context;

import com.freddy.kulaims.bean.IMSMsg;
import com.freddy.kulaims.config.IMSOptions;
import com.freddy.kulaims.interf.IMSInterface;
import com.freddy.kulaims.listener.IMSConnectStatusListener;
import com.freddy.kulaims.listener.IMSMsgReceivedListener;
import com.freddy.kulaims.listener.IMSMsgSentStatusListener;

/**
 * @author FreddyChen
 * @name Netty WebSocket IM Service
 * @date 2020/05/21 16:33
 * @email chenshichao@outlook.com
 * @github https://github.com/FreddyChen
 * @desc 基于Netty实现的WebSocket协议客户端
 */
public class NettyWebSocketIMS implements IMSInterface {

    private NettyWebSocketIMS() { }

    public static NettyWebSocketIMS getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder {
        private static final NettyWebSocketIMS INSTANCE = new NettyWebSocketIMS();
    }

    @Override
    public boolean init(Context context, IMSOptions options, IMSConnectStatusListener connectStatusListener, IMSMsgReceivedListener msgReceivedListener) {
        return true;
    }

    @Override
    public void connect() {
        this.reconnect(true);
    }

    @Override
    public void reconnect(boolean isFirstConnect) {

    }

    @Override
    public void sendMsg(IMSMsg msg) {

    }

    @Override
    public void sendMsg(IMSMsg msg, IMSMsgSentStatusListener listener) {

    }

    @Override
    public void sendMsg(IMSMsg msg, boolean isJoinResendManager) {

    }

    @Override
    public void sendMsg(IMSMsg msg, IMSMsgSentStatusListener listener, boolean isJoinResendManager) {

    }

    @Override
    public void release() {

    }
}
