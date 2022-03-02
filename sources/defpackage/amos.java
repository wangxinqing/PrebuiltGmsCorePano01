package defpackage;

/* renamed from: amos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amos implements amot {
    public final amoo a = new amoo();
    private final amoj b;
    private boolean c = false;

    public amos(amoj amoj) {
        this.b = amoj;
    }

    public final amoj a(int i) {
        if (!this.c) {
            this.c = true;
            return this.b;
        }
        throw new IllegalStateException();
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.c;
    }

    public final void c() {
        this.c = false;
    }

    public final amoo d() {
        return this.a;
    }
}
