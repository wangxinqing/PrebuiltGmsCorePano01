package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;

/* renamed from: iaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iaf {
    private static final iwd a = new iwd("CommonAccount", "PackageUtil");

    public static amri a(Application application, String str) {
        try {
            return amri.b(application.getPackageManager().getApplicationIcon(str));
        } catch (PackageManager.NameNotFoundException e) {
            a.d("Cannot find icon of package: %s", str, e);
            return ampu.a;
        }
    }

    public static String b(Application application, String str) {
        try {
            return jni.b(application).b(str).toString();
        } catch (PackageManager.NameNotFoundException e) {
            a.d("Cannot find label of package: %s", str, e);
            return "";
        }
    }
}
