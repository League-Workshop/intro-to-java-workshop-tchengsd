int x=0;

void setup(){
  size(800,800);
  noStroke();
}
void draw(){
  if(mousePressed){
    fill(0,255,0);
    x++;
  }
  else{
    fill(0,255,150);
  }
  ellipse(x,400,800,800);
}