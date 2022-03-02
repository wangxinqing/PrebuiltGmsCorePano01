package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: qoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qoj {
    public static TelephonyManager a(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static String a(Context context, String str) {
        String stripSeparators;
        String str2;
        String str3;
        String str4 = null;
        if (str == null || (stripSeparators = PhoneNumberUtils.stripSeparators(str)) == null) {
            return null;
        }
        TelephonyManager a = a(context);
        if (a != null) {
            str2 = a.getSimCountryIso();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            Locale locale = Locale.getDefault();
            if (locale != null) {
                str4 = locale.getCountry();
            }
        } else {
            str4 = str2;
        }
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4.toUpperCase(Locale.US);
        } else {
            str3 = "US";
        }
        int i = Build.VERSION.SDK_INT;
        String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(stripSeparators, str3);
        return TextUtils.isEmpty(formatNumberToE164) ? stripSeparators : formatNumberToE164;
    }
}
