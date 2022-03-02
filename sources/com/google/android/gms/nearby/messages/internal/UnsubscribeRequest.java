package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vdw();
    final int a;
    public final vcf b;
    public final vci c;
    public final PendingIntent d;
    @Deprecated
    public final int e;
    @Deprecated
    public final String f;
    @Deprecated
    public final String g;
    @Deprecated
    public final boolean h;
    @Deprecated
    public final ClientAppContext i;

    public UnsubscribeRequest(int i2, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i3, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        vcf vcf;
        this.a = i2;
        vci vci = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            vcf = queryLocalInterface instanceof vcf ? (vcf) queryLocalInterface : new vcd(iBinder);
        } else {
            vcf = null;
        }
        this.b = vcf;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface2 instanceof vci) {
                vci = (vci) queryLocalInterface2;
            } else {
                vci = new vcg(iBinder2);
            }
        }
        this.c = vci;
        this.d = pendingIntent;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = ClientAppContext.a(clientAppContext, str2, str, z);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        vcf vcf = this.b;
        if (vcf != null) {
            iBinder = vcf.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 2, iBinder);
        ivx.a(parcel, 3, this.c.asBinder());
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.b(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i, i2, false);
        ivx.b(parcel, a2);
    }

    public UnsubscribeRequest(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, (String) null, (String) null, false, (ClientAppContext) null);
    }
}
