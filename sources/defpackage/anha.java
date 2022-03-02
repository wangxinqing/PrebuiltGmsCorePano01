package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: anha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class anha extends anhb implements aneu {
    private static final long serialVersionUID = 0;
    transient Map a;

    public anha(aneu aneu) {
        super(aneu, (Object) null);
    }

    public final void a(Object obj, Iterable iterable) {
        throw null;
    }

    public aneu b() {
        return (aneu) this.f;
    }

    public final boolean b(Object obj, Object obj2) {
        throw null;
    }

    public final int c() {
        throw null;
    }

    public Collection c(Object obj) {
        throw null;
    }

    public final boolean c(Object obj, Object obj2) {
        throw null;
    }

    public final void d() {
        throw null;
    }

    public final boolean d(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = b().equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = b().hashCode();
        }
        return hashCode;
    }

    public final boolean k() {
        throw null;
    }

    public final Collection l() {
        throw null;
    }

    public final Set m() {
        throw null;
    }

    public final Collection n() {
        throw null;
    }

    public final Map o() {
        Map map;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new angq(b().o(), this.g);
            }
            map = this.a;
        }
        return map;
    }

    public final boolean a(Object obj, Object obj2) {
        boolean a2;
        synchronized (this.g) {
            a2 = b().a(obj, obj2);
        }
        return a2;
    }
}
