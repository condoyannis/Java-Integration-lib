import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

      public static void main(String[] args) {

               try {

	Report report = new Report();
			
	RapiResponse response = report.GetTransactionDetailReport(
		"merchantId", // REQUIRED - Merchant ID assigned by maxiPago!  //
		"merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
		"transactionId" // REQUIRED - Transaction ID created by maxiPago! //
	);

	if (response.getHeader().getErrorCode() == "0") {
                //  Success
}
else { 
             //  Fail
            	}

              } catch (Exception e) {
	e.printStackTrace();
              }
        }
}