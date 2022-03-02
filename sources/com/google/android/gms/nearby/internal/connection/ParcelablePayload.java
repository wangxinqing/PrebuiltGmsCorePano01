package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ParcelablePayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uim();
    public long a;
    public int b;
    public byte[] c;
    public ParcelFileDescriptor d;
    public String e;
    public long f;
    public ParcelFileDescriptor g;
    public Uri h;

    public ParcelablePayload() {
        this.f = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelablePayload) {
            ParcelablePayload parcelablePayload = (ParcelablePayload) obj;
            return ius.a(Long.valueOf(this.a), Long.valueOf(parcelablePayload.a)) && ius.a(Integer.valueOf(this.b), Integer.valueOf(parcelablePayload.b)) && Arrays.equals(this.c, parcelablePayload.c) && ius.a(this.d, parcelablePayload.d) && ius.a(this.e, parcelablePayload.e) && ius.a(Long.valueOf(this.f), Long.valueOf(parcelablePayload.f)) && ius.a(this.g, parcelablePayload.g) && ius.a(this.h, parcelablePayload.h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, Long.valueOf(this.f), this.g, this.h});
    }

    public ParcelablePayload(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri) {
        this.a = j;
        this.b = i;
        this.c = bArr;
        this.d = parcelFileDescriptor;
        this.e = str;
        this.f = j2;
        this.g = parcelFileDescriptor2;
        this.h = uri;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g, i, false);
        ivx.a(parcel, 8, this.h, i, false);
        ivx.b(parcel, a2);
    }
}
