package defpackage;

/* renamed from: afem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afem extends affr {
    public final long a;
    public final long b;
    public final anaf c;

    public afem(long j, long j2, anaf anaf) {
        this.a = j;
        this.b = j2;
        this.c = anaf;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final anaf c() {
        return this.c;
    }

    public final affq d() {
        return new affq(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof affr) {
            affr affr = (affr) obj;
            return this.a == affr.a() && this.b == affr.b() && this.c.equals(affr.c());
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79);
        sb.append("DirtyCounters{read=");
        sb.append(j);
        sb.append(", write=");
        sb.append(j2);
        sb.append(", triggers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
