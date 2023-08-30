import java.util.HashMap;
import  java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<String, String> tracklist = new HashMap<>();

    tracklist.put("Song1", "Lyrics of song1");
    tracklist.put("song2", "Lyrics of song2");
    tracklist.put("Song3", "Lyrics of song3");
    tracklist.put("Song4", "Lyrics of song4");

    String songTitle = "song2";
    String songLyrics = tracklist.get(songTitle);
    System.out.println("Song: "+ songLyrics);
    System.out.println("Lyrics: "+ songLyrics);

    for (Map.Entry<String, String>entry : tracklist.entrySet()){
      System.out.println("Track: "+ entry.getKey());
      System.out.println("Lyrics: "+ entry.getValue());
    }



  }
}