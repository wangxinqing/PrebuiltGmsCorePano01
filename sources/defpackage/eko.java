package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: eko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eko {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public eko(String str, String str2, boolean z, boolean z2, long j) {
        iva.c(str);
        this.a = str;
        iva.c(str2);
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eko) {
            eko eko = (eko) obj;
            return TextUtils.equals(this.a, eko.a) && TextUtils.equals(this.b, eko.b) && this.c == eko.c && this.d == eko.d && this.e == eko.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Long.valueOf(this.e)});
    }
}
