package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.LaunchSettings;

/* renamed from: qeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qeb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LaunchSettings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        while (parcel.dataPosition() < b) {
            ivw.b(parcel, parcel.readInt());
        }
        ivw.E(parcel, b);
        return new LaunchSettings();
    }
}
