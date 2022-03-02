package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chromesync.ChromeSyncState;

/* renamed from: hie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hie implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChromeSyncState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        PendingIntent pendingIntent = null;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                z = ivw.c(parcel, readInt);
            } else if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                pendingIntent = (PendingIntent) ivw.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                z2 = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ChromeSyncState(z, i, pendingIntent, z2);
    }
}
