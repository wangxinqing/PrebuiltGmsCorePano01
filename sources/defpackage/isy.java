package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.Feature;
import java.util.Collections;
import java.util.Set;

/* renamed from: isy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class isy extends irx implements ibo, isz {
    private final Account a;
    public final ise s;
    public final Set t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected isy(android.content.Context r10, android.os.Looper r11, int r12, defpackage.ise r13, defpackage.iea r14, defpackage.igg r15) {
        /*
            r9 = this;
            itc r3 = defpackage.itc.a(r10)
            hxj r4 = defpackage.hxj.a
            defpackage.iva.a((java.lang.Object) r14)
            defpackage.iva.a((java.lang.Object) r15)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isy.<init>(android.content.Context, android.os.Looper, int, ise, iea, igg):void");
    }

    /* access modifiers changed from: protected */
    public Set a(Set set) {
        return set;
    }

    public Set q() {
        return !g() ? Collections.emptySet() : this.t;
    }

    public final Account u() {
        return this.a;
    }

    public Feature[] v() {
        return new Feature[0];
    }

    /* access modifiers changed from: protected */
    public final Set y() {
        return this.t;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected isy(android.content.Context r12, android.os.Looper r13, defpackage.itc r14, defpackage.hxj r15, int r16, defpackage.ise r17, defpackage.iea r18, defpackage.igg r19) {
        /*
            r11 = this;
            r9 = r11
            r10 = r17
            r0 = r18
            r1 = r19
            r2 = 0
            if (r0 == 0) goto L_0x0011
            isw r3 = new isw
            r3.<init>(r0)
            r6 = r3
            goto L_0x0012
        L_0x0011:
            r6 = r2
        L_0x0012:
            if (r1 == 0) goto L_0x001b
            isx r0 = new isx
            r0.<init>(r1)
            r7 = r0
            goto L_0x001c
        L_0x001b:
            r7 = r2
        L_0x001c:
            java.lang.String r8 = r10.f
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.s = r10
            android.accounts.Account r0 = r10.a
            r9.a = r0
            java.util.Set r0 = r10.c
            java.util.Set r1 = r11.a(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0038:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0053
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.Scope r3 = (com.google.android.gms.common.api.Scope) r3
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x004b
            goto L_0x0038
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expanding scopes is not permitted, use implied scopes instead"
            r0.<init>(r1)
            throw r0
        L_0x0053:
            r9.t = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isy.<init>(android.content.Context, android.os.Looper, itc, hxj, int, ise, iea, igg):void");
    }
}
