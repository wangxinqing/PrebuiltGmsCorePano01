package defpackage;

/* renamed from: apyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apyu extends apyq {
    private final String b;

    public apyu(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null identifier");
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apyq) {
            return this.b.equals(((apyq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 24);
        sb.append("AuthContext{identifier=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
