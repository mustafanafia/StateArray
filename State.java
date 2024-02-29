//-------------------------------------------------
//   State Class
//
//   STUDENTS:  UPDATE WITH YOUR PERSONAL INFORMATION
//-------------------------------------------------

public class State
{
    private String stateName;
    private String stateCapital;
    private String stateBird;
    private String stateFlower;

    private String stateNickName;
    private String dateEnteredUnion;
    private int yearSettled;
    
//--------------------------------------------------
//    Constructor for the State class
//--------------------------------------------------

    public State (String stateName, String stateCapital, String stateBird, String stateFlower,String stateNickName, String dateEnteredUnion, int yearSettled)
    {
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.stateBird = stateBird;
        this.stateFlower = stateFlower;
        
        this.stateNickName = stateNickName;
        
        
        this.dateEnteredUnion = dateEnteredUnion;
        
        
  
        
        if (yearSettled >= 1600 || yearSettled <= 2018) 
        
        this.yearSettled = yearSettled;
    
        
        
        
    }
        
        
  
       

//--------------------------------------------------
//    Accessors for the State class
//--------------------------------------------------

    public String getStateName()
    {   return stateName;   }

    public String getStateCapital()
    {   return stateCapital;    }

    public String getStateBird()
    {   return stateBird;   }

    public String getStateFlower()
    {   return stateFlower; }

    
    
    public String getstateNickName() {
        return stateNickName; }
        
    public String getDateEnteredUnion() {
        return dateEnteredUnion; } 
    
    public int getYearSettled() {
        return yearSettled; } 
        
//--------------------------------------------------
//    Mutators for the State class
//--------------------------------------------------

    public void setStateName(String stateName)
    {   this.stateName = stateName; }

    public void setStateCapital(String stateCapital)
    {   this.stateCapital = stateCapital;   }

    public void setStateBird(String stateBird)
    {   this.stateBird = stateBird; }

    public void setStateFlower(String stateFlower)
    {   this.stateFlower = stateFlower; }
    
    
    
    public void setstateNickName(String stateNickName)
    {   this.stateNickName = stateNickName; }
    
    
    public void setdateEnteredUnion(String dateEnteredUnion)
    {   this.dateEnteredUnion = dateEnteredUnion; }
    
    
    public void setyearSettled(int yearSettled)
    {   this.yearSettled = yearSettled; }
    
    

}