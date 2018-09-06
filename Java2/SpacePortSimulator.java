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
			private boolean isFunctioning;
			private SpaceShipContainer shipContainer;

			public GasPort()
			{
				this.isFunctioning = gambleOdds(0.75);
			}

			public boolean tryToDock(SpaceShip arrivingSpaceShip)
			{
				if (this.isFunctioning) {
					shipContainer = new SpaceShipContainer(arrivingSpaceShip);
					return true;
				} else return false;
			}

			public boolean release

			public class SpaceShipContainer
			{
				private SpaceShip spaceShip;

				public SpaceShipContainer(SpaceShip containedShip)
				{
					this.spaceShip = containedShip;
				}

				public void add(con)
			}
		}
	}

	public class SpaceShip
	{
		public SpaceShip()
		{

		}
	}

	public static boolean gambleOdds(double decimalPercentOfWinning) {	return Math.random() <= decimalPercentOfWinning; }
}