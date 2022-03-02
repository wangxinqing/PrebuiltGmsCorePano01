package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: akrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrj {
    public final String a;
    public final LatLng b;
    public final float c;
    public final Collection d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;

    public akrj(LatLng latLng, float f2) {
        this(latLng, f2, -1, 0, (String) null, false, Collections.emptySet());
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj instanceof akrj) {
            akrj akrj = (akrj) obj;
            if ((this.g != null || akrj.g == null) && this.a.equals(akrj.a) && this.b.equals(akrj.b) && this.c == akrj.c && this.e == akrj.e && this.f == akrj.f && ((((str = this.g) == null && akrj.g == null) || str.equals(akrj.g)) && this.h == akrj.h && this.d.equals(akrj.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.e), this.g, Boolean.valueOf(this.h), this.d});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("id", this.a);
        a2.a("latLng", this.b);
        a2.a("radiusMeters", Float.valueOf(this.c));
        a2.a("loiteringTimeMillis", Integer.valueOf(this.e));
        a2.a("radiusType", Integer.valueOf(this.f));
        a2.a("chainName", this.g);
        a2.a("hasBeacon", Boolean.valueOf(this.h));
        a2.a("place types", this.d);
        return a2.toString();
    }

    public akrj(LatLng latLng, float f2, int i, int i2, String str, boolean z, Collection collection) {
        this.a = jhy.b(ByteBuffer.allocate(28).putDouble(latLng.a).putDouble(latLng.b).putFloat(f2).putInt(i).putInt(i2).array());
        this.c = f2;
        this.b = latLng;
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = z;
        this.d = collection;
    }
}
