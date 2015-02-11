create table Entity (
	uuid_ VARCHAR(75) null,
	entityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	total LONG,
	name VARCHAR(75) null,
	description STRING null
);