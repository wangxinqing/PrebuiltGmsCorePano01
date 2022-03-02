package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnPinnedDownloadPreferencesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kwz();
    public final ParcelableTransferPreferences a;

    public OnPinnedDownloadPreferencesResponse(ParcelableTransferPreferences parcelableTransferPreferences) {
        this.a = parcelableTransferPreferences;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
