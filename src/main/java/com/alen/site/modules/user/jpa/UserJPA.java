package com.alen.site.modules.user.jpa;

import com.alen.site.modules.user.entiy.TUsersEntity;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author liulun
 */
public interface UserJPA extends JpaRepository<TUsersEntity, Long>,
        JpaSpecificationExecutor<TUsersEntity>, Serializable {
    TUsersEntity findByUsername(@Param("username")String userName);
}
