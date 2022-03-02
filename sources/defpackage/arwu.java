package defpackage;

/* renamed from: arwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arwu extends arxj {
    public final boolean a;
    public final boolean b;

    public arwu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arxj) {
            arxj arxj = (arxj) obj;
            return this.a == arxj.a() && this.b == arxj.b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(64);
        sb.append("FlagWrapper{isBlackListDeviceType=");
        sb.append(z);
        sb.append(", isManagedProfile=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
