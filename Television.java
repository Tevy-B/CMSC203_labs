/**
 * 
 * The purpose of this class is to model  a televsion 
 * Sethatevy Bong, 02/22/2020
 *
 */
public class Television {

	//fields
	private final String MANUFACTURER;//brand name - cannot change
	private final int SCREEN_SIZE;//size of the television - cannot change
	private boolean powerOn;//if true power is on, if false power is off
	private int channel;//hold the value of the station
	private int volume;//loudness - 0 being no sound
	
	
	/**
	 * 
	 * @param brand
	 * @param size
	 * create a constructor definition that will bring in information
	 * assign values taken in from the parametes to the corresponding fields
	 * 
	 * initialize the powerOn field to false (power is off), the volume to 20
	 * ,and the channel to 2
	 */
	public Television(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	/**
	 * get the channel
	 * @return the channel
	 */
	public int getChannel()
	{
		return channel;
	}
	
	
	/**
	 * get the volume
	 * @return the volume
	 */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	 * get teh Manufacturer's brand
	 * @return the manufacturer
	 */
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	/**
	 * get the screen size
	 * @return the screen size
	 */
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	/** 
	 * station setter method
	 * @param station store the desired station in the channel field
	 */
	public void setChannel(int station)
	{
		 channel = station;	
	}
	
	/**
	 * toggle the power between on adn off
	 * power method change the value in powerOn field from true to false or false to true 
	 */
	public void power() 
	{
		powerOn = true;
		powerOn = !powerOn;	
	}
	
	/**
	 * increaseVolume method increase the volume by 1
	 */
	public void increaseVolume()
	{
		volume++;
	}
	
	/** 
	 * decreaseVolume method decrease the volume by 1
	 */
	public void decreaseVolume()
	{
		volume--;
	}
	
	
}
