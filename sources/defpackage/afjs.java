package defpackage;

/* renamed from: afjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjs extends afkh {
    public final String a;
    public final amri b;
    public final amri c;
    public final amri d;
    private final int e;

    public afjs(String str, amri amri, amri amri2, amri amri3, int i) {
        this.a = str;
        this.b = amri;
        this.c = amri2;
        this.d = amri3;
        this.e = i;
    }

    public final String a() {
        return this.a;
    }

    public final amri b() {
        return this.b;
    }

    public final amri c() {
        return this.c;
    }

    public final amri d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afkh) {
            afkh afkh = (afkh) obj;
            return this.a.equals(afkh.a()) && this.b.equals(afkh.b()) && this.c.equals(afkh.c()) && this.d.equals(afkh.d()) && this.e == afkh.e();
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DownloadFileGroupRequest{groupName=");
        sb.append(str);
        sb.append(", accountOptional=");
        sb.append(valueOf);
        sb.append(", downloadConditionsOptional=");
        sb.append(valueOf2);
        sb.append(", listenerOptional=");
        sb.append(valueOf3);
        sb.append(", groupSizeBytes=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
