package com.zj.Polymorphic;

public class BlackPerson extends Person{
    public void  printColor(String skinColor){
        System.out.println(SkinColorEnums.getColor(skinColor));
    }
}
