package defpackage;

/* renamed from: whq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class whq extends whn {
    private final String a;
    private final String b;

    public whq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof whn) {
            whn whn = (whn) obj;
            return this.a.equals(whn.a()) && this.b.equals(whn.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AccountOwner{displayName=");
        sb.append(str);
        sb.append(", givenName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
