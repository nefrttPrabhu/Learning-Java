import java.util.*;

public class NaturalSort {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple10", "apple2", "apple1", "apple20", "apple11");

        // Natural sort
        Collections.sort(strings, new NaturalSortComparator());

        System.out.println("Sorted List:");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    static class NaturalSortComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String[] parts1 = o1.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            String[] parts2 = o2.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

            int minSize = Math.min(parts1.length, parts2.length);
            for (int i = 0; i < minSize; i++) {
                if (!parts1[i].equals(parts2[i])) {
                    if (Character.isDigit(parts1[i].charAt(0)) && Character.isDigit(parts2[i].charAt(0))) {
                        return Integer.compare(Integer.parseInt(parts1[i]), Integer.parseInt(parts2[i]));
                    } else {
                        return parts1[i].compareTo(parts2[i]);
                    }
                }
            }
            return Integer.compare(parts1.length, parts2.length);
        }
    }
}
