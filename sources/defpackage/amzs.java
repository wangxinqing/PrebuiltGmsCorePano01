package defpackage;

import java.util.Collection;
import java.util.EnumSet;

/* renamed from: amzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amzs extends anax {
    private final transient EnumSet a;
    private transient int b;

    public amzs(EnumSet enumSet) {
        this.a = enumSet;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return ance.a(this.a.iterator());
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof amzs) {
            collection = ((amzs) collection).a;
        }
        return this.a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amzs) {
            obj = ((amzs) obj).a;
        }
        return this.a.equals(obj);
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new amzr(this.a);
    }
}
