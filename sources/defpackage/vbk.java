package defpackage;

import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: vbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vbk extends vaj {
    final /* synthetic */ vbp a;

    public vbk(vbp vbp) {
        this.a = vbp;
    }

    public final void a(auzf auzf, vai vai) {
        for (Map.Entry entry : this.a.d.b()) {
            for (avae avae : ((vbu) entry.getValue()).a()) {
                if (avae.d.contains(auzf)) {
                    vbp vbp = this.a;
                    vdx vdx = new vdx();
                    vdx.a(vbp.a(vai));
                    vbp.a(vdx, avae, (ClientAppIdentifier) entry.getKey());
                }
            }
        }
    }

    public final void a(vai vai) {
        if (aync.d()) {
            vbp vbp = this.a;
            vdx vdx = new vdx();
            vdx.d();
            NearbyDevice a2 = vbp.a(vai);
            vak vak = this.a.f;
            Set b = vai.b();
            vak.l.b();
            HashSet hashSet = new HashSet(b);
            hashSet.removeAll(vak.h.keySet());
            vak vak2 = this.a.f;
            Set c = vai.c();
            vak2.l.b();
            HashSet hashSet2 = new HashSet(c);
            for (vai c2 : vak2.g.values()) {
                hashSet2.removeAll(c2.c());
            }
            vak vak3 = this.a.f;
            Set d = vai.d();
            vak3.l.b();
            HashSet hashSet3 = new HashSet(d);
            for (vai d2 : vak3.g.values()) {
                hashSet3.removeAll(d2.d());
            }
            vbp.a(vdx, a2, hashSet, hashSet2, hashSet3, (uyq) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0207, code lost:
        if (defpackage.aync.a.a().b() != false) goto L_0x020f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.vai r21, defpackage.vai r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r8 = r22
            r9 = r23
            boolean r2 = defpackage.aync.d()
            if (r2 == 0) goto L_0x0269
            r2 = 1
            boolean r2 = defpackage.vak.a((int) r9, (int) r2)
            if (r2 == 0) goto L_0x0024
            vbp r2 = r0.a
            java.util.Map r3 = r21.e()
            java.util.Map r4 = r22.e()
            vbo r5 = defpackage.vbp.a
            r2.a(r8, r3, r4, r5)
        L_0x0024:
            r10 = 2
            boolean r2 = defpackage.vak.a((int) r9, (int) r10)
            if (r2 == 0) goto L_0x003b
            vbp r2 = r0.a
            java.util.Map r3 = r21.f()
            java.util.Map r4 = r22.f()
            vbo r5 = defpackage.vbp.b
            r2.a(r8, r3, r4, r5)
        L_0x003b:
            r2 = 32
            boolean r2 = defpackage.vak.a((int) r9, (int) r2)
            if (r2 == 0) goto L_0x0052
            vbp r2 = r0.a
            java.util.Map r3 = r21.g()
            java.util.Map r4 = r22.g()
            vbo r5 = defpackage.vbp.c
            r2.a(r8, r3, r4, r5)
        L_0x0052:
            r2 = 64
            boolean r2 = defpackage.vak.a((int) r9, (int) r2)
            if (r2 == 0) goto L_0x00a0
            vbp r2 = r0.a
            java.util.Map r3 = r21.g()
            java.util.Map r4 = r22.g()
            vbo r5 = defpackage.vbp.c
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x006e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00a0
            java.lang.Object r6 = r3.next()
            boolean r7 = r4.containsKey(r6)
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.nearby.messages.devices.NearbyDevice r7 = defpackage.vbp.a((defpackage.vai) r22)
            vdx r11 = new vdx
            r11.<init>()
            r11.d()
            r11.a((com.google.android.gms.nearby.messages.devices.NearbyDevice) r7)
            com.google.android.gms.nearby.messages.Message r6 = r5.a(r6, r7)
            if (r6 == 0) goto L_0x006e
            r11.b = r6
            com.google.android.gms.nearby.messages.internal.Update r6 = r11.a()
            r7 = 0
            uyq r7 = (defpackage.uyq) r7
            r2.a((com.google.android.gms.nearby.messages.internal.Update) r6, (defpackage.uyq) r7)
            goto L_0x006e
        L_0x00a0:
            r2 = 20
            boolean r2 = defpackage.vak.a((int) r9, (int) r2)
            if (r2 == 0) goto L_0x0269
            vbp r2 = r0.a
            java.util.Map r5 = r21.e()
            java.util.Map r6 = r22.e()
            vbo r7 = defpackage.vbp.a
            r3 = r23
            r4 = r22
            r2.a(r3, r4, r5, r6, r7)
            vbp r2 = r0.a
            java.util.Map r5 = r21.f()
            java.util.Map r6 = r22.f()
            vbo r7 = defpackage.vbp.b
            r2.a(r3, r4, r5, r6, r7)
            vbp r2 = r0.a
            java.util.Map r5 = r21.g()
            java.util.Map r6 = r22.g()
            vbo r7 = defpackage.vbp.c
            r2.a(r3, r4, r5, r6, r7)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r3 = r22.b()
            r2.addAll(r3)
            java.util.Set r3 = r22.c()
            r2.addAll(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x00f0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0269
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof defpackage.auzf
            if (r4 == 0) goto L_0x0115
            vbp r4 = r0.a
            vak r4 = r4.f
            r5 = r3
            auzf r5 = (defpackage.auzf) r5
            vai r4 = r4.a((defpackage.auzf) r5)
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = r4.b
            java.lang.String r5 = r8.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00f0
        L_0x0115:
            vdx r4 = new vdx
            r4.<init>()
            r5 = 4
            boolean r5 = defpackage.vak.a((int) r9, (int) r5)
            if (r5 == 0) goto L_0x012b
            com.google.android.gms.nearby.messages.internal.DistanceImpl r5 = new com.google.android.gms.nearby.messages.internal.DistanceImpl
            double r6 = r8.g
            r5.<init>(r6)
            r4.a((com.google.android.gms.nearby.messages.internal.DistanceImpl) r5)
        L_0x012b:
            r5 = 16
            boolean r5 = defpackage.vak.a((int) r9, (int) r5)
            if (r5 == 0) goto L_0x0144
            com.google.android.gms.nearby.messages.internal.BleSignalImpl r5 = r1.a((java.lang.Object) r3)
            com.google.android.gms.nearby.messages.internal.BleSignalImpl r6 = r8.a((java.lang.Object) r3)
            boolean r5 = defpackage.ius.a(r5, r6)
            if (r5 != 0) goto L_0x0144
            r4.a((com.google.android.gms.nearby.messages.internal.BleSignalImpl) r6)
        L_0x0144:
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x0263
            uzx r5 = r22.h()
            r4.a((defpackage.uzx) r5)
            vbp r5 = r0.a
            vbt r5 = r5.d
            java.util.Set r5 = r5.b()
            java.util.Iterator r5 = r5.iterator()
        L_0x015d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x025d
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            vbu r7 = (defpackage.vbu) r7
            java.util.Collection r7 = r7.a()
            java.util.Iterator r7 = r7.iterator()
        L_0x0177:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0253
            java.lang.Object r11 = r7.next()
            avae r11 = (defpackage.avae) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            aucx r13 = r11.d
            r12.addAll(r13)
            aucx r13 = r11.e
            r12.addAll(r13)
            boolean r12 = r12.contains(r3)
            if (r12 == 0) goto L_0x0249
            avah r12 = r11.g
            if (r12 == 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            avah r12 = defpackage.avah.b
        L_0x019f:
            double r12 = r12.a
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x022e
            aync r14 = defpackage.aync.a
            aynd r14 = r14.a()
            double r14 = r14.A()
            aync r16 = defpackage.aync.a
            aynd r16 = r16.a()
            double r16 = r16.B()
            r18 = r11
            double r10 = r12 * r16
            double r10 = java.lang.Math.max(r14, r10)
            double r10 = r10 + r12
            boolean r14 = r21.a()
            r15 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r14 == 0) goto L_0x01d5
            r14 = r2
            r17 = r3
            double r2 = r1.g
            goto L_0x01d9
        L_0x01d5:
            r14 = r2
            r17 = r3
            r2 = r15
        L_0x01d9:
            boolean r19 = r22.a()
            if (r19 == 0) goto L_0x01e5
            r19 = r14
            double r14 = r8.g
            r15 = r14
            goto L_0x01e7
        L_0x01e5:
            r19 = r14
        L_0x01e7:
            int r14 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x01f9
            int r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r14 > 0) goto L_0x0216
            int r2 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x0216
            jjg r2 = defpackage.tgc.a
            r4.d()
            goto L_0x0216
        L_0x01f9:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 < 0) goto L_0x020a
            aync r2 = defpackage.aync.a
            aynd r2 = r2.a()
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0216
            goto L_0x020f
        L_0x020a:
            jjg r2 = defpackage.tgc.a
            r4.c()
        L_0x020f:
            com.google.android.gms.nearby.messages.devices.NearbyDevice r2 = defpackage.vbp.a((defpackage.vai) r22)
            r4.a((com.google.android.gms.nearby.messages.devices.NearbyDevice) r2)
        L_0x0216:
            int r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            r3 = 2
            goto L_0x0235
        L_0x021c:
            com.google.android.gms.nearby.messages.internal.Update r2 = r4.a()
            r3 = 2
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto L_0x0235
            r3 = r17
            r2 = r19
            r10 = 2
            goto L_0x0177
        L_0x022e:
            r19 = r2
            r17 = r3
            r18 = r11
            r3 = 2
        L_0x0235:
            vbp r2 = r0.a
            java.lang.Object r10 = r6.getKey()
            com.google.android.gms.nearby.messages.ClientAppIdentifier r10 = (com.google.android.gms.nearby.messages.ClientAppIdentifier) r10
            r11 = r18
            r2.a((defpackage.vdx) r4, (defpackage.avae) r11, (com.google.android.gms.nearby.messages.ClientAppIdentifier) r10)
            r3 = r17
            r2 = r19
            r10 = 2
            goto L_0x0177
        L_0x0249:
            r19 = r2
            r17 = r3
            r3 = 2
            r3 = r17
            r10 = 2
            goto L_0x0177
        L_0x0253:
            r19 = r2
            r17 = r3
            r3 = 2
            r3 = r17
            r10 = 2
            goto L_0x015d
        L_0x025d:
            r19 = r2
            r3 = 2
            r10 = 2
            goto L_0x00f0
        L_0x0263:
            r19 = r2
            r3 = 2
            r10 = 2
            goto L_0x00f0
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbk.a(vai, vai, int):void");
    }
}
