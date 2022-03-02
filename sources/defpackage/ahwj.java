package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;

/* renamed from: ahwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableSensorScannerConfig(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSensorScannerConfig[i];
    }
}
