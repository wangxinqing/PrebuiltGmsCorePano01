package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: hpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hpk {
    public static final CountDownLatch a = new CountDownLatch(1);
    public static final Object b = new Object();
    protected static volatile int c = -1;
    protected static volatile Boolean d;
    public static volatile ikh e;
    private static final Object f = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d5, code lost:
        if (r6 == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer a(android.content.Context r9) {
        /*
            int r0 = c
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 > 0) goto L_0x011a
            java.lang.Object r0 = f
            monitor-enter(r0)
            int r2 = c     // Catch:{ all -> 0x0117 }
            if (r2 > 0) goto L_0x0115
            hvk r2 = defpackage.hvk.c()     // Catch:{ all -> 0x0117 }
            htg r2 = defpackage.hth.a(r9, r2)     // Catch:{ all -> 0x0117 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0109 }
            r4 = 24
            if (r3 < r4) goto L_0x003b
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x002a }
            java.lang.String r3 = "boot_count"
            int r9 = android.provider.Settings.Global.getInt(r9, r3)     // Catch:{ SettingNotFoundException -> 0x002a }
            c = r9     // Catch:{ SettingNotFoundException -> 0x002a }
            goto L_0x0100
        L_0x002a:
            r9 = move-exception
            c = r1     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "BootCount"
            java.lang.String r4 = "Could not find system setting for BOOT_COUNT."
            android.util.Log.e(r3, r4, r9)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = "bootCountGlobalSettingNotFound"
            r2.a((java.lang.String) r9)     // Catch:{ all -> 0x0109 }
            goto L_0x0100
        L_0x003b:
            awsr r3 = defpackage.awsr.a     // Catch:{ all -> 0x0109 }
            awss r3 = r3.a()     // Catch:{ all -> 0x0109 }
            boolean r3 = r3.a()     // Catch:{ all -> 0x0109 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0109 }
            d = r3     // Catch:{ all -> 0x0109 }
            java.lang.Boolean r3 = d     // Catch:{ all -> 0x0109 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0109 }
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0065
            java.lang.String r3 = "bootCount"
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r3, r5)     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "bootCount"
            int r9 = r9.getInt(r3, r4)     // Catch:{ all -> 0x0109 }
            c = r9     // Catch:{ all -> 0x0109 }
            goto L_0x0100
        L_0x0065:
            java.lang.Object r3 = b     // Catch:{ all -> 0x0109 }
            monitor-enter(r3)     // Catch:{ all -> 0x0109 }
            java.lang.String r6 = "com.google.android.gms.clearcut.uploader.QosUploaderService"
            ikd r7 = defpackage.hpj.a     // Catch:{ all -> 0x0106 }
            ikh r6 = defpackage.ikh.b(r9, r6, r5, r7)     // Catch:{ all -> 0x0106 }
            e = r6     // Catch:{ all -> 0x0106 }
            monitor-exit(r3)     // Catch:{ all -> 0x0106 }
            java.util.concurrent.CountDownLatch r3 = a     // Catch:{ InterruptedException -> 0x008e }
            awsr r6 = defpackage.awsr.a     // Catch:{ InterruptedException -> 0x008e }
            awss r6 = r6.a()     // Catch:{ InterruptedException -> 0x008e }
            long r6 = r6.b()     // Catch:{ InterruptedException -> 0x008e }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x008e }
            boolean r3 = r3.await(r6, r8)     // Catch:{ InterruptedException -> 0x008e }
            if (r3 == 0) goto L_0x0088
            goto L_0x009b
        L_0x0088:
            java.lang.String r3 = "systemMemoryCacheInitTimeout"
            r2.a((java.lang.String) r3)     // Catch:{ InterruptedException -> 0x008e }
            goto L_0x009b
        L_0x008e:
            r3 = move-exception
            java.lang.String r6 = "BootCount"
            java.lang.String r7 = "Wait on system memory cache initialization got interrupted."
            android.util.Log.e(r6, r7, r3)     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "systemMemoryCacheInitInterrupted"
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x0109 }
        L_0x009b:
            ikh r3 = e     // Catch:{ all -> 0x0109 }
            boolean r3 = r3.a()     // Catch:{ all -> 0x0109 }
            if (r3 == 0) goto L_0x00c5
            ikh r3 = e     // Catch:{ all -> 0x0109 }
            java.util.List r3 = r3.d()     // Catch:{ all -> 0x0109 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0109 }
            r6 = 1
        L_0x00ae:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x0109 }
            if (r7 != 0) goto L_0x00b5
            goto L_0x00c6
        L_0x00b5:
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x0109 }
            android.content.Intent r7 = (android.content.Intent) r7     // Catch:{ all -> 0x0109 }
            java.lang.String r8 = "bootCountUpdated"
            boolean r7 = r7.getBooleanExtra(r8, r5)     // Catch:{ all -> 0x0109 }
            if (r7 == 0) goto L_0x00ae
            r6 = 0
            goto L_0x00ae
        L_0x00c5:
            r6 = 0
        L_0x00c6:
            java.lang.String r3 = "bootCount"
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r3, r5)     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "bootCount"
            int r3 = r9.getInt(r3, r5)     // Catch:{ all -> 0x0109 }
            if (r3 != 0) goto L_0x00d5
            goto L_0x00d8
        L_0x00d5:
            if (r6 != 0) goto L_0x00d8
        L_0x00d7:
            goto L_0x00fe
        L_0x00d8:
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ all -> 0x0109 }
            int r3 = r3 + 1
            java.lang.String r5 = "bootCount"
            r9.putInt(r5, r3)     // Catch:{ all -> 0x0109 }
            r9.apply()     // Catch:{ all -> 0x0109 }
            ikh r9 = e     // Catch:{ all -> 0x0109 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x0109 }
            r5.<init>()     // Catch:{ all -> 0x0109 }
            java.lang.String r6 = "bootCountUpdated"
            android.content.Intent r4 = r5.putExtra(r6, r4)     // Catch:{ all -> 0x0109 }
            r9.a((android.os.Parcelable) r4)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = "BootCount"
            java.lang.String r4 = "(SystemMemoryCache) Device boot count in Clearcut increased."
            android.util.Log.i(r9, r4)     // Catch:{ all -> 0x0109 }
            goto L_0x00d7
        L_0x00fe:
            c = r3     // Catch:{ all -> 0x0109 }
        L_0x0100:
            if (r2 == 0) goto L_0x0115
            r2.close()     // Catch:{ all -> 0x0117 }
            goto L_0x0115
        L_0x0106:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0106 }
            throw r9     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r9 = move-exception
            if (r2 == 0) goto L_0x0114
            r2.close()     // Catch:{ all -> 0x0110 }
            goto L_0x0114
        L_0x0110:
            r1 = move-exception
            defpackage.apev.a((java.lang.Throwable) r9, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0117 }
        L_0x0114:
            throw r9     // Catch:{ all -> 0x0117 }
        L_0x0115:
            monitor-exit(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x011a
        L_0x0117:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0117 }
            throw r9
        L_0x011a:
            int r9 = c
            if (r9 == r1) goto L_0x0125
            int r9 = c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            return r9
        L_0x0125:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpk.a(android.content.Context):java.lang.Integer");
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            a(context);
            if (!d.booleanValue()) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("bootCount", 0);
                int i = sharedPreferences.getInt("bootCount", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                int i2 = i + 1;
                edit.putInt("bootCount", i2);
                edit.apply();
                c = i2;
                Log.i("BootCount", "(BOOT_COMPLETE intent)Device boot count in Clearcut increased.");
            }
        }
    }
}
