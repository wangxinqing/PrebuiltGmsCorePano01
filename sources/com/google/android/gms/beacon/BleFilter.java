package com.google.android.gms.beacon;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gtg();
    public final String a;
    public final String b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final ParcelUuid e;
    public final byte[] f;
    public final byte[] g;
    public final int h;
    public final byte[] i;
    public final byte[] j;

    public BleFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.a = str;
        this.c = parcelUuid;
        this.d = parcelUuid2;
        this.b = str2;
        this.e = parcelUuid3;
        this.f = bArr;
        this.g = bArr2;
        this.h = i2;
        this.i = bArr3;
        this.j = bArr4;
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
            return ius.a(this.a, bleFilter.a) && ius.a(this.b, bleFilter.b) && this.h == bleFilter.h && Arrays.equals(this.i, bleFilter.i) && Arrays.equals(this.j, bleFilter.j) && ius.a(this.e, bleFilter.e) && Arrays.equals(this.f, bleFilter.f) && Arrays.equals(this.g, bleFilter.g) && ius.a(this.c, bleFilter.c) && ius.a(this.d, bleFilter.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), this.e, Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), this.c, this.d});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String arrays = Arrays.toString(this.f);
        String arrays2 = Arrays.toString(this.g);
        int i2 = this.h;
        String arrays3 = Arrays.toString(this.i);
        String arrays4 = Arrays.toString(this.j);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(arrays).length();
        int length7 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 177 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("BleFilter [deviceName=");
        sb.append(str);
        sb.append(", deviceAddress=");
        sb.append(str2);
        sb.append(", uuid=");
        sb.append(valueOf);
        sb.append(", uuidMask=");
        sb.append(valueOf2);
        sb.append(", serviceDataUuid=");
        sb.append(valueOf3);
        sb.append(", serviceData=");
        sb.append(arrays);
        sb.append(", serviceDataMask=");
        sb.append(arrays2);
        sb.append(", manufacturerId=");
        sb.append(i2);
        sb.append(", manufacturerData=");
        sb.append(arrays3);
        sb.append(", manufacturerDataMask=");
        sb.append(arrays4);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d, i2, false);
        ivx.a(parcel, 6, this.e, i2, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.b(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i, false);
        ivx.a(parcel, 11, this.j, false);
        ivx.b(parcel, a2);
    }
}
