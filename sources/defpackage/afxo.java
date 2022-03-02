package defpackage;

/* renamed from: afxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afxo extends afyp {
    private final anaf a;
    private final long b;
    private final long c;
    private final long d;

    public afxo(anaf anaf, long j, long j2, long j3) {
        this.a = anaf;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final anaf a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afyp) {
            afyp afyp = (afyp) obj;
            return this.a.equals(afyp.a()) && this.b == afyp.b() && this.c == afyp.c() && this.d == afyp.d();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 231);
        sb.append("SyncStats{activeEventsWithDelaysMs=");
        sb.append(valueOf);
        sb.append(", syncDurationMs=");
        sb.append(j);
        sb.append(", elapsedTimeBetweenLastSuccessfulAndCurrentSyncCompletionMs=");
        sb.append(j2);
        sb.append(", elapsedTimeBetweenLastFailedAndCurrentSyncCompletionMs=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
