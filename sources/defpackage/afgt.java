package defpackage;

/* renamed from: afgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgt implements afgs {
    private final afgs a;
    private volatile boolean b;
    private Object c;

    public afgt(afgs afgs) {
        this.a = afgs;
    }

    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object a2 = this.a.a();
                    this.c = a2;
                    this.b = true;
                    return a2;
                }
            }
        }
        return this.c;
    }
}
