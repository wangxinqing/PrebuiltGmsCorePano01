package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.aidlrequests.ReloadAidlRequest;

/* renamed from: apob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apob implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReloadAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ReloadAidlRequest(str);
    }
}
