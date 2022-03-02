package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FieldMappingDictionary;

/* renamed from: jau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jau implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FieldMappingDictionary.FieldMapPair[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        FastJsonResponse$Field fastJsonResponse$Field = null;
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
                fastJsonResponse$Field = (FastJsonResponse$Field) ivw.a(parcel, readInt, (Parcelable.Creator) FastJsonResponse$Field.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new FieldMappingDictionary.FieldMapPair(i, str, fastJsonResponse$Field);
    }
}
