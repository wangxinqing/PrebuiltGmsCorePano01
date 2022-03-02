package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* renamed from: snm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snm {
    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
    }
}
