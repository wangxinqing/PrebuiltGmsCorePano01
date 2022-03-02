package defpackage;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Set;

/* renamed from: csm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csm {
    public static final aqsr a;
    public static final aqpp b;
    public static final aqpp c = aqpp.j;

    public static aqso a(aqsr aqsr) {
        aucd o = aqso.f.o();
        aqsc aqsc = aqsc.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqso aqso = (aqso) o.b;
        aqsc.getClass();
        aqso.c = aqsc;
        aqso.b = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        aqsr.getClass();
        aqso.d = aqsr;
        aqso.a |= 1;
        return (aqso) o.i();
    }

    public static aqsr b(aqpp aqpp) {
        aqsw aqsw = aqpp.g;
        if (aqsw == null) {
            aqsw = aqsw.f;
        }
        if ((aqsw.a & 8) == 0) {
            return null;
        }
        aqsw aqsw2 = aqpp.g;
        if (aqsw2 == null) {
            aqsw2 = aqsw.f;
        }
        aqsr aqsr = aqsw2.e;
        return aqsr == null ? aqsr.d : aqsr;
    }

    public static aqro c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (aqro) aucj.a((aucj) aqro.c, bArr, aubs.c());
        } catch (auda e) {
            throw new IllegalStateException(e);
        }
    }

    public static aqsr d(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & FragmentTransaction.TRANSIT_ENTER_MASK) == 0) {
            return null;
        }
        aqql aqql2 = aqpp.f;
        if (aqql2 == null) {
            aqql2 = aqql.l;
        }
        aqsr aqsr = aqql2.j;
        return aqsr == null ? aqsr.d : aqsr;
    }

    public static aqsr e(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & FragmentTransaction.TRANSIT_EXIT_MASK) == 0) {
            return null;
        }
        aqql aqql2 = aqpp.f;
        if (aqql2 == null) {
            aqql2 = aqql.l;
        }
        aqsr aqsr = aqql2.k;
        return aqsr == null ? aqsr.d : aqsr;
    }

    public static aqro f(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return null;
        }
        aqql aqql2 = aqpp.f;
        if (aqql2 == null) {
            aqql2 = aqql.l;
        }
        aqro aqro = aqql2.h;
        return aqro == null ? aqro.c : aqro;
    }

    public static aqsr g(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & 2) == 0) {
            return null;
        }
        aqql aqql2 = aqpp.f;
        if (aqql2 == null) {
            aqql2 = aqql.l;
        }
        aqsr aqsr = aqql2.c;
        return aqsr == null ? aqsr.d : aqsr;
    }

    public static aqsr h(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & 4) != 0) {
            aqql aqql2 = aqpp.f;
            if (aqql2 == null) {
                aqql2 = aqql.l;
            }
            aqsr aqsr = aqql2.d;
            return aqsr == null ? aqsr.d : aqsr;
        } else if ((aqpp.a & 64) == 0) {
            return null;
        } else {
            aqsw aqsw = aqpp.g;
            if (aqsw == null) {
                aqsw = aqsw.f;
            }
            if ((aqsw.a & 1) == 0) {
                return null;
            }
            aqsw aqsw2 = aqpp.g;
            if (aqsw2 == null) {
                aqsw2 = aqsw.f;
            }
            aqsr aqsr2 = aqsw2.b;
            return aqsr2 == null ? aqsr.d : aqsr2;
        }
    }

    public static aqsr i(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & 8) != 0) {
            aqql aqql2 = aqpp.f;
            if (aqql2 == null) {
                aqql2 = aqql.l;
            }
            aqsr aqsr = aqql2.e;
            return aqsr == null ? aqsr.d : aqsr;
        } else if ((aqpp.a & 64) == 0) {
            return null;
        } else {
            aqsw aqsw = aqpp.g;
            if (aqsw == null) {
                aqsw = aqsw.f;
            }
            if ((aqsw.a & 2) == 0) {
                return null;
            }
            aqsw aqsw2 = aqpp.g;
            if (aqsw2 == null) {
                aqsw2 = aqsw.f;
            }
            aqsr aqsr2 = aqsw2.c;
            return aqsr2 == null ? aqsr.d : aqsr2;
        }
    }

    public static aqsr j(aqpp aqpp) {
        if (aqpp == null || (aqpp.a & 32) == 0) {
            return null;
        }
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & 2048) == 0) {
            return null;
        }
        aqql aqql2 = aqpp.f;
        if (aqql2 == null) {
            aqql2 = aqql.l;
        }
        aqsr aqsr = aqql2.i;
        return aqsr == null ? aqsr.d : aqsr;
    }

    public static boolean k(aqpp aqpp) {
        return (c(aqpp) == null || h(aqpp) == null) ? false : true;
    }

    public static boolean l(aqpp aqpp) {
        return g(aqpp) != null;
    }

    public static int m(aqpp aqpp) {
        if ((aqpp.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return c(aqpp) == null ? 2 : 1;
        }
        return 3;
    }

    static {
        aqsp aqsp = (aqsp) aqsr.d.o();
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a |= 1;
        aqsr.b = 90000;
        a = (aqsr) aqsp.i();
        aucd o = aqpp.j.o();
        aqsd aqsd = aqsd.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqpp aqpp = (aqpp) o.b;
        aqsd.getClass();
        aqpp.i = aqsd;
        aqpp.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        b = (aqpp) o.i();
    }

    public static aqsr b(byte[] bArr) {
        if (bArr != null) {
            return a(bArr);
        }
        return null;
    }

    public static aqsr c(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & 1) == 0) {
            return null;
        }
        aqql aqql2 = aqpp.f;
        if (aqql2 == null) {
            aqql2 = aqql.l;
        }
        aqsr aqsr = aqql2.b;
        return aqsr == null ? aqsr.d : aqsr;
    }

    public static aqsr d(byte[] bArr) {
        return bArr != null ? a(bArr) : a;
    }

    public static Set b(aqso aqso) {
        aqtw aqtw;
        aqtw aqtw2;
        aqsj aqsj;
        aqqm aqqm;
        aqqm aqqm2;
        aqqm aqqm3;
        aqsf aqsf;
        aqqd aqqd;
        aqqd aqqd2;
        anav j = anax.j();
        amzt j2 = amzy.j();
        int i = aqso.b;
        int i2 = 0;
        if (i == 3) {
            aucx aucx = ((aqsv) aqso.c).a;
            int size = aucx.size();
            while (i2 < size) {
                aqpp aqpp = (aqpp) aucx.get(i2);
                int i3 = aqpp.a;
                if ((i3 & 32) != 0) {
                    aqql aqql = aqpp.f;
                    if (aqql == null) {
                        aqql = aqql.l;
                    }
                    if ((aqql.a & 8) != 0) {
                        aqsr aqsr = aqql.e;
                        if (aqsr == null) {
                            aqsr = aqsr.d;
                        }
                        j2.c(aqsr);
                    }
                    if ((aqql.a & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
                        aqsr aqsr2 = aqql.k;
                        if (aqsr2 == null) {
                            aqsr2 = aqsr.d;
                        }
                        j2.c(aqsr2);
                    }
                } else if ((i3 & 64) != 0) {
                    aqsw aqsw = aqpp.g;
                    if (aqsw == null) {
                        aqsw = aqsw.f;
                    }
                    if ((aqsw.a & 2) != 0) {
                        aqsr aqsr3 = aqsw.c;
                        if (aqsr3 == null) {
                            aqsr3 = aqsr.d;
                        }
                        j2.c(aqsr3);
                    }
                }
                i2++;
            }
        } else if (i == 7) {
            aucx aucx2 = ((aqqe) aqso.c).a;
            int size2 = aucx2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                aqpz aqpz = (aqpz) aucx2.get(i4);
                int i5 = aqpz.b;
                if (i5 == 2) {
                    j2.c((aqsr) aqpz.c);
                } else if (i5 == 3) {
                    aucx aucx3 = ((aqqa) aqpz.c).a;
                    int size3 = aucx3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        aqqb aqqb = (aqqb) aucx3.get(i6);
                        if (aqqb.a == 1) {
                            aqqd = (aqqd) aqqb.b;
                        } else {
                            aqqd = aqqd.e;
                        }
                        if ((aqqd.a & 1) != 0) {
                            if (aqqb.a == 1) {
                                aqqd2 = (aqqd) aqqb.b;
                            } else {
                                aqqd2 = aqqd.e;
                            }
                            aqsr aqsr4 = aqqd2.b;
                            if (aqsr4 == null) {
                                aqsr4 = aqsr.d;
                            }
                            j2.c(aqsr4);
                        }
                    }
                }
            }
        } else if (i == 8) {
            aqqh aqqh = (aqqh) aqso.c;
            int i7 = aqqh.a;
            if (i7 == 1) {
                aqti aqti = (aqti) aqqh.b;
                amzt j3 = amzy.j();
                if ((aqti.a & 1) != 0) {
                    aqsr aqsr5 = aqti.b;
                    if (aqsr5 == null) {
                        aqsr5 = aqsr.d;
                    }
                    j3.c(aqsr5);
                }
                aucx aucx4 = aqti.c;
                int size4 = aucx4.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    aqpx aqpx = (aqpx) aucx4.get(i8);
                    if ((aqpx.a & 131072) != 0) {
                        aqsr aqsr6 = aqpx.d;
                        if (aqsr6 == null) {
                            aqsr6 = aqsr.d;
                        }
                        j3.c(aqsr6);
                    }
                    int i9 = aqpx.b;
                    if (i9 == 1) {
                        aqqy aqqy = (aqqy) aqpx.c;
                        if ((aqqy.a & 64) != 0) {
                            aqsr aqsr7 = aqqy.f;
                            if (aqsr7 == null) {
                                aqsr7 = aqsr.d;
                            }
                            j3.c(aqsr7);
                        }
                    } else {
                        if (i9 == 6) {
                            aqqm = (aqqm) aqpx.c;
                        } else {
                            aqqm = aqqm.h;
                        }
                        if ((aqqm.a & 8) == 0) {
                            int i10 = aqpx.b;
                            if (i10 == 9) {
                                aucx aucx5 = ((aqpn) aqpx.c).a;
                                int size5 = aucx5.size();
                                for (int i11 = 0; i11 < size5; i11++) {
                                    aqpm aqpm = (aqpm) aucx5.get(i11);
                                    if ((aqpm.a & 4) != 0) {
                                        aqsr aqsr8 = aqpm.d;
                                        if (aqsr8 == null) {
                                            aqsr8 = aqsr.d;
                                        }
                                        j3.c(aqsr8);
                                    }
                                }
                            } else {
                                if (i10 == 10) {
                                    aqsf = (aqsf) aqpx.c;
                                } else {
                                    aqsf = aqsf.g;
                                }
                                if ((aqsf.a & 8) != 0) {
                                    aqsr aqsr9 = (aqpx.b == 10 ? (aqsf) aqpx.c : aqsf.g).e;
                                    if (aqsr9 == null) {
                                        aqsr9 = aqsr.d;
                                    }
                                    j3.c(aqsr9);
                                }
                            }
                        } else {
                            if (aqpx.b == 6) {
                                aqqm2 = (aqqm) aqpx.c;
                            } else {
                                aqqm2 = aqqm.h;
                            }
                            aqsr aqsr10 = aqqm2.f;
                            if (aqsr10 == null) {
                                aqsr10 = aqsr.d;
                            }
                            j3.c(aqsr10);
                            if (aqpx.b == 6) {
                                aqqm3 = (aqqm) aqpx.c;
                            } else {
                                aqqm3 = aqqm.h;
                            }
                            aucx aucx6 = aqqm3.b;
                            int size6 = aucx6.size();
                            for (int i12 = 0; i12 < size6; i12++) {
                                aqqn aqqn = (aqqn) aucx6.get(i12);
                                if ((aqqn.a & 32) != 0) {
                                    aqsr aqsr11 = aqqn.i;
                                    if (aqsr11 == null) {
                                        aqsr11 = aqsr.d;
                                    }
                                    j3.c(aqsr11);
                                }
                            }
                        }
                    }
                }
                j2.b((Iterable) j3.a());
            } else if (i7 == 2) {
                if (aqqh.a == 2) {
                    aqsj = (aqsj) aqqh.b;
                } else {
                    aqsj = aqsj.b;
                }
                aucx aucx7 = aqsj.a;
                int size7 = aucx7.size();
                while (i2 < size7) {
                    aqsl aqsl = (aqsl) aucx7.get(i2);
                    if ((aqsl.a & 16) != 0) {
                        aqsr aqsr12 = aqsl.f;
                        if (aqsr12 == null) {
                            aqsr12 = aqsr.d;
                        }
                        j2.c(aqsr12);
                    }
                    i2++;
                }
            }
        } else if (i == 5) {
            aucx aucx8 = ((aqts) aqso.c).a;
            int size8 = aucx8.size();
            while (i2 < size8) {
                aqtt aqtt = (aqtt) aucx8.get(i2);
                if ((aqtt.a & 1) != 0) {
                    aqsr aqsr13 = aqtt.b;
                    if (aqsr13 == null) {
                        aqsr13 = aqsr.d;
                    }
                    j2.c(aqsr13);
                }
                i2++;
            }
        } else if (i == 9) {
            aucx aucx9 = ((aqsy) aqso.c).b;
            int size9 = aucx9.size();
            while (i2 < size9) {
                aqsz aqsz = (aqsz) aucx9.get(i2);
                if ((aqsz.a & 16) != 0) {
                    aqsr aqsr14 = aqsz.g;
                    if (aqsr14 == null) {
                        aqsr14 = aqsr.d;
                    }
                    j2.c(aqsr14);
                }
                i2++;
            }
        } else if (i == 4) {
            aqtw aqtw3 = (aqtw) aqso.c;
            if ((aqtw3.a & 4) != 0) {
                aqsr aqsr15 = aqtw3.c;
                if (aqsr15 == null) {
                    aqsr15 = aqsr.d;
                }
                j2.c(aqsr15);
            }
            if (aqso.b == 4) {
                aqtw = (aqtw) aqso.c;
            } else {
                aqtw = aqtw.h;
            }
            aqpm aqpm2 = aqtw.e;
            if (aqpm2 == null) {
                aqpm2 = aqpm.e;
            }
            if ((aqpm2.a & 4) != 0) {
                if (aqso.b == 4) {
                    aqtw2 = (aqtw) aqso.c;
                } else {
                    aqtw2 = aqtw.h;
                }
                aqpm aqpm3 = aqtw2.e;
                if (aqpm3 == null) {
                    aqpm3 = aqpm.e;
                }
                aqsr aqsr16 = aqpm3.d;
                if (aqsr16 == null) {
                    aqsr16 = aqsr.d;
                }
                j2.c(aqsr16);
            }
        } else if (i == 13) {
            aucx aucx10 = ((aqsb) aqso.c).a;
            int size10 = aucx10.size();
            while (i2 < size10) {
                aqsa aqsa = (aqsa) aucx10.get(i2);
                if ((aqsa.a & 2) != 0) {
                    aqsr aqsr17 = aqsa.c;
                    if (aqsr17 == null) {
                        aqsr17 = aqsr.d;
                    }
                    j2.c(aqsr17);
                }
                i2++;
            }
        }
        j.b((Iterable) j2.a());
        return j.a();
    }

    public static byte[] c(aqsr aqsr) {
        if (aqsr != null) {
            return aqsr.k();
        }
        return null;
    }

    public static aqsr a(aqpp aqpp) {
        aqql aqql = aqpp.f;
        if (aqql == null) {
            aqql = aqql.l;
        }
        if ((aqql.a & 32) == 0) {
            return null;
        }
        aqql aqql2 = aqpp.f;
        if (aqql2 == null) {
            aqql2 = aqql.l;
        }
        aqsr aqsr = aqql2.f;
        return aqsr == null ? aqsr.d : aqsr;
    }

    public static aqsr a(byte[] bArr) {
        try {
            return (aqsr) aucj.a((aucj) aqsr.d, bArr, aubs.c());
        } catch (auda e) {
            throw new IllegalStateException(e);
        }
    }

    public static Set a(aqso aqso) {
        anav j = anax.j();
        amzt j2 = amzy.j();
        int i = aqso.b;
        if (i == 3) {
            aucx aucx = ((aqsv) aqso.c).a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                aqpp aqpp = (aqpp) aucx.get(i2);
                amzt j3 = amzy.j();
                int i3 = aqpp.a;
                if ((i3 & 32) != 0) {
                    aqql aqql = aqpp.f;
                    if (aqql == null) {
                        aqql = aqql.l;
                    }
                    if ((aqql.a & 2) != 0) {
                        aqsr aqsr = aqql.c;
                        if (aqsr == null) {
                            aqsr = aqsr.d;
                        }
                        j3.c(aqsr);
                    }
                    if ((aqql.a & 1) != 0) {
                        aqsr aqsr2 = aqql.b;
                        if (aqsr2 == null) {
                            aqsr2 = aqsr.d;
                        }
                        j3.c(aqsr2);
                    }
                    if ((aqql.a & 32) != 0) {
                        aqsr aqsr3 = aqql.f;
                        if (aqsr3 == null) {
                            aqsr3 = aqsr.d;
                        }
                        j3.c(aqsr3);
                    }
                    if ((aqql.a & 4) != 0) {
                        aqsr aqsr4 = aqql.d;
                        if (aqsr4 == null) {
                            aqsr4 = aqsr.d;
                        }
                        j3.c(aqsr4);
                    }
                    if ((aqql.a & 2048) != 0) {
                        aqsr aqsr5 = aqql.i;
                        if (aqsr5 == null) {
                            aqsr5 = aqsr.d;
                        }
                        j3.c(aqsr5);
                    }
                    if ((aqql.a & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
                        aqsr aqsr6 = aqql.j;
                        if (aqsr6 == null) {
                            aqsr6 = aqsr.d;
                        }
                        j3.c(aqsr6);
                    }
                } else if ((i3 & 64) != 0) {
                    aqsw aqsw = aqpp.g;
                    if (aqsw == null) {
                        aqsw = aqsw.f;
                    }
                    if ((aqsw.a & 8) != 0) {
                        aqsr aqsr7 = aqsw.e;
                        if (aqsr7 == null) {
                            aqsr7 = aqsr.d;
                        }
                        j3.c(aqsr7);
                    }
                    if ((aqsw.a & 1) != 0) {
                        aqsr aqsr8 = aqsw.b;
                        if (aqsr8 == null) {
                            aqsr8 = aqsr.d;
                        }
                        j3.c(aqsr8);
                    }
                }
                j2.b((Iterable) j3.a());
            }
        } else if (i == 6) {
            j2.b((Iterable) ((aqqk) aqso.c).a);
        }
        j.b((Iterable) j2.a());
        return j.a();
    }

    public static byte[] a(aqro aqro) {
        if (aqro != null) {
            return aqro.k();
        }
        return null;
    }

    public static byte[] b(aqsr aqsr) {
        return aqsr.k();
    }
}
