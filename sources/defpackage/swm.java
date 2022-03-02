package defpackage;

/* renamed from: swm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class swm extends swl {
    private boolean a;

    public swm(svv svv) {
        super(svv);
        this.x.v++;
    }

    /* access modifiers changed from: protected */
    public void G() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (!g()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!a()) {
            this.x.u();
            this.a = true;
        }
    }

    public final void m() {
        if (!this.a) {
            G();
            this.x.u();
            this.a = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
