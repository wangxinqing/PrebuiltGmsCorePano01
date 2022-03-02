package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;

/* renamed from: aagk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aagk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetStorageStatsCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
            } else if (a == 2) {
                getStorageStatsCall$PackageStatsArr = (GetStorageStatsCall$PackageStats[]) ivw.b(parcel, readInt, GetStorageStatsCall$PackageStats.CREATOR);
            } else if (a == 3) {
                j = ivw.i(parcel, readInt);
            } else if (a == 4) {
                j2 = ivw.i(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                j3 = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetStorageStatsCall$Response(status, getStorageStatsCall$PackageStatsArr, j, j2, j3);
    }
}
