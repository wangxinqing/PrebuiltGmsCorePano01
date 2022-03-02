package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.AnalyticsUserProperty;
import com.google.android.gms.config.internal.FetchConfigIpcRequest;
import java.util.ArrayList;

/* renamed from: jol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jol implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FetchConfigIpcRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        DataHolder dataHolder = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    dataHolder = (DataHolder) ivw.a(parcel2, readInt, DataHolder.CREATOR);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 9:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 10:
                    arrayList2 = ivw.c(parcel2, readInt, AnalyticsUserProperty.CREATOR);
                    break;
                case 11:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 12:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new FetchConfigIpcRequest(str, j, dataHolder, str2, str3, str4, arrayList, i, arrayList2, i2, i3);
    }
}
