package defpackage;

/* renamed from: amqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amqt implements amqy {
    private transient amqt a;

    public amqt a() {
        amqt amqt = this.a;
        if (amqt != null) {
            return amqt;
        }
        amqs amqs = new amqs(this);
        this.a = amqs;
        return amqs;
    }

    /* access modifiers changed from: protected */
    public abstract Object b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object c(Object obj);

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        Object c = c(obj);
        amrl.a(c);
        return c;
    }

    public Object e(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        amrl.a(b);
        return b;
    }

    protected amqt() {
    }

    public final Iterable a(Iterable iterable) {
        amrl.a((Object) iterable, (Object) "fromIterable");
        return new amqr(this, iterable);
    }

    @Deprecated
    public final Object a(Object obj) {
        return d(obj);
    }
}
