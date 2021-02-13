package cn.ajax.entry;;

import java.io.Serializable;

/**
 * @ProjectName: ajax
 * @Package: cn.ajax.entry
 * @ClassName: Result
 * @Author: ChaiXi
 * @Description:
 * @Date: 2021/1/16 12:06
 * @Version: 1.0
 */
public class Result implements Serializable {
    private Boolean flag;
    private Object user;
    private String errEnging;

    public Result(Boolean flag) {
        this.flag = flag;
    }

    public Result() {
    }

    public Result(Boolean flag, String errEnging) {
        this.flag = flag;
        this.errEnging = errEnging;
    }

    public Result(Boolean flag, Object user) {
        this.flag = flag;
        this.user = user;
    }

    public Result(Boolean flag, Object user, String errEnging) {
        this.flag = flag;
        this.user = user;
        this.errEnging = errEnging;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getuser() {
        return user;
    }

    public void setuser(Object user) {
        this.user = user;
    }

    public String getErrEnging() {
        return errEnging;
    }

    public void setErrEnging(String errEnging) {
        this.errEnging = errEnging;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", User=" + user +
                ", errEnging='" + errEnging + '\'' +
                '}';
    }
}
