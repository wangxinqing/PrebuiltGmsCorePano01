package defpackage;

/* renamed from: cof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cof extends coj {
    private final long b;
    private final int c;
    private final int d;
    private final long e;

    public cof(long j, int i, int i2, long j2) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coj) {
            coj coj = (coj) obj;
            return this.b == coj.a() && this.c == coj.b() && this.d == coj.c() && this.e == coj.d();
        }
    }

    public final int hashCode() {
        long j = this.b;
        int i = this.c;
        int i2 = this.d;
        long j2 = this.e;
        return ((int) ((j2 >>> 32) ^ j2)) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003);
    }

    public final String toString() {
        long j = this.b;
        int i = this.c;
        int i2 = this.d;
        long j2 = this.e;
        StringBuilder sb = new StringBuilder(168);
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(j);
        sb.append(", loadBatchSize=");
        sb.append(i);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(i2);
        sb.append(", eventCleanUpAge=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
