PImage Kat;
int x = 339;
int y = 304;
int acceleration = 1;

void setup(){
   size(800, 600);
   Kat = loadImage("Catt.jpeg");
   Kat.resize(800, 600);
   background(Kat);
}

void draw(){
if(mousePressed){
//println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
fill(random(0, 256), 0, 0);
noStroke();
ellipse(x, y, 50, 50);
fill(random(0, 256), 0, 0);
noStroke();
ellipse(x+130, y, 50, 50);
y+=2*acceleration;
x-=2*acceleration;
if (x > 800 ){
  //if (y > 600) {
    x = 339;
    y = 304;
    acceleration = 1;
    //}
}
}
}

