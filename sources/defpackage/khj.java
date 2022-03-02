package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.auth.AppIdentity;

/* renamed from: khj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppIdentity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (parcel.readByte() == 1) {
            return AppIdentity.a;
        }
        return AppIdentity.a(parcel.readString(), parcel.readString());
    }
}
