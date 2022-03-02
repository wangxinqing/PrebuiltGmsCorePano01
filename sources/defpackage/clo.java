package defpackage;

/* renamed from: clo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clo {
    private final String a;

    private clo(String str) {
        this.a = str;
    }

    public static clo a(String str) {
        return new clo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof clo) {
            return this.a.equals(((clo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("Encoding{name=\"");
        sb.append(str);
        sb.append("\"}");
        return sb.toString();
    }
}
