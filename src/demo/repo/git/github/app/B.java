package demo.repo.git.github.app;

public class B {

	public static String getLines() {
		StringBuffer sb= new StringBuffer();
		sb.append(" B.First ");
<<<<<<< HEAD
		sb.append("\n B.V2-Local  ");
=======
		sb.append("\n B.V2Remote  ");
>>>>>>> bc84bb5af0fd3eedf1b6a085d7cdb3ca45226cbf
		sb.append("\n B.Last ");
		return sb.toString();
	}
	
}
