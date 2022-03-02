package defpackage;

/* renamed from: afbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbw implements afda {
    public final Object a = new Object();
    private final afda b;
    private aumr c;
    private aumv d;
    private Long e;
    private Long f;
    private Integer g;

    public afbw(afda afda) {
        this.b = afda;
    }

    public final aumr a(afdo afdo) {
        aumr aumr;
        aumr aumr2;
        synchronized (this.a) {
            if (this.c == null) {
                try {
                    auay a2 = ((afcf) this.b).g.a(afdo, afcf.a);
                    if (a2 != null) {
                        aumr2 = (aumr) aucj.a((aucj) aumr.c, a2);
                    } else {
                        aumr2 = aumr.c;
                    }
                    this.c = aumr2;
                } catch (auda e2) {
                    throw new afdm("Unable to parse sync token", e2);
                }
            }
            aumr = this.c;
        }
        return aumr;
    }

    public final void a() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final aumv b(afdo afdo) {
        aumv aumv;
        aumv aumv2;
        synchronized (this.a) {
            if (this.d == null) {
                try {
                    auay a2 = ((afcf) this.b).g.a(afdo, afcf.b);
                    if (a2 != null) {
                        aumv2 = (aumv) aucj.a((aucj) aumv.c, a2);
                    } else {
                        aumv2 = aumv.c;
                    }
                    this.d = aumv2;
                } catch (auda e2) {
                    throw new afdm("Unable to parse channel filter", e2);
                }
            }
            aumv = this.d;
        }
        return aumv;
    }

    public final long c(afdo afdo) {
        long longValue;
        synchronized (this.a) {
            if (this.e == null) {
                this.e = Long.valueOf(afgi.a(((afcf) this.b).g.a(afdo, afcf.c), 0));
            }
            longValue = this.e.longValue();
        }
        return longValue;
    }

    public final void close() {
        synchronized (this.a) {
            this.b.close();
            a();
        }
    }

    public final long d(afdo afdo) {
        long longValue;
        synchronized (this.a) {
            if (this.f == null) {
                this.f = Long.valueOf(afgi.a(((afcf) this.b).g.a(afdo, afcf.d), 0));
            }
            longValue = this.f.longValue();
        }
        return longValue;
    }

    public final int e(afdo afdo) {
        int intValue;
        synchronized (this.a) {
            if (this.g == null) {
                this.g = Integer.valueOf((int) afgi.a(((afcf) this.b).g.a(afdo, afcf.e), -1));
            }
            intValue = this.g.intValue();
        }
        return intValue;
    }

    public final void c(afdp afdp, long j) {
        afdp.a(this);
        synchronized (this.a) {
            ((afcf) this.b).g.a(afdp, afcf.f, afgi.a(j));
        }
    }

    public final void b(afdp afdp, long j) {
        afdp.a(this);
        synchronized (this.a) {
            ((afcf) this.b).g.a(afdp, afcf.d, afgi.a(j));
            this.f = Long.valueOf(j);
        }
    }

    public final void a(afdp afdp) {
        synchronized (this.a) {
            ((afcf) this.b).g.b(afdp, auay.b, (auay) null);
            a();
        }
    }

    public final void a(afdp afdp, int i) {
        afdp.a(this);
        synchronized (this.a) {
            ((afcf) this.b).g.a(afdp, afcf.e, afgi.a((long) i));
            this.g = Integer.valueOf(i);
        }
    }

    public final void a(afdp afdp, long j) {
        afdp.a(this);
        synchronized (this.a) {
            ((afcf) this.b).g.a(afdp, afcf.c, afgi.a(j));
            this.e = Long.valueOf(j);
        }
    }

    public final void a(afdp afdp, aumr aumr) {
        afdp.a(this);
        synchronized (this.a) {
            ((afcf) this.b).g.a(afdp, afcf.a, aumr.au());
            this.c = aumr;
        }
    }

    public final void a(afdp afdp, aumv aumv) {
        afdp.a(this);
        synchronized (this.a) {
            ((afcf) this.b).g.a(afdp, afcf.b, aumv.au());
            this.d = aumv;
        }
    }
}
