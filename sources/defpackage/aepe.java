package defpackage;

/* renamed from: aepe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepe extends aepm {
    public final boolean a;
    public final int b;

    public aepe(boolean z, int i) {
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
        if (obj instanceof aepm) {
            aepm aepm = (aepm) obj;
            return this.a == aepm.a() && this.b == aepm.b();
        }
    }

    public final int hashCode() {
        return (((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(62);
        sb.append("SyncSubPolicy{enabled=");
        sb.append(z);
        sb.append(", throttleDelaySeconds=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
