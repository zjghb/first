package com.zj.Polymorphic;

public enum SkinColorEnums {

    BLACK("black","黑色"),
    WHITE("white","白色"),
    YELLOW("yellow","黄色");

    private String key;
    private String value;

    SkinColorEnums(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    // 普通方法
    public static String getColor(String key) {
        SkinColorEnums[] colorEnums = SkinColorEnums.values();
        for (SkinColorEnums colorEnum : colorEnums) {
            if(colorEnum.getKey().equals(key)){
                return colorEnum.value;
            }
        }
        return null;
    }
}
