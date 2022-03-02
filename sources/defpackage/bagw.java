package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* renamed from: bagw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bagw extends bade {
    private static final azyy a;
    private static final baab b;
    private babj c;
    private baaf d;
    private Charset e = amqn.c;
    private boolean f;

    static {
        bagv bagv = new bagv();
        a = bagv;
        b = azyz.a(":status", bagv);
    }

    protected bagw(int i, balm balm, balu balu) {
        super(i, balm, balu);
    }

    private static Charset c(baaf baaf) {
        String str = (String) baaf.b(bagt.f);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception e2) {
            }
        }
        return amqn.c;
    }

    private static void d(baaf baaf) {
        baaf.c(b);
        baaf.c(azza.b);
        baaf.c(azza.a);
    }

    private static final babj e(baaf baaf) {
        Integer num = (Integer) baaf.b(b);
        if (num == null) {
            return babj.n.a("Missing HTTP status code");
        }
        String str = (String) baaf.b(bagt.f);
        if (bagt.a(str)) {
            return null;
        }
        babj a2 = bagt.a(num.intValue());
        String valueOf = String.valueOf(str);
        return a2.b(valueOf.length() == 0 ? new String("invalid content-type: ") : "invalid content-type: ".concat(valueOf));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.baaf r8) {
        /*
            r7 = this;
            java.lang.String r0 = "headers"
            defpackage.amrl.a((java.lang.Object) r8, (java.lang.Object) r0)
            babj r0 = r7.c
            java.lang.String r1 = "headers: "
            if (r0 == 0) goto L_0x002f
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 9
            r3.<init>(r2)
            r3.append(r1)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            babj r8 = r0.b((java.lang.String) r8)
            r7.c = r8
            return
        L_0x002f:
            boolean r0 = r7.f     // Catch:{ all -> 0x0159 }
            if (r0 != 0) goto L_0x0137
            baab r0 = b     // Catch:{ all -> 0x0159 }
            java.lang.Object r0 = r8.b((defpackage.baab) r0)     // Catch:{ all -> 0x0159 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x007d
            int r2 = r0.intValue()     // Catch:{ all -> 0x0159 }
            r3 = 100
            if (r2 < r3) goto L_0x007d
            int r0 = r0.intValue()     // Catch:{ all -> 0x0159 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 >= r2) goto L_0x007d
            babj r0 = r7.c
            if (r0 == 0) goto L_0x007c
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 9
            r4.<init>(r3)
        L_0x0064:
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            babj r0 = r0.b((java.lang.String) r1)
            r7.c = r0
            r7.d = r8
        L_0x0076:
            java.nio.charset.Charset r8 = c(r8)
            r7.e = r8
        L_0x007c:
            return
        L_0x007d:
            r0 = 1
            r7.f = r0     // Catch:{ all -> 0x0159 }
            babj r2 = e(r8)     // Catch:{ all -> 0x0159 }
            r7.c = r2     // Catch:{ all -> 0x0159 }
            if (r2 != 0) goto L_0x0110
            d(r8)     // Catch:{ all -> 0x0159 }
            boolean r2 = r7.s     // Catch:{ all -> 0x0159 }
            r2 = r2 ^ r0
            java.lang.String r3 = "Received headers on closed stream"
            defpackage.amrl.b((boolean) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0159 }
            balm r2 = r7.o     // Catch:{ all -> 0x0159 }
            babm[] r2 = r2.b     // Catch:{ all -> 0x0159 }
            int r3 = r2.length     // Catch:{ all -> 0x0159 }
            r4 = 0
            r5 = 0
        L_0x009a:
            if (r5 < r3) goto L_0x010b
            baab r2 = defpackage.bagt.d     // Catch:{ all -> 0x0159 }
            java.lang.Object r2 = r8.b((defpackage.baab) r2)     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0159 }
            baab r2 = defpackage.bagt.b     // Catch:{ all -> 0x0159 }
            java.lang.Object r2 = r8.b((defpackage.baab) r2)     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0159 }
            if (r2 == 0) goto L_0x00ec
            azyi r3 = r7.q     // Catch:{ all -> 0x0159 }
            java.util.Map r3 = r3.c     // Catch:{ all -> 0x0159 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0159 }
            azyh r3 = (defpackage.azyh) r3     // Catch:{ all -> 0x0159 }
            if (r3 == 0) goto L_0x00bd
            azyg r3 = r3.a     // Catch:{ all -> 0x0159 }
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            if (r3 != 0) goto L_0x00d8
            babj r3 = defpackage.babj.n     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0159 }
            r0[r4] = r2     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = "Can't find decompressor for %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ all -> 0x0159 }
            babj r0 = r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0159 }
            babl r0 = r0.b()     // Catch:{ all -> 0x0159 }
            r7.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0159 }
            goto L_0x00f1
        L_0x00d8:
            azxw r2 = defpackage.azxv.a     // Catch:{ all -> 0x0159 }
            if (r3 == r2) goto L_0x00ec
            baet r2 = r7.j     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = "Already set full stream decompressor"
            defpackage.amrl.b((boolean) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "Can't pass an empty decompressor"
            defpackage.amrl.a((java.lang.Object) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x0159 }
            bajs r2 = (defpackage.bajs) r2     // Catch:{ all -> 0x0159 }
            r2.c = r3     // Catch:{ all -> 0x0159 }
        L_0x00ec:
            baeh r0 = r7.p     // Catch:{ all -> 0x0159 }
            r0.a(r8)     // Catch:{ all -> 0x0159 }
        L_0x00f1:
            babj r0 = r7.c
            if (r0 == 0) goto L_0x010a
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 9
            r4.<init>(r3)
            goto L_0x0064
        L_0x010a:
            return
        L_0x010b:
            r6 = r2[r5]     // Catch:{ all -> 0x0159 }
            int r5 = r5 + 1
            goto L_0x009a
        L_0x0110:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 9
            r4.<init>(r3)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            babj r0 = r2.b((java.lang.String) r0)
            r7.c = r0
            r7.d = r8
            goto L_0x0076
        L_0x0137:
            babj r0 = defpackage.babj.n     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = "Received headers twice"
            babj r0 = r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0159 }
            r7.c = r0     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x0158
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 9
            r4.<init>(r3)
            goto L_0x0064
        L_0x0158:
            return
        L_0x0159:
            r0 = move-exception
            babj r2 = r7.c
            if (r2 != 0) goto L_0x015f
            goto L_0x018a
        L_0x015f:
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 9
            r5.<init>(r4)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            babj r1 = r2.b((java.lang.String) r1)
            r7.c = r1
            r7.d = r8
            java.nio.charset.Charset r8 = c(r8)
            r7.e = r8
        L_0x018a:
            goto L_0x018c
        L_0x018b:
            throw r0
        L_0x018c:
            goto L_0x018b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bagw.a(baaf):void");
    }

    /* access modifiers changed from: protected */
    public abstract void a(babj babj, boolean z, baaf baaf);

    public final void b(baaf baaf) {
        babj babj;
        babj babj2;
        amrl.a((Object) baaf, (Object) "trailers");
        babj babj3 = this.c;
        if (babj3 == null && !this.f) {
            babj3 = e(baaf);
            this.c = babj3;
            if (babj3 != null) {
                this.d = baaf;
            }
        }
        if (babj3 == null) {
            babj babj4 = (babj) baaf.b(azza.b);
            if (babj4 != null) {
                babj = babj4.a((String) baaf.b(azza.a));
            } else if (this.f) {
                babj = babj.d.a("missing GRPC status in response");
            } else {
                Integer num = (Integer) baaf.b(b);
                if (num != null) {
                    babj2 = bagt.a(num.intValue());
                } else {
                    babj2 = babj.n.a("missing HTTP status code");
                }
                babj = babj2.b("missing GRPC status, inferred error from HTTP status code");
            }
            d(baaf);
            amrl.a((Object) babj, (Object) "status");
            amrl.a((Object) baaf, (Object) "trailers");
            if (this.s) {
                bacz.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{babj, baaf});
                return;
            }
            for (babm babm : this.o.b) {
            }
            b(babj, false, baaf);
            return;
        }
        String valueOf = String.valueOf(baaf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append("trailers: ");
        sb.append(valueOf);
        babj b2 = babj3.b(sb.toString());
        this.c = b2;
        a(b2, false, this.d);
    }

    /* access modifiers changed from: protected */
    public final void a(bakl bakl, boolean z) {
        babj babj = this.c;
        boolean z2 = false;
        if (babj != null) {
            String a2 = bakp.a(bakl, this.e);
            this.c = babj.b(a2.length() == 0 ? new String("DATA-----------------------------\n") : "DATA-----------------------------\n".concat(a2));
            bakl.close();
            if (this.c.s.length() > 1000 || z) {
                a(this.c, false, this.d);
            }
        } else if (this.f) {
            amrl.a((Object) bakl, (Object) "frame");
            boolean z3 = true;
            try {
                if (!this.s) {
                    try {
                        baet baet = this.j;
                        amrl.a((Object) bakl, (Object) "data");
                        if (((bajs) baet).a() || ((bajs) baet).f) {
                            bakl.close();
                        } else {
                            ((bajs) baet).d.a(bakl);
                            try {
                                ((bajs) baet).c();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            a(th2);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } else {
                    bacz.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                    bakl.close();
                }
                if (z) {
                    this.c = babj.n.a("Received unexpected EOS on DATA frame from server.");
                    baaf baaf = new baaf();
                    this.d = baaf;
                    b(this.c, false, baaf);
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = true;
                if (z2) {
                    bakl.close();
                }
                throw th;
            }
        } else {
            a(babj.n.a("headers not received before payload"), false, new baaf());
        }
    }
}
