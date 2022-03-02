package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: akrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akrc {
    final int a;
    final int b;
    final String c;
    final boolean d;
    final Collection e;
    final int f;
    final float g;

    public akrc(int i, int i2, String str, boolean z, Collection collection, int i3, float f2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.f = i3;
        this.g = f2;
        this.d = z;
        this.e = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akrc) {
            akrc akrc = (akrc) obj;
            return this.a == akrc.a && this.b == akrc.b && this.f == akrc.f && this.g == akrc.g && this.d == akrc.d && ius.a(this.c, akrc.c) && ius.a(this.e, akrc.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d), this.e, Integer.valueOf(this.f), Float.valueOf(this.g)});
    }
}
