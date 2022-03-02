package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rcw();
    public static final float[] a = {Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    final float[] b = new float[4];
    public int c = -1;
    public int d = -1;
    float e = Float.NaN;
    float f = Float.NaN;
    public long g = 0;
    public byte h = 0;

    public DeviceOrientation() {
    }

    private static void b(float[] fArr) {
        if (fArr.length != 4) {
            throw new IllegalArgumentException("Input attitude array should be of length 4.");
        }
    }

    public final int a() {
        if (b()) {
            return this.c;
        }
        return -1;
    }

    public final void a(float f2) {
        this.e = f2;
        this.h = (byte) (this.h | 4);
    }

    public final void b(float f2) {
        this.f = f2;
        this.h = (byte) (this.h | 8);
    }

    public final boolean b() {
        return (this.h & 1) != 0;
    }

    public final int c() {
        if (d()) {
            return this.d;
        }
        return -1;
    }

    public final boolean d() {
        return (this.h & 2) != 0;
    }

    public final float e() {
        if (f()) {
            return this.e;
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        if (this.h != deviceOrientation.h || ((b() && this.c != deviceOrientation.c) || ((d() && this.d != deviceOrientation.d) || ((f() && this.e != deviceOrientation.e) || ((h() && this.f != deviceOrientation.f) || this.g != deviceOrientation.g || (i() && !Arrays.equals(this.b, deviceOrientation.b))))))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        return (this.h & 4) != 0;
    }

    public final float g() {
        if (h()) {
            return this.f;
        }
        return Float.NaN;
    }

    public final boolean h() {
        return (this.h & 8) != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Long.valueOf(this.g), this.b, Byte.valueOf(this.h)});
    }

    public final boolean i() {
        return (this.h & 16) != 0;
    }

    public final void j() {
        this.c = -1;
        this.d = -1;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = 0;
        float[] fArr = a;
        float[] fArr2 = this.b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        this.h = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation{");
        if (i()) {
            String valueOf = String.valueOf(Arrays.toString(this.b));
            sb.append(valueOf.length() == 0 ? new String("mAttitude=") : "mAttitude=".concat(valueOf));
        }
        if (b()) {
            int i = this.c;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append(", mAttitudeConfidence=");
            sb2.append(i);
            sb.append(sb2.toString());
        }
        if (d()) {
            int i2 = this.d;
            StringBuilder sb3 = new StringBuilder(28);
            sb3.append(", mMagConfidence=");
            sb3.append(i2);
            sb.append(sb3.toString());
        }
        if (f()) {
            float f2 = this.e;
            StringBuilder sb4 = new StringBuilder(33);
            sb4.append(", mHeadingDegrees=");
            sb4.append(f2);
            sb.append(sb4.toString());
        }
        if (h()) {
            float f3 = this.f;
            StringBuilder sb5 = new StringBuilder(38);
            sb5.append(", mHeadingErrorDegrees=");
            sb5.append(f3);
            sb.append(sb5.toString());
        }
        long j = this.g;
        StringBuilder sb6 = new StringBuilder(42);
        sb6.append(", mElapsedRealtimeNs=");
        sb6.append(j);
        sb6.append('}');
        sb.append(sb6.toString());
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, !i() ? a : this.b, false);
        ivx.b(parcel, 2, a());
        ivx.b(parcel, 3, c());
        ivx.a(parcel, 4, e());
        ivx.a(parcel, 5, g());
        ivx.a(parcel, 6, this.g);
        ivx.a(parcel, 7, this.h);
        ivx.b(parcel, a2);
    }

    public DeviceOrientation(float[] fArr, int i, int i2, float f2, float f3, long j, byte b2) {
        b(fArr);
        System.arraycopy(fArr, 0, this.b, 0, fArr.length);
        this.c = i;
        this.d = i2;
        this.e = f2;
        this.f = f3;
        this.g = j;
        this.h = b2;
    }

    public final void a(float[] fArr) {
        b(fArr);
        System.arraycopy(fArr, 0, this.b, 0, fArr.length);
        this.h = (byte) (this.h | 16);
    }
}
