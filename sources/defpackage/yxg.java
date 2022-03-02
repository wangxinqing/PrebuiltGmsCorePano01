package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: yxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxg {
    public static String a(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return null;
        }
        Locale locale = configuration.locale;
        String country = locale.getCountry();
        String language = locale.getLanguage();
        String str = !TextUtils.isEmpty(country) ? "-" : "";
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + str.length() + String.valueOf(country).length());
        sb.append(language);
        sb.append(str);
        sb.append(country);
        return sb.toString();
    }
}
