package defpackage;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: wnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class wnd extends xqg {
    protected final wmi a;
    private final wzv b;
    private final boolean c;
    private final ycw d = ybx.a;
    private final boolean e;

    protected wnd(String str, int i, wzv wzv, boolean z, String str2, String str3) {
        super(str, i, str2, str3, (byte[]) null);
        this.b = wzv;
        this.c = z;
        this.e = ayuq.b();
        wmi wmi = new wmi(str3);
        this.a = wmi;
        wmi.b = str2;
        wmi.c = str;
    }

    private static void a(Context context, Exception exc) {
        xip.a();
        if (Boolean.valueOf(aywy.a.a().aD()).booleanValue()) {
            yde.a.a(context).a(exc, ((Double) xhi.a.a()).doubleValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9 A[Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9 A[Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = "Error during operation"
            java.lang.String r4 = "BasePeopleOperation"
            boolean r0 = r1.p
            r5 = 0
            if (r0 == 0) goto L_0x0020
            wmi r0 = r1.a
            r2 = 8
            r0.a(r2, r5)
            boolean r0 = r1.e
            if (r0 == 0) goto L_0x001f
            wmi r0 = r1.r
            if (r0 == 0) goto L_0x001f
            r0.b(r2, r5)
        L_0x001f:
            return
        L_0x0020:
            r7 = 3
            r8 = 5
            r9 = 4
            r10 = 0
            com.google.android.gms.common.data.DataHolder[] r0 = r16.c(r17)     // Catch:{ RuntimeException -> 0x009a, UserRecoverableAuthException -> 0x0076, eif -> 0x0067, VolleyError -> 0x0059, Exception -> 0x004b }
            xqy r11 = defpackage.xqy.c     // Catch:{ RuntimeException -> 0x009a, UserRecoverableAuthException -> 0x0076, eif -> 0x0067, VolleyError -> 0x0059, Exception -> 0x004b }
            if (r0 == 0) goto L_0x0047
            int r12 = r0.length     // Catch:{ RuntimeException -> 0x009a, UserRecoverableAuthException -> 0x0076, eif -> 0x0067, VolleyError -> 0x0059, Exception -> 0x004b }
            r13 = 0
            r14 = 0
        L_0x002f:
            if (r13 < r12) goto L_0x0032
            goto L_0x0048
        L_0x0032:
            r15 = r0[r13]     // Catch:{ RuntimeException -> 0x0045, UserRecoverableAuthException -> 0x0043, eif -> 0x0041, VolleyError -> 0x003f, Exception -> 0x003d }
            int r6 = r15.h     // Catch:{ RuntimeException -> 0x0045, UserRecoverableAuthException -> 0x0043, eif -> 0x0041, VolleyError -> 0x003f, Exception -> 0x003d }
            int r14 = r14 + r6
            r1.a((com.google.android.gms.common.data.DataHolder) r15)     // Catch:{ RuntimeException -> 0x0045, UserRecoverableAuthException -> 0x0043, eif -> 0x0041, VolleyError -> 0x003f, Exception -> 0x003d }
            int r13 = r13 + 1
            goto L_0x002f
        L_0x003d:
            r0 = move-exception
            goto L_0x004d
        L_0x003f:
            r0 = move-exception
            goto L_0x005b
        L_0x0041:
            r0 = move-exception
            goto L_0x0069
        L_0x0043:
            r0 = move-exception
            goto L_0x0078
        L_0x0045:
            r0 = move-exception
            goto L_0x009c
        L_0x0047:
            r14 = 0
        L_0x0048:
            r7 = 2
            goto L_0x00b5
        L_0x004b:
            r0 = move-exception
            r14 = 0
        L_0x004d:
            android.util.Log.e(r4, r3, r0)
            xqy r11 = defpackage.xqy.e
            a(r2, r0)
            r0 = r10
            r7 = 6
            goto L_0x00b5
        L_0x0059:
            r0 = move-exception
            r14 = 0
        L_0x005b:
            android.util.Log.e(r4, r3, r0)
            xqy r11 = defpackage.xqy.e
            a(r2, r0)
            r0 = r10
            r7 = 5
            goto L_0x00b5
        L_0x0067:
            r0 = move-exception
            r14 = 0
        L_0x0069:
            android.util.Log.e(r4, r3, r0)
            xqy r11 = defpackage.xqy.a(r8, r10)
            a(r2, r0)
            r0 = r10
            goto L_0x00b5
        L_0x0076:
            r0 = move-exception
            r14 = 0
        L_0x0078:
            android.util.Log.e(r4, r3, r0)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r6 = r0.a()
            r7 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = defpackage.jhg.a((android.content.Context) r2, (android.content.Intent) r6, (int) r7)
            java.lang.String r7 = "pendingIntent"
            r3.putParcelable(r7, r6)
            xqy r11 = defpackage.xqy.a(r9, r3)
            a(r2, r0)
            r0 = r10
            r7 = 4
            goto L_0x00b5
        L_0x009a:
            r0 = move-exception
            r14 = 0
        L_0x009c:
            android.util.Log.e(r4, r3, r0)
            java.lang.String r3 = r1.l
            if (r3 == 0) goto L_0x00f5
            ycw r6 = r1.d
            android.accounts.Account r3 = r6.a(r2, r3)
            if (r3 != 0) goto L_0x00f5
            r0.getMessage()
            xqy r11 = defpackage.xqy.g
            a(r2, r0)
            r0 = r10
        L_0x00b5:
            boolean r3 = r1.c     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            if (r3 != 0) goto L_0x00c9
            wzv r3 = r1.b     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            int r6 = r11.a     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            android.os.Bundle r8 = r11.b     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x00c4
            r10 = r0[r5]     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            goto L_0x00c5
        L_0x00c4:
        L_0x00c5:
            r3.a((int) r6, (android.os.Bundle) r8, (com.google.android.gms.common.data.DataHolder) r10)     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            goto L_0x00d2
        L_0x00c9:
            wzv r3 = r1.b     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            int r5 = r11.a     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            android.os.Bundle r6 = r11.b     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
            r3.a((int) r5, (android.os.Bundle) r6, (com.google.android.gms.common.data.DataHolder[]) r0)     // Catch:{ DeadObjectException -> 0x00df, Exception -> 0x00d4 }
        L_0x00d2:
            r6 = r7
            goto L_0x00e4
        L_0x00d4:
            r0 = move-exception
            java.lang.String r3 = "Unknown error"
            android.util.Log.e(r4, r3, r0)
            a(r2, r0)
            r6 = 6
            goto L_0x00e4
        L_0x00df:
            r0 = move-exception
            a(r2, r0)
            r6 = 7
        L_0x00e4:
            wmi r0 = r1.a
            r0.a(r6, r14)
            boolean r0 = r1.e
            if (r0 == 0) goto L_0x00f4
            wmi r0 = r1.r
            if (r0 == 0) goto L_0x00f4
            r0.b(r6, r14)
        L_0x00f4:
            return
        L_0x00f5:
            goto L_0x00f7
        L_0x00f6:
            throw r0
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnd.b(android.content.Context):void");
    }

    public abstract DataHolder[] c(Context context);
}
