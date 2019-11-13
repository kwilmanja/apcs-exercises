class Pantry
{
// Instance Variables
  private Jam  selected;
  private int number_of_jams;
  private Jam[] jars = new Jam[3];
  private boolean low = false;

  // Constructors:
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this.jars[0] = jar1 ;
    this.jars[1] = jar2 ;
    this.jars[2] = jar3 ;
    selected = null ;
    number_of_jams = 3;
  }
  Pantry( Jam jar1, Jam jar2)
  {
    this.jars[0] = jar1 ;
    this.jars[1] = jar2 ;
    this.jars[2] = null ;
    selected = null ;
    number_of_jams = 2;
  }
  Pantry( Jam jar1)
  {
    this.jars[0] = jar1 ;
    this.jars[1] = null ;
    this.jars[2] = null ;
    selected = null ;
    number_of_jams = 1;
  }


  // Methods:
  public String toString()
  {
    String str = "";
    if (jars[0] != null) str += "1: " +  jars[0].toString()  + "\n";
    if (jars[1] != null) str += "2: " +  jars[1].toString()  + "\n";
    if (jars[2] != null) str += "3: " +  jars[2].toString()  + "\n";     
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    selected = null;
    if ( jarNumber == 1 && number_of_jams >= 1)
      selected =  jars[0];
    else if (jarNumber == 2 && number_of_jams >= 2)
      selected = jars[1];
    else if ((jarNumber == 3 && number_of_jams >= 3))
      selected = jars[2];

    if (selected != null)
      return true;
    return false;


  }

  public void replace(Jam j, int slot){
    //System.out.println(jars[slot -1] + " replaced with " + j);
    jars[slot - 1] = j;
  }


  // spread the selected jam
  public void spread( int oz )
  {
    selected.spread(oz);
  }

  public String find_date(){
    String dateString;
    String subString;
    int date;
    int current_date = 99;
    String final_date = "";
    for (int i = 0; i < number_of_jams; i++){
      dateString = jars[i].getDate();
      subString = dateString.substring(dateString.length() - 2);
      date = Integer.parseInt(subString);
      if (date < current_date){
        current_date = date;
        final_date = dateString;
      }
    }
    return final_date;
  }
  
    public int get_all_OZ(){
    int total = 0;
    for (int i = 0; i < number_of_jams; i++){
      total += jars[i].getOZ();
    }
    return total;
  }

  public void combine(){
    if (!jars[0].getName().equals("Mixed Fruit")){
      if (jars[0].getOZ() < 3 && jars[1].getOZ() < 3 && jars[2].getOZ() < 3){      
        Jam mixed = new Jam("Mixed Fruit", find_date(), get_all_OZ());
        jars[0] = mixed;
        jars[1] = null;
        jars[2] = null;
        number_of_jams = 1;
      }
    }
  }
}