package defpackage;

import java.util.Map;

/* renamed from: aftw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aftw {
    private final aftb a;
    private final amsv b;
    private final afts c;

    public aftw(String str, String str2, String str3, amsv amsv, afts afts) {
        aucd o = aftb.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aftb aftb = (aftb) o.b;
        str.getClass();
        int i = aftb.a | 4;
        aftb.a = i;
        aftb.c = str;
        aftb.a = i | 2;
        aftb.b = 1;
        if (!rbk.d()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftb aftb2 = (aftb) o.b;
            str3.getClass();
            aftb2.a |= 16;
            aftb2.e = str3;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftb aftb3 = (aftb) o.b;
            str2.getClass();
            aftb3.a |= 8;
            aftb3.d = str2;
        }
        this.a = (aftb) o.i();
        this.b = amta.a(amsv);
        this.c = afts;
    }

    public final void a(afyp afyp, int i, int i2, aftx aftx, boolean z) {
        int g = rbk.g();
        if (this.c.a((long) g)) {
            aucd o = afth.k.o();
            long b2 = afyp.b();
            if (o.c) {
                o.c();
                o.c = false;
            }
            afth afth = (afth) o.b;
            afth.a |= 2;
            afth.c = b2;
            long d = afyp.d();
            if (o.c) {
                o.c();
                o.c = false;
            }
            afth afth2 = (afth) o.b;
            afth2.a |= 8;
            afth2.e = d;
            long c2 = afyp.c();
            if (o.c) {
                o.c();
                o.c = false;
            }
            afth afth3 = (afth) o.b;
            int i3 = 4;
            int i4 = afth3.a | 4;
            afth3.a = i4;
            afth3.d = c2;
            afth3.b = i - 1;
            afth3.a = i4 | 1;
            int i5 = i2 - 1;
            if (i2 != 0) {
                if (i5 == 0) {
                    i3 = 2;
                } else if (i5 == 1) {
                    i3 = 3;
                } else if (i5 != 2) {
                    i3 = 1;
                }
                afth afth4 = (afth) o.b;
                afth4.j = i3 - 1;
                afth4.a |= 128;
                anhj a2 = afyp.a().entrySet().iterator();
                while (a2.hasNext()) {
                    Map.Entry entry = (Map.Entry) a2.next();
                    aucd o2 = aftg.d.o();
                    int a3 = ((auco) ((Enum) entry.getKey())).a();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aftg aftg = (aftg) o2.b;
                    aftg.a |= 1;
                    aftg.b = a3;
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aftg aftg2 = (aftg) o2.b;
                    aftg2.a |= 2;
                    aftg2.c = longValue;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    afth afth5 = (afth) o.b;
                    aftg aftg3 = (aftg) o2.i();
                    aftg3.getClass();
                    if (!afth5.i.a()) {
                        afth5.i = aucj.a(afth5.i);
                    }
                    afth5.i.add(aftg3);
                }
                if (aftx != null) {
                    int a4 = aftx.a().a();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    afth afth6 = (afth) o.b;
                    afth6.a |= 16;
                    afth6.f = a4;
                    Integer b3 = aftx.b();
                    if (b3 != null) {
                        int intValue = b3.intValue();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        afth afth7 = (afth) o.b;
                        afth7.a |= 32;
                        afth7.g = intValue;
                    }
                }
                if (z) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    afth afth8 = (afth) o.b;
                    afth8.a |= 64;
                    afth8.h = true;
                }
                aucd o3 = afti.c.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                afti afti = (afti) o3.b;
                afth afth9 = (afth) o.i();
                afth9.getClass();
                afti.b = afth9;
                afti.a = 1 | afti.a;
                afti afti2 = (afti) o3.i();
                aftn aftn = (aftn) this.b.a();
                aucd o4 = aftc.f.o();
                aftb aftb = this.a;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aftc aftc = (aftc) o4.b;
                aftb.getClass();
                aftc.e = aftb;
                int i6 = aftc.a | 32;
                aftc.a = i6;
                aftc.a = i6 | 16;
                aftc.d = g;
                afti2.getClass();
                aftc.c = afti2;
                aftc.b = 6;
                aftn.a(3001, (aftc) o4.i());
                return;
            }
            throw null;
        }
    }

    @Deprecated
    public final void a(afyp afyp, int i, aftx aftx) {
        int g = rbk.g();
        if (this.c.a((long) g)) {
            aucd o = afth.k.o();
            long b2 = afyp.b();
            if (o.c) {
                o.c();
                o.c = false;
            }
            afth afth = (afth) o.b;
            afth.a |= 2;
            afth.c = b2;
            long d = afyp.d();
            if (o.c) {
                o.c();
                o.c = false;
            }
            afth afth2 = (afth) o.b;
            afth2.a |= 8;
            afth2.e = d;
            long c2 = afyp.c();
            if (o.c) {
                o.c();
                o.c = false;
            }
            afth afth3 = (afth) o.b;
            int i2 = afth3.a | 4;
            afth3.a = i2;
            afth3.d = c2;
            afth3.b = i - 1;
            afth3.a = i2 | 1;
            if (aftx != null) {
                int a2 = aftx.a().a();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                afth afth4 = (afth) o.b;
                afth4.a |= 16;
                afth4.f = a2;
                Integer b3 = aftx.b();
                if (b3 != null) {
                    int intValue = b3.intValue();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    afth afth5 = (afth) o.b;
                    afth5.a |= 32;
                    afth5.g = intValue;
                }
            }
            aucd o2 = afti.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            afti afti = (afti) o2.b;
            afth afth6 = (afth) o.i();
            afth6.getClass();
            afti.b = afth6;
            afti.a |= 1;
            afti afti2 = (afti) o2.i();
            aftn aftn = (aftn) this.b.a();
            aucd o3 = aftc.f.o();
            aftb aftb = this.a;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aftc aftc = (aftc) o3.b;
            aftb.getClass();
            aftc.e = aftb;
            int i3 = aftc.a | 32;
            aftc.a = i3;
            aftc.a = i3 | 16;
            aftc.d = g;
            afti2.getClass();
            aftc.c = afti2;
            aftc.b = 6;
            aftn.a(3001, (aftc) o3.i());
        }
    }
}
