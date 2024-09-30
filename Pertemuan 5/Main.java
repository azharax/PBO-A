public class Main {
    public static void main(String[] args) {
        MusicOrganizer organizer = new MusicOrganizer();

        organizer.addTrack("Tak Ingin Usai", "Keisya Levronka", 278);
        organizer.addTrack("Potential", "Lauv", 178);
        organizer.addTrack("Talk to You", "Carter Ryan", 182);

        organizer.listAllTracks();

        System.out.println("\nMemutar track 1:");
        organizer.startPlayingTrack(0);

        System.out.println("\nMenghentikan track:");
        organizer.stopPlaying();

        System.out.println("\nMencari track pertama yang sesuai 'Talk':");
        int index = organizer.findFirstMatchingTrack("Talk");
        if (index != -1) {
            System.out.println("Track ditemukan pada index: " + index);
        } else {
            System.out.println("Tidak ada track yang sesuai.");
        }

        System.out.println("\nMenghapus track 2:");
        organizer.removeTrack(1);

        organizer.listAllTracks();
    }
}
