import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(22, 15, 73);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(0);
    line(width/50*25,height/50*5,width/50*35,height/50*20);  

    stroke(0);
    line(width/50*25,height/50*5,width/50*13,height/50*20);
    
    stroke(0);
    line(width/50*13,height/50*20,width/50*14,height/50*20);
    
    stroke(0);
    line(width/50*34,height/50*20,width/50*35,height/50*20);
    
    fill(0,0,0);
    rect(width - width,height/50*39,width,height/50*110);
    
    fill(255, 0, 0);
    rect(width/50*14,height/50*19,width/50*20,height/50*20);
    
    fill(165,42,42);
    rect(width/50*4,height/50*22,width/50*4,height/50*17);
    
    fill(0,255,0);
    ellipse(width/50*6,height/50*20,width/50*7,height/50*7);
    
    fill(165,42,42);
    rect(width/50*30,height/50*32,width/50*4,height/50*7);
    
    fill(0,0,255);
    ellipse(width/50*33,height/50*36,width/50,height/50);
    
  }
  
  // define other methods down here.
}