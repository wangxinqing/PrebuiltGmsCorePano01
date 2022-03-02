package defpackage;

/* renamed from: afyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afyz {
    public Class a;
    public aucp b;
    public aekn c;
    public anij d;
    private ahei e;

    public final afza a() {
        String str = this.e == null ? " pdsFactory" : "";
        if (this.c == null) {
            str = str.concat(" clock");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" logger");
        }
        if (str.isEmpty()) {
            return new afyv(this.a, this.b, this.e, this.c, this.d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void a(ahei ahei) {
        if (ahei != null) {
            this.e = ahei;
            return;
        }
        throw new NullPointerException("Null pdsFactory");
    }
}
