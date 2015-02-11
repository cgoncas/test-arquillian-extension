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

package com.liferay.testarquillianextension.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Entity. This utility wraps
 * {@link com.liferay.testarquillianextension.service.impl.EntityLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EntityLocalService
 * @see com.liferay.testarquillianextension.service.base.EntityLocalServiceBaseImpl
 * @see com.liferay.testarquillianextension.service.impl.EntityLocalServiceImpl
 * @generated
 */
@ProviderType
public class EntityLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.testarquillianextension.service.impl.EntityLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the entity to the database. Also notifies the appropriate model listeners.
	*
	* @param entity the entity
	* @return the entity that was added
	*/
	public static com.liferay.testarquillianextension.model.Entity addEntity(
		com.liferay.testarquillianextension.model.Entity entity) {
		return getService().addEntity(entity);
	}

	/**
	* Creates a new entity with the primary key. Does not add the entity to the database.
	*
	* @param entityId the primary key for the new entity
	* @return the new entity
	*/
	public static com.liferay.testarquillianextension.model.Entity createEntity(
		long entityId) {
		return getService().createEntity(entityId);
	}

	/**
	* Deletes the entity from the database. Also notifies the appropriate model listeners.
	*
	* @param entity the entity
	* @return the entity that was removed
	*/
	public static com.liferay.testarquillianextension.model.Entity deleteEntity(
		com.liferay.testarquillianextension.model.Entity entity) {
		return getService().deleteEntity(entity);
	}

	/**
	* Deletes the entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entityId the primary key of the entity
	* @return the entity that was removed
	* @throws PortalException if a entity with the primary key could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity deleteEntity(
		long entityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteEntity(entityId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.testarquillianextension.model.impl.EntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.testarquillianextension.model.Entity fetchEntity(
		long entityId) {
		return getService().fetchEntity(entityId);
	}

	/**
	* Returns the entity matching the UUID and group.
	*
	* @param uuid the entity's UUID
	* @param groupId the primary key of the group
	* @return the matching entity, or <code>null</code> if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity fetchEntityByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchEntityByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
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
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> getEntities(
		int start, int end) {
		return getService().getEntities(start, end);
	}

	/**
	* Returns all the entities matching the UUID and company.
	*
	* @param uuid the UUID of the entities
	* @param companyId the primary key of the company
	* @return the matching entities, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> getEntitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getEntitiesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of entities matching the UUID and company.
	*
	* @param uuid the UUID of the entities
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of entities
	* @param end the upper bound of the range of entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching entities, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.testarquillianextension.model.Entity> getEntitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.testarquillianextension.model.Entity> orderByComparator) {
		return getService()
				   .getEntitiesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of entities.
	*
	* @return the number of entities
	*/
	public static int getEntitiesCount() {
		return getService().getEntitiesCount();
	}

	/**
	* Returns the entity with the primary key.
	*
	* @param entityId the primary key of the entity
	* @return the entity
	* @throws PortalException if a entity with the primary key could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity getEntity(
		long entityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEntity(entityId);
	}

	/**
	* Returns the entity matching the UUID and group.
	*
	* @param uuid the entity's UUID
	* @param groupId the primary key of the group
	* @return the matching entity
	* @throws PortalException if a matching entity could not be found
	*/
	public static com.liferay.testarquillianextension.model.Entity getEntityByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getEntityByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.portal.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	/**
	* Updates the entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entity the entity
	* @return the entity that was updated
	*/
	public static com.liferay.testarquillianextension.model.Entity updateEntity(
		com.liferay.testarquillianextension.model.Entity entity) {
		return getService().updateEntity(entity);
	}

	public static EntityLocalService getService() {
		return _serviceTracker.getService();
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	@Deprecated
	public void setService(EntityLocalService service) {
	}

	private static ServiceTracker<EntityLocalService, EntityLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EntityLocalServiceUtil.class);

		_serviceTracker = new ServiceTracker<EntityLocalService, EntityLocalService>(bundle.getBundleContext(),
				EntityLocalService.class, null);

		_serviceTracker.open();
	}
}