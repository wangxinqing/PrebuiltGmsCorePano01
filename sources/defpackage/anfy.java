package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: anfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfy extends anfk implements Serializable {
    private static final long serialVersionUID = 0;
    final anfk a;

    public anfy(anfk anfk) {
        amrl.a((Object) anfk);
        this.a = anfk;
    }

    public final anfk a() {
        return this.a;
    }

    public final Object b(Iterable iterable) {
        return this.a.a(iterable);
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anfy) {
            return this.a.equals(((anfy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }

    public final Object a(Iterable iterable) {
        return this.a.b(iterable);
    }

    public final Object b(Object obj, Object obj2) {
        return this.a.a(obj, obj2);
    }

    public final Object a(Object obj, Object obj2) {
        return this.a.b(obj, obj2);
    }

    public final Object b(Iterator it) {
        return this.a.a(it);
    }

    public final Object a(Iterator it) {
        return this.a.b(it);
    }
}
