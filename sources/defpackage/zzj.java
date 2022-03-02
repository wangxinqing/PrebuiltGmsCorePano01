package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: zzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zzj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HarmfulAppsInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HarmfulAppsData[] harmfulAppsDataArr = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                j = ivw.i(parcel, readInt);
            } else if (a == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) ivw.b(parcel, readInt, HarmfulAppsData.CREATOR);
            } else if (a == 4) {
                i = ivw.g(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new HarmfulAppsInfo(j, harmfulAppsDataArr, i, z);
    }
}
