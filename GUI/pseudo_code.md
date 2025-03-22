BEGIN
  IF Login Correct
    INPUT Vehicle_ID as V_ID
    IF Vehicle Has a Tracker
      IF Vehicle Functions Work
        IF Fuel is Okay
          IF Vehicle Condition Okay
            IF Vehicle Has Installed New System
              CALCULATE Fixed Errors
              OUTPUT Errors Added to DataBase
            ELSE
              CALCULATE New System Added
            ENDIF
          ELSE
              CALCULATE Fix The Errors on Conditions
          ENDIF
        ELSE
          CALCULATE Fix The Errors on Fuel
        ENDIF
      ELSE
        CALCULATE Fix The Errors on Functions
      ENDIF
    ELSE
      CALCULATE Fix the Tracker on Vehicle
    ENDIF
  ELSE 
    OUTPUT Try Login Credentials Again
  ENDIF
END
    
        
