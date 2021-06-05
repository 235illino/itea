package com.itea.pim.illia_chvyr;

import com.itea.pim.illia_chvyr.user.User;

public class Application {
    public static void main(String[] args) {
        User userRevenge = new User();
        userRevenge.setName("Ivan");
        userRevenge.setSurname("Ivanov");
        userRevenge.setLogin("Revenge");
        userRevenge.setPassword("0000");
        userRevenge.setEmail("revenge@gmail.com");

        User userIllino = new User();
        userIllino.setName("Boris");
        userIllino.setSurname("Jhonson");
        userIllino.setLogin("Illino");
        userIllino.setPassword("1111");
        userIllino.setEmail("illino@gmail.com");

        User userBarsick = new User();
        userIllino.setName("Bill");
        userIllino.setSurname("Klinton");
        userIllino.setLogin("Barsick");
        userIllino.setPassword("2222");
        userIllino.setEmail("barsick@gmail.com");

    }
}
