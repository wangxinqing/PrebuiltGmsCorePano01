package defpackage;

/* renamed from: aepd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepd extends aepk {
    private final long a;
    private final long b;
    private final long c;

    public aepd(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aepk) {
            aepk aepk = (aepk) obj;
            return this.a == aepk.a() && this.b == aepk.b() && this.c == aepk.c();
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder sb = new StringBuilder(163);
        sb.append("SyncStatus{elapsedRealtimeMillisAtLastSync=");
        sb.append(j);
        sb.append(", currentTimeMillisAtLastSync=");
        sb.append(j2);
        sb.append(", serverTimeMillisAtLastSync=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
