package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateFenceOperation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jwb();
    public final int a;
    public final ContextFenceRegistrationStub b;
    public jvm c;
    public final grc d;
    public final PendingIntent e;
    public final String f;
    public final long g;
    public final long h;

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, IBinder iBinder, PendingIntent pendingIntent, String str, long j, long j2) {
        jvm jvm;
        this.a = i;
        this.b = contextFenceRegistrationStub;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            jvm = queryLocalInterface instanceof jvm ? (jvm) queryLocalInterface : new jvk(iBinder);
        } else {
            jvm = null;
        }
        this.c = jvm;
        this.d = null;
        this.e = pendingIntent;
        this.f = str;
        this.g = j;
        this.h = j2;
    }

    public static final UpdateFenceOperation a(String str) {
        return new UpdateFenceOperation(5, (ContextFenceRegistrationStub) null, (grc) null, (PendingIntent) null, str, -1, -1);
    }

    public static final UpdateFenceOperation a(String str, long j, ContextFenceStub contextFenceStub, PendingIntent pendingIntent) {
        return new UpdateFenceOperation(2, ContextFenceRegistrationStub.a(str, j, contextFenceStub), (grc) null, pendingIntent, (String) null, -1, -1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, i, false);
        jvm jvm = this.c;
        if (jvm != null) {
            iBinder = jvm.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 4, iBinder);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, a2);
    }

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, grc grc, PendingIntent pendingIntent, String str, long j, long j2) {
        this.a = i;
        this.b = contextFenceRegistrationStub;
        this.c = null;
        this.d = grc;
        this.e = pendingIntent;
        this.f = str;
        this.g = j;
        this.h = j2;
    }

    public UpdateFenceOperation(ContextFenceRegistrationStub contextFenceRegistrationStub, jvm jvm) {
        this.a = 1;
        this.b = contextFenceRegistrationStub;
        this.c = jvm;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = -1;
        this.h = -1;
    }
}
