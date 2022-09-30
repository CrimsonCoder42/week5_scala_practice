package cscie88cNotes.week2


// case classes useful in functional programming
// use prefix case
object CaseClasses {

}


final case class CustomerTransaction(
    customerID: String,
    transactionDate: String,
    transactionAmount: Double
                                    )

//object CustomerTransaction {
//  def apply(csvRow: String): CustomerTransaction = {
//    val fields = csvRow.split(",")
//    CustomerTransaction(
//      customerId = fields(0)
//    )
//  }
//}