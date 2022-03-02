package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vdp();
    final int a;
    public final MessageWrapper b;
    public final Strategy c;
    public final vci d;
    @Deprecated
    public final String e;
    @Deprecated
    public final String f;
    @Deprecated
    public final boolean g;
    @Deprecated
    public final boolean h;
    @Deprecated
    public final ClientAppContext i;
    public final int j;
    public final vcm k;

    public PublishRequest(int i2, MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i3) {
        vci vci;
        this.a = i2;
        this.b = messageWrapper;
        this.c = strategy;
        vcm vcm = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            vci = queryLocalInterface instanceof vci ? (vci) queryLocalInterface : new vcg(iBinder);
        } else {
            vci = null;
        }
        this.d = vci;
        this.e = str;
        this.f = str2;
        this.g = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            if (queryLocalInterface2 instanceof vcm) {
                vcm = (vcm) queryLocalInterface2;
            } else {
                vcm = new vcm(iBinder2);
            }
        }
        this.k = vcm;
        this.h = z2;
        this.i = ClientAppContext.a(clientAppContext, str2, str, z2);
        this.j = i3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i2, false);
        ivx.a(parcel, 3, this.c, i2, false);
        ivx.a(parcel, 4, this.d.asBinder());
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g);
        vcm vcm = this.k;
        if (vcm != null) {
            iBinder = vcm.a;
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 8, iBinder);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i, i2, false);
        ivx.b(parcel, 11, this.j);
        ivx.b(parcel, a2);
    }
}
