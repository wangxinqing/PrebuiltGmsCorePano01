package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vca();
    final int a;
    public final vci b;
    @Deprecated
    public final String c;
    @Deprecated
    public final ClientAppContext d;

    public GetPermissionStatusRequest(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        vci vci;
        this.a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            vci = queryLocalInterface instanceof vci ? (vci) queryLocalInterface : new vcg(iBinder);
        } else {
            vci = null;
        }
        this.b = vci;
        this.c = str;
        this.d = ClientAppContext.a(clientAppContext, (String) null, str, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b.asBinder());
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
