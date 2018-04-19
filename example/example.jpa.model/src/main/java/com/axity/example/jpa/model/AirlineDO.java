package com.axity.example.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "C_AEROLINEA")
@NamedQueries({ @NamedQuery(name = "AirlineDO.findByCode", query = "SELECT o FROM AirlineDO o WHERE o.code = :code"),
    @NamedQuery(name = "AirlineDO.findByName", query = "SELECT o FROM AirlineDO o WHERE o.name LIKE :name") })
public class AirlineDO extends AbstractCatalogEntity<AirlineDO>
{

  /**
   * 
   */
  private static final long serialVersionUID = -1512732083253337161L;
  @Id
  @Column(name = "ID_AEROLINEA")
  private Integer idAirline;

  /**
   * @return the idAirline
   */
  public Integer getIdAirline()
  {
    return idAirline;
  }

  /**
   * @param idAirline the idAirline to set
   */
  public void setIdAirline( Integer idAirline )
  {
    this.idAirline = idAirline;
  }

  /**
   * @param object
   * @return
   */
  @Override
  public boolean equals( Object object )
  {
    boolean isEquals = false;
    if( this == object )
    {
      isEquals = true;
    }
    else if( object != null && object.getClass().equals( this.getClass() ) )
    {
      AirlineDO that = (AirlineDO) object;
      isEquals = new EqualsBuilder().append( this.idAirline, that.idAirline ).isEquals();
    }
    return isEquals;
  }

  /**
   * @return
   */
  @Override
  public int hashCode()
  {
    return new HashCodeBuilder().append( this.idAirline ).toHashCode();
  }

  /**
   * @return
   */
  @Override
  public String toString()
  {
    return new ToStringBuilder( this ).append( "idAirline", this.idAirline ).append( "name", this.name )
        .append( "code", this.code ).toString();
  }

}
