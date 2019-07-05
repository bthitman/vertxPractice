package com.toastedrecords.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class EthGeneral {
    public boolean status;
    private Map<String, Object> properties;

    @JsonAnySetter
    public void add(String key, Object value) {
        if (this.properties == null)
            this.properties = new HashMap<String, Object>();
        this.properties.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return buildString(sb, this.properties);
    }

    private String buildString(StringBuilder sb, Map<String, Object> properties) {
        for (Map.Entry<String, Object> me : properties.entrySet()) {
            if (me.getValue() instanceof Map) {
                buildString(sb, (Map<String, Object>) me.getValue());
            }
            sb.append(me.getKey()).append(" : ").append(me.getValue()).append("\n");
        }
        return sb.toString();
    }
}
