package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: yue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yue {
    public static void a(Bundle bundle, String str, String str2, String str3, int i, String str4, String[] strArr, PendingIntent pendingIntent) {
        bundle.putString("authAccount", str);
        bundle.putString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", str2);
        bundle.putString("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME", str3);
        bundle.putInt("com.google.android.gms.plus.intent.extra.SIGN_UP_STATE", i);
        if (strArr != null) {
            bundle.putStringArray("request_visible_actions", strArr);
        }
        bundle.putString("com.google.android.gms.plus.intent.extra.AUTH_SCOPE_STRING", str4);
        bundle.putParcelable("com.google.android.gms.plus.intent.extra.AUTH_TOKEN_INTENT", pendingIntent);
    }

    public static boolean a(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("https://www.googleapis.com/auth/games")) {
                return true;
            }
            if (str.contains("plus.") && !str.endsWith("plus.me")) {
                return true;
            }
        }
        return false;
    }
}
