
public class Score {
	private static final double WG1 = 0.25;		//Average Grade Weight
	private static final double WG2 = 0.15;		//Current Year Weight
	private static final double WG3 = 0.25;		//Total Failed courses after September Weight
	private static final double WG4 = 0.35;		//Languages Degrees Weight
	private static final double WL1 = 0.4;		//English Degree Sub-Weight
	private static final double WL2 = 0.5;		//Destination Language Degree Sub-Weight
	private static final double WL3 = 0.1;		//Average of Other Degrees Sub-Weight
	
	public static double CalculateGrade(Student stud) {
		return WG1*stud.getGrade();
		
	}
	
	public static double CalculateYear(Student stud) {
		return WG2*stud.getYear();
		
	}
	
	public static double CalculateFailed(Student stud) {
		return WG3*stud.getFailed();
		
	}
	
	
	public static double CalculateLanguage(Student stud, University uni) {
		//Wainting for Class Student & University
		return 0;
		
	}
	
	public static double CalculateTotal(Student stud, University uni) {
		float Final=CalculateGrade(stud)+CalculateYear(stud)+CalculateFailed(stud)+CalculateLanguage(stud,uni);
		return Final;
		
	}
}