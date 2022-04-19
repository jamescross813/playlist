import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("To Hell With the World");
    desertIslandPlaylist.add("Katie");
    desertIslandPlaylist.add("Decimate");
    desertIslandPlaylist.add("O'Sullivans Bar'");
    desertIslandPlaylist.add("How I Learned To Stop Worrying");
    desertIslandPlaylist.add("Elizabeth");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(4);
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);
    int songA = desertIslandPlaylist.indexOf("Katie");
    
    int songB = desertIslandPlaylist.indexOf("Elizabeth");

    String tempA = "Katie";
    String tempB = "Elizabeth";
    desertIslandPlaylist.set(songB, tempA);
    desertIslandPlaylist.set(songA, tempB);
    
    
    System.out.println(desertIslandPlaylist);
  }
  
}