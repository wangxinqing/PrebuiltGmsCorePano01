package defpackage;

import java.util.Arrays;
import java.util.Set;

/* renamed from: akrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrf {
    public final Set a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;

    public akrf(Set set, int i, int i2, int i3, String str, boolean z) {
        this.a = set;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akrf) {
            akrf akrf = (akrf) obj;
            if (ius.a(this.a, akrf.a) && this.b == akrf.b && this.c == akrf.c && this.d == akrf.d && ius.a(this.e, akrf.e) && this.f == akrf.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f)});
    }
}
