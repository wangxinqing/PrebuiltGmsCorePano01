package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* renamed from: zzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zzm implements Parcelable.Creator {
    public static void a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 2, safeBrowsingData.a, false);
        ivx.a(parcel, 3, safeBrowsingData.b, i, false);
        ivx.a(parcel, 4, safeBrowsingData.c, i, false);
        ivx.a(parcel, 5, safeBrowsingData.d);
        ivx.a(parcel, 6, safeBrowsingData.e, false);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                dataHolder = (DataHolder) ivw.a(parcel, readInt, DataHolder.CREATOR);
            } else if (a == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) ivw.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (a == 5) {
                j = ivw.i(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                bArr = ivw.t(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
