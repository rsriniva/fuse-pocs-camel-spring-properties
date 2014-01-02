package fuse.pocs.camel.spring.properties;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Prefixer {

    private final String prefix;

    public Prefixer(String prefix) {
        this.prefix = prefix;
    }

    public String process(@Body String message) {
        return prefix + message;
    }

}