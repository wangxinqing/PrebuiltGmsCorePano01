package defpackage;

import java.util.List;

/* renamed from: amzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzv extends amzy {
    private final transient amzy a;

    public amzv(amzy amzy) {
        this.a = amzy;
    }

    private final int c(int i) {
        return (size() - 1) - i;
    }

    private final int d(int i) {
        return size() - i;
    }

    public final amzy a(int i, int i2) {
        amrl.a(i, i2, size());
        return this.a.subList(d(i2), d(i)).g();
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public final boolean f() {
        return this.a.f();
    }

    public final amzy g() {
        return this.a;
    }

    public final Object get(int i) {
        amrl.a(i, size());
        return this.a.get(c(i));
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return c(lastIndexOf);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return c(indexOf);
        }
        return -1;
    }

    public final int size() {
        return this.a.size();
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
