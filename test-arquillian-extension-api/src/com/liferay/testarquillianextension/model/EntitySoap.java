/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.testarquillianextension.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.testarquillianextension.service.http.EntityServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.testarquillianextension.service.http.EntityServiceSoap
 * @generated
 */
@ProviderType
public class EntitySoap implements Serializable {
	public static EntitySoap toSoapModel(Entity model) {
		EntitySoap soapModel = new EntitySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEntityId(model.getEntityId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTotal(model.getTotal());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static EntitySoap[] toSoapModels(Entity[] models) {
		EntitySoap[] soapModels = new EntitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EntitySoap[][] toSoapModels(Entity[][] models) {
		EntitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EntitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new EntitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EntitySoap[] toSoapModels(List<Entity> models) {
		List<EntitySoap> soapModels = new ArrayList<EntitySoap>(models.size());

		for (Entity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EntitySoap[soapModels.size()]);
	}

	public EntitySoap() {
	}

	public long getPrimaryKey() {
		return _entityId;
	}

	public void setPrimaryKey(long pk) {
		setEntityId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEntityId() {
		return _entityId;
	}

	public void setEntityId(long entityId) {
		_entityId = entityId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getTotal() {
		return _total;
	}

	public void setTotal(long total) {
		_total = total;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private String _uuid;
	private long _entityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _total;
	private String _name;
	private String _description;
}