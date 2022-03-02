package defpackage;

import java.util.Arrays;

/* renamed from: bua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bua {
    public final String a;
    public final String b;

    public bua(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bua) {
            bua bua = (bua) obj;
            return this.a.equals(bua.a) && this.b.equals(bua.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
