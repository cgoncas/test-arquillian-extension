/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
package com.liferay.testarquillianextension.service.test;

import org.arquillian.container.liferay.remote.enricher.Inject;
import com.liferay.counter.service.CounterLocalService;
import com.liferay.testarquillianextension.model.Entity;
import com.liferay.testarquillianextension.service.EntityLocalService;
import com.liferay.testarquillianextension.service.EntityLocalServiceUtil;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Cristina González
 */
@RunWith(Arquillian.class)
public class EntityLocalServiceTest {

	@Test
	public void testAddEntity() {
		Long primaryKey = _counterLocalService.increment();

		Entity initialEntity = EntityLocalServiceUtil.createEntity(primaryKey);

		initialEntity.setNew(true);

		EntityLocalServiceUtil.addEntity(initialEntity);

		Entity actualEntity = _entityLocalService.fetchEntity(initialEntity.getEntityId());

		Assert.assertNotNull(actualEntity);
	}

	@Inject
	private EntityLocalService _entityLocalService;

	@Inject
	private CounterLocalService _counterLocalService;
}
