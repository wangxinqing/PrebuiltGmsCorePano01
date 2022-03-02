package defpackage;

/* renamed from: agtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agtg extends agur {
    private final auay a;
    private final long b;
    private final Long c;

    public agtg(auay auay, long j, Long l) {
        this.a = auay;
        this.b = j;
        this.c = l;
    }

    public final auay a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agur) {
            agur agur = (agur) obj;
            return this.a.equals(agur.a()) && this.b == agur.b() && this.c.equals(agur.c());
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("ItemImpl{data=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", id=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
