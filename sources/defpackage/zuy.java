package defpackage;

import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: zuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zuy {
    private static int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    public static aucd a(avdf avdf, avdi avdi) {
        int i;
        int i2;
        int i3;
        aucd aucd;
        avdz avdz;
        avdf avdf2 = avdf;
        aucd o = aqvh.b.o();
        avdq avdq = avdi.f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        String valueOf = String.valueOf(avdq.v);
        long j = avdf2.b;
        aucd o2 = amfk.d.o();
        aucd o3 = amfj.d.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        amfj amfj = (amfj) o3.b;
        valueOf.getClass();
        int i4 = amfj.a | 1;
        amfj.a = i4;
        amfj.b = valueOf;
        amfj.a = i4 | 2;
        amfj.c = j;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        amfk amfk = (amfk) o2.b;
        amfj amfj2 = (amfj) o3.i();
        amfj2.getClass();
        amfk.b = amfj2;
        amfk.a |= 1;
        aucd o4 = amgi.D.o();
        aucx aucx = avdf2.k;
        int size = aucx.size();
        int i5 = 0;
        while (i5 < size) {
            avdz avdz2 = (avdz) aucx.get(i5);
            long j2 = avdz2.b;
            String valueOf2 = String.valueOf(j2);
            String str = avdz2.e;
            String str2 = avdz2.c;
            String str3 = avdz2.d;
            boolean z = avdz2.l;
            int i6 = size;
            int i7 = i5;
            long j3 = avdz2.h;
            aucd aucd2 = o;
            aucd aucd3 = o4;
            long j4 = avdz2.i;
            aucd o5 = amgr.h.o();
            aucx aucx2 = aucx;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            amgr amgr = (amgr) o5.b;
            valueOf2.getClass();
            avdz avdz3 = avdz2;
            int i8 = amgr.a | 1;
            amgr.a = i8;
            amgr.b = valueOf2;
            int i9 = i8 | 2;
            amgr.a = i9;
            amgr.c = j2;
            str2.getClass();
            int i10 = i9 | 4;
            amgr.a = i10;
            amgr.d = str2;
            str3.getClass();
            amgr.a = i10 | 8;
            amgr.e = str3;
            aucd o6 = amfi.c.o();
            aucd o7 = avkm.d.o();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            avkm avkm = (avkm) o7.b;
            avkm.a |= 1;
            avkm.b = j3;
            aufc a = augk.a(j4);
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            avkm avkm2 = (avkm) o7.b;
            a.getClass();
            avkm2.c = a;
            avkm2.a |= 2;
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            amfi amfi = (amfi) o6.b;
            avkm avkm3 = (avkm) o7.i();
            avkm3.getClass();
            if (!amfi.b.a()) {
                amfi.b = aucj.a(amfi.b);
            }
            amfi.b.add(avkm3);
            if (z) {
                amfh amfh = amfh.STARRED;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                amfi amfi2 = (amfi) o6.b;
                amfh.getClass();
                if (!amfi2.a.a()) {
                    amfi2.a = aucj.a(amfi2.a);
                }
                amfi2.a.d(amfh.c);
            }
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            amgr amgr2 = (amgr) o5.b;
            amfi amfi3 = (amfi) o6.i();
            amfi3.getClass();
            amgr2.g = amfi3;
            amgr2.a |= 64;
            if (!TextUtils.isEmpty(str)) {
                try {
                    long parseLong = Long.parseLong(str, 16);
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    amgr amgr3 = (amgr) o5.b;
                    amgr3.a |= 16;
                    amgr3.f = parseLong;
                } catch (NumberFormatException e) {
                    if (!azdq.a.a().r()) {
                        throw e;
                    }
                }
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            amfk amfk2 = (amfk) o2.b;
            amgr amgr4 = (amgr) o5.i();
            amgr4.getClass();
            if (!amfk2.c.a()) {
                amfk2.c = aucj.a(amfk2.c);
            }
            amfk2.c.add(amgr4);
            String str4 = avdf2.c;
            if (azdq.l()) {
                avdz = avdz3;
                if ((avdz.a & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
                    aucd o8 = amfz.o.o();
                    avea avea = avdz.j;
                    if (avea == null) {
                        avea = avea.m;
                    }
                    if ((avea.a & 1) != 0) {
                        avea avea2 = avdz.j;
                        if (avea2 == null) {
                            avea2 = avea.m;
                        }
                        String str5 = avea2.b;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz = (amfz) o8.b;
                        str5.getClass();
                        amfz.a |= 2;
                        amfz.c = str5;
                    }
                    avea avea3 = avdz.j;
                    if (avea3 == null) {
                        avea3 = avea.m;
                    }
                    if ((avea3.a & 4) != 0) {
                        avea avea4 = avdz.j;
                        if (avea4 == null) {
                            avea4 = avea.m;
                        }
                        String str6 = avea4.d;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz2 = (amfz) o8.b;
                        str6.getClass();
                        amfz2.a |= 32;
                        amfz2.f = str6;
                    }
                    avea avea5 = avdz.j;
                    if (avea5 == null) {
                        avea5 = avea.m;
                    }
                    if ((avea5.a & 2) != 0) {
                        avea avea6 = avdz.j;
                        if (avea6 == null) {
                            avea6 = avea.m;
                        }
                        String str7 = avea6.c;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz3 = (amfz) o8.b;
                        str7.getClass();
                        amfz3.a |= 16;
                        amfz3.e = str7;
                    }
                    avea avea7 = avdz.j;
                    if (avea7 == null) {
                        avea7 = avea.m;
                    }
                    if ((16 & avea7.a) != 0) {
                        avea avea8 = avdz.j;
                        if (avea8 == null) {
                            avea8 = avea.m;
                        }
                        String str8 = avea8.f;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz4 = (amfz) o8.b;
                        str8.getClass();
                        amfz4.a |= 64;
                        amfz4.g = str8;
                    }
                    avea avea9 = avdz.j;
                    if (avea9 == null) {
                        avea9 = avea.m;
                    }
                    if ((avea9.a & 8) != 0) {
                        avea avea10 = avdz.j;
                        if (avea10 == null) {
                            avea10 = avea.m;
                        }
                        String str9 = avea10.e;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz5 = (amfz) o8.b;
                        str9.getClass();
                        amfz5.a |= 128;
                        amfz5.h = str9;
                    }
                    avea avea11 = avdz.j;
                    if (avea11 == null) {
                        avea11 = avea.m;
                    }
                    if ((avea11.a & 32) != 0) {
                        avea avea12 = avdz.j;
                        if (avea12 == null) {
                            avea12 = avea.m;
                        }
                        String str10 = avea12.g;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz6 = (amfz) o8.b;
                        str10.getClass();
                        amfz6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        amfz6.i = str10;
                    }
                    avea avea13 = avdz.j;
                    if (avea13 == null) {
                        avea13 = avea.m;
                    }
                    if ((avea13.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        avea avea14 = avdz.j;
                        if (avea14 == null) {
                            avea14 = avea.m;
                        }
                        String str11 = avea14.j;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz7 = (amfz) o8.b;
                        str11.getClass();
                        amfz7.a |= 2048;
                        amfz7.l = str11;
                    }
                    avea avea15 = avdz.j;
                    if (avea15 == null) {
                        avea15 = avea.m;
                    }
                    if ((avea15.a & 64) != 0) {
                        avea avea16 = avdz.j;
                        if (avea16 == null) {
                            avea16 = avea.m;
                        }
                        String str12 = avea16.h;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz8 = (amfz) o8.b;
                        str12.getClass();
                        amfz8.a |= 1024;
                        amfz8.k = str12;
                    }
                    avea avea17 = avdz.j;
                    if (avea17 == null) {
                        avea17 = avea.m;
                    }
                    if ((avea17.a & 128) != 0) {
                        avea avea18 = avdz.j;
                        if (avea18 == null) {
                            avea18 = avea.m;
                        }
                        String str13 = avea18.i;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        amfz amfz9 = (amfz) o8.b;
                        str13.getClass();
                        amfz9.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                        amfz9.m = str13;
                    }
                    String valueOf3 = String.valueOf(avdz.b);
                    avea avea19 = avdz.j;
                    if (avea19 == null) {
                        avea19 = avea.m;
                    }
                    aucd a2 = a(valueOf3, avea19.b.equals(str4));
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    amfz amfz10 = (amfz) o8.b;
                    amgl amgl = (amgl) a2.i();
                    amgl.getClass();
                    amfz10.b = amgl;
                    amfz10.a |= 1;
                    aucd = aucd3;
                    aucd.j(o8);
                    i5 = i7 + 1;
                    o4 = aucd;
                    size = i6;
                    o = aucd2;
                    aucx = aucx2;
                } else {
                    aucd = aucd3;
                }
            } else {
                aucd = aucd3;
                avdz = avdz3;
            }
            if (str4 != null) {
                aucd o9 = amfz.o.o();
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                amfz amfz11 = (amfz) o9.b;
                str4.getClass();
                amfz11.a |= 8;
                amfz11.d = str4;
                aucd a3 = a(String.valueOf(avdz.b), true);
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                amfz amfz12 = (amfz) o9.b;
                amgl amgl2 = (amgl) a3.i();
                amgl2.getClass();
                amfz12.b = amgl2;
                amfz12.a |= 1;
                aucd.j(o9);
            }
            i5 = i7 + 1;
            o4 = aucd;
            size = i6;
            o = aucd2;
            aucx = aucx2;
        }
        aucd aucd4 = o;
        aucd aucd5 = o4;
        aucx aucx3 = avdf2.f;
        int size2 = aucx3.size();
        int i11 = 0;
        while (i11 < size2) {
            avdv avdv = (avdv) aucx3.get(i11);
            aucv aucv = avdv.d;
            int size3 = aucv.size();
            int i12 = 0;
            while (true) {
                i3 = i11 + 1;
                if (i12 >= size3) {
                    break;
                }
                long longValue = ((Long) aucv.get(i12)).longValue();
                aucd o10 = amgo.g.o();
                String str14 = avdv.b;
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                amgo amgo = (amgo) o10.b;
                str14.getClass();
                int i13 = amgo.a | 2;
                amgo.a = i13;
                amgo.c = str14;
                String str15 = avdv.c;
                str15.getClass();
                amgo.a = i13 | 4;
                amgo.d = str15;
                aucd a4 = a(String.valueOf(longValue), avdv.g);
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                amgo amgo2 = (amgo) o10.b;
                amgl amgl3 = (amgl) a4.i();
                amgl3.getClass();
                amgo2.b = amgl3;
                amgo2.a |= 1;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                amgi amgi = (amgi) aucd5.b;
                amgo amgo3 = (amgo) o10.i();
                amgo3.getClass();
                amgi.c();
                amgi.h.add(amgo3);
                i12++;
            }
            i11 = i3;
        }
        aucx aucx4 = avdf2.g;
        int size4 = aucx4.size();
        int i14 = 0;
        while (i14 < size4) {
            avds avds = (avds) aucx4.get(i14);
            aucv aucv2 = avds.d;
            int size5 = aucv2.size();
            int i15 = 0;
            while (true) {
                i2 = i14 + 1;
                if (i15 >= size5) {
                    break;
                }
                long longValue2 = ((Long) aucv2.get(i15)).longValue();
                aucd o11 = amfm.f.o();
                String str16 = avds.b;
                if (o11.c) {
                    o11.c();
                    o11.c = false;
                }
                amfm amfm = (amfm) o11.b;
                str16.getClass();
                int i16 = amfm.a | 2;
                amfm.a = i16;
                amfm.c = str16;
                String str17 = avds.c;
                str17.getClass();
                amfm.a = i16 | 4;
                amfm.d = str17;
                aucd a5 = a(String.valueOf(longValue2), avds.g);
                if (o11.c) {
                    o11.c();
                    o11.c = false;
                }
                amfm amfm2 = (amfm) o11.b;
                amgl amgl4 = (amgl) a5.i();
                amgl4.getClass();
                amfm2.b = amgl4;
                amfm2.a |= 1;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                amgi amgi2 = (amgi) aucd5.b;
                amfm amfm3 = (amfm) o11.i();
                amfm3.getClass();
                amgi2.b();
                amgi2.g.add(amfm3);
                i15++;
            }
            i14 = i2;
        }
        aucx aucx5 = avdf2.h;
        int size6 = aucx5.size();
        int i17 = 0;
        while (i17 < size6) {
            avdx avdx = (avdx) aucx5.get(i17);
            aucv aucv3 = avdx.d;
            int size7 = aucv3.size();
            int i18 = 0;
            while (true) {
                i = i17 + 1;
                if (i18 >= size7) {
                    break;
                }
                long longValue3 = ((Long) aucv3.get(i18)).longValue();
                aucd o12 = amez.l.o();
                String str18 = avdx.b;
                if (o12.c) {
                    o12.c();
                    o12.c = false;
                }
                amez amez = (amez) o12.b;
                str18.getClass();
                int i19 = amez.a | 8;
                amez.a = i19;
                amez.d = str18;
                String str19 = avdx.c;
                str19.getClass();
                amez.a = i19 | 2;
                amez.c = str19;
                aucd a6 = a(String.valueOf(longValue3), avdx.e);
                if (o12.c) {
                    o12.c();
                    o12.c = false;
                }
                amez amez2 = (amez) o12.b;
                amgl amgl5 = (amgl) a6.i();
                amgl5.getClass();
                amez2.b = amgl5;
                amez2.a |= 1;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                amgi amgi3 = (amgi) aucd5.b;
                amez amez3 = (amez) o12.i();
                amez3.getClass();
                amgi3.d();
                amgi3.o.add(amez3);
                i18++;
            }
            i17 = i;
        }
        aucd o13 = amgn.f.o();
        if (o13.c) {
            o13.c();
            o13.c = false;
        }
        amgn amgn = (amgn) o13.b;
        amfk amfk3 = (amfk) o2.i();
        amfk3.getClass();
        if (!amgn.e.a()) {
            amgn.e = aucj.a(amgn.e);
        }
        amgn.e.add(amfk3);
        amgn amgn2 = (amgn) o13.i();
        if (aucd5.c) {
            aucd5.c();
            aucd5.c = false;
        }
        amgi amgi4 = (amgi) aucd5.b;
        amgn2.getClass();
        amgi4.c = amgn2;
        amgi4.a |= 2;
        aucd aucd6 = aucd4;
        if (aucd6.c) {
            aucd6.c();
            aucd6.c = false;
        }
        amgi amgi5 = (amgi) aucd5.i();
        amgi5.getClass();
        ((aqvh) aucd6.b).a = amgi5;
        return aucd6;
    }

    public static aucd a(avdi avdi) {
        int i;
        avdq avdq = avdi.f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        String valueOf = String.valueOf(avdq.v);
        avdq avdq2 = avdi.f;
        if (avdq2 == null) {
            avdq2 = avdq.A;
        }
        aucd o = avlm.e.o();
        aucd o2 = avli.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avli avli = (avli) o2.b;
        valueOf.getClass();
        avli.a |= 1;
        avli.b = valueOf;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avlm avlm = (avlm) o.b;
        avli avli2 = (avli) o2.i();
        avli2.getClass();
        avlm.b = avli2;
        avlm.a |= 1;
        aucd o3 = avlh.d.o();
        String str = avdq2.c;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        avlh avlh = (avlh) o3.b;
        str.getClass();
        int i2 = avlh.a | 2;
        avlh.a = i2;
        avlh.b = str;
        String str2 = avdq2.b;
        str2.getClass();
        avlh.a = i2 | 4;
        avlh.c = str2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avlm avlm2 = (avlm) o.b;
        avlh avlh2 = (avlh) o3.i();
        avlh2.getClass();
        avlm2.c = avlh2;
        avlm2.a |= 2;
        aucd o4 = avlj.h.o();
        long j = avdq2.i;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        avlj avlj = (avlj) o4.b;
        int i3 = avlj.a | 2;
        avlj.a = i3;
        avlj.e = j;
        long j2 = avdq2.j;
        avlj.a = i3 | 4;
        avlj.f = j2;
        aucd o5 = aufc.c.o();
        long j3 = avdq2.n;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        ((aufc) o5.b).a = j3;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        avlj avlj2 = (avlj) o4.b;
        aufc aufc = (aufc) o5.i();
        aufc.getClass();
        avlj2.g = aufc;
        avlj2.a |= 16;
        aucd o6 = avks.g.o();
        int a = avdp.a(avdq2.o);
        if (a == 0) {
            a = 1;
        }
        if (a != 1) {
            i = a == 2 ? 2 : 3;
        } else {
            i = 1;
        }
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        avks avks = (avks) o6.b;
        avks.c = i - 1;
        int i4 = avks.a | 2;
        avks.a = i4;
        double d = avdq2.m;
        avks.a = i4 | 4;
        avks.d = d;
        int a2 = avdn.a(avdq2.s);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = a(a2);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        avks avks2 = (avks) o6.b;
        avks2.e = a3 - 1;
        avks2.a |= 16;
        int a4 = avdn.a(avdq2.t);
        if (a4 == 0) {
            a4 = 1;
        }
        int a5 = a(a4);
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        avks avks3 = (avks) o6.b;
        avks3.f = a5 - 1;
        int i5 = avks3.a | 32;
        avks3.a = i5;
        avks3.b = 1;
        avks3.a = i5 | 1;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        avlj avlj3 = (avlj) o4.b;
        avks avks4 = (avks) o6.i();
        avks4.getClass();
        avlj3.c = avks4;
        avlj3.b = 8;
        aucd o7 = avll.c.o();
        String str3 = avdq2.y;
        if (o7.c) {
            o7.c();
            o7.c = false;
        }
        avll avll = (avll) o7.b;
        str3.getClass();
        avll.a |= 1;
        avll.b = str3;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        avlj avlj4 = (avlj) o4.b;
        avll avll2 = (avll) o7.i();
        avll2.getClass();
        avlj4.d = avll2;
        avlj4.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avlm avlm3 = (avlm) o.b;
        avlj avlj5 = (avlj) o4.i();
        avlj5.getClass();
        avlm3.d = avlj5;
        avlm3.a |= 4;
        avlm avlm4 = (avlm) o.i();
        aucd o8 = aqvf.c.o();
        aqve aqve = aqve.UDC;
        if (o8.c) {
            o8.c();
            o8.c = false;
        }
        aqvf aqvf = (aqvf) o8.b;
        aqve.getClass();
        if (!aqvf.a.a()) {
            aqvf.a = aucj.a(aqvf.a);
        }
        aqvf.a.d(aqve.a());
        if (o8.c) {
            o8.c();
            o8.c = false;
        }
        avlm4.getClass();
        ((aqvf) o8.b).b = avlm4;
        return o8;
    }

    private static aucd a(String str, boolean z) {
        aucd o = amgl.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amgl amgl = (amgl) o.b;
        amgl.c = 13;
        int i = amgl.a | 4;
        amgl.a = i;
        str.getClass();
        int i2 = i | 16;
        amgl.a = i2;
        amgl.d = str;
        if (z) {
            amgl.a = i2 | 32;
            amgl.e = true;
        }
        return o;
    }
}
