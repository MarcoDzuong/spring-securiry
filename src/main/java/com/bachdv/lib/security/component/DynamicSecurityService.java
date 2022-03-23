package com.bachdv.lib.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * Dynamic permission related business classes
 *
 * @author BachDV
 * Date : 23/03/2022
 */
public interface DynamicSecurityService {
    /**
     * Load resource ANT wildcard and resource corresponding MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
