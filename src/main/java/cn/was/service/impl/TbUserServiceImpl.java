package cn.was.service.impl;

import cn.was.entity.TbUser;
import cn.was.mapper.TbUserMapper;
import cn.was.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王安顺
 * @since 2022-08-10
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
