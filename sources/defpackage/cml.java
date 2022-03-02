package defpackage;

/* renamed from: cml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cml {
    public byte[] a;
    private String b;
    private clp c;

    public final cmm a() {
        String str = this.b == null ? " backendName" : "";
        if (this.c == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new cme(this.b, this.a, this.c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void a(clp clp) {
        if (clp != null) {
            this.c = clp;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    public final void a(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }
}
