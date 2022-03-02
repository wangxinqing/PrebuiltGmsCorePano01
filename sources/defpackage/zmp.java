package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: zmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmp implements ica, icb {
    final /* synthetic */ zmr a;

    public zmp(zmr zmr) {
        this.a = zmr;
    }

    public final void a(int i) {
        zmr zmr = this.a;
        if (zmr.n == null || zmr.l) {
            zmr.b.t();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c A[LOOP:1: B:19:0x007a->B:20:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x004f A[EDGE_INSN: B:71:0x004f->B:12:0x004f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            zmr r1 = r0.a
            yuv r2 = r1.b
            java.lang.String r2 = r2.a()
            r1.j = r2
            zmr r1 = r0.a
            zms r1 = r1.g
            boolean r1 = r1.a()
            r2 = 0
            if (r1 == 0) goto L_0x002f
            zmr r1 = r0.a
            zms r3 = r1.g
            java.lang.String r3 = r3.a
            java.lang.String r1 = r1.j
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x002f
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            zmr r3 = r0.a
            java.lang.String r3 = r3.j
            r1[r2] = r3
            goto L_0x0033
        L_0x002f:
            zmr r1 = r0.a
            java.lang.String[] r1 = r1.i
        L_0x0033:
            zmr r3 = r0.a
            r4 = -1
            r3.k = r4
            int r3 = r1.length
            r4 = 0
        L_0x003a:
            if (r4 >= r3) goto L_0x004f
            r5 = r1[r4]
            zmr r6 = r0.a
            java.lang.String r6 = r6.j
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x004b
            int r4 = r4 + 1
            goto L_0x003a
        L_0x004b:
            zmr r3 = r0.a
            r3.k = r4
        L_0x004f:
            zmr r3 = r0.a
            int r3 = r3.k
            java.lang.String r4 = "ShareBox"
            if (r3 >= 0) goto L_0x0060
            java.lang.String r3 = "Resolved account name not found among share eligable accounts"
            android.util.Log.e(r4, r3)
            zmr r3 = r0.a
            r3.k = r2
        L_0x0060:
            zmr r3 = r0.a
            zmq r5 = r3.f
            if (r5 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            int r3 = r3.k
            r5.a((java.lang.String[]) r1, (int) r3)
        L_0x006c:
            zmr r1 = r0.a
            java.util.ArrayList r3 = r1.x
            int r3 = r3.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            r6 = 0
        L_0x007a:
            if (r6 >= r3) goto L_0x008a
            java.util.ArrayList r7 = r1.x
            java.lang.Object r7 = r7.get(r6)
            zmn r7 = (defpackage.zmn) r7
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x007a
        L_0x008a:
            java.util.ArrayList r6 = r1.x
            r6.clear()
        L_0x008f:
            if (r2 >= r3) goto L_0x00e6
            java.lang.Object r6 = r5.get(r2)
            zmn r6 = (defpackage.zmn) r6
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x00bf
            boolean r7 = r6.b()
            if (r7 != 0) goto L_0x00a4
            goto L_0x00bf
        L_0x00a4:
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x00b9
            boolean r7 = r6.b()
            if (r7 != 0) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            com.google.android.gms.common.server.FavaDiagnosticsEntity r7 = r6.a
            com.google.android.gms.common.server.FavaDiagnosticsEntity r6 = r6.b
            r1.a((com.google.android.gms.common.server.FavaDiagnosticsEntity) r7, (com.google.android.gms.common.server.FavaDiagnosticsEntity) r6)
            goto L_0x00e3
        L_0x00b9:
            java.lang.String r6 = "Unhandled queued navigation log request"
            android.util.Log.e(r4, r6)
            goto L_0x00e3
        L_0x00bf:
            boolean r7 = r6.c()
            if (r7 != 0) goto L_0x00cb
            java.lang.String r6 = "Unhandled queued log request"
            android.util.Log.e(r4, r6)
            goto L_0x00e3
        L_0x00cb:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x00dd
            com.google.android.gms.common.server.FavaDiagnosticsEntity r7 = r6.c
            com.google.android.gms.common.server.FavaDiagnosticsEntity r8 = r6.a
            com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity r9 = r6.d
            com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity r6 = r6.e
            r1.a(r7, r8, r9, r6)
            goto L_0x00e3
        L_0x00dd:
            java.lang.String r6 = "Unhandled queued action log request"
            android.util.Log.e(r4, r6)
        L_0x00e3:
            int r2 = r2 + 1
            goto L_0x008f
        L_0x00e6:
            zmr r1 = r0.a
            icc r1 = r1.d
            boolean r1 = r1.i()
            if (r1 != 0) goto L_0x0102
            zmr r1 = r0.a
            icc r1 = r1.d
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x00fb
            goto L_0x0102
        L_0x00fb:
            zmr r1 = r0.a
            icc r1 = r1.d
            r1.e()
        L_0x0102:
            zmr r1 = r0.a
            boolean r2 = r1.l
            if (r2 == 0) goto L_0x0110
            yuv r2 = r1.b
            com.google.android.gms.plus.model.posts.Post r3 = r1.m
            r2.a((defpackage.yus) r1, (com.google.android.gms.plus.model.posts.Post) r3)
            return
        L_0x0110:
            zms r1 = r1.g
            boolean r1 = r1.e()
            r2 = 0
            if (r1 == 0) goto L_0x0125
            zmr r1 = r0.a
            zms r1 = r1.g
            java.lang.String r1 = r1.n
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r7 = r1
            goto L_0x0126
        L_0x0125:
            r7 = r2
        L_0x0126:
            zmr r1 = r0.a
            zms r1 = r1.g
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x013a
            zmr r1 = r0.a
            zms r1 = r1.g
            zmw r1 = r1.p
            android.os.Bundle r2 = r1.a
            r11 = r2
            goto L_0x013b
        L_0x013a:
            r11 = r2
        L_0x013b:
            zmr r1 = r0.a
            zms r1 = r1.g
            java.lang.String r15 = r1.b()
            zmr r1 = r0.a
            zms r1 = r1.g
            com.google.android.gms.common.people.data.Audience r2 = r1.q
            java.lang.String r13 = r1.f
            com.google.android.gms.plus.model.posts.Post r1 = new com.google.android.gms.plus.model.posts.Post
            r4 = 1
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 1
            r3 = r1
            r16 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            zmr r2 = r0.a
            com.google.android.gms.plus.model.posts.Settings r3 = r2.n
            if (r3 != 0) goto L_0x0167
            yuv r3 = r2.b
            r3.a((defpackage.yur) r2, (com.google.android.gms.plus.model.posts.Post) r1)
            goto L_0x0170
        L_0x0167:
            com.google.android.gms.common.ConnectionResult r3 = com.google.android.gms.common.ConnectionResult.a
            zmr r4 = r0.a
            com.google.android.gms.plus.model.posts.Settings r4 = r4.n
            r2.a((com.google.android.gms.common.ConnectionResult) r3, (com.google.android.gms.plus.model.posts.Settings) r4)
        L_0x0170:
            zmr r2 = r0.a
            ysw r2 = r2.p
            if (r2 == 0) goto L_0x0177
            goto L_0x0185
        L_0x0177:
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x0185
            zmr r2 = r0.a
            yuv r3 = r2.b
            r3.a((defpackage.yuq) r2, (com.google.android.gms.plus.model.posts.Post) r1)
            return
        L_0x0185:
            zmr r1 = r0.a
            com.google.android.gms.common.ConnectionResult r2 = com.google.android.gms.common.ConnectionResult.a
            zmr r3 = r0.a
            ysw r3 = r3.p
            r1.a((com.google.android.gms.common.ConnectionResult) r2, (defpackage.ysw) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmp.g(android.os.Bundle):void");
    }

    public final void a(ConnectionResult connectionResult) {
        zmr zmr = this.a;
        if (zmr.f != null) {
            if (connectionResult.c == 4) {
                zmr.y = ((Long) ysu.Y.c()).longValue();
            }
            this.a.f.a(connectionResult);
        }
    }
}
