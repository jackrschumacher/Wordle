import java.util.*;
public class Wordle{
  private static String[] WORD_LIST = new String[]{"zesty", "zebra", "zippy", "zonal", "zones","wages", "wains", "wakes", "wales", "walks","xenon", "xylem", "xylyl", "xebec", "xrays","fancy", "felon", "fever", "fight", "final","rabbi", "roose", "resin", "revel", "rater","eager", "early", "earth", "elbow", "elect","udder","under","uncle","union","unity","organ", "onion ", "older",  "ocean ", "olive ", "pedal ", " pixel", "plain", "plane", "penny", "panic","hydro", "helix", "harpy", "heist", "horde","jolly", "juror", "joker", "jumpy", "judge","makes", "macaw", "macro", "micro", "magic","nacho", "ninja", "navvy", "nymph", "niece","start", "shown", "scrap", "stare", "smear","train", "track", "timed", "thyme", "tours","knead", "kites", "kilos", "knelt", "knoll", "label", "labor", "lacks", "lapel", "lamas","icing", "igloo", "index", "inter", "irony","gamer", "golem", "greed", "ghoul", "gamma","dough", "dream", "doubt", "death", "darts","bacon", "basic", "beach", "beard", "beats","quasi", "quail", "quads", "quack", "queen","apple", "adult", "asset", "above", "angry","court", "cases", "check", "chick", "chain","yoink", "yearn", "young", "youth", "yacht","video", "valve", "vapor", "valid", "valet" };

  // Word Acessses When game is run
  private String currentWord;
  private int guessesRemaining;

  public Wordle(){
    currentWord = selectWord();
    guessesRemaining = 6;
  }
  
  private String selectWord(){
    return (WORD_LIST[(int)(Math.random()* WORD_LIST.length)]);
  }
}