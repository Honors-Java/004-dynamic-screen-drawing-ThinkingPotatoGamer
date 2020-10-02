void setup() {
	size(300, 300);
  
}

int sizeChangeX = 10;
int sizeChangeY = 10;

double r;
double g;
double b;

void draw(){
  r = 2 * (mouseX - 150);
  g = 2 * (-1 * (mouseX - 215) - mouseY);
  b = 2 * (-1 * (mouseX + 50) + mouseY);

  rectMode(CENTER);
  fill(r, g, b);
}

//dont forget to add mouse and keypressed interaction functions

//Creates Quaderlaterals
void mousePressed(){
  rect(mouseX, mouseY, sizeChangeX, sizeChangeY);
  println("color( " + r + ", " + g + ", " + b + ")");
}

//Changes the dimensons of the Quads based off of x and y of mouse so long as a button is held
void keyPressed(){
  sizeChangeX = mouseX;
  sizeChangeY = mouseY;
  println("X size " + sizeChangeX);
  println("Y size " + sizeChangeY);
}