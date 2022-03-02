package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DriveServiceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kvq();
    final IBinder a;

    public DriveServiceResponse(IBinder iBinder) {
        this.a = iBinder;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [itp, android.os.IBinder] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DriveServiceResponse(defpackage.itp r1) {
        /*
            r0 = this;
            r1.asBinder()
            r0.<init>((android.os.IBinder) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.internal.DriveServiceResponse.<init>(itp):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.b(parcel, a2);
    }
}
