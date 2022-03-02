package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails;

/* renamed from: lnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ValuesAddedDetails[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 4) {
                i3 = ivw.g(parcel, readInt);
            } else if (a == 5) {
                str = ivw.q(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                i4 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ValuesAddedDetails(i, i2, i3, str, i4);
    }
}
