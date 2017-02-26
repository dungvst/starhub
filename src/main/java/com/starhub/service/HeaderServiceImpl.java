/**
 * 
 */
package com.starhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.starhub.dao.HeaderDao;
import com.starhub.model.HeaderSection;

/**
 * @author DungNV
 *
 */
@Repository("headerSectionService")
@Transactional
public class HeaderServiceImpl implements HeaderService {

    @Autowired
    private HeaderDao headerDao;

    @Override
    public HeaderSection updateHeaderSection(HeaderSection headerSection) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HeaderSection getDefaultHeaderSection() {
        return headerDao.getDefaultHeaderSection();
    }

}
