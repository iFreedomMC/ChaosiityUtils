package com.scuph.scuphutils;

import net.pravian.bukkitlib.config.PathContainer;

public enum ConfigEntries implements PathContainer {

    SERVER_NAME("server.name"),
    SERVER_OWNER("server.owner"),
    SERVER_WEBSITE("server.website");

    private final String key;

    //
    private ConfigEntries(String key) {
        this.key = key;
    }

    @Override
    public String getPath() {
        return key;
    }

}
