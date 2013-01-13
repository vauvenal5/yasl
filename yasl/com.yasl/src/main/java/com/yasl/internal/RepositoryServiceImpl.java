/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yasl.internal;

import com.yasl.RepositoryService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;

/**
 *
 * @author martin
 */
public class RepositoryServiceImpl implements RepositoryService {

    public RepositoryConnection getRepositoryConnection() throws RepositoryException {        
            return SesameStore.getRepositoryConnection();        
    }
    
}
