package com.soft.storecore.facade.populator;

public interface Populator<SOURCE, TARGET> {

    void populate(SOURCE source, TARGET target);
}
