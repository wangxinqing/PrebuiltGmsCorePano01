package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.ParcelableTransferPreferences;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;

/* renamed from: kxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kxl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetPinnedDownloadPreferencesRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ParcelableTransferPreferences parcelableTransferPreferences = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                parcelableTransferPreferences = (ParcelableTransferPreferences) ivw.a(parcel, readInt, ParcelableTransferPreferences.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SetPinnedDownloadPreferencesRequest(parcelableTransferPreferences);
    }
}
