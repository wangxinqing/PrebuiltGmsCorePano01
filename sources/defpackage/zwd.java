package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;

/* renamed from: zwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RestoreInfoEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Long l = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                l = ivw.j(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new RestoreInfoEntity(str, l);
    }
}
