package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.quake.ShakeEvent;
import com.google.android.location.quake.ShakeVettingHints;

/* renamed from: ajfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ShakeEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ShakeVettingHints shakeVettingHints = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                j = ivw.i(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                shakeVettingHints = (ShakeVettingHints) ivw.a(parcel, readInt, ShakeVettingHints.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ShakeEvent(j, shakeVettingHints);
    }
}
