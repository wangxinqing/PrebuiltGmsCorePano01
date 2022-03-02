package defpackage;

/* renamed from: iu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iu implements ax {
    public final km a;
    public final ir b;
    public boolean c = false;

    public iu(km kmVar, ir irVar) {
        this.a = kmVar;
        this.b = irVar;
    }

    public final void a(Object obj) {
        if (ix.c(2)) {
            "  onLoadFinished in " + this.a + ": " + this.a.dataToString(obj);
        }
        this.c = true;
        this.b.a(this.a, obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
