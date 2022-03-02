package defpackage;

/* renamed from: sna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sna extends snk {
    public final String a;
    private final boolean b;
    private final boolean c;

    public sna(String str, boolean z, boolean z2) {
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null echoServerToken");
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof snk) {
            snk snk = (snk) obj;
            return this.a.equals(snk.a()) && this.b == snk.b() && this.c == snk.c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
        if (this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 82);
        sb.append("LocationRequest{echoServerToken=");
        sb.append(str);
        sb.append(", includeBattery=");
        sb.append(z);
        sb.append(", includeConnectivity=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
