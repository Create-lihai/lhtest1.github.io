package cn.star.service;
import cn.star.domain.Users;
import java.util.List;
/**
 * 〈一句话功能简述〉<br> 
 * 〈业务层接口〉
 *
 */
public interface UsersService {
    //查询所有用户
    public List<Users> findUsers();
    //用户注册
    public void insertUsers(Users users);
    //用户登录
    public boolean login(Users users);
}