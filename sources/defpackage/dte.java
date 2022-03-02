package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdate;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;

/* renamed from: dte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dte implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PIMEUpdateResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        byte[] bArr = null;
        PIMEUpdate[] pIMEUpdateArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                pIMEUpdateArr = (PIMEUpdate[]) ivw.b(parcel, readInt, PIMEUpdate.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new PIMEUpdateResponse(str, bArr, pIMEUpdateArr);
    }
}
