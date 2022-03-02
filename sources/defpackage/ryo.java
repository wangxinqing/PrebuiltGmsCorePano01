package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncSubPolicy;

/* renamed from: ryo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ryo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncPolicy[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SyncSubPolicy syncSubPolicy = null;
        SyncSubPolicy syncSubPolicy2 = null;
        SyncSubPolicy syncSubPolicy3 = null;
        SyncSubPolicy syncSubPolicy4 = null;
        Integer num = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    syncSubPolicy = (SyncSubPolicy) ivw.a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 3:
                    syncSubPolicy2 = (SyncSubPolicy) ivw.a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 4:
                    syncSubPolicy3 = (SyncSubPolicy) ivw.a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 5:
                    syncSubPolicy4 = (SyncSubPolicy) ivw.a(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 6:
                    num = ivw.h(parcel, readInt);
                    break;
                case 7:
                    z = ivw.c(parcel, readInt);
                    break;
                case 8:
                    z2 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new SyncPolicy(i, syncSubPolicy, syncSubPolicy2, syncSubPolicy3, syncSubPolicy4, num, z, z2);
    }
}
