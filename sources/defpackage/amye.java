package defpackage;

/* renamed from: amye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amye extends amyf {
    private static final long serialVersionUID = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amye(Comparable comparable) {
        super(comparable);
        amrl.a((Object) comparable);
    }

    public final void a(StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }

    public final void b(StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("\\");
        sb.append(valueOf);
        sb.append("/");
        return sb.toString();
    }

    public final boolean a(Comparable comparable) {
        return anfm.b(this.b, comparable) <= 0;
    }
}
