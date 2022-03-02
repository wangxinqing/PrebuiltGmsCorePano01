package defpackage;

/* renamed from: agbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbs extends agck {
    private final Class a;
    private final String b;

    public agbs(Class cls, String str) {
        this.a = cls;
        this.b = str;
    }

    public final Class a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agck) {
            agck agck = (agck) obj;
            return this.a.equals(agck.a()) && this.b.equals(agck.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + str.length());
        sb.append("ImageModelType{modelClass=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
