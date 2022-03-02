package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AtomInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfs();
    public final String a;
    public final String b;
    public final String[] c;
    public final int[] d;
    public final int e;
    public final byte[] f;
    public final boolean g;

    public AtomInfo(String str, String str2, String[] strArr, int[] iArr, int i, byte[] bArr, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = iArr;
        this.e = i;
        this.f = bArr;
        this.g = z;
    }

    private static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AtomInfo) {
            AtomInfo atomInfo = (AtomInfo) obj;
            if (!this.a.equals(atomInfo.a) || this.g != atomInfo.g || !this.b.equals(atomInfo.b) || this.e != atomInfo.e || !Arrays.equals(this.f, atomInfo.f) || !Arrays.equals(this.c, atomInfo.c) || !Arrays.equals(this.d, atomInfo.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((a(this.a) * 961) + a(Boolean.valueOf(this.g))) * 31) + a(this.b)) * 31) + a(Integer.valueOf(this.e))) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 4, this.b, false);
        ivx.a(parcel, 5, this.c, false);
        ivx.b(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.d, false);
        ivx.a(parcel, 9, this.g);
        ivx.b(parcel, a2);
    }
}
