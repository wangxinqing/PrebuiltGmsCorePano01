package defpackage;

/* renamed from: aimi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aimi {
    private final int a;
    private volatile boolean b;
    private volatile Object c;
    public final Object d;

    protected aimi(int i) {
        this(i, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void a(aioa aioa) {
        aioa.b(this.a, this);
    }

    public final Object b() {
        irk.a(this.b, (Object) "getResultWhenAvailable called before result is set.");
        return this.c;
    }

    protected aimi(int i, Object obj) {
        this.b = false;
        this.a = i;
        this.d = obj;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        this.c = obj;
        this.b = true;
        a();
    }
}
