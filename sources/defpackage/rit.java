package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.ReplaySignal;

/* renamed from: rit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rit implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReplaySignal[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class cls = (Class) parcel.readSerializable();
        return new ReplaySignal(parcel.readParcelable(cls.getClassLoader()), parcel.readLong(), cls);
    }
}
