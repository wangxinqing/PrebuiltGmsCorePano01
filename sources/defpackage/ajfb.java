package defpackage;

import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: ajfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajfb extends ajgs {
    private final ajfq a;
    private ajdi b;
    private final ajej c;

    public ajfb(ajfq ajfq, ajej ajej) {
        super("RTRep");
        this.a = ajfq;
        this.c = ajej;
    }

    public final void a() {
        this.b = new ajdp(this.c.a.b);
        this.h.c();
    }

    public final void b() {
        ajdi ajdi = this.b;
        if (ajdi != null) {
            ajdp ajdp = (ajdp) ajdi;
            ajdp.f.shutdown();
            try {
                ((ajdp) ajdi).f.awaitTermination(ayel.h(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                ((anih) ajdp.e.c()).a("shutdown incomplete");
            }
            ajdp.g.a();
            this.b = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        r6 = (defpackage.ajdp) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.os.Message r6) {
        /*
            r5 = this;
            int r6 = r6.what
            r0 = 6
            if (r6 == r0) goto L_0x003d
            r0 = 8
            if (r6 == r0) goto L_0x000a
            goto L_0x005f
        L_0x000a:
            jjg r6 = defpackage.ajfj.a
            ajdi r6 = r5.b
            ajfq r0 = r5.a
            ajge r0 = r0.h()
            long r0 = r0.d
            boolean r2 = defpackage.ayel.k()
            if (r2 == 0) goto L_0x005f
            ajdp r6 = (defpackage.ajdp) r6
            java.util.concurrent.atomic.AtomicReference r2 = r6.j
            java.lang.Object r2 = r2.get()
            auay r2 = (defpackage.auay) r2
            auay r3 = defpackage.auay.b
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x005f
            com.google.android.gms.common.internal.ClientContext r3 = r6.c()
            if (r3 == 0) goto L_0x005f
            ajdm r4 = new ajdm
            r4.<init>(r6, r3, r2)
            r6.a(r0, r4)
            goto L_0x005f
        L_0x003d:
            jjg r6 = defpackage.ajfj.a
            ajdi r6 = r5.b
            ajfq r0 = r5.a
            ajge r0 = r0.h()
            long r0 = r0.d
            boolean r2 = defpackage.ayel.j()
            if (r2 == 0) goto L_0x005f
            ajdp r6 = (defpackage.ajdp) r6
            com.google.android.gms.common.internal.ClientContext r2 = r6.c()
            if (r2 == 0) goto L_0x005f
            ajdl r3 = new ajdl
            r3.<init>(r6, r2, r0)
            r6.a(r0, r3)
        L_0x005f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfb.a(android.os.Message):boolean");
    }
}
