package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.accountsettings.utils.ButtonConfig;

/* renamed from: diu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class diu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ButtonConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ButtonConfig(parcel.readString(), parcel.readInt(), parcel.readBundle(getClass().getClassLoader()));
    }
}
