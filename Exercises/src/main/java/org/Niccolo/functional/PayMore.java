package org.Niccolo.functional;

import java.util.Map;
import java.util.function.BiFunction;

public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta){
        fees.replaceAll((number, fee) -> number.startsWith(numberFamily) ? fee + costDelta : fee);
    }
}
