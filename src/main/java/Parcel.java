public class Parcel {
  private int mLength;
  private int mWidth;
  private int mHeight;
  private int mWeight;

 public Parcel (int length, int width, int height, int weight){
   mLength = length;
   mWidth = width;
   mHeight = height;
   mWeight = weight;
 }
 public int volume() {
   return (mLength*mWidth*mHeight);
 }
 public double cost() {
   return ((volume()*.1)+(mWeight*.1));
 }
}
