package com.GerbertShildtFullManual.part3;
//  Продемонстрировать облать видимости блока кода
class Scope {
    public static void main(String args[]) {
        int x;  //  Эта переменная доступна всему
                //  коду из метода main()
        x = 10;
        if(x == 10) {   //  начало новой области действия,
            int y = 20; //  доступной
            //  обе переменные x и y доступны в
            // этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        //  y = 100;    //  Ошибка! Переменная y недоступна
        //  в этой области действия, тогда как
        //  переменная x доступна и здесь
        System.out.println("x равно " + x);
    }
}
