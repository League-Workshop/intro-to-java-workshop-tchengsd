PImage mustache;
PImage smash;
void setup() {
 size(450,600);
 smash=loadImage("smash.png");
 smash.resize(width,height);
 mustache=loadImage("mustache.png");
 mustache.resize(150
 ,50);
}
void draw() {
  background(smash);
  if (mousePressed){
  image(mustache,mouseX,mouseY);
}}