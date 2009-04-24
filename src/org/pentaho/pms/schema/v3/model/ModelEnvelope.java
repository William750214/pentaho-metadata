/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved.
 * This software was developed by Pentaho Corporation and is provided under the terms
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
 * the license for the specific language governing your rights and limitations.
 *
 * Copyright 2009 Pentaho Corporation.  All rights reserved. 
 *
 * @created Mar, 2009
 * @author James Dixon
 * 
*/
package org.pentaho.pms.schema.v3.model;

import org.pentaho.pms.schema.v3.envelope.Envelope;

/**
 * This class extends Envelope and adds a domain attribute.
 * This class can be easily generated and used whenever a list
 * of models is needed.
 * @author jamesdixon
 *
 */
public class ModelEnvelope extends Envelope {

  private String domain;

  /**
   * Gets the domain of a model
   * @return
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Sets the domain of a model
   * @param domain
   */
  public void setDomain(String domain) {
    this.domain = domain;
  }
  
}