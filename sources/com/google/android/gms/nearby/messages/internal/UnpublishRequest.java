package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vdu();
    final int a;
    public final MessageWrapper b;
    public final vci c;
    @Deprecated
    public final String d;
    @Deprecated
    public final String e;
    @Deprecated
    public final boolean f;
    @Deprecated
    public final ClientAppContext g;

    public UnpublishRequest(int i, MessageWrapper messageWrapper, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        vci vci;
        this.a = i;
        this.b = messageWrapper;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            vci = queryLocalInterface instanceof vci ? (vci) queryLocalInterface : new vcg(iBinder);
        } else {
            vci = null;
        }
        this.c = vci;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = ClientAppContext.a(clientAppContext, str2, str, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c.asBinder());
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g, i, false);
        ivx.b(parcel, a2);
    }
}
