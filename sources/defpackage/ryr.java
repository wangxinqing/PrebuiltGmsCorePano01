package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.SyncSubPolicy;

/* renamed from: ryr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ryr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncSubPolicy[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                z = ivw.c(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SyncSubPolicy(z, i);
    }
}