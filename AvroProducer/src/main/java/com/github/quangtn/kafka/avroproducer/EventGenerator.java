package com.github.quangtn.kafka.avroproducer;

//import org.apache.maven.plugin.logging.Log;

import JavaSessionize.avro.LogLine;
// import org.apache.avro.

import java.util.Date;
import java.util.Random;

public class EventGenerator {

    static long numbers = 10000;
    static long currUser = 1;
    static String[] websites = {"support.html","about.html","foo.html",
            "bar.html", "home.html", "search.html", "list.html",
            "help.html", "bar.html", "foo.html"};

    public static LogLine getNext() {
        LogLine event = new LogLine();
        int ip4 =(int) currUser % 256;
        long runtime = new Date().getTime();
        Random r = new Random();
        event.setIp("66.249.1."+ ip4);
        event.setReferrer("www.example.com");
        event.setTimestamp(runtime);
        event.setUrl(websites[r.nextInt(websites.length)]);
        event.setUseragent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 " +
                "Safari/537.36");
        currUser += 1;
        return event;

    }
}
