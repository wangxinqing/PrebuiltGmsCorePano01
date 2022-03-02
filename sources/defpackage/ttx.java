package defpackage;

/* renamed from: ttx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ttx extends twv {
    private final avuv a;
    private final boolean b;

    public ttx(avuv avuv, boolean z) {
        this.a = avuv;
        this.b = z;
    }

    public final avuv a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof twv) {
            twv twv = (twv) obj;
            return this.a.equals(twv.a()) && this.b == twv.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Result{response=");
        sb.append(valueOf);
        sb.append(", isRetriable=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
