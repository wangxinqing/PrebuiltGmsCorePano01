package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: aeek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeek {
    public static Uri a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            String a = aeeg.a(context.getContentResolver(), "context_sensitive_help_url", "https://support.google.com/mobile/?hl=%locale%");
            if (a.contains("%locale%")) {
                Locale locale = Locale.getDefault();
                a = a.replace("%locale%", locale.getLanguage() + "-" + locale.getCountry().toLowerCase(locale));
            }
            Uri.Builder buildUpon = Uri.parse(a).buildUpon();
            buildUpon.appendQueryParameter("p", str);
            try {
                buildUpon.appendQueryParameter("version", String.valueOf(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionCode));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("HelpUrl", "Error finding package " + context.getApplicationInfo().packageName);
            }
            return buildUpon.build();
        }
        throw new IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty");
    }
}
