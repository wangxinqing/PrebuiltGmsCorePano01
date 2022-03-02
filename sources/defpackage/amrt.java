package defpackage;

/* renamed from: amrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrt extends amri {
    private static final long serialVersionUID = 0;
    public final Object a;

    public amrt(Object obj) {
        this.a = obj;
    }

    public final amri a(amri amri) {
        amrl.a((Object) amri);
        return this;
    }

    public final boolean a() {
        return true;
    }

    public final Object b() {
        return this.a;
    }

    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amrt) {
            return this.a.equals(((amrt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final Object a(Object obj) {
        amrl.a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }
}
