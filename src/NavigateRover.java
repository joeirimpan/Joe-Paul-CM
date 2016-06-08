import java.util.Scanner;

public class NavigateRover {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int fx = scan.nextInt();
		int fy = scan.nextInt();
		
		int posx = scan.nextInt();
		int posy = scan.nextInt();
		char initial = scan.next().charAt(0);
		int orientation;
		
		if(initial=='N')
			orientation = 0;
		else if(initial=='E')
			orientation = 1;
		else if(initial=='S')
			orientation = 2;
		else
			orientation = 3;
		
		scan.nextLine();
		
		String path = scan.nextLine();//LMLMLMLMM	//MMRMMRMRRM
		
		for(int i=0;i<path.length();i++){
			
			char c = path.charAt(i);
			
			if(c=='R')
				orientation = (orientation+1)%4;
			else if(c=='L'){
				orientation = (orientation-1)%4;
				}
			else{//M move one point
				
				if(orientation==0)//N
					posy++;
				else if(orientation==1)//E
					posx++;
				else if(orientation==2)//S
					posy--;
				else if(orientation==3)//W
					posx--;
				
			}
			
		}
		
		if(posx>fx||posy>fy)
			System.out.println("Out of the boundary");
		else
			System.out.println(posx+" "+posy+" "+orientation);
		
	}

}
