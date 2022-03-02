package defpackage;

/* renamed from: avyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyo {
    public final String a;
    public final String b;

    public avyo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avyo)) {
            return false;
        }
        avyo avyo = (avyo) obj;
        return awaj.a((Object) this.a, (Object) avyo.a) && awaj.a((Object) this.b, (Object) avyo.b);
    }

    public final int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 899) * 31;
        String str2 = this.a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" realm=\"");
        sb.append(str2);
        sb.append("\"");
        return sb.toString();
    }
}
