package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import java.util.ArrayList;

/* renamed from: rkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceExtendedDetailsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        String str = null;
        Uri uri = null;
        float f = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.B(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
            } else if (a == 4) {
                f = ivw.l(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PlaceExtendedDetailsEntity(arrayList, str, uri, f, i);
    }
}
