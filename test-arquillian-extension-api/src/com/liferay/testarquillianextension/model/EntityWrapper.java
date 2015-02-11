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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Entity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entity
 * @generated
 */
@ProviderType
public class EntityWrapper implements Entity, ModelWrapper<Entity> {
	public EntityWrapper(Entity entity) {
		_entity = entity;
	}

	@Override
	public Class<?> getModelClass() {
		return Entity.class;
	}

	@Override
	public String getModelClassName() {
		return Entity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entityId", getEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("total", getTotal());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entityId = (Long)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long total = (Long)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new EntityWrapper((Entity)_entity.clone());
	}

	@Override
	public int compareTo(
		com.liferay.testarquillianextension.model.Entity entity) {
		return _entity.compareTo(entity);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _entity.getAvailableLanguageIds();
	}

	/**
	* Returns the company ID of this entity.
	*
	* @return the company ID of this entity
	*/
	@Override
	public long getCompanyId() {
		return _entity.getCompanyId();
	}

	/**
	* Returns the create date of this entity.
	*
	* @return the create date of this entity
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _entity.getCreateDate();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _entity.getDefaultLanguageId();
	}

	/**
	* Returns the description of this entity.
	*
	* @return the description of this entity
	*/
	@Override
	public java.lang.String getDescription() {
		return _entity.getDescription();
	}

	/**
	* Returns the localized description of this entity in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized description of this entity
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId) {
		return _entity.getDescription(languageId);
	}

	/**
	* Returns the localized description of this entity in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this entity
	*/
	@Override
	public java.lang.String getDescription(java.lang.String languageId,
		boolean useDefault) {
		return _entity.getDescription(languageId, useDefault);
	}

	/**
	* Returns the localized description of this entity in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized description of this entity
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale) {
		return _entity.getDescription(locale);
	}

	/**
	* Returns the localized description of this entity in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized description of this entity. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getDescription(java.util.Locale locale,
		boolean useDefault) {
		return _entity.getDescription(locale, useDefault);
	}

	@Override
	public java.lang.String getDescriptionCurrentLanguageId() {
		return _entity.getDescriptionCurrentLanguageId();
	}

	@Override
	public java.lang.String getDescriptionCurrentValue() {
		return _entity.getDescriptionCurrentValue();
	}

	/**
	* Returns a map of the locales and localized descriptions of this entity.
	*
	* @return the locales and localized descriptions of this entity
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
		return _entity.getDescriptionMap();
	}

	/**
	* Returns the entity ID of this entity.
	*
	* @return the entity ID of this entity
	*/
	@Override
	public long getEntityId() {
		return _entity.getEntityId();
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _entity.getExpandoBridge();
	}

	/**
	* Returns the group ID of this entity.
	*
	* @return the group ID of this entity
	*/
	@Override
	public long getGroupId() {
		return _entity.getGroupId();
	}

	/**
	* Returns the modified date of this entity.
	*
	* @return the modified date of this entity
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _entity.getModifiedDate();
	}

	/**
	* Returns the name of this entity.
	*
	* @return the name of this entity
	*/
	@Override
	public java.lang.String getName() {
		return _entity.getName();
	}

	/**
	* Returns the primary key of this entity.
	*
	* @return the primary key of this entity
	*/
	@Override
	public long getPrimaryKey() {
		return _entity.getPrimaryKey();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _entity.getPrimaryKeyObj();
	}

	/**
	* Returns the total of this entity.
	*
	* @return the total of this entity
	*/
	@Override
	public long getTotal() {
		return _entity.getTotal();
	}

	/**
	* Returns the user ID of this entity.
	*
	* @return the user ID of this entity
	*/
	@Override
	public long getUserId() {
		return _entity.getUserId();
	}

	/**
	* Returns the user name of this entity.
	*
	* @return the user name of this entity
	*/
	@Override
	public java.lang.String getUserName() {
		return _entity.getUserName();
	}

