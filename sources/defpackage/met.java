package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;

/* renamed from: met  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class met implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncActivityControlsSettingsInternalResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                bArr = ivw.t(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SyncActivityControlsSettingsInternalResult(bArr);
    }
}
