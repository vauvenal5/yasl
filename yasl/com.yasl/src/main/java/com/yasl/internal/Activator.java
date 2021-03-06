package com.yasl.internal;

import java.util.Dictionary;
import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.yasl.RepositoryService;

/**
 * Extension of the default OSGi bundle activator
 */
public final class Activator
    implements BundleActivator
{
    /**
     * Called whenever the OSGi framework starts our bundle
     */
    public void start( BundleContext bc )
        throws Exception
    {
        SesameStore.initNativeStore();
        bc.registerService(RepositoryService.class.getName(), new RepositoryServiceImpl(), new Properties());
    }

    /**
     * Called whenever the OSGi framework stops our bundle
     */
    public void stop( BundleContext bc )
        throws Exception
    {
        SesameStore.stopNativeStore();
    }
}