	/**
	* Returns the user uuid of this entity.
	*
	* @return the user uuid of this entity
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _entity.getUserUuid();
	}

	/**
	* Returns the uuid of this entity.
	*
	* @return the uuid of this entity
	*/
	@Override
	public java.lang.String getUuid() {
		return _entity.getUuid();
	}

	@Override
	public int hashCode() {
		return _entity.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _entity.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _entity.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _entity.isNew();
	}

	@Override
	public void persist() {
		_entity.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.LocaleException {
		_entity.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_entity.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_entity.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this entity.
	*
	* @param companyId the company ID of this entity
	*/
	@Override
	public void setCompanyId(long companyId) {
		_entity.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this entity.
	*
	* @param createDate the create date of this entity
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_entity.setCreateDate(createDate);
	}

	/**
	* Sets the description of this entity.
	*
	* @param description the description of this entity
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_entity.setDescription(description);
	}

	/**
	* Sets the localized description of this entity in the language.
	*
	* @param description the localized description of this entity
	* @param locale the locale of the language
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale) {
		_entity.setDescription(description, locale);
	}

	/**
	* Sets the localized description of this entity in the language, and sets the default locale.
	*
	* @param description the localized description of this entity
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescription(java.lang.String description,
		java.util.Locale locale, java.util.Locale defaultLocale) {
		_entity.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
		_entity.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized descriptions of this entity from the map of locales and localized descriptions.
	*
	* @param descriptionMap the locales and localized descriptions of this entity
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
		_entity.setDescriptionMap(descriptionMap);
	}

	/**
	* Sets the localized descriptions of this entity from the map of locales and localized descriptions, and sets the default locale.
	*
	* @param descriptionMap the locales and localized descriptions of this entity
	* @param defaultLocale the default locale
	*/
	@Override
	public void setDescriptionMap(
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Locale defaultLocale) {
		_entity.setDescriptionMap(descriptionMap, defaultLocale);
	}

	/**
	* Sets the entity ID of this entity.
	*
	* @param entityId the entity ID of this entity
	*/
	@Override
	public void setEntityId(long entityId) {
		_entity.setEntityId(entityId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_entity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_entity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_entity.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this entity.
	*
	* @param groupId the group ID of this entity
	*/
	@Override
	public void setGroupId(long groupId) {
		_entity.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this entity.
	*
	* @param modifiedDate the modified date of this entity
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_entity.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this entity.
	*
	* @param name the name of this entity
	*/
	@Override
	public void setName(java.lang.String name) {
		_entity.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_entity.setNew(n);
	}

	/**
	* Sets the primary key of this entity.
	*
	* @param primaryKey the primary key of this entity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_entity.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_entity.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the total of this entity.
	*
	* @param total the total of this entity
	*/
	@Override
	public void setTotal(long total) {
		_entity.setTotal(total);
	}

	/**
	* Sets the user ID of this entity.
	*
	* @param userId the user ID of this entity
	*/
	@Override
	public void setUserId(long userId) {
		_entity.setUserId(userId);
	}

	/**
	* Sets the user name of this entity.
	*
	* @param userName the user name of this entity
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_entity.setUserName(userName);
	}

	/**
	* Sets the user uuid of this entity.
	*
	* @param userUuid the user uuid of this entity
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_entity.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this entity.
	*
	* @param uuid the uuid of this entity
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_entity.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.testarquillianextension.model.Entity> toCacheModel() {
		return _entity.toCacheModel();
	}

	@Override
	public com.liferay.testarquillianextension.model.Entity toEscapedModel() {
		return new EntityWrapper(_entity.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _entity.toString();
	}

	@Override
	public com.liferay.testarquillianextension.model.Entity toUnescapedModel() {
		return new EntityWrapper(_entity.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _entity.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EntityWrapper)) {
			return false;
		}

		EntityWrapper entityWrapper = (EntityWrapper)obj;

		if (Validator.equals(_entity, entityWrapper._entity)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _entity.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public Entity getWrappedEntity() {
		return _entity;
	}

	@Override
	public Entity getWrappedModel() {
		return _entity;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entity.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _entity.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_entity.resetOriginalValues();
	}

	private final Entity _entity;
}