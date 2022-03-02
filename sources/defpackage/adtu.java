package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.Position;

/* renamed from: adtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckInReport[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Position position = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                j = ivw.i(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                position = (Position) ivw.a(parcel, readInt, Position.CREATOR);
            } else if (a == 5) {
                i = ivw.g(parcel, readInt);
            } else if (a == 6) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 7) {
                ivw.b(parcel, readInt);
            } else {
                bArr2 = ivw.u(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new CheckInReport(j, str, position, i, bArr, bArr2);
    }
}
