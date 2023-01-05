package demo.repo.git.github.app;

public class C {

	public static String getLines() {
		StringBuffer sb= new StringBuffer();
		sb.append(" C.First ");
		sb.append("\n C.V1  ");
		sb.append("\n C.Last ");
<<<<<<< HEAD
		sb.append("\n C.NewLocal ");
=======
		sb.append("\n C.NewRemote ");
>>>>>>> bc84bb5af0fd3eedf1b6a085d7cdb3ca45226cbf
		return sb.toString();
	}
	
}
