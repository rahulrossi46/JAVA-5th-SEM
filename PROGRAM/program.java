package programs; 
class SbiAcc {
	private String Accholder;
	private int Balance;
	SbiAcc(String Accholder , int Balance) {
		this.Accholder=Accholder;
		this.Balance=Balance;
 }
public String getAccholder()  {
	return Accholder;
}
 public int getBalance() {
	return Balance;
}
 public void deposit(int dep) {
	if (Balance > 0) {
	Balance += dep;
	//Balance = balance + dep;
	System.out.println("Deposit Amount:"+dep);
	System.out.println("Now Current Balance:"+Balance);
	}
}
 public void setAccholder(String Accholder) {
	this.Accholder=Accholder;
  }
  public void setWithdraw(int withdraw) {
      Balance -= withdraw;
      System.out.println("withdrawn amount:"+withdraw);
  }
}
public class BankDetails {
     public static void main(String[] args) {
     SbiAcc ac=new SbiAcc("John" , 20000);
     System.out.println("Account holder Name:" +ac.getAccholder());
     ac.setAccholder("RAHUL");
     System.out.println("update account holder:"+ac.getAccholder());
     System.out.println("Balance:" +ac.getBalance());
     ac.Deposit(3000);
     ac.setWithdraw(20000);
     System.out.println("Avail Balance:"+ac.getBalance());

	}
   }