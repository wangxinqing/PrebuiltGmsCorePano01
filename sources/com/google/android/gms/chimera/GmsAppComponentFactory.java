package com.google.android.gms.chimera;

import android.app.AppComponentFactory;
import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsAppComponentFactory extends AppComponentFactory {
    static List a = null;

    private static bsc a(Context context, String str) {
        try {
            apxg f = bkv.a(context).f().f();
            return f.d(brt.a(f.F(), str));
        } catch (IndexOutOfBoundsException e) {
            bkn.b();
            if (awxs.a.a().H()) {
                String valueOf = String.valueOf(str);
                throw new InvalidConfigException(valueOf.length() == 0 ? new String("IndexOutOfBounds trying to retrieve ") : "IndexOutOfBounds trying to retrieve ".concat(valueOf), e);
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (r3 != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.ContentProvider instantiateProvider(java.lang.ClassLoader r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r0 = defpackage.ihs.a()
            if (r0 == 0) goto L_0x0109
            ihs r0 = defpackage.ihs.b()
            java.lang.String r1 = "GmsAppComponentFactory"
            r2 = 0
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + 60
            r3.<init>(r0)
            java.lang.String r0 = "Cannot Instantiate "
            r3.append(r0)
            r3.append(r13)
            java.lang.String r0 = ": GmsApplicationContext is not available."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r1, r0)
            goto L_0x0105
        L_0x0034:
            awxs r3 = defpackage.awxs.a
            awxt r3 = r3.a()
            boolean r3 = r3.x()
            r4 = 0
            if (r3 == 0) goto L_0x0097
            java.util.List r3 = a
            if (r3 != 0) goto L_0x008d
            android.os.SystemClock.uptimeMillis()
            amzt r3 = new amzt
            r3.<init>()
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x007d }
            java.lang.String r6 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x007d }
            r7 = 648(0x288, float:9.08E-43)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x007d }
            android.content.pm.ProviderInfo[] r6 = r5.providers     // Catch:{ NameNotFoundException -> 0x007d }
            if (r6 != 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            android.content.pm.ProviderInfo[] r5 = r5.providers     // Catch:{ NameNotFoundException -> 0x007d }
            int r6 = r5.length     // Catch:{ NameNotFoundException -> 0x007d }
            r7 = 0
        L_0x0064:
            if (r7 >= r6) goto L_0x0083
            r8 = r5[r7]     // Catch:{ NameNotFoundException -> 0x007d }
            android.os.Bundle r9 = r8.metaData     // Catch:{ NameNotFoundException -> 0x007d }
            if (r9 == 0) goto L_0x007a
            java.lang.String r10 = "chimera.sliceProviderProxy"
            boolean r9 = r9.getBoolean(r10, r4)     // Catch:{ NameNotFoundException -> 0x007d }
            if (r9 != 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            java.lang.String r8 = r8.name     // Catch:{ NameNotFoundException -> 0x007d }
            r3.c(r8)     // Catch:{ NameNotFoundException -> 0x007d }
        L_0x007a:
            int r7 = r7 + 1
            goto L_0x0064
        L_0x007d:
            r5 = move-exception
            java.lang.String r6 = "Cannot get package info"
            android.util.Log.e(r1, r6, r5)
        L_0x0083:
            amzy r3 = r3.a()
            a = r3
            android.os.SystemClock.uptimeMillis()
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            boolean r3 = r3.contains(r13)
            if (r3 == 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            goto L_0x0105
        L_0x0097:
            r3 = 0
        L_0x0098:
            bsc r0 = a(r0, r13)     // Catch:{ InvalidConfigException -> 0x009d }
            goto L_0x00dc
        L_0x009d:
            r5 = move-exception
            r5 = 1
            defpackage.hey.a((boolean) r5)
            bsc r0 = a(r0, r13)     // Catch:{ InvalidConfigException -> 0x00a7 }
            goto L_0x00dc
        L_0x00a7:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = java.lang.String.valueOf(r13)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 49
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Cannot instantiate "
            r7.append(r5)
            r7.append(r13)
            java.lang.String r5 = " from invalid Chimera config: "
            r7.append(r5)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.e(r1, r0)
            r0 = r2
        L_0x00dc:
            if (r0 == 0) goto L_0x00fe
            int r1 = r0.f()
            if (r1 > 0) goto L_0x00ea
            hdz r2 = new hdz
            r2.<init>(r13)
            goto L_0x0105
        L_0x00ea:
            java.lang.String[] r2 = new java.lang.String[r1]
        L_0x00ec:
            if (r4 >= r1) goto L_0x00f7
            java.lang.String r3 = r0.a(r4)
            r2[r4] = r3
            int r4 = r4 + 1
            goto L_0x00ec
        L_0x00f7:
            hdz r0 = new hdz
            r0.<init>(r13, r2)
            r2 = r0
            goto L_0x0105
        L_0x00fe:
            if (r3 == 0) goto L_0x0095
            hdz r2 = new hdz
            r2.<init>(r13)
        L_0x0105:
            if (r2 != 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            return r2
        L_0x0109:
            android.content.ContentProvider r12 = super.instantiateProvider(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.GmsAppComponentFactory.instantiateProvider(java.lang.ClassLoader, java.lang.String):android.content.ContentProvider");
    }
}
