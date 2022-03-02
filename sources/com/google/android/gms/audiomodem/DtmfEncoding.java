package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DtmfEncoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new edq();
    public static final float[] a = {740.0f, 830.622f, 932.342f, 1108.75f, 1244.53f, 1480.0f, 1661.24f, 1864.68f, 2217.49f, 2489.05f};
    public static final AdsrParams b = new ecd().a();
    public final int c;
    public final boolean d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final AdsrParams j;
    private final float[] k;

    public DtmfEncoding(int i2, boolean z, float f2, int i3, int i4, int i5, int i6, AdsrParams adsrParams, float[] fArr) {
        this.c = i2;
        this.d = z;
        this.e = f2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = adsrParams;
        this.k = fArr;
    }

    public final AdsrParams a() {
        AdsrParams adsrParams = this.j;
        return adsrParams == null ? b : adsrParams;
    }

    public final float[] b() {
        float[] fArr = this.k;
        return fArr == null ? a : fArr;
    }

    public final int c() {
        return this.c + this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DtmfEncoding) {
            DtmfEncoding dtmfEncoding = (DtmfEncoding) obj;
            return this.c == dtmfEncoding.c && this.d == dtmfEncoding.d && this.e == dtmfEncoding.e && this.f == dtmfEncoding.f && this.g == dtmfEncoding.g && this.h == dtmfEncoding.h && this.i == dtmfEncoding.i && ius.a(a(), dtmfEncoding.a()) && ius.a(b(), dtmfEncoding.b());
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Boolean.valueOf(this.d), Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d);
        ivx.a(parcel, 4, this.e);
        ivx.b(parcel, 5, this.f);
        ivx.b(parcel, 6, this.g);
        ivx.b(parcel, 7, this.h);
        ivx.b(parcel, 8, this.i);
        ivx.a(parcel, 9, a(), i2, false);
        ivx.a(parcel, 10, b(), false);
        ivx.b(parcel, a2);
    }
}
