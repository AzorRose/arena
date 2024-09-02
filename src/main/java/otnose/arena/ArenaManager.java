package otnose.arena;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ArenaManager {
    private static Map<String, ArenaData> arenas;
    private static List<String> formatList = Arrays.asList("1v1", "2v2", "1v1v1", "1v1v1v1", "gvg", "4v4");

    public ArenaManager() {

    }

    public static List<String> getFormatList() {
        return formatList;
    }

    public static boolean checkArenaExisting(String check) {
        return arenas.containsKey(check);
    }

    public static void putToArenas(String arenaName, ArenaData data) {
        arenas.put(arenaName, data);
    }
}
