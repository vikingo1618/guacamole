package com.axity.example.jpa.persistence.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import com.axity.example.jpa.model.AirlineDO;
import com.axity.example.jpa.persistence.base.GenericBaseDAOImpl;
import com.axity.example.jpa.persistence.dao.AirlineDAO;

public class AirlineDAOImpl extends GenericBaseDAOImpl<AirlineDO> implements AirlineDAO
{

  /**
   * Constructor default
   */
  public AirlineDAOImpl()
  {
    super( AirlineDO.class );
  }

  @Override
  public List<AirlineDO> findByCode( String code )
  {
    TypedQuery<AirlineDO> namedQuery = super.getEntityManager().createNamedQuery( "AirlineDO.findByCode",
      AirlineDO.class );
    namedQuery.setParameter( "code", code );

    return findByNamedQuery( namedQuery );
  }

  @Override
  public List<AirlineDO> findByName( String name )
  {
    TypedQuery<AirlineDO> namedQuery = super.getEntityManager().createNamedQuery( "AirlineDO.findByName",
      AirlineDO.class );
    namedQuery.setParameter( "name", name );

    return findByNamedQuery( namedQuery );
  }
}
