/*
 * (C) 2007-2012 Alibaba Group Holding Limited.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 * Authors:
 *   leiwen <chrisredfield1985@126.com> , boyan <killme2008@gmail.com>
 */
package com.taobao.diamond.manager;

import com.taobao.diamond.client.DiamondConfigure;

import java.util.List;
import java.util.Properties;


/**
 * DiamondManager���ڶ���һ���ҽ���һ��DataID��Ӧ��������Ϣ
 * 
 * @author aoqiong
 * 
 */
public interface DiamondManager {

    /**
     * ����ManagerListener��ÿ���յ�һ��DataID��Ӧ��������Ϣ����ͻ����õ�ManagerListener����յ����������Ϣ
     * 
     * @param managerListener
     */
    public void setManagerListener(ManagerListener managerListener);


    /**
     * ����DataID��Ӧ�Ķ��ManagerListener��ÿ���յ�һ��DataID��Ӧ��������Ϣ��
     * ��ͻ����õĶ��ManagerListener����յ����������Ϣ
     * 
     * @param managerListenerList
     */
    public void setManagerListeners(List<ManagerListener> managerListenerList);


    /**
     * ���ظ�DiamondManager���õ�listener�б�
     * 
     * @return
     */
    public List<ManagerListener> getManagerListeners();


    /**
     * ͬ����ȡ������Ϣ,,�˷������ȴ�${user.home
     * }/diamond/data/config-data/${group}/${dataId}�»�ȡ�����ļ������û�У����diamond
     * server��ȡ������Ϣ
     * 
     * @param timeout
     *            �������ȡ������Ϣ�ĳ�ʱ����λ����
     * @return
     */
    public String getConfigureInfomation(long timeout);


    /**
     * ͬ����ȡһ����Ч��������Ϣ������<strong>�����ļ�->diamond������->��һ����ȷ���õ�snapshot</strong>
     * ������˳���ȡ�� �����Щ;������Ч���򷵻�null
     * 
     * @param timeout
     *            �������ȡ������Ϣ�ĳ�ʱ����λ����
     * @return
     */
    public String getAvailableConfigureInfomation(long timeout);


    /**
     * ͬ����ȡһ����Ч��������Ϣ������<strong>��һ����ȷ���õ�snapshot->�����ļ�->diamond������</strong>
     * ������˳���ȡ�� �����Щ;������Ч���򷵻�null
     * 
     * @param timeout
     *            �������ȡ������Ϣ�ĳ�ʱ����λ����
     * @return
     */

    public String getAvailableConfigureInfomationFromSnapshot(long timeout);


    /**
     * ͬ����ȡProperties��ʽ��������Ϣ
     * 
     * @param timeout
     *            ��λ������
     * @return
     */
    public Properties getPropertiesConfigureInfomation(long timeout);


    /**
     * ͬ����ȡProperties��ʽ��������Ϣ������snapshot����
     * 
     * @param timeout
     * @return
     */
    public Properties getAvailablePropertiesConfigureInfomationFromSnapshot(long timeout);


    /**
     * ͬ����ȡһ����Ч��Properties������Ϣ������<strong>�����ļ�->diamond������->��һ����ȷ���õ�snapshot</
     * strong> ������˳���ȡ�� �����Щ;������Ч���򷵻�null
     * 
     * @param timeout
     *            ��λ������
     * @return
     */
    public Properties getAvailablePropertiesConfigureInfomation(long timeout);


    /**
     * ����DiamondConfigure��һ��JVM�����е�DiamondManager��Ӧ��һ��DiamondConfigure
     * 
     * @param diamondConfigure
     */
    public void setDiamondConfigure(DiamondConfigure diamondConfigure);


    /**
     * ��ȡDiamondConfigure��һ��JVM�����е�DiamondManager��Ӧ��һ��DiamondConfigure
     * 
     * @param diamondConfigure
     */
    public DiamondConfigure getDiamondConfigure();


    /**
     * �ر����DiamondManager
     */
    public void close();

}
