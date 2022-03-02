package defpackage;

import java.util.Set;

/* renamed from: cnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cnl extends cnq {
    private final long a;
    private final long b;
    private final Set c;

    public cnl(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Set c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cnq) {
            cnq cnq = (cnq) obj;
            return this.a == cnq.a() && this.b == cnq.b() && this.c.equals(cnq.c());
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 85);
        sb.append("ConfigValue{delta=");
        sb.append(j);
        sb.append(", maxAllowedDelay=");
        sb.append(j2);
        sb.append(", flags=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
