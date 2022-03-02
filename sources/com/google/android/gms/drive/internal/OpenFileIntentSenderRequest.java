package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxf();
    public final String a;
    public final String[] b;
    public final DriveId c;
    public final FilterHolder d;

    public OpenFileIntentSenderRequest(String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this.a = str;
        this.b = strArr;
        this.c = driveId;
        this.d = filterHolder;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
