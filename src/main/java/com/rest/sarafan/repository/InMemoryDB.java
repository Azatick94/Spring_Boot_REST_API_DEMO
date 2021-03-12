package com.rest.sarafan.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDB {
    private static List<Map<String, String>> messages = new ArrayList<>();

    static {
        messages.add(new HashMap<>() {{
            put("id", "1");
            put("text", "First message");
        }});
        messages.add(new HashMap<>() {{
            put("id", "2");
            put("text", "Second message");
        }});
        messages.add(new HashMap<>() {{
            put("id", "3");
            put("text", "Third message");
        }});
    }

    public static List<Map<String, String>> getMessages() {
        return messages;
    }

    public static Map<String, String> showListItemByIndex(int index) {
        return messages.get(index - 1);
    }

    public static void saveMessage(Map<String, String> message) {
        messages.add(message);
    }

    public static void deleteMessage(int index) {
        messages.remove(index);
    }

    public static void deleteAllMessage() {
        messages = new ArrayList<>();
    }
}
