package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdh.SyncStatus;
import java.util.ArrayList;

/* renamed from: ryi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ryi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdhFootprintsReadResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        SyncStatus syncStatus = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.c(parcel, readInt, MdhFootprint.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                syncStatus = (SyncStatus) ivw.a(parcel, readInt, SyncStatus.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new MdhFootprintsReadResult(arrayList, syncStatus);
    }
}
