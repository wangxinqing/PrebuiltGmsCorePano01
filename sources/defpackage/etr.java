package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import java.util.ArrayList;

/* renamed from: etr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class etr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountTransferProgress[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    arrayList = ivw.C(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = ivw.C(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = ivw.C(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = ivw.C(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = ivw.C(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AccountTransferProgress(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }
}
