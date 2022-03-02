package defpackage;

/* renamed from: ampu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampu extends amri {
    public static final ampu a = new ampu();
    private static final long serialVersionUID = 0;

    private ampu() {
    }

    private Object readResolve() {
        return a;
    }

    public final amri a(amri amri) {
        amrl.a((Object) amri);
        return amri;
    }

    public final boolean a() {
        return false;
    }

    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final Object c() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Object a(Object obj) {
        amrl.a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }
}
