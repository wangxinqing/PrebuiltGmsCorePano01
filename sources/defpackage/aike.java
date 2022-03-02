package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.geofencer.data.PendingIntentCacheItem;
import java.util.ArrayList;

/* renamed from: aike  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aike implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PendingIntentCacheItem[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                pendingIntent = (PendingIntent) ivw.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                arrayList = ivw.C(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PendingIntentCacheItem(pendingIntent, str, arrayList, str2);
    }
}
