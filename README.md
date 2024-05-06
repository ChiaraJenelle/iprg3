pseudocode 

START
 //DECLARE
 rentPerHour AS REAL = 400 
rentPerMinute AS REAL = 1 
totalMinutes AS INTEGER 
hours AS INTEGER
 minutes AS INTEGER
 totalPrice AS REAL

// DISPLAY HEADING
DISPLAY "Sammy's Seashore Supplies" 

// INPUT TOTAL MINUTES
LET totalMinutes = INPUT()

// CALCULATE HOURS AND MINUTES
LET hours = totalMinutes DIV 60
LET minutes = totalMinutes MOD 60

// CALCULATE TOTAL PRICE
IF totalMinutes > 60 THEN
    LET totalPrice = (rentPerHour * hours) + (rentPerMinute * minutes) 
ELSE
    LET totalPrice = rentPerHour * hours 
ENDIF 

// DISPLAY RENTAL HOURS, MINUTES, AND TOTAL PRICE
DISPLAY "Rental Hours:", hours 
DISPLAY "Rental Minutes:", minutes
DISPLAY "Total Price: R", totalPrice
STOP



flowchart
