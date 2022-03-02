package defpackage;

import android.content.res.Resources;
import com.google.android.gms.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: yrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yrz {
    static String a(Resources resources, Locale locale, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        irk.a(z, (Object) "Count must be non-negative.");
        NumberFormat instance = NumberFormat.getInstance(locale);
        if (Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
            double d = (double) i;
            if (d < 1000.0d) {
                return instance.format((long) i);
            }
            int intValue = new BigDecimal(i).round(new MathContext(2)).intValue();
            if (d < 1000000.0d) {
                double d2 = (double) intValue;
                Double.isNaN(d2);
                return resources.getString(R.string.plus_one_count_in_the_thousands, new Object[]{instance.format(d2 / 1000.0d)});
            } else if (d >= 1.0E9d) {
                return resources.getString(R.string.plus_one_count_more_than_a_billion);
            } else {
                double d3 = (double) intValue;
                Double.isNaN(d3);
                return resources.getString(R.string.plus_one_count_in_the_millions, new Object[]{instance.format(d3 / 1000000.0d)});
            }
        } else if (i >= 9999) {
            return resources.getString(R.string.plus_one_count_many);
        } else {
            return instance.format((long) i);
        }
    }
}
