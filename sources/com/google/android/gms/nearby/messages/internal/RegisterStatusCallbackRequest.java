package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vdq();
    final int a;
    public final vci b;
    public boolean c;
    @Deprecated
    public String d;
    @Deprecated
    public final ClientAppContext e;
    public final vcn f;

    public RegisterStatusCallbackRequest(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        vci vci;
        vcn vcn;
        this.a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            vci = queryLocalInterface instanceof vci ? (vci) queryLocalInterface : new vcg(iBinder);
        } else {
            vci = null;
        }
        this.b = vci;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            vcn = queryLocalInterface2 instanceof vcn ? (vcn) queryLocalInterface2 : new vcn(iBinder2);
        } else {
            vcn = null;
        }
        this.f = vcn;
        this.c = z;
        this.d = str;
        this.e = ClientAppContext.a(clientAppContext, (String) null, str, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b.asBinder());
        ivx.a(parcel, 3, this.f.a);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, i, false);
        ivx.b(parcel, a2);
    }
}
