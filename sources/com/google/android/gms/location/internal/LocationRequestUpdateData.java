package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rgw();
    public int a;
    public LocationRequestInternal b;
    public ref c;
    public PendingIntent d;
    public rec e;
    public rge f;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        ref ref;
        rec rec;
        this.a = i;
        this.b = locationRequestInternal;
        rge rge = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            ref = queryLocalInterface instanceof ref ? (ref) queryLocalInterface : new red(iBinder);
        } else {
            ref = null;
        }
        this.c = ref;
        this.d = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            rec = queryLocalInterface2 instanceof rec ? (rec) queryLocalInterface2 : new rea(iBinder2);
        } else {
            rec = null;
        }
        this.e = rec;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof rge) {
                rge = (rge) queryLocalInterface3;
            } else {
                rge = new rgc(iBinder3);
            }
        }
        this.f = rge;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.internal.LocationRequestUpdateData a(defpackage.rec r8, defpackage.rge r9) {
        /*
            com.google.android.gms.location.internal.LocationRequestUpdateData r7 = new com.google.android.gms.location.internal.LocationRequestUpdateData
            if (r9 == 0) goto L_0x0009
            android.os.IBinder r9 = r9.asBinder()
            goto L_0x000a
        L_0x0009:
            r9 = 0
        L_0x000a:
            r6 = r9
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.LocationRequestUpdateData.a(rec, rge):com.google.android.gms.location.internal.LocationRequestUpdateData");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.internal.LocationRequestUpdateData a(defpackage.ref r8, defpackage.rge r9) {
        /*
            com.google.android.gms.location.internal.LocationRequestUpdateData r7 = new com.google.android.gms.location.internal.LocationRequestUpdateData
            if (r9 == 0) goto L_0x0009
            android.os.IBinder r9 = r9.asBinder()
            goto L_0x000a
        L_0x0009:
            r9 = 0
        L_0x000a:
            r6 = r9
            r1 = 2
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.LocationRequestUpdateData.a(ref, rge):com.google.android.gms.location.internal.LocationRequestUpdateData");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ref ref = this.c;
        IBinder iBinder3 = null;
        if (ref != null) {
            iBinder = ref.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 3, iBinder);
        ivx.a(parcel, 4, this.d, i, false);
        rec rec = this.e;
        if (rec != null) {
            iBinder2 = rec.asBinder();
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 5, iBinder2);
        rge rge = this.f;
        if (rge != null) {
            iBinder3 = rge.asBinder();
        }
        ivx.a(parcel, 6, iBinder3);
        ivx.b(parcel, a2);
    }
}
