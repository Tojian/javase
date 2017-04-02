package qunaer;

public class Main1 {

	public String getFileSuffix(String path){
		return  path == null ||  path.lastIndexOf(".") == -1? null: path.substring(path.lastIndexOf(".") + 1);
		}
	public static void main(String[] args) {
		
	}
}
