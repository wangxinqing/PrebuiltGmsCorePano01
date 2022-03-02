package com.google.android.gms.nearby.messages.ble;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uzw();
    public final int a;
    public final ParcelUuid b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    public final byte[] h;
    public final byte[] i;

    public BleFilter(int i2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4) {
        this.a = i2;
        this.b = parcelUuid;
        this.c = parcelUuid2;
        this.d = parcelUuid3;
        this.e = bArr;
        this.f = bArr2;
        this.g = i3;
        this.h = bArr3;
        this.i = bArr4;
    }

    public static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (bArr3[i2] != bArr[i2]) {
                    return false;
                }
            }
            return true;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b2 = bArr2[i3];
            if ((bArr3[i3] & b2) != (b2 & bArr[i3])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleFilter bleFilter = (BleFilter) obj;
            return this.g == bleFilter.g && Arrays.equals(this.h, bleFilter.h) && Arrays.equals(this.i, bleFilter.i) && ius.a(this.d, bleFilter.d) && Arrays.equals(this.e, bleFilter.e) && Arrays.equals(this.f, bleFilter.f) && ius.a(this.b, bleFilter.b) && ius.a(this.c, bleFilter.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 4, this.b, i2, false);
        ivx.a(parcel, 5, this.c, i2, false);
        ivx.a(parcel, 6, this.d, i2, false);
        ivx.a(parcel, 7, this.e, false);
        ivx.a(parcel, 8, this.f, false);
        ivx.b(parcel, 9, this.g);
        ivx.a(parcel, 10, this.h, false);
        ivx.a(parcel, 11, this.i, false);
        ivx.b(parcel, a2);
    }
}
