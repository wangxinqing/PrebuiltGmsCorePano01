package defpackage;

/* renamed from: zsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zsq extends zsw {
    private final long a;
    private final int b;
    private final long c;
    private final boolean d;

    public zsq(long j, int i, long j2, boolean z) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = z;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zsw) {
            zsw zsw = (zsw) obj;
            return this.a == zsw.a() && this.b == zsw.b() && this.c == zsw.c() && this.d == zsw.d();
        }
    }

    public final int hashCode() {
        long j = this.a;
        int i = this.b;
        long j2 = this.c;
        return (!this.d ? 1237 : 1231) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        long j2 = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(132);
        sb.append("ContactMetadata{contactId=");
        sb.append(j);
        sb.append(", timesContacted=");
        sb.append(i);
        sb.append(", lastTimeContacted=");
        sb.append(j2);
        sb.append(", isStarred=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
