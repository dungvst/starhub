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

    HeaderSection updateHeaderSection(HeaderSection headerSection);

    HeaderSection getDefaultHeaderSection();
}
