package defpackage;

/* renamed from: lfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lfx implements lfk {
    private static final ith a = new ith("ImpressionApplyOnServer", "");
    private final lgc b;
    private aucd c = aman.i.o();

    public lfx(lgc lgc) {
        this.b = lgc;
    }

    private final void c(int i) {
        boolean z;
        g();
        if (((((aman) this.c.b).a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Can't set status twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aman aman = (aman) aucd.b;
        aman aman2 = aman.i;
        aman.b = i - 1;
        aman.a |= 1;
    }

    private final void g() {
        iva.a((Object) this.c, (Object) "Builder can only be used once.");
    }

    public final void a() {
        boolean z;
        g();
        lgc lgc = this.b;
        aman aman = (aman) this.c.i();
        lgc.k();
        if ((((ambk) lgc.e.b).a & 134217728) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't set applyOnServerDetails more than once");
        aucd aucd = lgc.e;
        iva.a((Object) aman);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        ambk ambk2 = ambk.K;
        aman.getClass();
        ambk.D = aman;
        ambk.a |= 134217728;
        this.c = null;
    }

    public final void e() {
        boolean z;
        g();
        if (((((aman) this.c.b).a & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z, (Object) "Can't set status twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aman aman = (aman) aucd.b;
        aman aman2 = aman.i;
        aman.b = 9;
        aman.a = 1 | aman.a;
    }

    public final /* bridge */ /* synthetic */ void f() {
        c(1);
    }

    public final /* bridge */ /* synthetic */ void b() {
        c(13);
    }

    public final /* bridge */ /* synthetic */ void d() {
        c(2);
    }

    public final /* bridge */ /* synthetic */ void b(int i) {
        boolean z;
        g();
        if ((((aman) this.c.b).a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setNumAttempts() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aman aman = (aman) aucd.b;
        aman aman2 = aman.i;
        aman.a |= 2;
        aman.c = i;
    }

    public final /* bridge */ /* synthetic */ void c() {
        c(3);
    }

    public final /* bridge */ /* synthetic */ void a(int i) {
        boolean z;
        g();
        if ((((aman) this.c.b).a & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setSecondsSinceApplyLocally() twice");
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aman aman = (aman) aucd.b;
        aman aman2 = aman.i;
        aman.a |= 4;
        aman.d = i;
    }

    public final /* bridge */ /* synthetic */ void a(Throwable th) {
        g();
        iva.a(((((aman) this.c.b).a & 1) ^ 1) != 0, (Object) "Can't set status twice");
        if (th instanceof kcn) {
            kcn kcn = (kcn) th;
            if (kcn.a) {
                aucd aucd = this.c;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aman aman = (aman) aucd.b;
                aman aman2 = aman.i;
                aman.b = 8;
                aman.a = 1 | aman.a;
            } else {
                aucd aucd2 = this.c;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                aman aman3 = (aman) aucd2.b;
                aman aman4 = aman.i;
                aman3.b = 10;
                aman3.a = 1 | aman3.a;
            }
            if (kcn instanceof kcx) {
                kcx kcx = (kcx) kcn;
                aucd aucd3 = this.c;
                int i = kcx.b;
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                aman aman5 = (aman) aucd3.b;
                aman5.a |= 16;
                aman5.f = i;
                lrx lrx = kcx.c;
                Integer num = lrx.e;
                if (num != null) {
                    aucd aucd4 = this.c;
                    int a2 = amcm.a(num.intValue());
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    aman aman6 = (aman) aucd4.b;
                    int i2 = a2 - 1;
                    if (a2 != 0) {
                        aman6.g = i2;
                        aman6.a |= 32;
                    } else {
                        throw null;
                    }
                }
                Integer num2 = lrx.f;
                if (num2 != null) {
                    aucd aucd5 = this.c;
                    int a3 = amck.a(num2.intValue());
                    if (aucd5.c) {
                        aucd5.c();
                        aucd5.c = false;
                    }
                    aman aman7 = (aman) aucd5.b;
                    int i3 = a3 - 1;
                    if (a3 != 0) {
                        aman7.h = i3;
                        aman7.a |= 64;
                        return;
                    }
                    throw null;
                }
            }
        } else if (th instanceof kct) {
            aucd aucd6 = this.c;
            if (aucd6.c) {
                aucd6.c();
                aucd6.c = false;
            }
            aman aman8 = (aman) aucd6.b;
            aman aman9 = aman.i;
            aman8.b = 11;
            aman8.a |= 1;
        } else if (th instanceof kcs) {
            aucd aucd7 = this.c;
            if (aucd7.c) {
                aucd7.c();
                aucd7.c = false;
            }
            aman aman10 = (aman) aucd7.b;
            aman aman11 = aman.i;
            aman10.b = 3;
            aman10.a |= 1;
        } else if (th instanceof kcu) {
            aucd aucd8 = this.c;
            if (aucd8.c) {
                aucd8.c();
                aucd8.c = false;
            }
            aman aman12 = (aman) aucd8.b;
            aman aman13 = aman.i;
            aman12.b = 4;
            aman12.a |= 1;
        } else if (th instanceof kcm) {
            aucd aucd9 = this.c;
            if (aucd9.c) {
                aucd9.c();
                aucd9.c = false;
            }
            aman aman14 = (aman) aucd9.b;
            aman aman15 = aman.i;
            aman14.b = 5;
            aman14.a |= 1;
        } else if (th instanceof kcv) {
            aucd aucd10 = this.c;
            if (aucd10.c) {
                aucd10.c();
                aucd10.c = false;
            }
            aman aman16 = (aman) aucd10.b;
            aman aman17 = aman.i;
            aman16.b = 6;
            aman16.a |= 1;
        } else if (th instanceof kcw) {
            aucd aucd11 = this.c;
            if (aucd11.c) {
                aucd11.c();
                aucd11.c = false;
            }
            aman aman18 = (aman) aucd11.b;
            aman aman19 = aman.i;
            aman18.b = 7;
            aman18.a |= 1;
        } else if (th instanceof lsq) {
            aucd aucd12 = this.c;
            if (aucd12.c) {
                aucd12.c();
                aucd12.c = false;
            }
            aman aman20 = (aman) aucd12.b;
            aman aman21 = aman.i;
            aman20.b = 13;
            aman20.a |= 1;
        } else {
            a.b("ImpressionApplyOnServer", "Unknown throwable: %s", th.getClass().getCanonicalName());
            aucd aucd13 = this.c;
            if (aucd13.c) {
                aucd13.c();
                aucd13.c = false;
            }
            aman aman22 = (aman) aucd13.b;
            aman aman23 = aman.i;
            aman22.b = 0;
            aman22.a |= 1;
        }
    }

    public final /* bridge */ /* synthetic */ void a(lgw lgw) {
        g();
        iva.a(!((((aman) this.c.b).a & 8) != 0), (Object) "Can't call setConnectionType() twice");
        lgw lgw2 = lgw.DISCONNECTED;
        int ordinal = lgw.ordinal();
        if (ordinal == 0) {
            aucd aucd = this.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aman aman = (aman) aucd.b;
            aman aman2 = aman.i;
            aman.e = 1;
            aman.a |= 8;
        } else if (ordinal == 1) {
            aucd aucd2 = this.c;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aman aman3 = (aman) aucd2.b;
            aman aman4 = aman.i;
            aman3.e = 2;
            aman3.a |= 8;
        } else if (ordinal == 2) {
            aucd aucd3 = this.c;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            aman aman5 = (aman) aucd3.b;
            aman aman6 = aman.i;
            aman5.e = 3;
            aman5.a |= 8;
        } else if (ordinal != 3) {
            a.b("ImpressionApplyOnServer", "Unknown connection type: %s", lgw);
            aucd aucd4 = this.c;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            aman aman7 = (aman) aucd4.b;
            aman aman8 = aman.i;
            aman7.e = 0;
            aman7.a |= 8;
        } else {
            aucd aucd5 = this.c;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            aman aman9 = (aman) aucd5.b;
            aman aman10 = aman.i;
            aman9.e = 4;
            aman9.a |= 8;
        }
    }
}
