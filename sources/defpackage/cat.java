package defpackage;

/* renamed from: cat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cat implements cao {
    private final bwv a;
    private final cau b;
    private final boolean c;

    public cat() {
        boolean O = awuz.a.a().O();
        this.c = O;
        if (!O) {
            this.b = new cau();
            this.a = null;
            return;
        }
        this.a = new bwv();
        this.b = null;
    }

    public final void a(bsz bsz, atjv atjv) {
    }

    public final void b(bsz bsz, atjv atjv) {
    }

    public final void a(bsz bsz, cas cas) {
        if (this.c) {
            this.a.a(cas);
        } else {
            this.b.a(cas);
        }
    }

    public final void a(bsz bsz, cas cas, cas cas2) {
        if (this.c) {
            bwv bwv = this.a;
            new Object[1][0] = cas;
            if (cas.b(cas)) {
                bwv.c.add(cas);
                bwv.a(bvq.a("ExpirationOperation"));
            }
            if (cas2 != null) {
                this.a.a(cas2);
                return;
            }
            return;
        }
        cau cau = this.b;
        new Object[1][0] = cas;
        if (cas.b(cas)) {
            new Object[1][0] = cas;
            cau.c.add(cas);
            cau.a(bvq.a("InterestRecordExpirationOperation"));
        }
        if (cas2 != null) {
            this.b.a(cas2);
        }
    }
}
