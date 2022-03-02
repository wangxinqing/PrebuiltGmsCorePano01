package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSettings;
import java.util.ArrayList;

/* renamed from: gtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleSettings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        WorkSource workSource = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 4) {
                j = ivw.i(parcel, readInt);
            } else if (a == 6) {
                arrayList = ivw.c(parcel, readInt, BleFilter.CREATOR);
            } else if (a == 7) {
                workSource = (WorkSource) ivw.a(parcel, readInt, WorkSource.CREATOR);
            } else if (a != 8) {
                ivw.b(parcel, readInt);
            } else {
                i3 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new BleSettings(i, i2, j, arrayList, workSource, i3);
    }
}
