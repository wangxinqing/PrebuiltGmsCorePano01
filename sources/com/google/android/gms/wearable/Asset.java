package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adyf();
    public byte[] a;
    public String b;
    public ParcelFileDescriptor c;
    public Uri d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = bArr;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Asset) {
            Asset asset = (Asset) obj;
            return Arrays.equals(this.a, asset.a) && ius.a(this.b, asset.b) && ius.a(this.c, asset.c) && ius.a(this.d, asset.d);
        }
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.b == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.b);
        }
        if (this.a != null) {
            sb.append(", size=");
            sb.append(this.a.length);
        }
        if (this.c != null) {
            sb.append(", fd=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(", uri=");
            sb.append(this.d);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        irk.b(parcel);
        int i2 = i | 1;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d, i2, false);
        ivx.b(parcel, a2);
    }
}
