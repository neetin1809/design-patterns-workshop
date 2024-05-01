package com.example;

public final class Cache {
    private static final Cache INSTANCE = new Cache();

    private Cache() {
        // avoid initialization
    }

    public static Cache getInstance() {
        return INSTANCE;
    }
}