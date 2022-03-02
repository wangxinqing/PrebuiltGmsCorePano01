package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.auth.CallingAppInfo;

/* renamed from: khr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CallingAppInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CallingAppInfo(parcel.readString(), parcel.readString(), parcel.readInt());
    }
}
