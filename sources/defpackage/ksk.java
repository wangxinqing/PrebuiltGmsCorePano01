package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

/* renamed from: ksk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChangesAvailableEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ChangesAvailableOptions changesAvailableOptions = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 3) {
                ivw.b(parcel, readInt);
            } else {
                changesAvailableOptions = (ChangesAvailableOptions) ivw.a(parcel, readInt, ChangesAvailableOptions.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ChangesAvailableEvent(changesAvailableOptions);
    }
}
