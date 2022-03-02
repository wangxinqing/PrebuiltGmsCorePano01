package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: cqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqa {
    static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Cannot determine apk version.", e);
        }
    }
}
