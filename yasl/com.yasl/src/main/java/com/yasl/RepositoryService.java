package com.yasl;

import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
/**
 * Public API representing an example OSGi service
 */
public interface RepositoryService
{
    RepositoryConnection getRepositoryConnection() throws RepositoryException;   
}

    