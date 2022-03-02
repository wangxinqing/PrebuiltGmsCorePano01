package defpackage;

/* renamed from: aesj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aesj extends aeso {
    private final boolean a;
    private final int b;

    public aesj(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeso) {
            aeso aeso = (aeso) obj;
            return this.a == aeso.a() && this.b == aeso.b();
        }
    }

    public final int hashCode() {
        return (((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(66);
        sb.append("CoreSyncSubPolicy{enabled=");
        sb.append(z);
        sb.append(", throttleDelaySeconds=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
