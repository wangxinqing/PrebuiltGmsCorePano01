package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;

/* renamed from: rvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    arrayList2 = ivw.c(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    ivw.a(parcel, readInt, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    f = ivw.l(parcel, readInt);
                    break;
                case 5:
                    i = ivw.g(parcel, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 7:
                    f2 = ivw.l(parcel, readInt);
                    break;
                case 8:
                    z = ivw.c(parcel, readInt);
                    break;
                case 9:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 10:
                    z3 = ivw.c(parcel, readInt);
                    break;
                case 11:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 12:
                    arrayList3 = ivw.c(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, arrayList3);
    }
}
