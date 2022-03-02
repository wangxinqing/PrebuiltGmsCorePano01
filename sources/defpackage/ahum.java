package defpackage;

/* renamed from: ahum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahum {
    protected final ahss h;
    protected final ajrh i;
    protected volatile boolean j = false;
    protected final ahuz k;
    protected int l;

    public ahum(ahss ahss, ajrh ajrh, ahuz ahuz) {
        this.h = ahss;
        this.i = ahvx.a(ajrh);
        this.k = ahuz;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract boolean a(aqek aqek, aqek aqek2);

    public final synchronized boolean b(aqek aqek, aqek aqek2) {
        boolean z;
        if (!this.j) {
            int i2 = this.l + 1;
            this.l = i2;
            ahuz ahuz = this.k;
            if (ahuz != null) {
                ahuz.a(i2);
                this.k.a(aqek);
            }
            z = a(aqek, aqek2);
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void c() {
        this.j = true;
        a();
    }
}
