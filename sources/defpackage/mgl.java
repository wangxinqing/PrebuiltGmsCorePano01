package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: mgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgl extends izd {
    public mgl(Context context, String str, int i) {
        super(context, str, i, -1, 6656);
        String str2;
        a("X-Device-ID", Long.toHexString(jhg.a(context)));
        a("User-Agent", izu.a(context, "Family/1.0"));
        Configuration configuration = context.getResources().getConfiguration();
        Locale locale = jkr.c() ? configuration.getLocales().get(0) : configuration.locale;
        if (locale != null && !TextUtils.isEmpty(locale.toString())) {
            int i2 = Build.VERSION.SDK_INT;
            str2 = locale.toLanguageTag();
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            a("Accept-Language", str2);
        }
    }
}
