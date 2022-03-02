package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.notifications.Identifier;
import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: wjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReadStateUpdate[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        Identifier identifier = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                i2 = ivw.g(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                identifier = (Identifier) ivw.a(parcel, readInt, Identifier.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ReadStateUpdate(i, i2, identifier);
    }
}
