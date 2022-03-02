package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.internal.GetPermissionsResponse;
import java.util.ArrayList;

/* renamed from: kwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPermissionsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                arrayList = ivw.c(parcel, readInt, Permission.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetPermissionsResponse(arrayList, i);
    }
}
