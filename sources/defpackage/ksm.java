package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.ArrayList;

/* renamed from: ksm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChangesAvailableOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                z = ivw.c(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, DriveSpace.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ChangesAvailableOptions(i, z, arrayList);
    }
}
