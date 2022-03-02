package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.UUID;

/* renamed from: agmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agmq implements agcv, agid {
    private static final anhq a = anhq.a("agmq");
    private final agcz b;
    private final bapu c;
    private final bapu d;
    private final bapu e;
    private final bapu f;

    public agmq(agcz agcz, bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, agic agic) {
        this.b = agcz;
        agcz.a((agcy) this);
        this.c = bapu;
        this.d = bapu2;
        this.e = bapu3;
        this.f = bapu4;
        agic.b(this);
    }

    private static long a(Long l, long j) {
        return l != null ? Math.min(l.longValue(), j) : j;
    }

    public final void b(Activity activity) {
        long j;
        Long l;
        this.b.b(this);
        agmp agmp = agmp.a;
        if (agmp.f > 0) {
            if (agmp.b) {
                j = agmp.c;
            } else {
                long j2 = agmp.e;
                j = 0;
            }
            if (j > 0 && agmp.f >= j) {
                aucd o = basb.l.o();
                boolean z = agmp.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                basb basb = (basb) o.b;
                basb.a |= 128;
                basb.i = z;
                agmo agmo = agmp.h;
                if (agmo.a) {
                    long j3 = agmp.c;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    basb basb2 = (basb) o.b;
                    basb2.a |= 4;
                    basb2.d = j3;
                    l = Long.valueOf(a((Long) null, j3));
                } else {
                    l = null;
                }
                if (agmo.b) {
                    long j4 = agmp.d;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    basb basb3 = (basb) o.b;
                    basb3.a |= 8;
                    basb3.e = j4;
                    l = Long.valueOf(a(l, j4));
                }
                boolean z2 = agmo.c;
                if (agmo.d) {
                    long j5 = agmp.f;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    basb basb4 = (basb) o.b;
                    basb4.a |= 32;
                    basb4.g = j5;
                    l = Long.valueOf(a(l, j5));
                }
                boolean z3 = agmo.e;
                if (agmp.i.b != null) {
                    basa a2 = a(agmp.i);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    basb basb5 = (basb) o.b;
                    a2.getClass();
                    basb5.j = a2;
                    basb5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if ((a2.a & 2) != 0) {
                        l = Long.valueOf(a(l, a2.c));
                    }
                    if ((a2.a & 4) != 0) {
                        l = Long.valueOf(a(l, a2.d));
                    }
                    if ((a2.a & 8) != 0) {
                        l = Long.valueOf(a(l, a2.e));
                    }
                }
                if (agmp.j.b != null) {
                    basa a3 = a(agmp.j);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    basb basb6 = (basb) o.b;
                    a3.getClass();
                    basb6.k = a3;
                    basb6.a |= 512;
                    if ((a3.a & 2) != 0) {
                        l = Long.valueOf(a(l, a3.c));
                    }
                    if ((a3.a & 4) != 0) {
                        l = Long.valueOf(a(l, a3.d));
                    }
                    if ((a3.a & 8) != 0) {
                        l = Long.valueOf(a(l, a3.e));
                    }
                }
                if (Build.VERSION.SDK_INT < 24 || !((Boolean) this.d.a()).booleanValue()) {
                    amri amri = (amri) agmv.a.a();
                    if (amri.a()) {
                        Long l2 = (Long) amri.b();
                        long longValue = l2.longValue();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        basb basb7 = (basb) o.b;
                        basb7.a |= 2;
                        basb7.c = longValue;
                        l = Long.valueOf(a(l, l2.longValue()));
                    }
                } else {
                    long startElapsedRealtime = Process.getStartElapsedRealtime();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    basb basb8 = (basb) o.b;
                    basb8.a |= 2;
                    basb8.c = startElapsedRealtime;
                    l = Long.valueOf(a(l, startElapsedRealtime));
                }
                if (l != null && ((Boolean) this.e.a()).booleanValue()) {
                    long longValue2 = l.longValue();
                    boolean booleanValue = ((Boolean) this.f.a()).booleanValue();
                    if (longValue2 != 0) {
                        if (!booleanValue) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb9 = (basb) o.b;
                            basb9.a |= 1;
                            basb9.b = longValue2;
                        }
                        basb basb10 = (basb) o.b;
                        if ((basb10.a & 4) != 0) {
                            long j6 = basb10.d - longValue2;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb11 = (basb) o.b;
                            basb11.a |= 4;
                            basb11.d = j6;
                        }
                        basb basb12 = (basb) o.b;
                        if ((basb12.a & 8) != 0) {
                            long j7 = basb12.e - longValue2;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb13 = (basb) o.b;
                            basb13.a |= 8;
                            basb13.e = j7;
                        }
                        basb basb14 = (basb) o.b;
                        if ((basb14.a & 16) != 0) {
                            long j8 = basb14.f - longValue2;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb15 = (basb) o.b;
                            basb15.a |= 16;
                            basb15.f = j8;
                        }
                        basb basb16 = (basb) o.b;
                        if ((basb16.a & 32) != 0) {
                            long j9 = basb16.g - longValue2;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb17 = (basb) o.b;
                            basb17.a |= 32;
                            basb17.g = j9;
                        }
                        basb basb18 = (basb) o.b;
                        if ((basb18.a & 64) != 0) {
                            long j10 = basb18.h - longValue2;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb19 = (basb) o.b;
                            basb19.a |= 64;
                            basb19.h = j10;
                        }
                        basb basb20 = (basb) o.b;
                        if ((basb20.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            basa basa = basb20.j;
                            if (basa == null) {
                                basa = basa.f;
                            }
                            aucd aucd = (aucd) basa.c(5);
                            aucd.a((aucj) basa);
                            basa basa2 = (basa) aucd.b;
                            if ((basa2.a & 2) != 0) {
                                long j11 = basa2.c - longValue2;
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                basa basa3 = (basa) aucd.b;
                                basa3.a |= 2;
                                basa3.c = j11;
                            }
                            basa basa4 = (basa) aucd.b;
                            if ((basa4.a & 4) != 0) {
                                long j12 = basa4.d - longValue2;
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                basa basa5 = (basa) aucd.b;
                                basa5.a |= 4;
                                basa5.d = j12;
                            }
                            basa basa6 = (basa) aucd.b;
                            if ((basa6.a & 8) != 0) {
                                long j13 = basa6.e - longValue2;
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                basa basa7 = (basa) aucd.b;
                                basa7.a |= 8;
                                basa7.e = j13;
                            }
                            basa basa8 = (basa) aucd.i();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb21 = (basb) o.b;
                            basa8.getClass();
                            basb21.j = basa8;
                            basb21.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        }
                        basb basb22 = (basb) o.b;
                        if ((basb22.a & 512) != 0) {
                            basa basa9 = basb22.k;
                            if (basa9 == null) {
                                basa9 = basa.f;
                            }
                            aucd aucd2 = (aucd) basa9.c(5);
                            aucd2.a((aucj) basa9);
                            basa basa10 = (basa) aucd2.b;
                            if ((basa10.a & 2) != 0) {
                                long j14 = basa10.c - longValue2;
                                if (aucd2.c) {
                                    aucd2.c();
                                    aucd2.c = false;
                                }
                                basa basa11 = (basa) aucd2.b;
                                basa11.a |= 2;
                                basa11.c = j14;
                            }
                            basa basa12 = (basa) aucd2.b;
                            if ((basa12.a & 4) != 0) {
                                long j15 = basa12.d - longValue2;
                                if (aucd2.c) {
                                    aucd2.c();
                                    aucd2.c = false;
                                }
                                basa basa13 = (basa) aucd2.b;
                                basa13.a |= 4;
                                basa13.d = j15;
                            }
                            basa basa14 = (basa) aucd2.b;
                            if ((basa14.a & 8) != 0) {
                                long j16 = basa14.e - longValue2;
                                if (aucd2.c) {
                                    aucd2.c();
                                    aucd2.c = false;
                                }
                                basa basa15 = (basa) aucd2.b;
                                basa15.a |= 8;
                                basa15.e = j16;
                            }
                            basa basa16 = (basa) aucd2.i();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb23 = (basb) o.b;
                            basa16.getClass();
                            basb23.k = basa16;
                            basb23.a |= 512;
                        }
                        basb basb24 = (basb) o.b;
                        if ((basb24.a & 2) != 0) {
                            long j17 = basb24.c - longValue2;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            basb basb25 = (basb) o.b;
                            basb25.a |= 2;
                            basb25.c = j17;
                        }
                    }
                }
                aucd o2 = barw.h.o();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barw barw = (barw) o2.b;
                int i = barw.a | 1;
                barw.a = i;
                barw.b = leastSignificantBits;
                barw.c = 2;
                barw.a = i | 2;
                basb basb26 = (basb) o.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                barw barw2 = (barw) o2.b;
                basb26.getClass();
                barw2.g = basb26;
                barw2.a |= 16;
                barw barw3 = (barw) o2.i();
                agms agms = (agms) this.c.a();
                agfe agfe = agmp.g;
                String a4 = agfe.a((agfe) null);
                aucd o3 = basu.s.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                basu basu = (basu) o3.b;
                barw3.getClass();
                basu.m = barw3;
                basu.a |= 32768;
                basu basu2 = (basu) o3.i();
                if ((barw3.a & 1) != 0) {
                    long j18 = barw3.b;
                }
                if (barw3.d.size() > 0) {
                    String str = ((barz) barw3.d.get(0)).b;
                }
                agms.a.a((String) null, true, basu2, (barb) null, a4);
                return;
            }
            return;
        }
        ((anhn) ((anhn) a.d()).a("agmq", "b", 245, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("missing firstDraw timestamp");
    }

    public final void c() {
        this.b.b(this);
    }

    private static basa a(agmk agmk) {
        aucd o = basa.f.o();
        if (agmk.a != null) {
            String str = agmk.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            basa basa = (basa) o.b;
            str.getClass();
            basa.a |= 1;
            basa.b = str;
        }
        if (agmk.b != null) {
            long longValue = agmk.b.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            basa basa2 = (basa) o.b;
            basa2.a |= 2;
            basa2.c = longValue;
        }
        if (agmk.c != null) {
            long longValue2 = agmk.c.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            basa basa3 = (basa) o.b;
            basa3.a |= 4;
            basa3.d = longValue2;
        }
        if (agmk.d != null) {
            long longValue3 = agmk.d.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            basa basa4 = (basa) o.b;
            basa4.a |= 8;
            basa4.e = longValue3;
        }
        return (basa) o.i();
    }
}
