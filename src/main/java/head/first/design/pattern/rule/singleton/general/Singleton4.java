/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.singleton.general;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:11
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class Singleton4 {
    /**
     * volatile
     */
    private volatile static Singleton4 uniqueInstance;

    private Singleton4() {
    }

    /**
     * 인스턴스 생성.
     *
     * @return 유일무이 객체
     */
    public static Singleton4 getInstance() {
        if (uniqueInstance == null) { // 첫 인스턴스 생성시만 동기화 됨
            synchronized (Singleton4.class) { // 첫 인스턴스 생성시만 동기화 됨
                if (uniqueInstance == null) { // 동기화 후에도 한번더 체크
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
