/**
 * ServerImp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.server.client;

public interface ServerImp extends javax.xml.rpc.Service {
    public java.lang.String getServerImpPortAddress();

    public com.test.server.client.ServerImpPort_PortType getServerImpPort() throws javax.xml.rpc.ServiceException;

    public com.test.server.client.ServerImpPort_PortType getServerImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
