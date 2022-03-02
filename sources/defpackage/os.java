package defpackage;

/* renamed from: os  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class os extends or {
    private final Object a = new Object();

    public os(int i) {
        super(i);
    }

    public final Object a() {
        Object a2;
        synchronized (this.a) {
            a2 = super.a();
        }
        return a2;
    }

    public final boolean a(Object obj) {
        boolean a2;
        synchronized (this.a) {
            a2 = super.a(obj);
        }
        return a2;
    }
}
