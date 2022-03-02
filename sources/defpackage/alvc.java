package defpackage;

/* renamed from: alvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class alvc implements alvb, alva {
    protected final boolean a;
    private final int b;

    protected alvc(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    /* access modifiers changed from: protected */
    public final void a(alzd alzd) {
        alzd.a();
        if (this.a) {
            alzd.a(this.b);
        }
    }
}
