package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Login
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Logins {
    private Integer id;
    private String account;
    private String password;
    private String adminName;

}
