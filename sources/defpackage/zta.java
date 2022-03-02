package defpackage;

import android.telephony.PhoneNumberUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: zta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zta {
    private static final Pattern a = Pattern.compile("[^0-9#*+]");

    public static String a(String str) {
        String country = Locale.getDefault().getCountry();
        if (ampw.a(country, Locale.US.getCountry()) || ampw.a(country, Locale.CANADA.getCountry())) {
            str = a.matcher(str).replaceAll("");
        }
        return PhoneNumberUtils.formatNumber(str);
    }
}
