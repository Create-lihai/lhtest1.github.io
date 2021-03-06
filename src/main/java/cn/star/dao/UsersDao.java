package cn.star.dao;
import cn.star.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * 〈一句话功能简述〉<br> 
 * 〈数据访问层 UsersDao 接口〉
 *
 */
@Repository
public interface UsersDao {
    //查询所有用户
    @Select("select * from users")
    public List<Users> findUsers();

    //用户注册
    @Insert("INSERT INTO USERS (username,PASSWORD) VALUES(#{username},#{PASSWORD})")
    public void insertUsers(Users users);

    //用户登录
    @Select("select * from users where username=#{username} and PASSWORD=#{PASSWORD}")
    public Users login(Users users);
}