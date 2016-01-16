package temperature;

public class ConwertTemperature {
	
	// ft - ����������� �� ����������
	// 32, 5/9 - ���, �������� magic numbers
	public double convertToCelsius(double ft) {
		return (ft - 32) * 5/9;
	}
	
	// cel - ����������� �� �������
	// 9/5, 32 - ���, �������� magic numbers
	public double convertToFahrenheit(double cel) {
		return (cel * 9/5) + 32;
	}

}
