/*
The code originates from
https://www.codequality.rocks/post/making-untestable-testable-again
*/
public partial class MainWindow : Window {
    public MainWindow() {
        InitializeComponent();
    }

    private void Send_Click(object sender, RoutedEventArgs e) {
        var name = NameTextBox.Text;
        var crossSum = CalculateCrossSum(DataTextBox.Text);
    
        if (crossSum != 0.0) {
            MessageBox.Show($"{name} has the crossSum: {crossSum}");
        }
    }

    private static double CalculateCrossSum(string strNumber) {
        double result = 0.0;
        foreach (var digit in strNumber) {
            if (double.TryParse(digit.ToString(), out var number)) {
                result += number;
            } else {
                MessageBox.Show($"could not parse the data '{strNumber}' ");
                return 0.0;
            }
        }
        return result;
    }
}
