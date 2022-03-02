package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.rocket.impressions.Session;

/* renamed from: agyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agyi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Session[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Session(parcel);
    }
}
