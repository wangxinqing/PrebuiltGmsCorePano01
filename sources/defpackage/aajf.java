package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;

/* renamed from: aajf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aajf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetGlobalSearchSourcesCall$Request(z);
    }
}
