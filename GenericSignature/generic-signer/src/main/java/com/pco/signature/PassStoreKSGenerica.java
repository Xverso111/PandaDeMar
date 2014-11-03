package com.pco.signature;

import java.security.cert.X509Certificate;

import es.mityc.javasign.pkstore.IPassStoreKS;

public class PassStoreKSGenerica
  implements IPassStoreKS
{
  private transient String password;

  public PassStoreKSGenerica(String pass)
  {
    this.password = new String(pass);
  }

  public char[] getPassword(X509Certificate certificate, String alias)
  {
    return this.password.toCharArray();
  }
}
