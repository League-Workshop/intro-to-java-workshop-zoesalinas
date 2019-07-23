PImage mustache;
PImage Me;
void setup(){
  Me= loadImage ("Me.jpg");
  size (450, 600);
  Me.resize(450,600);
 mustache=loadImage ("mustache.png");
  mustache.resize(100, 50);
}
void draw(){
  background(Me);
  image (mustache, mouseX, mouseY);
}
