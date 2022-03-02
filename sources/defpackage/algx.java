package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.setupcompat.logging.MetricKey;

/* renamed from: algx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MetricKey(parcel.readString(), parcel.readString());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MetricKey[i];
    }
}
