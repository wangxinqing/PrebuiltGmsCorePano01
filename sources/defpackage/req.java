package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsConfiguration;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

/* renamed from: req  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class req implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        LocationSettingsConfiguration locationSettingsConfiguration = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.c(parcel, readInt, LocationRequest.CREATOR);
            } else if (a == 2) {
                z = ivw.c(parcel, readInt);
            } else if (a == 3) {
                z2 = ivw.c(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                locationSettingsConfiguration = (LocationSettingsConfiguration) ivw.a(parcel, readInt, LocationSettingsConfiguration.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, locationSettingsConfiguration);
    }
}
