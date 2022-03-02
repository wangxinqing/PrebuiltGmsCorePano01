package defpackage;

import java.util.List;

/* renamed from: agys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agys extends agyt {
    public final String a;
    private final List b;

    public agys(String str, List list) {
        if (str != null) {
            this.a = str;
            this.b = list;
            return;
        }
        throw new NullPointerException("Null query");
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agyt) {
            agyt agyt = (agyt) obj;
            return this.a.equals(agyt.a()) && this.b.equals(agyt.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 27 + String.valueOf(valueOf).length());
        sb.append("SafeSql{query=");
        sb.append(str);
        sb.append(", queryArgs=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
