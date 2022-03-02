package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;

/* renamed from: jom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jom implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FetchConfigIpcResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DataHolder dataHolder = null;
        DataHolder dataHolder2 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                dataHolder = (DataHolder) ivw.a(parcel, readInt, DataHolder.CREATOR);
            } else if (a == 4) {
                j = ivw.i(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                dataHolder2 = (DataHolder) ivw.a(parcel, readInt, DataHolder.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new FetchConfigIpcResponse(i, dataHolder, j, dataHolder2);
    }
}
