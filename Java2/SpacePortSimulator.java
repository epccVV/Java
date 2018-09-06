public class SpaceGasStationSimulator
{
	public static void main(String[] args)
	{
		GasStation localSpaceGasStation = new GasStation();
	}

	public class GasStation
	{

		private GasPort[] allTheGasPorts;

		public GasStation()
		{
			this.allTheGasPorts = new GasPort[8];
		}

		public class GasPort
		{
			private boolean functioning;
			private SpaceShip occupyingShip;

			public GasPort()
			{
				this.functioning = gambleOdds(0.75);
			}

			public boolean dock(SpaceShip arrivingSpaceShip)
			{
				if (this.functioning) {
					occupyingShip = arrivingSpaceShip;
					return true;
				} else return false;
			}

			public boolean release


		}
	}

	public class SpaceShip
	{
		public SpaceShip()
		{

		}
	}

	public static boolean gambleOdds(double percentOfWinning) {	return Math.random() <= percentOfWinning; }
}