package defpackage;

import android.os.Build;
import android.os.Handler;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: arcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcb {
    private static final String[] h = {"x86", "x86_64"};
    public arcr a;
    public Handler b;
    public String c = "Inertial Anchor";
    public boolean d = false;
    public arcq e = arcq.l;
    public arcp f = null;
    public arci g = null;
    private final aucd i = arcw.c.o();

    public final AndroidInertialAnchor a() {
        int i2 = Build.VERSION.SDK_INT;
        for (String str : Build.SUPPORTED_ABIS) {
            for (String contains : h) {
                if (str.contains(contains)) {
                    return null;
                }
            }
        }
        arcr arcr = this.a;
        if (arcr != null) {
            ardc ardc = arcr.d;
            if (ardc == null) {
                ardc = ardc.b;
            }
            if (ardc.a == null) {
                arcr arcr2 = this.a;
                aucd aucd = this.i;
                ardc ardc2 = arcr2.d;
                if (ardc2 == null) {
                    ardc2 = ardc.b;
                }
                aucd aucd2 = (aucd) ardc2.c(5);
                aucd2.a((aucj) ardc2);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                arcw arcw = (arcw) aucd.i();
                arcw.getClass();
                ((ardc) aucd2.b).a = arcw;
                aucd aucd3 = (aucd) arcr2.c(5);
                aucd3.a((aucj) arcr2);
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                ardc ardc3 = (ardc) aucd2.i();
                ardc3.getClass();
                ((arcr) aucd3.b).d = ardc3;
                this.a = (arcr) aucd3.i();
            }
            arcr arcr3 = this.a;
            arcp arcp = this.f;
            if (arcp != null) {
                aucd aucd4 = (aucd) arcr3.c(5);
                aucd4.a((aucj) arcr3);
                arcu arcu = ((arcr) aucd4.b).a;
                if (arcu == null) {
                    arcu = arcu.c;
                }
                aucd aucd5 = (aucd) arcu.c(5);
                aucd5.a((aucj) arcu);
                arct arct = ((arcu) aucd5.b).a;
                if (arct == null) {
                    arct = arct.m;
                }
                aucd aucd6 = (aucd) arct.c(5);
                aucd6.a((aucj) arct);
                if (aucd6.c) {
                    aucd6.c();
                    aucd6.c = false;
                }
                arcp.getClass();
                ((arct) aucd6.b).l = arcp;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                arct arct2 = (arct) aucd6.i();
                arct2.getClass();
                ((arcu) aucd5.b).a = arct2;
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                arcu arcu2 = (arcu) aucd5.i();
                arcu2.getClass();
                ((arcr) aucd4.b).a = arcu2;
                arcr3 = (arcr) aucd4.i();
            }
            this.a = arcr3;
            aucd aucd7 = (aucd) arcr3.c(5);
            aucd7.a((aucj) arcr3);
            arck arck = arcr3.c;
            if (arck != null) {
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                arck.getClass();
                ((arcr) aucd7.b).c = arck;
            }
            arcu arcu3 = arcr3.a;
            if (arcu3 != null) {
                aucd aucd8 = (aucd) arcu3.c(5);
                aucd8.a((aucj) arcu3);
                arct arct3 = arcu3.a;
                if (arct3 != null) {
                    aucd aucd9 = (aucd) arct3.c(5);
                    aucd9.a((aucj) arct3);
                    ardf ardf = arct3.a;
                    if (ardf != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        ardf.getClass();
                        ((arct) aucd9.b).a = ardf;
                    }
                    ardf ardf2 = arct3.b;
                    if (ardf2 != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        ardf2.getClass();
                        ((arct) aucd9.b).b = ardf2;
                    }
                    ardb ardb = arct3.c;
                    if (ardb != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        ardb.getClass();
                        ((arct) aucd9.b).c = ardb;
                    }
                    arcx arcx = arct3.d;
                    if (arcx != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        arcx.getClass();
                        ((arct) aucd9.b).d = arcx;
                    }
                    arcj arcj = arct3.e;
                    if (arcj != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        arcj.getClass();
                        ((arct) aucd9.b).e = arcj;
                    }
                    arcn arcn = arct3.f;
                    if (arcn != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        arcn.getClass();
                        ((arct) aucd9.b).f = arcn;
                    }
                    arco arco = arct3.g;
                    if (arco != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        arco.getClass();
                        ((arct) aucd9.b).g = arco;
                    }
                    arda arda = arct3.h;
                    if (arda != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        arda.getClass();
                        ((arct) aucd9.b).h = arda;
                    }
                    arcl arcl = arct3.i;
                    if (arcl != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        arcl.getClass();
                        ((arct) aucd9.b).i = arcl;
                    }
                    ardd ardd = arct3.j;
                    if (ardd != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        ardd.getClass();
                        ((arct) aucd9.b).j = ardd;
                    }
                    ardb ardb2 = arct3.k;
                    if (ardb2 != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        ardb2.getClass();
                        ((arct) aucd9.b).k = ardb2;
                    }
                    arcp arcp2 = arct3.l;
                    if (arcp2 != null) {
                        if (aucd9.c) {
                            aucd9.c();
                            aucd9.c = false;
                        }
                        arcp2.getClass();
                        ((arct) aucd9.b).l = arcp2;
                    }
                    arct arct4 = (arct) aucd9.i();
                    if (aucd8.c) {
                        aucd8.c();
                        aucd8.c = false;
                    }
                    arct4.getClass();
                    ((arcu) aucd8.b).a = arct4;
                }
                arcs arcs = arcu3.b;
                if (arcs != null) {
                    if (aucd8.c) {
                        aucd8.c();
                        aucd8.c = false;
                    }
                    arcs.getClass();
                    ((arcu) aucd8.b).b = arcs;
                }
                arcu arcu4 = (arcu) aucd8.i();
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                arcu4.getClass();
                ((arcr) aucd7.b).a = arcu4;
            }
            arcz arcz = arcr3.e;
            if (arcz != null) {
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                arcz.getClass();
                ((arcr) aucd7.b).e = arcz;
            }
            ardg ardg = arcr3.b;
            if (ardg != null) {
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                ardg.getClass();
                ((arcr) aucd7.b).b = ardg;
            }
            this.a = (arcr) aucd7.i();
        }
        try {
            return new AndroidInertialAnchor(this);
        } catch (UnsatisfiedLinkError e2) {
            return null;
        }
    }

    public final void a(int i2) {
        aucd aucd = this.i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        arcw arcw = arcw.c;
        ((arcw) aucd.b).a = i2;
    }

    public final void a(boolean z) {
        aucd aucd = this.i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        arcw arcw = arcw.c;
        ((arcw) aucd.b).b = z;
        this.d = z;
    }
}
