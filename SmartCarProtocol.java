package com.liudaxia.netty.stakepackage;

import java.util.Arrays;

/**
 * Created by liudaxia on 2018/7/24.
 */
public class SmartCarProtocol {
    /**
     * 协议包含头，长度，data
     */
    private int head_data = ConstantValue.HEAD_DATA;
    private int contentLength ;
    private byte[] content;

    public SmartCarProtocol() {
    }

    public SmartCarProtocol(int contentLength, byte[] content) {
        this.contentLength = contentLength;
        this.content = content;
    }

    public SmartCarProtocol(int head_data, int contentLength, byte[] content) {
        this.head_data = head_data;
        this.contentLength = contentLength;
        this.content = content;
    }

    public int getHead_data() {
        return head_data;
    }

    public void setHead_data(int head_data) {
        this.head_data = head_data;
    }

    public int getContentLength() {
        return contentLength;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new String(getContent());
    }
}
