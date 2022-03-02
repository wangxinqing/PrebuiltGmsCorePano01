package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: akrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrs {
    public final akri a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;

    public akrs(akri akri, int i, int i2, String str, boolean z) {
        this.a = akri;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = z;
    }

    public final Collection a() {
        return this.a.e;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof akrs)) {
            akrs akrs = (akrs) obj;
            if (!this.a.a.equals(akrs.a.a) || this.c != akrs.c || this.e != akrs.e || this.b != akrs.b || !ius.a(this.d, akrs.d) || !ius.a(this.a.e, akrs.a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Boolean.valueOf(this.e), this.a.e});
    }
}
