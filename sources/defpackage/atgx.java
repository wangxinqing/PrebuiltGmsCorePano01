package defpackage;

/* renamed from: atgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgx {
    public String a = "";
    public String b = "";
    public String c = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (!this.b.isEmpty()) {
            sb.append("-");
            sb.append(this.b);
        }
        if (!this.c.isEmpty()) {
            sb.append("-");
            sb.append(this.c);
        }
        return sb.toString();
    }
}
