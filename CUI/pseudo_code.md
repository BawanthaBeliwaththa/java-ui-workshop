```
BEGIN
  Machines = 5
  INPUT Total_Power
  INPUT Machine_Power[]
  CALCULATE Optimal_Load [] = Machine_Power[i]
  CALCULATE Require_Power = SUM of Machine_Power[i]
  IF Require_Power > Total_Power
    CALCULATE Optimal_Load = (Machine_Power / Require_Power) * Total_Power
    DISPLAY Optimal_Load
    IF Load > Total_Power
      CALCULATE Optimal_Load = ADJUST_LOAD(Optimal_Load)
      DISPLAY Optimal_Load
    ELSE
      DISPLAY “Insufficient Power”
    END IF
  END IF
END
```
