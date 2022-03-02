package defpackage;

/* renamed from: anmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmc {
    public final String a;

    static {
        new anmc("");
    }

    public anmc(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anmc) {
            return this.a.equals(((anmc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 10);
        sb.append("SafeHtml{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
