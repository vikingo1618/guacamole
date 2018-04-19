package com.axity.example.jpa.persistence.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.axity.example.jpa.model.AirlineDO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/initial-test-context.xml" })
@Transactional
public class AirlineDAOTest
{
  private static final Logger LOGGER = Logger.getLogger( AirlineDAOTest.class );

  @Autowired
  private AirlineDAO airlineDAO;

  @Test
  public void testFindByCode()
  {
    List<AirlineDO> airlines = this.airlineDAO.findByCode( "AV" );
    Assert.assertEquals( 1, airlines.size() );
  }

  @Test
  public void testFindByName()
  {
    List<AirlineDO> airlines = this.airlineDAO.findByName( "Avianca" );
    Assert.assertEquals( 1, airlines.size() );
  }

  @Test
  public void testFind()
  {
    AirlineDO airline = this.airlineDAO.find( 1 );
    Assert.assertNotNull( airline );
  }

  @Test
  public void testFindAll()
  {
    List<AirlineDO> airlines = airlineDAO.findAll();

    for( AirlineDO airline : airlines )
    {
      LOGGER.info( airline );
    }

  }

}
