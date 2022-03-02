package defpackage;

/* renamed from: arwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arwv extends arxs {
    private final uaj a;
    private final auay b;
    private final auay c;
    private final String d;

    public arwv(uaj uaj, auay auay, auay auay2, String str) {
        this.a = uaj;
        this.b = auay;
        this.c = auay2;
        this.d = str;
    }

    public final uaj a() {
        return this.a;
    }

    public final auay b() {
        return this.b;
    }

    public final auay c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arxs) {
            arxs arxs = (arxs) obj;
            return this.a.equals(arxs.a()) && this.b.equals(arxs.b()) && this.c.equals(arxs.c()) && this.d.equals(arxs.d());
        }
    }

    public final int hashCode() {
        uaj uaj = this.a;
        int i = uaj.S;
        if (i == 0) {
            i = aueh.a.a((Object) uaj).a(uaj);
            uaj.S = i;
        }
        return this.d.hashCode() ^ ((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 98 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("FastPairUploadInfo{storedDiscoveryItem=");
        sb.append(valueOf);
        sb.append(", accountKey=");
        sb.append(valueOf2);
        sb.append(", sha256AccountKeyPublicAddress=");
        sb.append(valueOf3);
        sb.append(", bleAddress=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
