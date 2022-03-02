package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FileUploadPreferencesImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kvv();
    int a;
    int b;
    public boolean c;

    public FileUploadPreferencesImpl(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final int a() {
        int i = this.a;
        if (i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    public final int b() {
        int i = this.b;
        if (i == 256 || i == 257) {
            return i;
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
