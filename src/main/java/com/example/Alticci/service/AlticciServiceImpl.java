package com.example.Alticci.service;

import org.springframework.stereotype.Service;

@Service
public class AlticciServiceImpl implements AlticciService{

    @Override
    public Integer getAlticciIndex(Integer n) {
        switch (n){
            case (0):
                return 0;
            case (1):
            case (2):
                return 1;
            default:
                return getAlticciIndex(n - 3) + getAlticciIndex(n-2);
        }
    }
}
