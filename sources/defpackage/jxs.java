package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: jxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimeFilterImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                arrayList = ivw.c(parcel, readInt, TimeFilterImpl.Interval.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                iArr = ivw.w(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new TimeFilterImpl(arrayList, iArr);
    }
}
