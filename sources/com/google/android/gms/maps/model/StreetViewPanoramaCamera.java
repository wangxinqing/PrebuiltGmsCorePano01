package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rvm();
    public final float a;
    public final float b;
    public final float c;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        iva.b(z, sb.toString());
        this.a = ((double) f) <= 0.0d ? 0.0f : f;
        this.b = 0.0f + f2;
        if (((double) f3) <= 0.0d) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.c = f4 % 360.0f;
        new StreetViewPanoramaOrientation(f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaCamera) {
            StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
            return Float.floatToIntBits(this.a) == Float.floatToIntBits(streetViewPanoramaCamera.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(streetViewPanoramaCamera.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(streetViewPanoramaCamera.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("zoom", Float.valueOf(this.a));
        a2.a("tilt", Float.valueOf(this.b));
        a2.a("bearing", Float.valueOf(this.c));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
