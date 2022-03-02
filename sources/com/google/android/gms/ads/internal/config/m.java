package com.google.android.gms.ads.internal.config;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class m implements amsv {
    private final Context a;

    public m(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085 A[Catch:{ all -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            com.google.android.gms.ads.internal.config.f r1 = com.google.android.gms.ads.internal.config.n.a
            com.google.android.gms.ads.internal.config.l r1 = com.google.android.gms.ads.internal.client.c.b()
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x009c
            java.lang.Object r2 = r1.a
            monitor-enter(r2)
            boolean r3 = r1.c     // Catch:{ all -> 0x0099 }
            if (r3 != 0) goto L_0x0097
            boolean r3 = r1.d     // Catch:{ all -> 0x0099 }
            r4 = 1
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1.d = r4     // Catch:{ all -> 0x0099 }
        L_0x001b:
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ all -> 0x0099 }
            if (r3 == 0) goto L_0x0026
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ all -> 0x0099 }
            goto L_0x0027
        L_0x0026:
            r3 = r0
        L_0x0027:
            r1.g = r3     // Catch:{ all -> 0x0099 }
            android.content.Context r3 = r1.g     // Catch:{ NameNotFoundException -> 0x0042, NullPointerException -> 0x0040 }
            jnh r3 = defpackage.jni.b(r3)     // Catch:{ NameNotFoundException -> 0x0042, NullPointerException -> 0x0040 }
            android.content.Context r5 = r1.g     // Catch:{ NameNotFoundException -> 0x0042, NullPointerException -> 0x0040 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0042, NullPointerException -> 0x0040 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.a((java.lang.String) r5, (int) r6)     // Catch:{ NameNotFoundException -> 0x0042, NullPointerException -> 0x0040 }
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0042, NullPointerException -> 0x0040 }
            r1.f = r3     // Catch:{ NameNotFoundException -> 0x0042, NullPointerException -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r3 = move-exception
            goto L_0x0043
        L_0x0042:
            r3 = move-exception
        L_0x0043:
            r3 = 0
            android.content.Context r5 = defpackage.hxz.i(r0)     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x004b
            goto L_0x0056
        L_0x004b:
            if (r0 == 0) goto L_0x0056
            android.content.Context r5 = r0.getApplicationContext()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r0 = r5
            goto L_0x0057
        L_0x0056:
            r0 = r5
        L_0x0057:
            if (r0 == 0) goto L_0x0085
            com.google.android.gms.ads.internal.client.c r5 = com.google.android.gms.ads.internal.client.c.a     // Catch:{ all -> 0x008e }
            com.google.android.gms.ads.internal.config.h r5 = r5.b     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "google_ads_flags"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r5, r3)     // Catch:{ all -> 0x008e }
            r1.e = r0     // Catch:{ all -> 0x008e }
            android.content.SharedPreferences r0 = r1.e     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r0.registerOnSharedPreferenceChangeListener(r1)     // Catch:{ all -> 0x008e }
        L_0x006d:
            com.google.android.gms.ads.internal.config.k r0 = new com.google.android.gms.ads.internal.config.k     // Catch:{ all -> 0x008e }
            r0.<init>(r1)     // Catch:{ all -> 0x008e }
            java.util.concurrent.atomic.AtomicReference r5 = com.google.android.gms.ads.internal.flag.h.a     // Catch:{ all -> 0x008e }
            r5.set(r0)     // Catch:{ all -> 0x008e }
            r1.a()     // Catch:{ all -> 0x008e }
            r1.c = r4     // Catch:{ all -> 0x008e }
            r1.d = r3     // Catch:{ all -> 0x0099 }
            android.os.ConditionVariable r0 = r1.b     // Catch:{ all -> 0x0099 }
            r0.open()     // Catch:{ all -> 0x0099 }
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            goto L_0x009c
        L_0x0085:
            r1.d = r3     // Catch:{ all -> 0x0099 }
            android.os.ConditionVariable r0 = r1.b     // Catch:{ all -> 0x0099 }
            r0.open()     // Catch:{ all -> 0x0099 }
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            goto L_0x009c
        L_0x008e:
            r0 = move-exception
            r1.d = r3     // Catch:{ all -> 0x0099 }
            android.os.ConditionVariable r1 = r1.b     // Catch:{ all -> 0x0099 }
            r1.open()     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0097:
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            goto L_0x009c
        L_0x0099:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            throw r0
        L_0x009c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.config.m.a():java.lang.Object");
    }
}
