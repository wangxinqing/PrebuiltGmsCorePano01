package defpackage;

/* renamed from: afjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afjt extends afkj {
    public final boolean a;
    public final boolean b;
    public final amri c;
    public final amri d;

    public afjt(boolean z, boolean z2, amri amri, amri amri2) {
        this.a = z;
        this.b = z2;
        this.c = amri;
        this.d = amri2;
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

    public final amri d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afkj) {
            afkj afkj = (afkj) obj;
            return this.a == afkj.a() && this.b == afkj.b() && this.c.equals(afkj.c()) && this.d.equals(afkj.d());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 120 + String.valueOf(valueOf2).length());
        sb.append("GetFileGroupsByFilterRequest{includeAllGroups=");
        sb.append(z);
        sb.append(", groupWithNoAccountOnly=");
        sb.append(z2);
        sb.append(", groupNameOptional=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
