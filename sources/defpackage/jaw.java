package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import java.util.ArrayList;

/* renamed from: jaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jaw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FieldMappingDictionary.Entry[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, FieldMappingDictionary.FieldMapPair.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new FieldMappingDictionary.Entry(i, str, arrayList);
    }
}
