package defpackage;

/* renamed from: alqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqv {
    public int a;
    public final StringBuilder b = new StringBuilder();
    public aloy c;
    private boolean d;
    private final alqr e;

    public alqv(alqr alqr) {
        if (((alqn) alqr).b == 3) {
            this.e = alqr;
            alqr.a(new alqu(this));
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized void a() {
        if (!this.d) {
            this.d = true;
            this.e.a();
        } else {
            throw new IllegalArgumentException("Request has already been sent.");
        }
    }
}
