
public class ArrayAlg {

	public static Hello<String> minmax(String []a){
		if(a==null||a.length==0){
			return null;
		}
       String min=a[0];
       String max=a[0];
       for(int i=1;i<a.length;i++){

       if(min.compareTo(a[0])>0) min=a[i];
       if(max.compareTo(a[0])<0) max=a[i];
       }

	return new Hello<String>(min,max);
}}
