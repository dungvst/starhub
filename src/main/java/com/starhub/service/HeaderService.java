
package com.starhub.service;

import com.starhub.model.HeaderSection;

/**
 * @author DungNV
 *
 */
public interface HeaderService {

    void updateHeaderSection(HeaderSection headerSection);

    HeaderSection getDefaultHeaderSection();
}
