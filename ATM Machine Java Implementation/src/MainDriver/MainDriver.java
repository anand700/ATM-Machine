 package MainDriver;
import Input.Account1;
import Input.Account2;
import MDA_EFSM.MDA_EFSM;
import Output.Output;
import AbstractFactory.A1Factory;
import AbstractFactory.A2Factory;
import java.util.Scanner;

/**
* This class is a Driver class which is used help the user to choose and call the accounts operations. Typically shows the execution of the ATM machine for two account types. 
* the accounts
* @author Anand N
* @Date 05/01/2016
*/
public class MainDriver {
	
	
	static final int account1Value = 1;
	static final int account2Value = 2;
	
	public static void main(String[] args){
		System.out.println("MainDriver>>");
		Scanner scanner = new Scanner (System.in);
		//try{
			System.out.println("\n******Choose Account******");
			System.out.println("\n1. Account1");
			System.out.println("\n2. Account2");
			int option = Integer.parseInt(scanner.next());
			if(1 != option && 2!= option){
				System.out.println("\nIncorrect option. Please execute again with the correct option.");
			}
			if(1 == option){
				
				A1Factory a1fact = new A1Factory();
				Output o = new Output(a1fact.getDataStore(), a1fact);
				MDA_EFSM me = new MDA_EFSM(a1fact, o, account1Value);
				Account1 a1 = new Account1(me, a1fact.getDataStore());
				
				System.out.println("\n******Choose Account1 operations******");
				System.out.println("\n1. open(string,String,float)" );
			    System.out.println("\n2. login(String uid)" );
			    System.out.println("\n3. deposit(float)" );
			    System.out.println("\n4. withdraw(float)" );
			    System.out.println("\n5. balance()" );
			    System.out.println("\n6. pin(string pin)" );
			    System.out.println("\n7. logout()" );
			    System.out.println("\n8. lock(string PIN)" );
			    System.out.println("\n9. unlock(string PIN)" );
			    System.out.println("\nPress 999 to Quit" );
			    
			    while(true)
			    {
			           
			    	System.out.println("******Select Operation:******");
			    	System.out.println("1. open,2. login,3. deposit,4. withdraw,5. balance,6. pin,7. logout,8. lock,9. unlock");

			    	option = Integer.parseInt(scanner.next());
			    	if(option == 0 || option > 9){
			    		System.out.println("\nPlease enter the valid option");
			    		continue;
			    	}
			    	 if(option == 999){
			    		 break;
			    	 }
			         
			    	 float d, b, w;
			    	 String p, u;
			    	 
			         switch(option){
			         	
				      	    case 1: System.out.println("\nEnter value of pin : ");
					      			p = scanner.next();
					      			
					      			System.out.println("\nEnter value of uid : ");
					      			u = scanner.next();
					      			
					      			System.out.println("\nEnter the value of Balance : ");
					      			b = scanner.nextFloat();
					      			System.out.println("----------------------");
					      			a1.open(p,u,b);
					      			System.out.println("----------------------");
					      			break;
				      			
				      	    case 2: System.out.println("\nEnter value of uid : ");
							        u = scanner.next();
							        System.out.println("----------------------");
					      			a1.login(u);
					      			System.out.println("----------------------");
					      			p = scanner.next();
					      			System.out.println("----------------------");
					      			a1.pin(p);
					      			System.out.println("----------------------");
					      			break;
				      	  

				      	    case 3: System.out.println("\nEnter value to be deposited : ");
					      			d = scanner.nextFloat();
					      			System.out.println("----------------------");
					      			a1.deposit(d);
					      			System.out.println("----------------------");
					      			break;
				      				
				      	    case 4: System.out.println("\nEnter value to be withdrawn : ");
					      			w = scanner.nextFloat();
					      			System.out.println("----------------------");
					      			a1.withdraw(w);
					      			System.out.println("----------------------");
					      			break;
				      			

				      	    case 5: System.out.println("----------------------");
				      	    		a1.balance();
				      	    		System.out.println("----------------------");
				      	    		break;
				      			
				      	    case 6:	System.out.println("\nEnter value of pin : ");
					      			p = scanner.next();
					      			System.out.println("----------------------");
					      			a1.pin(p);
					      			System.out.println("----------------------");
					      			break;
				      			

				      	    case 7: System.out.println("----------------------");
				      	    		a1.logout();
				      	    		System.out.println("----------------------");
				      	    		break;
				      			
				      			
				      	    case 8: System.out.println("\nEnter value of pin : ");
					      			p = scanner.next();
					      			System.out.println("----------------------");
					      			a1.lock(p);
					      			System.out.println("----------------------");
					      			break;
				      			

				      	    case 9: System.out.println("\nEnter value of pin : ");
			      					p = scanner.next();
			      					System.out.println("----------------------");
					      			a1.unlock(p);
					      			System.out.println("----------------------");
					      			break;
				      			
				      			
				      	   default: System.out.println("Please enter a valid option");
			      					break;
				      			
			         }
				}
			}else{
				A2Factory a2fact = new A2Factory();
				Output o = new Output(a2fact.getDataStore(), a2fact);
				MDA_EFSM me = new MDA_EFSM(a2fact, o, account2Value);
				Account2 a2 = new Account2(me, a2fact.getDataStore());
				
				System.out.println("\n******Choose Account2 operations******");
				System.out.println("\n1. OPEN(int,int,int)" );
			    System.out.println("\n2. LOGIN(int)" );
			    System.out.println("\n3. DEPOSIT(int)" );
			    System.out.println("\n4. WITHDRAW(int)" );
			    System.out.println("\n5. BALANCE()" );
			    System.out.println("\n6. PIN(int)" );
			    System.out.println("\n7. LOGOUT()" );
			    System.out.println("\n8. Suspend()" );
			    System.out.println("\n9. activate()" );
			    System.out.println("\n10. close()" );
			    System.out.println("\nPress 999 to Quit" );
			    
				while(true)
			    {
					
					System.out.println("******Select Operation:******");
			    	System.out.println("1. OPEN,2. LOGIN,3. DEPOSIT,4. WITHDRAW,5. BALANCE,6. PIN,7. LOGOUT,8. Suspend,9. Activate, 10. close");
			           
			    	
			    	option = Integer.parseInt(scanner.next());
			    	if(option == 0 || (option < 999 && option >10) || option > 999){
			    		System.out.println("\nPlease enter the valid option");
			    		continue;
			    	}
			    	 if(option == 999){
			    		 break;
			    	 }
			         
			    	 int d, b, w, p, u;
			    	 
			         switch(option){
			         	
				      	    case 1: System.out.println("\nEnter value of pin : ");
					      			p = scanner.nextInt();
					      			
					      			System.out.println("\nEnter value of uid : ");
					      			u = scanner.nextInt();
					      			
					      			System.out.println("\nEnter the value of Balance : ");
					      			b = scanner.nextInt();
					      			System.out.println("----------------------");
					      			a2.OPEN(p,u,b);
					      			System.out.println("----------------------");
					      			break;
					      			
					      			
				      	    case 2: System.out.println("\nEnter value of uid : ");
							        u = scanner.nextInt();
							        System.out.println("----------------------");
					      			a2.LOGIN(u);
					      			System.out.println("----------------------");
					      			p = scanner.nextInt();
					      			System.out.println("----------------------");
					      			a2.PIN(p);
					      			System.out.println("----------------------");
					      			break;	


				      	    case 3: System.out.println("\nEnter value to be deposited : ");
					      			d = scanner.nextInt();
					      			System.out.println("----------------------");
					      			a2.DEPOSIT(d);
					      			System.out.println("----------------------");
					      			break;
				      				
				      	    case 4: System.out.println("\nEnter value to be withdrawn : ");
					      			w = scanner.nextInt();
					      			System.out.println("----------------------");
					      			a2.WITHDRAW(w);
					      			System.out.println("----------------------");
					      			break;
				      			

				      	    case 5: System.out.println("----------------------");
				      	    		a2.BALANCE();
				      	    		System.out.println("----------------------");
				      	    		break;
				    
				      			
				      	    case 6:	System.out.println("\nEnter value of pin : ");
					      			p = scanner.nextInt();
					      			System.out.println("----------------------");
					      			a2.PIN(p);
					      			System.out.println("----------------------");
					      			break;
			      			
				      	    case 7: System.out.println("----------------------");
				      	    		a2.LOGOUT();
				      	    		System.out.println("----------------------");
				      	    		break;
				      			
				      			
				      	    case 8: System.out.println("----------------------");
				      	    		a2.suspend();
				      	    		System.out.println("----------------------");
					      			break;
				      			

				      	    case 9: System.out.println("----------------------");
				      	    		a2.activate();
				      	    		System.out.println("----------------------");
				      	    		break;
					      			
				      	    case 10: System.out.println("----------------------");
				      	    		 a2.close();
				      	    		 System.out.println("----------------------");
				      	    		 break;
				      			
				      			
				      	   default: System.out.println("Please enter a valid option");
			      					break;
				      			
			         }
				}
			}
			System.out.println("MainDriver<<");
//		}catch(Exception ex){
//			System.out.println("Some exception occurred with ex = "ex.getMessage());
//		}finally {
//			scanner.close();
//		}
		scanner.close();
		}
		
}


