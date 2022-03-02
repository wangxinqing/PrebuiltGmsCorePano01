package defpackage;

/* renamed from: doy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class doy {
    private final dox a;
    private final Object b;
    private final Object c = new Object();

    private doy(Object obj, dox dox) {
        this.b = obj;
        this.a = dox;
    }

    static doy a(Object obj, dox dox) {
        return new doy(obj, dox);
    }

    public final Object a() {
        synchronized (this.c) {
        }
        try {
            return this.a.a();
        } catch (IllegalStateException | SecurityException e) {
            return this.b;
        }
    }
}
