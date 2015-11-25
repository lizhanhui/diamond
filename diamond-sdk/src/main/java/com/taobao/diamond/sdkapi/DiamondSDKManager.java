/*
 * (C) 2007-2012 Alibaba Group Holding Limited.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 * Authors:
 *   leiwen <chrisredfield1985@126.com> , boyan <killme2008@gmail.com>
 */
package com.taobao.diamond.sdkapi;

import com.taobao.diamond.domain.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * ����SDK���⿪�ŵ����ݷ��ʽӿ�
 * 
 * @filename DiamondSDKManager.java
 * @author libinbin.pt
 * @datetime 2010-7-16 ����04:03:28
 * 
 *           {@link #exists(String, String, String)}
 */
public interface DiamondSDKManager {
	
	public Map<String, DiamondSDKConf> getDiamondSDKConfMaps();

	// /////////////////////////////////////////�������ݽӿڶ���////////////////////////////////////////
	/**
	 * ʹ��ָ����diamond����������
	 * 
	 * @param dataId
	 * @param groupName
	 * @param context
	 * @param serverId
	 * @return ContextResult ��������
	 */
	public ContextResult pulish(String dataId, String groupName,
			String context, String serverId);

	// /////////////////////////////////////////�����޸ĺ�����ݽӿڶ���////////////////////////////////////////
	/**
	 * ʹ��ָ����diamond�������޸ĺ������,�޸�ǰ�ȼ�����ݴ�����
	 * 
	 * @param dataId
	 * @param groupName
	 * @param context
	 * @param serverId
	 * @return ContextResult ��������
	 */
	public ContextResult pulishAfterModified(String dataId, String groupName,
			String context, String serverId);

	// /////////////////////////////////////////ģ����ѯ�ӿڶ���////////////////////////////////////////
	/**
	 * ����ָ���� dataId��������ָ����diamond�ϲ�ѯ�����б� ���ģʽ�а�������'*',����Զ��滻Ϊ'%'��ʹ��[ like ]���
	 * ���ģʽ�в���������'*'���Ҳ�Ϊ�մ�������" "��,��ʹ��[ = ]���
	 * 
	 * @param dataIdPattern
	 * @param groupNamePattern
	 * @param serverId
	 * @param currentPage
	 * @param sizeOfPerPage
	 * @return PageContextResult<ConfigInfo> ��������
	 * @throws SQLException
	 */
	public PageContextResult<ConfigInfo> queryBy(String dataIdPattern,
			String groupNamePattern, String serverId, long currentPage,
			long sizeOfPerPage);

	/**
	 * ����ָ���� dataId,������content��ָ�����õ�diamond����ѯ�����б� ���ģʽ�а�������'*',����Զ��滻Ϊ'%'��ʹ��[
	 * like ]��� ���ģʽ�в���������'*'���Ҳ�Ϊ�մ�������" "��,��ʹ��[ = ]���
	 * 
	 * @param dataIdPattern
	 * @param groupNamePattern
	 * @param contentPattern
	 * @param serverId
	 * @param currentPage
	 * @param sizeOfPerPage
	 * @return PageContextResult<ConfigInfo> ��������
	 * @throws SQLException
	 */
	public PageContextResult<ConfigInfo> queryBy(String dataIdPattern,
			String groupNamePattern, String contentPattern, String serverId,
			long currentPage, long sizeOfPerPage);

	// /////////////////////////////////////////��ȷ��ѯ�ӿڶ���////////////////////////////////////////
	/**
	 * ����ָ����dataId��������ָ����diamond�ϲ�ѯ�����б�
	 * 
	 * @param dataId
	 * @param groupName
	 * @param serverId
	 * @return ContextResult ��������
	 * @throws SQLException
	 */
	public ContextResult queryByDataIdAndGroupName(String dataId,
			String groupName, String serverId);

	// /////////////////////////////////////////�Ƴ���Ϣ�ӿڶ���////////////////////////////////////
	/**
	 * �Ƴ��ض���������idָ����������Ϣ
	 * 
	 * @param serverId
	 * @param id
	 * @return ContextResult ��������
	 */
	public ContextResult unpublish(String serverId, long id);
	
	
	/**
     * ������ѯ
     * 
     * @param groupName
     * @param dataIds
     * @param serverId
     * @return
     */
    public BatchContextResult<ConfigInfoEx> batchQuery(String serverId, String groupName, List<String> dataIds);


    /**
     * �������������
     * 
     * @param serverId
     * @param groupName
     * @param dataId2ContentMap
     *            key:dataId,value:content
     * @return
     */
    public BatchContextResult<ConfigInfoEx> batchAddOrUpdate(String serverId, String groupName,
            Map<String/* dataId */, String/* content */> dataId2ContentMap);

}
