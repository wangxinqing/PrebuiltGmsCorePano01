package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;

/* renamed from: aahr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aahr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeleteUsageReportCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new DeleteUsageReportCall$Response(status);
    }
}
