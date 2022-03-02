package defpackage;

/* renamed from: agov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agov extends agpb {
    public final long a;
    public final agpa b;
    public final boolean c;

    public agov(long j, agpa agpa, boolean z) {
        this.a = j;
        this.b = agpa;
        this.c = z;
    }

    public final long a() {
        return this.a;
    }

    public final agpa b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpb) {
            agpb agpb = (agpb) obj;
            return this.a == agpb.a() && this.b.equals(agpb.b()) && this.c == agpb.c();
        }
    }

    public final int hashCode() {
        long j = this.a;
        return (!this.c ? 1237 : 1231) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 107);
        sb.append("DownloadDeletionsOptions{timeoutMillis=");
        sb.append(j);
        sb.append(", reason=");
        sb.append(valueOf);
        sb.append(", uploadPushNotificationPayloads=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
