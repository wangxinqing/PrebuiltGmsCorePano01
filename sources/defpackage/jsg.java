package defpackage;

import java.util.List;

/* renamed from: jsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsg extends jsp {
    private final amzy a;
    private final amri b;
    private final amri c;
    private final amri d;

    public jsg(amzy amzy, amri amri, amri amri2, amri amri3) {
        this.a = amzy;
        this.b = amri;
        this.c = amri2;
        this.d = amri3;
    }

    public final amzy a() {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsp) {
            jsp jsp = (jsp) obj;
            return anda.a((List) this.a, (Object) jsp.a()) && this.b.equals(jsp.b()) && this.c.equals(jsp.c()) && this.d.equals(jsp.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PostsCardData{posts=");
        sb.append(valueOf);
        sb.append(", targetGaiaId=");
        sb.append(valueOf2);
        sb.append(", viewerAccountName=");
        sb.append(valueOf3);
        sb.append(", viewerPageId=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
