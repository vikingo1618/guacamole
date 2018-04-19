package com.axity.example.jpa.persistence.dao;

import java.util.List;

import com.axity.example.jpa.model.AirlineDO;
import com.axity.example.jpa.persistence.base.GenericDAO;

/**
 * DAO de la tabla C_AEROLINEA
 * 
 * @author gsegura
 */
public interface AirlineDAO extends GenericDAO<AirlineDO>
{

  /**
   * Busca los registros por el codigo
   * 
   * @param code
   * @return
   */
  List<AirlineDO> findByCode( String code );

  /**
   * Busca los registros por el nombre
   * 
   * @param name
   * @return
   */
  List<AirlineDO> findByName( String name );
}
