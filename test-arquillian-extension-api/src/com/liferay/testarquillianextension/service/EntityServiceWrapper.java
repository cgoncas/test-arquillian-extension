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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntityService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntityService
 * @generated
 */
@ProviderType
public class EntityServiceWrapper implements EntityService,
	ServiceWrapper<EntityService> {
	public EntityServiceWrapper(EntityService entityService) {
		_entityService = entityService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _entityService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_entityService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public EntityService getWrappedEntityService() {
		return _entityService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedEntityService(EntityService entityService) {
		_entityService = entityService;
	}

	@Override
	public EntityService getWrappedService() {
		return _entityService;
	}

	@Override
	public void setWrappedService(EntityService entityService) {
		_entityService = entityService;
	}

	private EntityService _entityService;
}