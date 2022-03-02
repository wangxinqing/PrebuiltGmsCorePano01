package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import android.util.Pair;

/* renamed from: wnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wnb extends xqg {
    private final wzv Dn;
    private final ycw Do;
    private final boolean Dp;
    private amsn Dq;
    protected final boolean a;
    protected wmi b;

    public wnb(String str, int i, wzv wzv, String str2, String str3) {
        this(str, i, wzv, str2, str3, (byte[]) null);
    }

    private final void a(int i, int i2) {
        wmi wmi;
        if (this.Dp && (wmi = this.r) != null) {
            wmi.b(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        a(r2, 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Error during operation"
            java.lang.String r1 = "BasePeopleOperation"
            boolean r2 = r13.p
            r3 = 0
            if (r2 != 0) goto L_0x0201
            r2 = 6
            r4 = 11
            r5 = 1
            r6 = 4
            r7 = 3
            r8 = 5
            r9 = 0
            r10 = 2
            android.util.Pair r11 = r13.c(r14)     // Catch:{ IllegalArgumentException -> 0x0196, RuntimeException -> 0x013f, UserRecoverableAuthException -> 0x00f2, eif -> 0x00b9, VolleyError -> 0x0082, Exception -> 0x004c }
            java.lang.Object r12 = r11.first     // Catch:{ IllegalArgumentException -> 0x0196, RuntimeException -> 0x013f, UserRecoverableAuthException -> 0x00f2, eif -> 0x00b9, VolleyError -> 0x0082, Exception -> 0x004c }
            xqy r12 = (defpackage.xqy) r12     // Catch:{ IllegalArgumentException -> 0x0196, RuntimeException -> 0x013f, UserRecoverableAuthException -> 0x00f2, eif -> 0x00b9, VolleyError -> 0x0082, Exception -> 0x004c }
            java.lang.Object r11 = r11.second     // Catch:{ IllegalArgumentException -> 0x0196, RuntimeException -> 0x013f, UserRecoverableAuthException -> 0x00f2, eif -> 0x00b9, VolleyError -> 0x0082, Exception -> 0x004c }
            android.os.Bundle r11 = (android.os.Bundle) r11     // Catch:{ IllegalArgumentException -> 0x0196, RuntimeException -> 0x013f, UserRecoverableAuthException -> 0x00f2, eif -> 0x00b9, VolleyError -> 0x0082, Exception -> 0x004c }
            wmi r14 = r13.b
            if (r14 != 0) goto L_0x0023
            goto L_0x0042
        L_0x0023:
            boolean r0 = r13.a
            if (r0 == 0) goto L_0x003d
            amsn r0 = r13.Dq
            if (r0 == 0) goto L_0x003d
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            xmc r0 = defpackage.wml.b(r10, r0)
            r14.a((defpackage.xmc) r0)
            amsn r14 = r13.Dq
            r14.e()
        L_0x003d:
            wmi r14 = r13.b
            r14.a(r10, r5)
        L_0x0042:
            r13.a((int) r10, (int) r5)
            r9 = r11
            goto L_0x01c9
        L_0x0049:
            r14 = move-exception
            goto L_0x01d8
        L_0x004c:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)     // Catch:{ all -> 0x0049 }
            xqy r12 = defpackage.xqy.e     // Catch:{ all -> 0x0049 }
            a((android.content.Context) r14, (java.lang.Exception) r4)     // Catch:{ all -> 0x007f }
            wmi r14 = r13.b
            if (r14 != 0) goto L_0x005a
            goto L_0x0079
        L_0x005a:
            boolean r0 = r13.a
            if (r0 == 0) goto L_0x0074
            amsn r0 = r13.Dq
            if (r0 == 0) goto L_0x0074
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            xmc r0 = defpackage.wml.b(r10, r0)
            r14.a((defpackage.xmc) r0)
            amsn r14 = r13.Dq
            r14.e()
        L_0x0074:
            wmi r14 = r13.b
            r14.a(r2, r3)
        L_0x0079:
        L_0x007a:
            r13.a((int) r2, (int) r3)
            goto L_0x01c9
        L_0x007f:
            r14 = move-exception
            goto L_0x01d9
        L_0x0082:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0049 }
            xqy r12 = defpackage.xqy.e     // Catch:{ all -> 0x0049 }
            a((android.content.Context) r14, (java.lang.Exception) r2)     // Catch:{ all -> 0x00b5 }
            wmi r14 = r13.b
            if (r14 != 0) goto L_0x0090
            goto L_0x00af
        L_0x0090:
            boolean r0 = r13.a
            if (r0 == 0) goto L_0x00aa
            amsn r0 = r13.Dq
            if (r0 == 0) goto L_0x00aa
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            xmc r0 = defpackage.wml.b(r10, r0)
            r14.a((defpackage.xmc) r0)
            amsn r14 = r13.Dq
            r14.e()
        L_0x00aa:
            wmi r14 = r13.b
            r14.a(r8, r3)
        L_0x00af:
            r13.a((int) r8, (int) r3)
            goto L_0x01c9
        L_0x00b5:
            r14 = move-exception
            r2 = 5
            goto L_0x01d9
        L_0x00b9:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0049 }
            xqy r12 = defpackage.xqy.a(r8, r9)     // Catch:{ all -> 0x0049 }
            a((android.content.Context) r14, (java.lang.Exception) r2)     // Catch:{ all -> 0x00ee }
            wmi r14 = r13.b
            if (r14 != 0) goto L_0x00c9
            goto L_0x00e8
        L_0x00c9:
            boolean r0 = r13.a
            if (r0 == 0) goto L_0x00e3
            amsn r0 = r13.Dq
            if (r0 == 0) goto L_0x00e3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            xmc r0 = defpackage.wml.b(r10, r0)
            r14.a((defpackage.xmc) r0)
            amsn r14 = r13.Dq
            r14.e()
        L_0x00e3:
            wmi r14 = r13.b
            r14.a(r7, r3)
        L_0x00e8:
            r13.a((int) r7, (int) r3)
            goto L_0x01c9
        L_0x00ee:
            r14 = move-exception
            r2 = 3
            goto L_0x01d9
        L_0x00f2:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0049 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            android.content.Intent r1 = r2.a()     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = "pendingIntent"
            r7 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = defpackage.jhg.a((android.content.Context) r14, (android.content.Intent) r1, (int) r7)     // Catch:{ all -> 0x0049 }
            r0.putParcelable(r4, r1)     // Catch:{ all -> 0x0049 }
            xqy r12 = defpackage.xqy.a(r6, r0)     // Catch:{ all -> 0x0049 }
            a((android.content.Context) r14, (java.lang.Exception) r2)     // Catch:{ all -> 0x013b }
            wmi r14 = r13.b
            if (r14 != 0) goto L_0x0116
            goto L_0x0135
        L_0x0116:
            boolean r0 = r13.a
            if (r0 == 0) goto L_0x0130
            amsn r0 = r13.Dq
            if (r0 == 0) goto L_0x0130
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            xmc r0 = defpackage.wml.b(r10, r0)
            r14.a((defpackage.xmc) r0)
            amsn r14 = r13.Dq
            r14.e()
        L_0x0130:
            wmi r14 = r13.b
            r14.a(r6, r3)
        L_0x0135:
            r13.a((int) r6, (int) r3)
            goto L_0x01c9
        L_0x013b:
            r14 = move-exception
            r2 = 4
            goto L_0x01d9
        L_0x013f:
            r0 = move-exception
            ayun r1 = defpackage.ayun.a     // Catch:{ all -> 0x0049 }
            ayuo r1 = r1.a()     // Catch:{ all -> 0x0049 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0157
            boolean r1 = r0 instanceof java.lang.NullPointerException     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            xqy r1 = defpackage.xqy.h     // Catch:{ all -> 0x0049 }
            r2 = 12
            r12 = r1
            goto L_0x016a
        L_0x0157:
            java.lang.String r1 = r13.l     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0195
            ycw r2 = r13.Do     // Catch:{ all -> 0x0049 }
            android.accounts.Account r1 = r2.a(r14, r1)     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0195
            r0.getMessage()     // Catch:{ all -> 0x0049 }
            xqy r1 = defpackage.xqy.g     // Catch:{ all -> 0x0049 }
            r12 = r1
            r2 = 3
        L_0x016a:
            a((android.content.Context) r14, (java.lang.Exception) r0)     // Catch:{ all -> 0x0193 }
            wmi r14 = r13.b
            if (r14 != 0) goto L_0x0172
            goto L_0x0191
        L_0x0172:
            boolean r0 = r13.a
            if (r0 == 0) goto L_0x018c
            amsn r0 = r13.Dq
            if (r0 == 0) goto L_0x018c
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            xmc r0 = defpackage.wml.b(r10, r0)
            r14.a((defpackage.xmc) r0)
            amsn r14 = r13.Dq
            r14.e()
        L_0x018c:
            wmi r14 = r13.b
            r14.a(r2, r3)
        L_0x0191:
            goto L_0x007a
        L_0x0193:
            r14 = move-exception
            goto L_0x01d9
        L_0x0195:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0196:
            r0 = move-exception
            java.lang.String r2 = "Bad operation"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0049 }
            xqy r12 = defpackage.xqy.h     // Catch:{ all -> 0x0049 }
            a((android.content.Context) r14, (java.lang.Exception) r0)     // Catch:{ all -> 0x01d4 }
            wmi r14 = r13.b
            if (r14 != 0) goto L_0x01a6
            goto L_0x01c5
        L_0x01a6:
            boolean r0 = r13.a
            if (r0 == 0) goto L_0x01c0
            amsn r0 = r13.Dq
            if (r0 == 0) goto L_0x01c0
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            xmc r0 = defpackage.wml.b(r10, r0)
            r14.a((defpackage.xmc) r0)
            amsn r14 = r13.Dq
            r14.e()
        L_0x01c0:
            wmi r14 = r13.b
            r14.a(r4, r3)
        L_0x01c5:
            r13.a((int) r4, (int) r3)
        L_0x01c9:
            if (r9 != 0) goto L_0x01d0
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x01d0:
            r13.a((defpackage.xqy) r12, (android.os.Bundle) r9)
            return
        L_0x01d4:
            r14 = move-exception
            r2 = 11
            goto L_0x01d9
        L_0x01d8:
            r2 = 1
        L_0x01d9:
            wmi r0 = r13.b
            if (r0 == 0) goto L_0x01fc
            boolean r1 = r13.a
            if (r1 == 0) goto L_0x01f7
            amsn r1 = r13.Dq
            if (r1 == 0) goto L_0x01f7
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r1.a((java.util.concurrent.TimeUnit) r4)
            xmc r1 = defpackage.wml.b(r10, r4)
            r0.a((defpackage.xmc) r1)
            amsn r0 = r13.Dq
            r0.e()
        L_0x01f7:
            wmi r0 = r13.b
            r0.a(r2, r3)
        L_0x01fc:
            r13.a((int) r2, (int) r3)
            throw r14
        L_0x0201:
            wmi r14 = r13.b
            r0 = 8
            if (r14 == 0) goto L_0x020a
            r14.a(r0, r3)
        L_0x020a:
            r13.a((int) r0, (int) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnb.b(android.content.Context):void");
    }

    public abstract Pair c(Context context);

    protected wnb(String str, int i, wzv wzv, String str2, String str3, byte[] bArr) {
        super(str, i, str2, str3, (byte[]) null);
        this.Do = ybx.a;
        this.Dn = wzv;
        this.a = ayun.a.a().b();
        this.Dp = ayuq.b();
        wmi wmi = new wmi(str3);
        this.b = wmi;
        wmi.b = str2;
        wmi.c = str;
        if (this.a) {
            this.Dq = amsn.b(ampt.a);
        }
    }

    private static final void a(Context context, Exception exc) {
        if (ayun.a.a().c()) {
            yde.a.a(context).a(exc, ayun.a.a().d());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(xqy xqy, Bundle bundle) {
        try {
            this.Dn.a(xqy.a, xqy.b, bundle);
        } catch (DeadObjectException e) {
        } catch (Exception e2) {
            Log.e("BasePeopleOperation", "Unknown error", e2);
        }
    }
}
