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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.liferay.testarquillianextension.model.Entity;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the entity service. This utility wraps {@link com.liferay.testarquillianextension.service.persistence.impl.EntityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityPersistence
 * @see com.liferay.testarquillianextension.service.persistence.impl.EntityPersistenceImpl
 * @generated
 */
@ProviderType
public class EntityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Entity entity) {
		getPersistence().clearCache(entity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entity> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entity> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entity> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Entity> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Entity update(Entity entity) {
		return getPersistence().update(entity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Entity update(Entity entity, ServiceContext serviceContext) {
		return getPersistence().update(entity, serviceContext);
	}

	/**
	* Returns all the entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching entities
	*/
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid(
		java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid(
		java.lang.String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last entity in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the entities before and after the current entity in the ordered set where uuid = &#63;.
	*
	* @param entityId the primary key of the current entity
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity[] findByUuid_PrevAndNext(
		long entityId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence()
				   .findByUuid_PrevAndNext(entityId, uuid, orderByComparator);
	}

	/**
	* Removes all the entities where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of entities where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching entities
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the entity where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.testarquillianextension.NoSuchEntityException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByUUID_G(
		java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the entity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the entity where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the entity that was removed
	*/
	public static com.liferay.testarquillianextension.model.Entity removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of entities where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching entities
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching entities
	*/
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid_C(
		java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last entity in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static com.liferay.testarquillianextension.model.Entity[] findByUuid_C_PrevAndNext(
		long entityId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(entityId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the entities where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of entities where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching entities
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the entities where name = &#63;.
	*
	* @param name the name
	* @return the matching entities
	*/
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByName(
		java.lang.String name) {
		return getPersistence().findByName(name);
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByName(
		java.lang.String name, int start, int end) {
		return getPersistence().findByName(name, start, end);
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns the first entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the entities before and after the current entity in the ordered set where name = &#63;.
	*
	* @param entityId the primary key of the current entity
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity[] findByName_PrevAndNext(
		long entityId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence()
				   .findByName_PrevAndNext(entityId, name, orderByComparator);
	}

	/**
	* Removes all the entities where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByName(java.lang.String name) {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of entities where name = &#63;.
	*
	* @param name the name
	* @return the number of matching entities
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the entity in the entity cache if it is enabled.
	*
	* @param entity the entity
	*/
	public static void cacheResult(
		com.liferay.testarquillianextension.model.Entity entity) {
		getPersistence().cacheResult(entity);
	}

	/**
	* Caches the entities in the entity cache if it is enabled.
	*
	* @param entities the entities
	*/
	public static void cacheResult(
		java.util.List<com.liferay.testarquillianextension.model.Entity> entities) {
		getPersistence().cacheResult(entities);
	}

	/**
	* Creates a new entity with the primary key. Does not add the entity to the database.
	*
	* @param entityId the primary key for the new entity
	* @return the new entity
	*/
	public static com.liferay.testarquillianextension.model.Entity create(
		long entityId) {
		return getPersistence().create(entityId);
	}

	/**
	* Removes the entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entityId the primary key of the entity
	* @return the entity that was removed
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity remove(
		long entityId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().remove(entityId);
	}

	public static com.liferay.testarquillianextension.model.Entity updateImpl(
		com.liferay.testarquillianextension.model.Entity entity) {
		return getPersistence().updateImpl(entity);
	}

	/**
	* Returns the entity with the primary key or throws a {@link com.liferay.testarquillianextension.NoSuchEntityException} if it could not be found.
	*
	* @param entityId the primary key of the entity
	* @return the entity
	* @throws com.liferay.testarquillianextension.NoSuchEntityException if a entity with the primary key could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity findByPrimaryKey(
		long entityId)
		throws com.liferay.testarquillianextension.exception.NoSuchEntityException {
		return getPersistence().findByPrimaryKey(entityId);
	}

	/**
	* Returns the entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entityId the primary key of the entity
	* @return the entity, or <code>null</code> if a entity with the primary key could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchByPrimaryKey(
		long entityId) {
		return getPersistence().fetchByPrimaryKey(entityId);
	}

	public static java.util.Map<java.io.Serializable, com.liferay.testarquillianextension.model.Entity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the entities.
	*
	* @return the entities
	*/
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findAll() {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the entities from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of entities.
	*
	* @return the number of entities
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EntityPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	@Deprecated
	public void setPersistence(EntityPersistence persistence) {
	}

	private static ServiceTracker<EntityPersistence, EntityPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EntityUtil.class);

		_serviceTracker = new ServiceTracker<EntityPersistence, EntityPersistence>(bundle.getBundleContext(),
				EntityPersistence.class, null);

		_serviceTracker.open();
	}
}