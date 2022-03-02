package defpackage;

/* renamed from: aesi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aesi extends aesm {
    private final long b;
    private final long c;
    private final long d;

    public aesi(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aesm) {
            aesm aesm = (aesm) obj;
            return this.b == aesm.a() && this.c == aesm.b() && this.d == aesm.c();
        }
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        StringBuilder sb = new StringBuilder(167);
        sb.append("CoreSyncStatus{elapsedRealtimeMillisAtLastSync=");
        sb.append(j);
        sb.append(", currentTimeMillisAtLastSync=");
        sb.append(j2);
        sb.append(", serverTimeMillisAtLastSync=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
