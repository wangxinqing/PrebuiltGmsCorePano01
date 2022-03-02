package defpackage;

import java.util.Arrays;

/* renamed from: jzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzz implements jzy {
    public final int a;
    public final boolean b;
    public final int c;

    public jzz(int i, boolean z, int i2) {
        this.a = i;
        this.b = z;
        this.c = i2;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jzz jzz = (jzz) obj;
            return jzz.a == this.a && jzz.b == this.b && jzz.c == this.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return String.format("NetworkPreference: %s, IsRoamingAllowed %s, BatteryUsagePreference %s", new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c)});
    }
}
