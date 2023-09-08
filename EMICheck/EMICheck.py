
# Define the loan details
principal_amount = 1000000.00  # Principal amount in Rs.
monthly_emi = 15000.00        # Monthly EMI in Rs.
annual_interest_rate = 12     # Annual interest rate in percentage

# Convert the annual interest rate to monthly interest rate
monthly_interest_rate = (annual_interest_rate / 100) / 12

# Calculate the number of EMIs required to complete the loan
emi_count = -1  # Initialize the count of EMIs

# Use a loop to calculate the EMI count
while principal_amount > 0:
    # Calculate interest for the current month
    monthly_interest = (principal_amount * monthly_interest_rate)
    
    # Calculate the remaining principal after deducting the EMI
    principal_amount -= (monthly_emi - monthly_interest)
    
    # Increment the EMI count
    emi_count += 1

# Print the result
print("Number of EMIs to complete the loan:", emi_count)
