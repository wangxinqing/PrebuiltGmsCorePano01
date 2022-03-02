package defpackage;

import java.math.BigDecimal;
import java.util.Objects;

/* renamed from: aue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aue {
    private static final BigDecimal a = new BigDecimal(20);
    private static final BigDecimal b = new BigDecimal(90);
    private static final BigDecimal c = new BigDecimal(180);
    private static final BigDecimal d = new BigDecimal(4);
    private static final BigDecimal e = new BigDecimal(5);
    private final String f;

    public aue(double d2, double d3) {
        double d4;
        int min = Math.min(12, 15);
        if (min < 4 || (min < 10 && (min & 1) == 1)) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Illegal code length ");
            sb.append(min);
            throw new IllegalArgumentException(sb.toString());
        }
        double min2 = Math.min(Math.max(d2, (double) (-b.intValue())), (double) b.intValue());
        while (d3 < ((double) (-c.intValue()))) {
            int intValue = c.intValue();
            double d5 = (double) (intValue + intValue);
            Double.isNaN(d5);
            d3 += d5;
        }
        while (d3 >= ((double) c.intValue())) {
            int intValue2 = c.intValue();
            double d6 = (double) (intValue2 + intValue2);
            Double.isNaN(d6);
            d3 -= d6;
        }
        if (min2 == b.doubleValue()) {
            if (min > 10) {
                d4 = Math.pow((double) a.intValue(), -3.0d) / Math.pow((double) e.intValue(), (double) (min - 10));
            } else {
                d4 = Math.pow((double) a.intValue(), Math.floor((double) ((min / -2) + 2)));
            }
            min2 -= d4 * 0.9d;
        }
        BigDecimal bigDecimal = new BigDecimal(min2 + b.doubleValue());
        BigDecimal bigDecimal2 = new BigDecimal(d3 + c.doubleValue());
        StringBuilder sb2 = new StringBuilder();
        BigDecimal bigDecimal3 = a;
        BigDecimal multiply = bigDecimal3.multiply(bigDecimal3);
        BigDecimal bigDecimal4 = a;
        BigDecimal multiply2 = bigDecimal4.multiply(bigDecimal4);
        int i = 0;
        while (i < min) {
            if (i >= 10) {
                multiply = multiply.divide(e);
                multiply2 = multiply2.divide(d);
                BigDecimal divide = bigDecimal.divide(multiply, 0, 3);
                BigDecimal divide2 = bigDecimal2.divide(multiply2, 0, 3);
                bigDecimal = bigDecimal.subtract(multiply.multiply(divide));
                bigDecimal2 = bigDecimal2.subtract(multiply2.multiply(divide2));
                sb2.append("23456789CFGHJMPQRVWX".charAt((divide.intValue() * d.intValue()) + divide2.intValue()));
                i++;
            } else {
                multiply = multiply.divide(a);
                multiply2 = multiply2.divide(a);
                BigDecimal divide3 = bigDecimal.divide(multiply, 0, 3);
                BigDecimal divide4 = bigDecimal2.divide(multiply2, 0, 3);
                bigDecimal = bigDecimal.subtract(multiply.multiply(divide3));
                bigDecimal2 = bigDecimal2.subtract(multiply2.multiply(divide4));
                sb2.append("23456789CFGHJMPQRVWX".charAt(divide3.intValue()));
                sb2.append("23456789CFGHJMPQRVWX".charAt(divide4.intValue()));
                i += 2;
            }
            if (i == 8) {
                sb2.append('+');
            }
        }
        if (i < 8) {
            while (i < 8) {
                sb2.append('0');
                i++;
            }
            sb2.append('+');
        }
        this.f = sb2.toString();
    }

    public static String a(double d2, double d3) {
        return new aue(d2, d3).f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f, ((aue) obj).f);
    }

    public final int hashCode() {
        String str = this.f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f;
    }
}
