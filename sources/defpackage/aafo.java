package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: aafo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aafo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingUserActionInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        long j = 0;
        ActionImpl actionImpl = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                j = ivw.i(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                actionImpl = (ActionImpl) ivw.a(parcel, readInt, ActionImpl.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new AppIndexingUserActionInfo(str, j, actionImpl);
    }
}
