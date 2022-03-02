package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;

/* renamed from: jyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChangeSequenceNumber[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                j = ivw.i(parcel, readInt);
            } else if (a == 3) {
                j2 = ivw.i(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                j3 = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ChangeSequenceNumber(j, j2, j3);
    }
}
