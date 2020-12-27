package com.aking.learn.enums;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-27
 */
public enum ApplicationTypeEnum {
    CRM_ADMIN(1, "后台"),
    CRM_H5(2, "h5");

    public Integer code;
    public String desc;

    private ApplicationTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ApplicationTypeEnum getEnum(Integer code) {
        ApplicationTypeEnum[] values = values();
        ApplicationTypeEnum[] var2 = values;
        int var3 = values.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            ApplicationTypeEnum value = var2[var4];
            if (value.code.equals(code)) {
                return value;
            }
        }

        return null;
    }

    public static String getEnumDesc(Integer code) {
        ApplicationTypeEnum value = getEnum(code);
        return value != null ? value.desc : "";
    }
}
