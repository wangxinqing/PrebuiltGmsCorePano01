package defpackage;

/* renamed from: juj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class juj {
    public final atpe a;
    public final bsz b;
    private jut c;
    private jun d;

    public juj(bsz bsz, atpe atpe) {
        iva.a((Object) atpe);
        this.a = atpe;
        this.c = null;
        this.d = null;
        this.b = bsz;
    }

    public static juj a(int i, audx audx) {
        juh juh = new juh((bsz) null, i);
        juh.a(audx.k());
        return juh.a();
    }

    public final int a() {
        return this.a.b;
    }

    public final jut b() {
        jut jut = this.c;
        if (jut != null) {
            return jut;
        }
        atpe atpe = this.a;
        if ((atpe.a & 2) == 0) {
            return null;
        }
        atmb atmb = atpe.c;
        if (atmb == null) {
            atmb = atmb.e;
        }
        jut jut2 = new jut(atmb);
        this.c = jut2;
        return jut2;
    }

    public final byte[] c() {
        return this.a.d.k();
    }

    public final jun d() {
        jun jun = this.d;
        if (jun != null) {
            return jun;
        }
        atpe atpe = this.a;
        if ((atpe.a & 8) == 0) {
            return null;
        }
        atkq atkq = atpe.e;
        if (atkq == null) {
            atkq = atkq.e;
        }
        jun jun2 = new jun(atkq);
        this.d = jun2;
        return jun2;
    }

    public juj(byte[] bArr, int i, bsz bsz) {
        atpe atpe;
        try {
            atpe = (atpe) aucj.a((aucj) atpe.f, bArr, aubs.c());
        } catch (auda e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("juj", "<init>", 59, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Feature] Could not parse feature proto.");
            atpe = null;
        }
        this.a = atpe;
        this.c = null;
        this.d = null;
        this.b = bsz;
    }

    public static juj a(bsz bsz, int i, audx audx) {
        juh juh = new juh(bsz, i);
        juh.a(audx.k());
        return juh.a();
    }
}
