package defpackage;

/* renamed from: xve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xve extends xvf {
    public final String a;
    public final String b;

    public xve(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null groupsFeed");
        }
        throw new NullPointerException("Null contactsFeed");
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
        if (obj instanceof xvf) {
            xvf xvf = (xvf) obj;
            return this.a.equals(xvf.a()) && this.b.equals(xvf.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 33 + str2.length());
        sb.append("Feeds{contactsFeed=");
        sb.append(str);
        sb.append(", groupsFeed=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
