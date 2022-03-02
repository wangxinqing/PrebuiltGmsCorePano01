package defpackage;

/* renamed from: syx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class syx extends syw {
    private boolean a;

    public syx(sze sze) {
        super(sze);
        this.j.k++;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: package-private */
    public final boolean p() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void q() {
        if (!p()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!a()) {
            this.j.l++;
            this.a = true;
        }
    }
}
