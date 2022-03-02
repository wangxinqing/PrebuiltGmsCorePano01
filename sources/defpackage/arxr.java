package defpackage;

/* renamed from: arxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxr {
    private uaj a;
    private auay b;
    private auay c;
    private String d;

    public final arxs a() {
        String str = this.a == null ? " storedDiscoveryItem" : "";
        if (this.b == null) {
            str = str.concat(" accountKey");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" sha256AccountKeyPublicAddress");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" bleAddress");
        }
        if (str.isEmpty()) {
            return new arwv(this.a, this.b, this.c, this.d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(auay auay) {
        if (auay != null) {
            this.c = auay;
            return;
        }
        throw new NullPointerException("Null sha256AccountKeyPublicAddress");
    }

    public final void a(auay auay) {
        if (auay != null) {
            this.b = auay;
            return;
        }
        throw new NullPointerException("Null accountKey");
    }

    public final void a(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null bleAddress");
    }

    public final void a(uaj uaj) {
        if (uaj != null) {
            this.a = uaj;
            return;
        }
        throw new NullPointerException("Null storedDiscoveryItem");
    }
}
