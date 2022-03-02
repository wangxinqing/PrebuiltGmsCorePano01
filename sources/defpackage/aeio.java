package defpackage;

/* renamed from: aeio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeio extends aejb {
    private final boolean a;
    private final long b;
    private final amri c;
    private final amri d;

    public aeio(boolean z, long j, amri amri, amri amri2) {
        this.a = z;
        this.b = j;
        this.c = amri;
        this.d = amri2;
    }

    public final boolean a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final amri c() {
        return this.c;
    }

    public final amri d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aejb) {
            aejb aejb = (aejb) obj;
            return this.a == aejb.a() && this.b == aejb.b() && this.c.equals(aejb.c()) && this.d.equals(aejb.d());
        }
    }

    public final int hashCode() {
        int i = !this.a ? 1237 : 1231;
        long j = this.b;
        return ((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 109 + String.valueOf(valueOf2).length());
        sb.append("ConnectionOptions{autoConnect=");
        sb.append(z);
        sb.append(", connectionTimeoutMillis=");
        sb.append(j);
        sb.append(", connectionPriority=");
        sb.append(valueOf);
        sb.append(", mtu=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
