package defpackage;

/* renamed from: xbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbs implements xfg {
    public final String a;
    private final String c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public xbs(String str, String str2) {
        this(str, str2, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xbs) {
            return ius.a(this.a, ((xbs) obj).a);
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            str2 = str3;
        }
        double d2 = this.d;
        String str4 = this.i;
        double d3 = this.e;
        String str5 = this.j;
        double d4 = this.f;
        String str6 = this.k;
        double d5 = this.g;
        String str7 = this.l;
        double d6 = d5;
        double d7 = this.h;
        double d8 = d6;
        String str8 = this.m;
        int length = str.length();
        int length2 = str2.length();
        int length3 = String.valueOf(str4).length();
        int length4 = String.valueOf(str5).length();
        int length5 = String.valueOf(str6).length();
        String str9 = str8;
        StringBuilder sb = new StringBuilder(length + 172 + length2 + length3 + length4 + length5 + String.valueOf(str7).length() + String.valueOf(str8).length());
        sb.append("EmailAddress:[Value=");
        sb.append(str);
        sb.append(" Type=");
        sb.append(str2);
        sb.append(" a1=");
        sb.append(d2);
        sb.append(",");
        sb.append(str4);
        sb.append(" a2=");
        sb.append(d3);
        sb.append(",");
        sb.append(str5);
        sb.append(" a3=");
        sb.append(d4);
        sb.append(",");
        sb.append(str6);
        sb.append(" a4=");
        sb.append(d8);
        sb.append(",");
        sb.append(str7);
        sb.append(" a5=");
        sb.append(d7);
        sb.append(",");
        sb.append(str9);
        sb.append("]");
        return sb.toString();
    }

    public xbs(String str, String str2, double d2, double d3, double d4, double d5, double d6, String str3, String str4, String str5, String str6, String str7) {
        this.c = str;
        this.a = str2;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = d6;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
    }
}
