package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: xbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SyncStatus(i, str);
    }
}
