package defpackage;

/* renamed from: jse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jse extends jsl {
    private final String a;
    private final String b;
    private final String c;

    public jse(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsl) {
            jsl jsl = (jsl) obj;
            return this.a.equals(jsl.a()) && this.b.equals(jsl.b()) && this.c.equals(jsl.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("LinkData{linkTitle=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", iconUrl=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
