package defpackage;

import android.util.SparseArray;

/* renamed from: amma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amma implements amlc {
    private final awdn a;
    private final amlp b;

    public final void a(amln amln, SparseArray sparseArray) {
        amri amri;
        boolean z;
        amln amln2 = amln;
        SparseArray sparseArray2 = sparseArray;
        amri amri2 = (amri) this.a.a();
        if (!amri2.a() || !((aghw) amri2.b()).a()) {
            amri = ampu.a;
        } else {
            amri = ((aghw) amri2.b()).c().a(sparseArray2, amln2);
        }
        if (amri.a()) {
            ammc ammc = new ammc();
            ammc.a = amln2;
            ammc.b = sparseArray2;
            ammc.g = ((Float) amri.b()).floatValue();
            amrl.a((Object) ammc.a);
            int i = 1;
            boolean z2 = false;
            if (ammc.h == null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            aucd o = barw.h.o();
            float f = ammc.g;
            if (o.c) {
                o.c();
                o.c = false;
            }
            barw barw = (barw) o.b;
            barw.a |= 4;
            barw.e = f;
            ammc.h = o;
            amln amln3 = ammc.a;
            ammc.c = amln3.f;
            aucd aucd = ammc.h;
            long j = (amln3.b ^ amln3.c) & Long.MAX_VALUE;
            long j2 = 1;
            if (j == 0) {
                j = 1;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            barw barw2 = (barw) aucd.b;
            int i2 = barw2.a | 1;
            barw2.a = i2;
            barw2.b = j;
            barw2.c = 1;
            barw2.a = i2 | 2;
            aucx aucx = ammc.a.d;
            int size = aucx.size();
            int i3 = 0;
            while (i3 < size) {
                amkp amkp = (amkp) aucx.get(i3);
                aucd o2 = barz.m.o();
                String str = amkp.b;
                if (o2.c) {
                    o2.c();
                    o2.c = z2;
                }
                barz barz = (barz) o2.b;
                str.getClass();
                int i4 = barz.a | i;
                barz.a = i4;
                barz.b = str;
                int i5 = amkp.c;
                int i6 = i4 | 8;
                barz.a = i6;
                barz.e = ((long) i5) + j2;
                int i7 = amkp.d;
                int i8 = i6 | 16;
                barz.a = i8;
                barz.f = ((long) i7) + j2;
                long j3 = ammc.c;
                long j4 = amkp.e;
                int i9 = i8 | 32;
                barz.a = i9;
                barz.g = j3 + j4;
                if ((amkp.a & 16) != 0) {
                    long j5 = amkp.f;
                    i9 |= 64;
                    barz.a = i9;
                    barz.h = j5;
                }
                if ((amkp.a & 32) != 0) {
                    int i10 = amkp.g;
                    barz.a = i9 | 128;
                    barz.i = i10;
                }
                amks a2 = amkv.a(ammb.a, (amkv) ammc.b.get(i5, amku.a), amlw.a);
                if (a2.b()) {
                    njx njx = (njx) a2.a();
                    if (njx.a) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barz barz2 = (barz) o2.b;
                        barz2.k = 5;
                        barz2.a |= 512;
                    }
                    amri amri3 = njx.b;
                    if (amri3.a()) {
                        barb barb = (barb) amri3.b();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        barz barz3 = (barz) o2.b;
                        barb.getClass();
                        barz3.l = barb;
                        barz3.a |= 1024;
                    }
                }
                barz barz4 = (barz) o2.i();
                if (barz4.f != 0) {
                    int a3 = bary.a(barz4.k);
                    if (a3 != 0 && a3 == 6 && ammc.f == null) {
                        ammc.f = barz4;
                    }
                } else {
                    ammc.e = barz4;
                }
                aucd aucd2 = ammc.h;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                barw barw3 = (barw) aucd2.b;
                barz4.getClass();
                barw3.c();
                barw3.d.add(barz4);
                long j6 = barz4.g + barz4.h;
                if (j6 > ammc.d) {
                    ammc.d = j6;
                }
                i3++;
                i = 1;
                z2 = false;
                j2 = 1;
            }
            amln amln4 = ammc.a;
            if ((amln4.a & 16) != 0) {
                amkc amkc = amln4.g;
                if (amkc == null) {
                    amkc = amkc.d;
                }
                aucd o3 = bart.d.o();
                if ((amkc.a & 1) != 0) {
                    amkb amkb = amkc.b;
                    if (amkb == null) {
                        amkb = amkb.c;
                    }
                    int i11 = amkb.b;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    bart bart = (bart) o3.b;
                    bart.a |= 1;
                    bart.b = i11;
                }
                if ((amkc.a & 2) != 0) {
                    amka amka = amkc.c;
                    if (amka == null) {
                        amka = amka.d;
                    }
                    long j7 = amka.b;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    bart bart2 = (bart) o3.b;
                    bart2.a |= 2;
                    bart2.c = j7;
                }
                aucd aucd3 = ammc.h;
                bart bart3 = (bart) o3.i();
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                barw barw4 = (barw) aucd3.b;
                bart3.getClass();
                barw4.f = bart3;
                barw4.a |= 8;
            }
            if (ammc.f == null) {
                ammc.f = ammc.e;
            }
            barz barz5 = ammc.f;
            String str2 = barz5.b;
            barb barb2 = barz5.l;
            ammd ammd = new ammd(str2, barb2 != null ? barb2 : barb.c, ammc.c, ammc.d, (barw) ammc.h.i());
            agfu.a().a.a(agie.a, ammd.e, (barb) null);
            if (((amri) this.a.a()).a() && ((aghw) ((amri) this.a.a()).b()).d()) {
                agfu.a().a.a(agir.a, ammd.a, ammd.c, ammd.d, ammd.b);
            }
        }
    }

    public amma(awdn awdn, amlp amlp) {
        this.a = awdn;
        this.b = amlp;
    }
}
