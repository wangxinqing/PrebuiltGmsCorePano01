package defpackage;

/* renamed from: sot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class sot extends sos {
    public boolean a;

    public sot(svv svv) {
        super(svv);
        this.x.v++;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!n()) {
            this.x.u();
            this.a = true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean n();
}
