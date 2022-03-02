package defpackage;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: cbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbx extends cbv {
    private final ContextData[] f;
    private final atjv g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cbx(android.content.Context r15, defpackage.bsz r16, defpackage.atjv r17, com.google.android.gms.contextmanager.ContextData[] r18, long r19, defpackage.cbm r21, defpackage.but r22) {
        /*
            r14 = this;
            r13 = r14
            if (r16 != 0) goto L_0x0004
            goto L_0x000e
        L_0x0004:
            boolean r0 = r16.b()
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "producecontextinternal"
            r4 = r0
            goto L_0x0011
        L_0x000e:
            java.lang.String r0 = "produceanonymouscontext"
            r4 = r0
        L_0x0011:
            r0 = 10
            if (r16 == 0) goto L_0x0023
            boolean r1 = r16.b()
            if (r1 == 0) goto L_0x001e
            r6 = 10
            goto L_0x0025
        L_0x001e:
            r0 = 9
            r6 = 9
            goto L_0x0025
        L_0x0023:
            r6 = 10
        L_0x0025:
            r5 = 12551(0x3107, float:1.7588E-41)
            atqc r7 = defpackage.atqc.e
            r12 = 0
            java.lang.String r2 = "ProduceContextTask"
            r0 = r14
            r1 = r15
            r3 = r16
            r8 = r19
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            r0 = r18
            r13.f = r0
            r0 = r17
            r13.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbx.<init>(android.content.Context, bsz, atjv, com.google.android.gms.contextmanager.ContextData[], long, cbm, but):void");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ atqk a(audx audx) {
        atqk atqk = ((atqc) audx).b;
        return atqk == null ? atqk.c : atqk;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c() {
        aucd o = atqb.e.o();
        atqj a = cbn.a(this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqb atqb = (atqb) o.b;
        a.getClass();
        atqb.b = a;
        int i = atqb.a | 1;
        atqb.a = i;
        atqb.c = this.g.bA;
        atqb.a = i | 2;
        ContextData[] contextDataArr = this.f;
        if (contextDataArr == null || (r2 = contextDataArr.length) == 0) {
            return (atqb) o.i();
        }
        for (ContextData c : contextDataArr) {
            auay au = c.c().au();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atqb atqb2 = (atqb) o.b;
            au.getClass();
            if (!atqb2.d.a()) {
                atqb2.d = aucj.a(atqb2.d);
            }
            atqb2.d.add(au);
        }
        return (atqb) o.i();
    }
}
