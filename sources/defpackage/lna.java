package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
import java.util.ArrayList;

/* renamed from: lna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lna implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableEventList[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        DataHolder dataHolder = null;
        ArrayList arrayList2 = null;
        ParcelableChangeInfo parcelableChangeInfo = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                arrayList = ivw.c(parcel, readInt, ParcelableEvent.CREATOR);
            } else if (a == 3) {
                dataHolder = (DataHolder) ivw.a(parcel, readInt, DataHolder.CREATOR);
            } else if (a == 4) {
                z = ivw.c(parcel, readInt);
            } else if (a == 5) {
                arrayList2 = ivw.C(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                parcelableChangeInfo = (ParcelableChangeInfo) ivw.a(parcel, readInt, ParcelableChangeInfo.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ParcelableEventList(arrayList, dataHolder, z, arrayList2, parcelableChangeInfo);
    }
}
