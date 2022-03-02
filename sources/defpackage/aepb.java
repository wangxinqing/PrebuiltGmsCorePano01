package defpackage;

/* renamed from: aepb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepb extends aeph {
    private final Object a;
    private final aepk b;

    public aepb(Object obj, aepk aepk) {
        if (obj != null) {
            this.a = obj;
            this.b = aepk;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public final Object a() {
        return this.a;
    }

    public final aepk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeph) {
            aeph aeph = (aeph) obj;
            return this.a.equals(aeph.a()) && this.b.equals(aeph.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("MdhReadResult{value=");
        sb.append(valueOf);
        sb.append(", syncStatus=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
