package defpackage;

/* renamed from: amyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amyb extends amyf {
    public static final amyb a = new amyb();
    private static final long serialVersionUID = 0;

    private amyb() {
        super((Comparable) null);
    }

    private Object readResolve() {
        return a;
    }

    public final int a(amyf amyf) {
        return amyf == this ? 0 : 1;
    }

    public final boolean a(Comparable comparable) {
        return false;
    }

    public final void b(StringBuilder sb) {
        sb.append("+∞)");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((amyf) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }

    public final Comparable a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    public final void a(StringBuilder sb) {
        throw new AssertionError();
    }
}
