class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  //constructor
  Language(String langName, int numSpeak, String regSpoken, String wrdOrder){
    this.name = langName;
    this.numSpeakers = numSpeak;
    this.regionsSpoken = regSpoken;
    this.wordOrder = wrdOrder;
  }

  //method getInfo
  public void getInfo() {
 
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
 
    }

  //main method
  public static void main(String[] args){
    Language english = new Language("English", 1000000, "UK, USA, Spain", "subject-verb-object");
    english.getInfo();
    Language chontal = new Mayan("chontal", 36810);
    chontal.getInfo();
    Language chinese = new SinoTibetan("Mandarin Chinese", 2000000);
    chinese.getInfo();
    Language nonChinese = new SinoTibetan("Burmese", 100234);
    nonChinese.getInfo();
  }
}
