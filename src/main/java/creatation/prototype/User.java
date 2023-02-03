package creatation.prototype;

import lombok.Data;

/**
 * 当前对徐是可克隆的
 */
@Data
public class User {

    private String username;
    private Integer age;

    /**
     * 再创建一个人,赋予我的所有属性
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException{
        User user = new User();
        user.setUsername(username);
        user.setAge(age);
        return user;
    }
}
