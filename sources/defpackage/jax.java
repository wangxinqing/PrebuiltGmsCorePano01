package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.server.response.SafeParcelResponse;

/* renamed from: jax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jax implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Parcel parcel2 = null;
        FieldMappingDictionary fieldMappingDictionary = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                parcel2 = ivw.D(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                fieldMappingDictionary = (FieldMappingDictionary) ivw.a(parcel, readInt, FieldMappingDictionary.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SafeParcelResponse(i, parcel2, fieldMappingDictionary);
    }
}
