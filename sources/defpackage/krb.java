package defpackage;

/* renamed from: krb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class krb implements kre {
    public String a = null;
    public String b = null;
    private final kra c;
    private final String d;

    private krb(kra kra, String str) {
        this.c = kra;
        iva.a((Object) str);
        this.d = str;
    }

    public static krb a(String str) {
        return new krb(kra.LEFT_OUTER, str);
    }

    public static krb b(String str) {
        return new krb(kra.INNER, str);
    }

    public final String toString() {
        return a();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.c.e);
        sb.append("JOIN ");
        sb.append(this.d);
        if (this.b != null) {
            sb.append(" AS ");
            sb.append(this.b);
        }
        if (this.a != null) {
            sb.append(" ON ");
            sb.append(this.a);
        }
        return sb.toString();
    }
}
