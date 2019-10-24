package com.czk.algorithm;

/**
 * IP地址无效化
 * <p>
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *
 * @author caozhikun
 * @datetime 2019/10/24
 */
public class DefangIPaddr {

    /**
     * @param address ip地址
     * @return String
     * @methodname defangIPaddr1
     * @author caozhikun
     * @datetime 2019/10/24 15:11
     */
    private static String defangIPaddr1(String address) {
        return address.replace(".", "[.]");
    }


    public static void main(String[] args) {
        System.out.println(defangIPaddr1("127.0.0.1"));
    }
}
