package defpackage;

/* renamed from: jsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsq {
    private String a;
    private amri b;

    public jsq() {
    }

    public final jsr a() {
        String str = this.a == null ? " text" : "";
        if (str.isEmpty()) {
            return new jsh(this.a, this.b);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public jsq(byte[] bArr) {
        this.b = ampu.a;
    }

    public final void a(String str) {
        this.b = amri.b(str);
    }
}
