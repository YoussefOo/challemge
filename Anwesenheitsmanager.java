import java.util.*;
import java.util.stream.Collectors;

public class Anwesenheitsmanager {

    enum Status {
        ANWESEND, ABWESEND, ENTSCHULDIGT, VERSPAETET
    }

    static class Anwesenheitseintrag {
        private final Status status;
        private final String kommentar;

        Anwesenheitseintrag(Status status, String kommentar) {
            this.status = status;
            this.kommentar = kommentar;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return status + (kommentar.isEmpty() ? "" : " (" + kommentar + ")");
        }
    }

    public static void main(String[] args) {

        Map<String, List<Anwesenheitseintrag>> daten = createTestData();

        auswertungTeilnahme(daten);
        auswertungWoche(daten, 2); // Woche 3
        statistikProWoche(daten);
    }

    private static Map<String, List<Anwesenheitseintrag>> createTestData() {
        Map<String, List<Anwesenheitseintrag>> daten = new HashMap<>();

        daten.put("Max", createEntries(
                Status.ANWESEND, Status.VERSPAETET, Status.ANWESEND,
                Status.ENTSCHULDIGT, Status.ANWESEND, Status.ANWESEND, Status.ANWESEND
        ));

        daten.put("Lisa", createEntries(
                Status.ANWESEND, Status.ABWESEND, Status.ANWESEND,
                Status.ANWESEND, Status.VERSPAETET, Status.ANWESEND, Status.ENTSCHULDIGT
        ));

        daten.put("Tom", createEntries(
                Status.ABWESEND, Status.ABWESEND, Status.ANWESEND,
                Status.ANWESEND, Status.ANWESEND, Status.VERSPAETET, Status.ANWESEND
        ));

        daten.put("Anna", createEntries(
                Status.ANWESEND, Status.ANWESEND, Status.ANWESEND,
                Status.ANWESEND, Status.ANWESEND, Status.ANWESEND, Status.ANWESEND
        ));
    
return daten;
    }

    private static List<Anwesenheitseintrag> createEntries(Status... statuses) {
        return Arrays.stream(statuses)
                .map(s -> new Anwesenheitseintrag(s, ""))
                .toList();
    }

    private static void auswertungTeilnahme(Map<String, List<Anwesenheitseintrag>> daten) {
        System.out.println("Studierende mit mindestens 6 Teilnahmen und max. 1 Entschuldigung:");

        daten.forEach((name, liste) -> {
            long teilnahmen = countStatus(liste, Status.ANWESEND, Status.VERSPAETET);
            long entschuldigungen = countStatus(liste, Status.ENTSCHULDIGT);

            if (teilnahmen >= 6 && entschuldigungen <= 1) {
                System.out.println("- " + name);
            }
        });
    }

    private static void auswertungWoche(Map<String, List<Anwesenheitseintrag>> daten, int wocheIndex) {
        long anwesend = daten.values().stream()
                .map(liste -> liste.get(wocheIndex).getStatus())
                .filter(s -> s == Status.ANWESEND || s == Status.VERSPAETET)
                .count();

        int gesamt = daten.size();
        double prozent = (anwesend * 100.0) / gesamt;

        System.out.println("\nWoche " + (wocheIndex + 1) + ":");
        System.out.println("Anwesend: " + anwesend + " von " + gesamt);
        System.out.printf("Prozent: %.2f%%\n", prozent);
    }


    private static void statistikProWoche(Map<String, List<Anwesenheitseintrag>> daten) {
        int wochen = daten.values().iterator().next().size();

        System.out.println("\nStatistik pro Woche:");

        for (int i = 0; i < wochen; i++) {

            Map<Status, Long> statistik = daten.values().stream()
                    .map(liste -> liste.get(i).getStatus())
                    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

            System.out.println("Woche " + (i + 1) + ":");
            System.out.println("  Anwesend: " + statistik.getOrDefault(Status.ANWESEND, 0L));
            System.out.println("  Verspätet: " + statistik.getOrDefault(Status.VERSPAETET, 0L));
            System.out.println("  Entschuldigt: " + statistik.getOrDefault(Status.ENTSCHULDIGT, 0L));
            System.out.println("  Abwesend: " + statistik.getOrDefault(Status.ABWESEND, 0L));
        }
    }

    private static long countStatus(List<Anwesenheitseintrag> liste, Status... statusFilter) {
        Set<Status> filter = Set.of(statusFilter);

        return liste.stream()
                .map(Anwesenheitseintrag::getStatus)
                .filter(filter::contains)
                .count();
    }
}