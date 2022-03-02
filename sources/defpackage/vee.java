package defpackage;

import com.android.volley.Request;
import com.android.volley.RetryPolicy;

/* renamed from: vee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class vee extends iyn {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vee(android.content.Context r11, java.lang.String r12, int r13) {
        /*
            r10 = this;
            android.content.Context r1 = r11.getApplicationContext()
            java.lang.String r2 = defpackage.aync.m()
            java.lang.String r3 = defpackage.aync.l()
            java.lang.Class<vav> r0 = defpackage.vav.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r11, (java.lang.Class) r0)
            vav r0 = (defpackage.vav) r0
            auyt r0 = r0.f
            auyy r0 = r0.d
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            auyy r0 = defpackage.auyy.v
        L_0x001d:
            boolean r4 = r0.n
            java.lang.Class<vav> r0 = defpackage.vav.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r11, (java.lang.Class) r0)
            vav r0 = (defpackage.vav) r0
            auyt r0 = r0.f
            auyy r0 = r0.d
            if (r0 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            auyy r0 = defpackage.auyy.v
        L_0x0030:
            boolean r5 = r0.o
            java.lang.String r6 = defpackage.aync.b()
            java.lang.Class<vav> r0 = defpackage.vav.class
            java.lang.Object r11 = defpackage.thl.a((android.content.Context) r11, (java.lang.Class) r0)
            vav r11 = (defpackage.vav) r11
            auyt r11 = r11.f
            auyu r11 = r11.c
            if (r11 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            auyu r11 = defpackage.auyu.c
        L_0x0047:
            java.lang.String r7 = r11.b
            r9 = 0
            r0 = r10
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.g = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vee.<init>(android.content.Context, java.lang.String, int):void");
    }

    public final String a(String str) {
        return a(this.d, str);
    }

    public RetryPolicy b(String str) {
        return new iym(this, str, (int) aync.a.a().k());
    }

    /* access modifiers changed from: protected */
    public final void a(Request request, String str) {
        request.setRetryPolicy(b(str));
    }
}
