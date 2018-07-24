package com.liudaxia.netty.stakepackage;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by liudaxia on 2018/7/24.
 */
public class SmartCarEncoder extends MessageToByteEncoder<SmartCarProtocol> {
    protected void encode(ChannelHandlerContext channelHandlerContext, SmartCarProtocol smartCarProtocol, ByteBuf byteBuf) throws Exception {
        byteBuf.writeInt(smartCarProtocol.getHead_data());
        byteBuf.writeInt(smartCarProtocol.getContentLength());
        byteBuf.writeBytes(smartCarProtocol.getContent());
    }

}
