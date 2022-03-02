package defpackage;

/* renamed from: jsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsd extends jsj {
    private final amri a;
    private final amri b;
    private final amri c;

    public jsd(amri amri, amri amri2, amri amri3) {
        this.a = amri;
        this.b = amri2;
        this.c = amri3;
    }

    public final amri a() {
        return this.a;
    }

    public final amri b() {
        return this.b;
    }

    public final amri c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsj) {
            jsj jsj = (jsj) obj;
            return this.a.equals(jsj.a()) && this.b.equals(jsj.b()) && this.c.equals(jsj.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ContactInfoCardData{emails=");
        sb.append(valueOf);
        sb.append(", phones=");
        sb.append(valueOf2);
        sb.append(", addresses=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
