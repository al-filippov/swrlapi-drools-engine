package org.swrlapi.drools.owl.axioms;

import org.swrlapi.drools.owl.core.DroolsUnaryObject;

abstract class DroolsUnaryIndividualAxiom extends DroolsUnaryObject<String> implements A
{
  private static final long serialVersionUID = 1L;

  protected DroolsUnaryIndividualAxiom(String individualID)
  {
    super(individualID);
  }

  public String getiid()
  {
    return getT1();
  }

  @Override
  public String toString()
  {
    return super.toString();
  }
}