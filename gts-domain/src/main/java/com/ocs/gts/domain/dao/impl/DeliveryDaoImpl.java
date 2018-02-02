package com.ocs.gts.domain.dao.impl;

import com.mysema.query.types.path.EntityPathBase;
import com.ocs.dynamo.dao.FetchJoinInformation;
import com.ocs.dynamo.dao.impl.BaseDaoImpl;
import com.ocs.gts.domain.Delivery;
import com.ocs.gts.domain.QDelivery;
import com.ocs.gts.domain.dao.DeliveryDao;
import org.springframework.stereotype.Repository;

@Repository("deliveryDao")
public class DeliveryDaoImpl extends BaseDaoImpl<Integer, Delivery> implements DeliveryDao {

	@Override
	public Class<Delivery> getEntityClass() {
		return Delivery.class;
	}

	@Override
	protected EntityPathBase<Delivery> getDslRoot() {
		return QDelivery.delivery;
	}

	@Override
	protected FetchJoinInformation[] getFetchJoins() {
		return new FetchJoinInformation[] { new FetchJoinInformation("fromPerson"),
		        new FetchJoinInformation("toPerson"), new FetchJoinInformation("gift") };
	}
}
