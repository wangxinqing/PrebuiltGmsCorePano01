package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.ArrayList;

/* renamed from: rvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    arrayList = ivw.c(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 4:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    cap = (Cap) ivw.a(parcel2, readInt, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) ivw.a(parcel2, readInt, Cap.CREATOR);
                    break;
                case 11:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 12:
                    arrayList2 = ivw.c(parcel2, readInt, PatternItem.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2);
    }
}
