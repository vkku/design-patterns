package me.vkku.mixin;

import java.util.List;

interface MixinList<T> extends List<T> {
    public List<T> getElements();

}
