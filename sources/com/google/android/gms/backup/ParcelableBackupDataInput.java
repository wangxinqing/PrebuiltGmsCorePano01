package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableBackupDataInput extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new gsw();
    public final ParcelFileDescriptor a;

    public ParcelableBackupDataInput(ParcelFileDescriptor parcelFileDescriptor) {
        iva.a((Object) parcelFileDescriptor);
        this.a = parcelFileDescriptor;
    }

    public final void close() {
        this.a.close();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
