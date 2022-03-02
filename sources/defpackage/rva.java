package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;

/* renamed from: rva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rva implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    latLng = (LatLng) ivw.a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = ivw.n(parcel2, readInt);
                    break;
                case 4:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 5:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 8:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    arrayList = ivw.c(parcel2, readInt, PatternItem.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }
}
