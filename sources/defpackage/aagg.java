package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;

/* renamed from: aagg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aagg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAppIndexingPackagesCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
            } else if (a == 2) {
                strArr = ivw.A(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                strArr2 = ivw.A(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetAppIndexingPackagesCall$Response(status, strArr, strArr2);
    }
}
