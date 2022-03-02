package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WifiScan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfg();
    public static final long[] a = new long[0];
    public static final int[] b = new int[0];
    public final long c;
    final long[] d;
    final int[] e;
    final int[] f;
    final int[] g;
    final int[] h;
    final int[] i;
    final int[] j;

    public WifiScan(long j2, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.c = j2;
        this.d = jArr == null ? a : jArr;
        this.e = iArr == null ? b : iArr;
        this.f = iArr2 == null ? b : iArr2;
        this.g = iArr3 == null ? b : iArr3;
        this.h = iArr4 == null ? b : iArr4;
        this.i = iArr5 == null ? b : iArr5;
        this.j = iArr6 == null ? b : iArr6;
    }

    public static WifiScan a(Location location) {
        byte[] byteArray;
        Bundle extras = location.getExtras();
        if (extras == null || (byteArray = extras.getByteArray("wifiScan")) == null) {
            return null;
        }
        return a(byteArray);
    }

    private final void i(int i2) {
        if (i2 < 0 || i2 >= a()) {
            int a2 = a();
            StringBuilder sb = new StringBuilder(49);
            sb.append("Index ");
            sb.append(i2);
            sb.append(" out of bounds: [0, ");
            sb.append(a2);
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final byte b(int i2) {
        i(i2);
        return (byte) ((int) ((this.d[i2] & 71776119061217280L) >>> 48));
    }

    public final int c(int i2) {
        i(i2);
        return this.e[i2];
    }

    public final int d(int i2) {
        i(i2);
        int[] iArr = this.f;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return 0;
    }

    public final int e(int i2) {
        i(i2);
        int[] iArr = this.g;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiScan) {
            WifiScan wifiScan = (WifiScan) obj;
            if (wifiScan.c != this.c || !Arrays.equals(wifiScan.d, this.d) || !Arrays.equals(wifiScan.e, this.e) || !Arrays.equals(wifiScan.f, this.f) || !Arrays.equals(wifiScan.g, this.g) || !Arrays.equals(wifiScan.h, this.h) || !Arrays.equals(wifiScan.i, this.i) || !Arrays.equals(wifiScan.j, this.j)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int f(int i2) {
        i(i2);
        int[] iArr = this.h;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return 0;
    }

    public final int g(int i2) {
        i(i2);
        int[] iArr = this.i;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return 0;
    }

    public final int h(int i2) {
        i(i2);
        int[] iArr = this.j;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WifiScan[elapsed rt: ");
        sb.append(this.c);
        int a2 = a();
        for (int i2 = 0; i2 < a2; i2++) {
            sb.append(", Device[mac: ");
            sb.append(a(i2));
            sb.append(", dbm: ");
            sb.append(b(i2));
            sb.append(", mhz: ");
            sb.append(c(i2));
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.c);
        ivx.a(parcel, 2, this.d, false);
        ivx.a(parcel, 3, this.e, false);
        ivx.a(parcel, 4, this.f, false);
        ivx.a(parcel, 5, this.g, false);
        ivx.a(parcel, 6, this.h, false);
        ivx.a(parcel, 7, this.i, false);
        ivx.a(parcel, 8, this.j, false);
        ivx.b(parcel, a2);
    }

    public static WifiScan a(byte[] bArr) {
        return (WifiScan) ivy.a(bArr, CREATOR);
    }

    public final int a() {
        return this.d.length;
    }

    public final long a(int i2) {
        i(i2);
        return this.d[i2] & 281474976710655L;
    }
}
