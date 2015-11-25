/*
 * (C) 2007-2012 Alibaba Group Holding Limited.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 * Authors:
 *   leiwen <chrisredfield1985@126.com> , boyan <killme2008@gmail.com>
 */
package com.taobao.diamond.client;

import com.taobao.diamond.configinfo.ConfigureInfomation;

import java.util.concurrent.Executor;


/**
 * Diamond�����ߵ�������Ϣ������
 * 
 * @author aoqiong
 * 
 */
public interface SubscriberListener {

    public Executor getExecutor();


    /**
     * ���յ�һ��������Ϣ
     * 
     * @param configureInfomation
     */
    public void receiveConfigInfo(final ConfigureInfomation configureInfomation);
}
