package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.ProviderSendParams;

/* renamed from: vzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vzv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ProviderSendParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ShareTarget shareTarget = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                shareTarget = (ShareTarget) ivw.a(parcel, readInt, ShareTarget.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                iBinder = ivw.r(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ProviderSendParams(str, shareTarget, iBinder);
    }
}
