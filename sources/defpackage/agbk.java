package defpackage;

/* renamed from: agbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbk {
    public String a;
    public Boolean b;
    private String c;

    public final agbl a() {
        String str = this.c == null ? " accountName" : "";
        if (this.b == null) {
            str = str.concat(" isG1User");
        }
        if (str.isEmpty()) {
            return new agbi(this.a, this.c, this.b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void a(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }
}
