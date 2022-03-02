package defpackage;

import java.util.Arrays;

/* renamed from: hfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfy {
    public final String a;
    public final String b;
    public final boolean c;
    public String d = null;
    public String e = null;

    public hfy(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hfy) {
            hfy hfy = (hfy) obj;
            if (!amqx.a(this.a, hfy.a) || !amqx.a(this.b, hfy.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(':');
        sb.append(this.b);
        if (this.d != null) {
            sb.append('[');
            sb.append(this.d);
            sb.append(']');
        }
        if (this.e != null) {
            sb.append('@');
            sb.append(this.e);
        }
        sb.append(" permitMetered=");
        sb.append(this.c);
        return sb.toString();
    }
}
