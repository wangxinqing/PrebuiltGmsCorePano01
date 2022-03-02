package defpackage;

/* renamed from: dma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dma extends dlz {
    private boolean a;

    protected dma(dmd dmd) {
        super(dmd);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final boolean p() {
        return this.a;
    }

    public final void q() {
        if (!p()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        a();
        this.a = true;
    }
}
