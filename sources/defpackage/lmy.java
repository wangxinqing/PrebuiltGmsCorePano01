package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.realtime.internal.event.ObjectChangedDetails;

/* renamed from: lmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ObjectChangedDetails[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                i2 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ObjectChangedDetails(i, i2);
    }
}
