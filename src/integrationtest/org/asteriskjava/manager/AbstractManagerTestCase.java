package org.asteriskjava.manager;

import junit.framework.TestCase;

public abstract class AbstractManagerTestCase extends TestCase
{
    protected DefaultManagerConnection getDefaultManagerConnection()
    {
        DefaultManagerConnection dmc;

        dmc = new DefaultManagerConnection();
        dmc.setUsername("callcenterami");
        dmc.setPassword("callcenterzycoo");
        dmc.setHostname("192.168.1.65");
        dmc.setPort(5038);

        return dmc;
    }
}
