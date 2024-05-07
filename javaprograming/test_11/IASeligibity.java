/* WAJP to check IAS eligibility 21-34 */

class IASeligibity
{
	public static void main(String[] args) 
	{
		int a = 11;
        
		String res = (a >= 21 && a <= 34 ? "eligibity for IAS" 
			                  : "Not eligibity for IAS");

		System.out.println(res);
	}
}
