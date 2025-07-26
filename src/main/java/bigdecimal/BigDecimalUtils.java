package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtils {

    public static double roundToHundredth(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal value) {
        BigDecimal negated = value.negate();
        return negated.setScale(1, RoundingMode.HALF_UP);
    }
}
