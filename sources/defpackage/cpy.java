package defpackage;

import java.util.Arrays;

/* renamed from: cpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cpy {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;

    public cpy(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cpy) {
            cpy cpy = (cpy) obj;
            return this.e == cpy.e && amqx.a(this.a, cpy.a) && amqx.a(this.b, cpy.b) && amqx.a(this.c, cpy.c) && amqx.a(this.d, cpy.d) && amqx.a(this.f, cpy.f) && amqx.a(this.g, cpy.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.e), this.f, this.g});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        if (this.b != null) {
            sb.append(":");
            sb.append(this.b);
        }
        if (this.e) {
            sb.append(":permitMetered");
        }
        if (this.f != null) {
            sb.append(":");
            sb.append(this.f);
        }
        if (this.g != null) {
            sb.append(":");
            sb.append(this.g);
        }
        return sb.toString();
    }
}
