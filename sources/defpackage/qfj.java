package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: qfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfj {
    public static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(268435456);
        return intent;
    }

    public static Intent a(String str, String str2, long j) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setClassName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.UrlHandler");
        intent.setFlags(268435456);
        intent.putExtra("com.google.android.gms.instantapps.API_CALLER_PKG", str2);
        intent.putExtra("com.google.android.gms.instantapps.API_CALL_TIME_MS", j);
        return intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r1.getPackageManager().queryIntentActivities(r2, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r1, android.content.Intent r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0015
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r2, r0)
            if (r1 == 0) goto L_0x0015
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0015
            r1 = 1
            return r1
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfj.a(android.content.Context, android.content.Intent):boolean");
    }
}
