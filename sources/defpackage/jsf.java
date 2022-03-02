package defpackage;

/* renamed from: jsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsf extends jsn {
    private final avjs a;
    private final amri b;
    private final amri c;
    private final amri d;

    public jsf(avjs avjs, amri amri, amri amri2, amri amri3) {
        this.a = avjs;
        this.b = amri;
        this.c = amri2;
        this.d = amri3;
    }

    public final avjs a() {
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
        if (obj instanceof jsn) {
            jsn jsn = (jsn) obj;
            return this.a.equals(jsn.a()) && this.b.equals(jsn.b()) && this.c.equals(jsn.c()) && this.d.equals(jsn.d());
        }
    }

    public final int hashCode() {
        avjs avjs = this.a;
        int i = avjs.S;
        if (i == 0) {
            i = aueh.a.a((Object) avjs).a(avjs);
            avjs.S = i;
        }
        return this.d.hashCode() ^ ((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PhotosCardData{relatedPhotosCard=");
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
