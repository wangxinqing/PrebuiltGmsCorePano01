package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import java.util.ArrayList;

/* renamed from: jxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InterestUpdateBatchImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, InterestUpdateBatchImpl.Operation.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new InterestUpdateBatchImpl(arrayList);
    }
}
