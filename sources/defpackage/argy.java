package defpackage;

/* renamed from: argy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class argy extends arhb implements argv {
    public abstract Object a();

    public abstract Object a(Object obj);

    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }

    public final Object c() {
        return this.b.next();
    }

    public final Object d() {
        f();
        return a();
    }

    public final Object e() {
        return this.b.b();
    }

    public argy(arhd arhd) {
        super(arhd);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        f();
        return new argx(this, e(), a());
    }
}
