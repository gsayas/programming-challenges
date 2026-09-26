You are tasked with implementing a payment processing function for an application. Streamers have payment requests and
our company has balances on certain currencies. We will pay streamers from our balances on currencies according to their
requested amount. The function should handle fund allocation in our company’s balance and make payments to streamers.

Function takes in the existing balance and payment requests to be processed as the input. It should deduct each payment
request from the existing balance when there are enough funds. Then, return the remaining balance and paid payment
requests as output. Here are the details:

Input Format: The function takes a single parameter, which is a string containing two sections separated by an "&"
character:

The first section lists available funds in the company’s balance in the format currency:amount|currency:amount|.... The
second section lists payment requests in the format streamer_id:currency:requested_amount|streamer_id:currency:
requested_amount|.... All amount and requested_amount are guaranteed to be integers. Note that any of the first and
second sections can be empty. You can assume input is always in the correct format.

Output Format: Return a string formatted as follows:

Output should be in the same notation as input: balance and payment parts with the same concatenation character "&".
Even if no payment or balance is listed, "&" concatenation character should always be stated. The balance part should be
ordered by currency name alphabetically and the resulting balance should be stated according to the notation (currency1:
remaining_amount|currency2:remaining_amount&....). Even if no balance is left after payments, each currency should be
listed with zero balance in the balance part if that currency was given in the input and supported. Paid payment
requests should be grouped together with their currency in the same order they’re listed in the balance part of the
output and ordered inside that group by the fee dropped amount ascending. Only the paid payment requests should be
listed in the output.

Requirements:

Only TRY, EUR, and USD should be supported. Skip funds and payments with unsupported currencies, and do not show
unsupported currency balance and unsupported currency payment on the output. Each currency has a processing fee (1 for
TRY and 2 for other supported currencies) applied to the requested_amount. The processing fee should be deducted from
the requested_amount before making a payment (resulting in the actual_amount). requested_amount should be higher than
the processing fee to pay the payment request. (i.e actual_amount should be positive)
The actual_amount should be deducted from the company’s balance. Ensure payments are processed in ascending order of
actual_amount for each currency. Each successful payment under each currency should be sorted by actual_amount in
ascending order. A streamer can have multiple payment requests both in the same currency or different currencies,
payments should not be merged in any way and must appear separately in the output. Your program should be able to easily
adapt to a new currency, if we plan to support new currency in the future. Clean coding and solving in acceptable time
complexity will be evaluated as well