package defpackage;

/* renamed from: juh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class juh {
    private final bsz a;
    private final aucd b;

    public juh(bsz bsz, int i) {
        aucd o = atpe.f.o();
        this.b = o;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpe atpe = (atpe) o.b;
        atpe.a |= 1;
        atpe.b = i;
        this.a = bsz;
    }

    public final juj a() {
        aucd aucd = this.b;
        if ((((atpe) aucd.b).a & 2) == 0) {
            atmb c = jut.c(cbi.i().a());
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            atpe atpe = (atpe) aucd.b;
            atpe atpe2 = atpe.f;
            c.getClass();
            atpe.c = c;
            atpe.a |= 2;
        }
        return new juj(this.a, (atpe) this.b.i());
    }

    public final void a(jun jun) {
        aucd aucd = this.b;
        atkq atkq = jun.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atpe atpe = (atpe) aucd.b;
        atpe atpe2 = atpe.f;
        atkq.getClass();
        atpe.e = atkq;
        atpe.a |= 8;
    }

    public final void a(jut jut) {
        iva.a((Object) jut);
        aucd aucd = this.b;
        atmb atmb = jut.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atpe atpe = (atpe) aucd.b;
        atpe atpe2 = atpe.f;
        atmb.getClass();
        atpe.c = atmb;
        atpe.a |= 2;
    }

    public final void a(byte[] bArr) {
        aucd aucd = this.b;
        auay a2 = auay.a(bArr);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atpe atpe = (atpe) aucd.b;
        atpe atpe2 = atpe.f;
        a2.getClass();
        atpe.a |= 4;
        atpe.d = a2;
    }
}
