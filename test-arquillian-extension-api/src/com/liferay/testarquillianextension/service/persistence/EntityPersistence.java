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

package com.liferay.testarquillianextension.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.testarquillianextension.model.Entity;

/**
 * The persistence interface for the entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.testarquillianextension.service.persistence.impl.EntityPersistenceImpl
 * @see EntityUtil
 * @generated
 */
@ProviderType
public interface EntityPersistence extends BasePersistence<Entity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EntityUtil} to access the entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid(
		java.lang.String uuid);

	/**
	* Returns a range of all the entities where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @return the range of matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid(
		java.lang.String uuid, int start, int end);

	/**
	* Returns an ordered range of all the entities where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the first entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the first entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the last entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the last entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the entities before and after the current entity in the ordered set where uuid = &#63;.
	*
	* @param entityId the primary key of the current entity
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity[] findByUuid_PrevAndNext(
		long entityId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Removes all the entities where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching entities
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the entity where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.testarquillianextension.NoSuchEntityException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByUUID_G(
		java.lang.String uuid, long groupId);

	/**
	* Returns the entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache);

	/**
	* Removes the entity where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the entity that was removed
	*/
	public com.liferay.testarquillianextension.model.Entity removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the number of entities where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching entities
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid_C(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of all the entities where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @return the range of matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end);

	/**
	* Returns an ordered range of all the entities where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the first entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the first entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the last entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the last entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the entities before and after the current entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param entityId the primary key of the current entity
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity[] findByUuid_C_PrevAndNext(
		long entityId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Removes all the entities where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching entities
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the entities where name = &#63;.
	*
	* @param name the name
	* @return the matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByName(
		java.lang.String name);

	/**
	* Returns a range of all the entities where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @return the range of matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByName(
		java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the entities where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the first entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the first entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the last entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the last entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Returns the entities before and after the current entity in the ordered set where name = &#63;.
	*
	* @param entityId the primary key of the current entity
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity[] findByName_PrevAndNext(
		long entityId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Removes all the entities where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByName(java.lang.String name);

	/**
	* Returns the number of entities where name = &#63;.
	*
	* @param name the name
	* @return the number of matching entities
	*/
	public int countByName(java.lang.String name);

	/**
	* Caches the entity in the entity cache if it is enabled.
	*
	* @param entity the entity
	*/
	public void cacheResult(
		com.liferay.testarquillianextension.model.Entity entity);

	/**
	* Caches the entities in the entity cache if it is enabled.
	*
	* @param entities the entities
	*/
	public void cacheResult(
		java.util.List<com.liferay.testarquillianextension.model.Entity> entities);

	/**
	* Creates a new entity with the primary key. Does not add the entity to the database.
	*
	* @param entityId the primary key for the new entity
	* @return the new entity
	*/
	public com.liferay.testarquillianextension.model.Entity create(
		long entityId);

	/**
	* Removes the entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entityId the primary key of the entity
	* @return the entity that was removed
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity remove(
		long entityId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	public com.liferay.testarquillianextension.model.Entity updateImpl(
		com.liferay.testarquillianextension.model.Entity entity);

	/**
	* Returns the entity with the primary key or throws a {@link com.liferay.testarquillianextension.NoSuchEntityException} if it could not be found.
	*
	* @param entityId the primary key of the entity
	* @return the entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity findByPrimaryKey(
		long entityId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException;

	/**
	* Returns the entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entityId the primary key of the entity
	* @return the entity, or <code>null</code> if a entity with the primary key could not be found
	*/
	public com.liferay.testarquillianextension.model.Entity fetchByPrimaryKey(
		long entityId);

	@Override
	public java.util.Map<java.io.Serializable, com.liferay.testarquillianextension.model.Entity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the entities.
	*
	* @return the entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findAll();

	/**
	* Returns a range of all the entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @return the range of entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of entities
	*/
	public java.util.List<com.liferay.testarquillianextension.model.Entity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator);

	/**
	* Removes all the entities from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of entities.
	*
	* @return the number of entities
	*/
	public int countAll();
}