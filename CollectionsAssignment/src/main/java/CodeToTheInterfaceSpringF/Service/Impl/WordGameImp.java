package CodeToTheInterfaceSpringF.Service.Impl;

import CodeToTheInterfaceSpringF.Service.WordGameInterface;

public class WordGameImp implements WordGameInterface {

    @Override
    public String concatenate(String a, String b) {
        return a+b;
    }
}
