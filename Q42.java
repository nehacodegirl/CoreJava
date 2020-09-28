/*42.	Create a class Tile to store the 
edge length of a square tile, and create 
another class Floor to store length and width
 of a rectangular floor. Add method 
totalTiles(Tile t) in Floor class with Tile 
as argument to calculate the whole number of
 tiles
 needed to cover the floor completely.*/

class Tile{
	 int edge;
	Tile(int edge){
	this.edge=edge;
}
}

class Floor{
	private int length;
	private int width;

	Floor(int length,int width){
		this.length=length;
		this.width=width;
	}
	int totalTile(Tile t){
		int num = ((length*width)/(t.edge*t.edge));
		return num;		
	}
}

class Q42{
public static void main(String args[]){

	Floor f = new Floor(25,25);
	Tile t = new Tile(5);
	int tile = f.totalTile(t);
	System.out.println("No of tiles on floor : "+tile);
}

}