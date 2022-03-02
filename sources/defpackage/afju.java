package defpackage;

/* renamed from: afju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afju extends afmg {
    public final String a;
    public final amri b;

    public afju(String str, amri amri) {
        this.a = str;
        this.b = amri;
    }

    public final String a() {
        return this.a;
    }

    public final amri b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afmg) {
            afmg afmg = (afmg) obj;
            return this.a.equals(afmg.a()) && this.b.equals(afmg.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(valueOf).length());
        sb.append("RemoveFileGroupRequest{groupName=");
        sb.append(str);
        sb.append(", accountOptional=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
