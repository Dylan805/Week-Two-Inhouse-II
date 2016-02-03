public class Money 
{
    private long dollars;
    private long cents;

    // Constructors

    /**
     * Empty constructor that sets dollars and cents to zero.
     */
	 public Money()
	 {
		 setDollars(0);
		 setCents(0);
	 }

    /**
     * Constructor with parameter for dollars, cents
     */
	 
	 public Money(long dollar, long cent)
	 { 
		 if (dollar >= 0 && cent >= 0)
		 {
			setDollars(dollar);
			setCents(cent);
			
			while (cents >= 100)
			{
				cents = cents - 100;
				dollars = dollars + 1;
			}
		 }
		 
		 else
		 {
			 System.out.println("ERROR: Neagative Value");
		 }
		
	 }

    // Getters & Setters

    /**
     * Getters for private variables
     */
	 
	 public long getDollars()
	 {
		return dollars;
	 }
	 
	 public long getCents()
	 {
		 return cents;
	 }
	 
	 private void setDollars(long amount)
	 {
		 dollars = amount;
	 }
	 
	 private void setCents(long amount)
	 {
		 cents = amount;
	 }

    // Public Methods

    /**
     * toString() method returns a formatted string for printing
     */
	 public String toString()
	 {
		 return ("You have " + getDollars() + " dollars and " + getCents() + " cents.");
	 }

    /**
     * add(Money value) binary operator
     * returns sum of object plus value
     */
    public Money add(long dollar, long cent)
    {
        this.cents = this.cents + cent;
        this.dollars = this.dollars + dollar;
		
		while (this.cents >= 100)
		{
			this.cents = this.cents - 100;
			this.dollars = this.dollars + 1;
		}
		
        return this;
    }
    
    public Money subtract (long sdollar, long scent)
    {
        while (scent >= 100)
        {
            scent = scent - 100;
            sdollar = sdollar + 1;
        }
   
        this.cents = this.cents - scent;
        this.dollars = this.dollars - sdollar;
            
        if (this.cents < 0)
        {
            this.cents = this.cents + 100;
            this.dollars = this.dollars - 1;
        }
        
        if (this.dollars < 0)
        {
            System.out.println("ERROR: Negative amount");
        }
        
        return this;
    }
}
