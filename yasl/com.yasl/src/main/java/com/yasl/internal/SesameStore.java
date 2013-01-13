/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yasl.internal;

import java.io.File;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.sail.inferencer.fc.ForwardChainingRDFSInferencer;
import org.openrdf.sail.nativerdf.NativeStore;

/**
 *
 * @author martin
 */
public class SesameStore {
    private static Repository repository;
    
    /**
     *
     * @throws RepositoryException
     */
    public static void initNativeStore() throws RepositoryException {
        File dataDir = new File("yaslData");
        repository = new SailRepository(new ForwardChainingRDFSInferencer(new NativeStore(dataDir)));        
        repository.initialize();
    }
    
    public static void stopNativeStore() throws RepositoryException {
        repository.shutDown();
    }
    /**
     *
     */
    public static RepositoryConnection getRepositoryConnection() throws RepositoryException {
        return repository.getConnection();
    }
}
