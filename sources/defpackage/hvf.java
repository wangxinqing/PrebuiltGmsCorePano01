package defpackage;

import java.util.Arrays;

/* renamed from: hvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvf {
    public final String a;
    public final String b;

    public hvf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hvf) {
            hvf hvf = (hvf) obj;
            return ius.a(this.a, hvf.a) && ius.a(this.b, hvf.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
