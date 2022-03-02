package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.Position;

/* renamed from: adub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adub implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Position[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                d = ivw.n(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                d2 = ivw.n(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Position(d, d2);
    }
}
