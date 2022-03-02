package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class D2dOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gea();
    public final boolean a;
    public final boolean b;

    public D2dOptions() {
        this(false, false);
    }

    public static D2dOptions a(Bundle bundle) {
        if (bundle != null) {
            return a(bundle.getByteArray("d2d_options"));
        }
        return new D2dOptions();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D2dOptions) {
            D2dOptions d2dOptions = (D2dOptions) obj;
            if (this.a == d2dOptions.a && this.b == d2dOptions.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public D2dOptions(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }

    public static D2dOptions a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new D2dOptions();
        }
        return (D2dOptions) ivy.a(bArr, CREATOR);
    }
}
