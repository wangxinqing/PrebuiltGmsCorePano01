package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akte extends akss {
    private final int b;

    public final /* bridge */ /* synthetic */ anui a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        asuz asuz = (asuz) obj;
        anui a = super.a(i, j, placesParams, asuz);
        aucd aucd = (aucd) a.c(5);
        aucd.a((aucj) a);
        aucd o = aofs.d.o();
        int i3 = this.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofs aofs = (aofs) o.b;
        aofs.a |= 1;
        aofs.b = i3;
        if (asuz != null) {
            i2 = asuz.b.size();
        } else {
            i2 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofs aofs2 = (aofs) o.b;
        aofs2.a |= 2;
        aofs2.c = i2;
        aofs aofs3 = (aofs) o.i();
        aoei aoei = ((anui) aucd.b).c;
        if (aoei == null) {
            aoei = aoei.w;
        }
        aucd aucd2 = (aucd) aoei.c(5);
        aucd2.a((aucj) aoei);
        aodn aodn = ((aoei) aucd2.b).v;
        if (aodn == null) {
            aodn = aodn.q;
        }
        aucd aucd3 = (aucd) aodn.c(5);
        aucd3.a((aucj) aodn);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn2 = (aodn) aucd3.b;
        aofs3.getClass();
        aodn2.n = aofs3;
        aodn2.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        aodn aodn3 = (aodn) aucd3.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
        aodn3.getClass();
        aoei2.v = aodn3;
        aoei2.a |= 8388608;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anui anui = (anui) aucd.b;
        aoei aoei3 = (aoei) aucd2.i();
        anui anui2 = anui.p;
        aoei3.getClass();
        anui.c = aoei3;
        anui.a |= 2;
        return (anui) aucd.i();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public akte(defpackage.iyn r12, android.content.Context r13, java.lang.String r14, java.lang.String r15, com.google.android.gms.maps.model.LatLngBounds r16, int r17, java.lang.String r18, java.util.Collection r19, boolean r20, java.lang.String r21, com.google.android.gms.location.places.internal.PlacesParams r22) {
        /*
            r11 = this;
            r0 = r17
            asuy r1 = defpackage.asuy.g
            aucd r1 = r1.o()
            r2 = r13
            r3 = r22
            asuu r2 = defpackage.aksd.a((android.content.Context) r13, (com.google.android.gms.location.places.internal.PlacesParams) r3)
            boolean r3 = r1.c
            r4 = 0
            if (r3 == 0) goto L_0x0019
            r1.c()
            r1.c = r4
        L_0x0019:
            aucj r3 = r1.b
            asuy r3 = (defpackage.asuy) r3
            r2.getClass()
            r3.b = r2
            int r2 = r3.a
            r2 = r2 | 1
            r3.a = r2
            assv r2 = defpackage.assv.d
            aucd r2 = r2.o()
            java.util.List r3 = defpackage.akic.a((java.util.Collection) r19)
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            r2.c()
            r2.c = r4
        L_0x003c:
            aucj r5 = r2.b
            assv r5 = (defpackage.assv) r5
            aucx r6 = r5.c
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0050
            aucx r6 = r5.c
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r5.c = r6
        L_0x0050:
            aucx r5 = r5.c
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r5)
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            r2.c()
            r2.c = r4
        L_0x005f:
            aucj r3 = r2.b
            assv r3 = (defpackage.assv) r3
            int r5 = r3.a
            r5 = r5 | 1
            r3.a = r5
            r5 = r20
            r3.b = r5
            aucj r2 = r2.i()
            assv r2 = (defpackage.assv) r2
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r1.c()
            r1.c = r4
        L_0x007d:
            aucj r3 = r1.b
            asuy r3 = (defpackage.asuy) r3
            r2.getClass()
            r3.c = r2
            int r2 = r3.a
            r2 = r2 | 2
            r3.a = r2
            assd r2 = defpackage.aksd.a((com.google.android.gms.maps.model.LatLngBounds) r16)
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0095
            goto L_0x009a
        L_0x0095:
            r1.c()
            r1.c = r4
        L_0x009a:
            aucj r3 = r1.b
            asuy r3 = (defpackage.asuy) r3
            r2.getClass()
            r3.d = r2
            int r2 = r3.a
            r2 = r2 | 4
            r3.a = r2
            r2 = r2 | 16
            r3.a = r2
            r3.f = r0
            r18.getClass()
            r2 = r2 | 8
            r3.a = r2
            r2 = r18
            r3.e = r2
            aucj r1 = r1.i()
            asuy r1 = (defpackage.asuy) r1
            byte[] r7 = r1.k()
            asuz r8 = defpackage.asuz.c
            r9 = 10
            r10 = 10242(0x2802, float:1.4352E-41)
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akte.<init>(iyn, android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.maps.model.LatLngBounds, int, java.lang.String, java.util.Collection, boolean, java.lang.String, com.google.android.gms.location.places.internal.PlacesParams):void");
    }
}
