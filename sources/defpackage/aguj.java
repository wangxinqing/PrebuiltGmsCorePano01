package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aguj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aguj implements agtj {
    public final agod a;
    public final agul b;
    public final Executor c;
    public final agny d;
    public final long e;
    public final int f;
    public final amsv g;
    public final agot h;
    private final aoqu i;

    public aguj(agod agod, agul agul, Executor executor, agny agny, long j, int i2, amsv amsv, agot agot) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        this.a = agod;
        this.b = agul;
        this.c = executor;
        this.i = aoqu.a();
        this.d = agny;
        this.e = j;
        this.f = i2;
        this.g = amsv;
        this.h = agot;
    }

    public static atwy a(agtf agtf, afyl afyl) {
        if (afyl != null) {
            agtf.a(afyl.d(), agtv.a);
        }
        return agtf.a();
    }

    public final void close() {
        try {
            this.b.close();
        } finally {
            this.a.close();
        }
    }

    public final aorr a() {
        return this.i.a(new agui(this), this.c);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Iterable r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r7.size()
            r4 = 0
        L_0x000e:
            if (r4 >= r3) goto L_0x0020
            java.lang.Object r5 = r7.get(r4)
            atix r5 = (defpackage.atix) r5
            auay r5 = r5.au()
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0020:
            amsv r7 = r6.g
            java.lang.Object r7 = r7.a()
            afym r7 = (defpackage.afym) r7
            agti r3 = defpackage.agti.ENQUEUE_ALL
            aorr r7 = r7.a((java.lang.Enum) r3)
            java.lang.String r3 = "FootprintsUploadBufferImpl"
            aorr r7 = defpackage.agok.a((defpackage.aorr) r7, (java.lang.String) r3)
            agtu r3 = new agtu
            r3.<init>(r6, r0, r2)
            java.util.concurrent.Executor r0 = r6.c
            aorr r7 = defpackage.aopr.a((defpackage.aorr) r7, (defpackage.aoqb) r3, (java.util.concurrent.Executor) r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aguj.a(java.lang.Iterable):aorr");
    }
}
