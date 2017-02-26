/**
 * 
 */
package com.starhub.dao;

import com.starhub.model.HeaderSection;

/**
 * @author DungNV
 *
 */
public interface HeaderDao {

    void updateHeaderSection(HeaderSection headerSection);

    HeaderSection getDefaultHeaderSection();
}
