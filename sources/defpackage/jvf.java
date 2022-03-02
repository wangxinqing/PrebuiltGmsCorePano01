package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import java.util.ArrayList;

/* renamed from: jvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jvf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FenceStateImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                j = ivw.i(parcel, readInt);
            } else if (a == 4) {
                str = ivw.q(parcel, readInt);
            } else if (a == 5) {
                i2 = ivw.g(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, ContextData.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new FenceStateImpl(i, j, str, i2, arrayList);
    }
}
