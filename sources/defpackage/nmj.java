package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.PopupLocationInfoParcelable;

/* renamed from: nmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nmj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PopupLocationInfoParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Bundle bundle = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                bundle = ivw.s(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                iBinder = ivw.r(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PopupLocationInfoParcelable(bundle, iBinder);
    }
}
