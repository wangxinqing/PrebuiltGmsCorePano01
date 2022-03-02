package defpackage;

/* renamed from: aeex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeex extends aehc {
    private final auay a;
    private final auay b;

    public aeex(auay auay, auay auay2) {
        if (auay != null) {
            this.a = auay;
            if (auay2 != null) {
                this.b = auay2;
                return;
            }
            throw new NullPointerException("Null sha256AccountKeyPublicAddress");
        }
        throw new NullPointerException("Null accountKey");
    }

    public final auay a() {
        return this.a;
    }

    public final auay b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aehc) {
            aehc aehc = (aehc) obj;
            return this.a.equals(aehc.a()) && this.b.equals(aehc.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(valueOf2).length());
        sb.append("FastPairHistoryItem{accountKey=");
        sb.append(valueOf);
        sb.append(", sha256AccountKeyPublicAddress=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
