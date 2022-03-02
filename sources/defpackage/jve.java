package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;

/* renamed from: jve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jve implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FenceQueryRequestImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        FenceQueryRequestImpl.QueryFenceOperation queryFenceOperation = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                queryFenceOperation = (FenceQueryRequestImpl.QueryFenceOperation) ivw.a(parcel, readInt, FenceQueryRequestImpl.QueryFenceOperation.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new FenceQueryRequestImpl(queryFenceOperation);
    }
}
