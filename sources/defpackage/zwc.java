package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.romanesco.protomodel.EmailAddressEntity;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;

/* renamed from: zwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RawContactEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 4) {
                arrayList = ivw.c(parcel, readInt, EmailAddressEntity.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                arrayList2 = ivw.c(parcel, readInt, PhoneNumberEntity.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new RawContactEntity(str, arrayList, arrayList2);
    }
}
