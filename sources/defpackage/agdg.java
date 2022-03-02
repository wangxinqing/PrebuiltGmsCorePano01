package defpackage;

/* renamed from: agdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdg extends aghl {
    private final boolean a;
    private final boolean b;
    private final amri c;

    public agdg(boolean z, boolean z2, amri amri) {
        this.a = z;
        this.b = z2;
        this.c = amri;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final amri c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aghl) {
            aghl aghl = (aghl) obj;
            return this.a == aghl.a() && this.b == aghl.b() && this.c.equals(aghl.c());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 88);
        sb.append("PrimesPackageConfigurations{enabled=");
        sb.append(z);
        sb.append(", manualCapture=");
        sb.append(z2);
        sb.append(", dirStatsConfigurations=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
