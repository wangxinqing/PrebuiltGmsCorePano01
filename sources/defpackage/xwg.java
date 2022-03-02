package defpackage;

/* renamed from: xwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xwg extends xwh {
    public final int a;
    public final boolean b;

    public xwg(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xwh) {
            xwh xwh = (xwh) obj;
            return this.a == xwh.a() && this.b == xwh.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(63);
        sb.append("MigrateState{numContactsMigrated=");
        sb.append(i);
        sb.append(", isComplete=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
