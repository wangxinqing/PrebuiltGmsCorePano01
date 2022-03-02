package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvj {
    public final String a;
    protected final String b;
    protected final String c;
    public final String d;
    public final String e;
    public final String f;
    protected final String g;
    public final String h;
    public final String i;
    public final Map j;
    public final boolean k;

    public dvj(String str, String str2, String str3, String str4, String str5, Map map, boolean z, String str6, String str7) {
        if (str3 == null) {
            String valueOf = String.valueOf(str2);
            throw new NullPointerException(valueOf.length() == 0 ? new String("A URI column must be specified for table ") : "A URI column must be specified for table ".concat(valueOf));
        }
        this.f = str3;
        this.c = str6;
        if (str6 == null) {
            this.g = null;
        } else if (str7 == null) {
            throw new NullPointerException(str6.length() == 0 ? new String("A Tag column must be specified for table ") : "A Tag column must be specified for table ".concat(str6));
        } else {
            this.g = str7;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str3.length());
            sb.append(str2);
            sb.append("_");
            sb.append(str3);
            str = sb.toString();
        }
        this.a = str;
        this.b = str2;
        if (!str2.equals(this.c)) {
            this.h = str4 == null ? "0" : str4;
            this.i = str5 == null ? "0" : str5;
            this.j = Collections.unmodifiableMap(new HashMap(map));
            this.d = this.b;
            this.e = this.c;
            this.k = z;
            return;
        }
        throw new IllegalArgumentException("Tags table and docs table cannot be the same.");
    }

    public static dvi a() {
        return new dvi();
    }

    private final Object[] b() {
        return new Object[]{this.a, this.b, this.d, this.f, this.h, this.i, this.j, null, Boolean.valueOf(this.k), this.c, this.e};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dvj)) {
            return false;
        }
        return Arrays.deepEquals(b(), ((dvj) obj).b());
    }

    public final int hashCode() {
        return Arrays.deepHashCode(b());
    }
}
