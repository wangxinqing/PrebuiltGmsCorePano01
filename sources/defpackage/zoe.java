package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: zoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zoe extends bhv implements zog {
    public zoe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
    }

    public final void a(zod zod) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zod);
        c(1, aQ);
    }

    public final void b(zod zod) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zod);
        c(3, aQ);
    }

    public final void a(zod zod, PseudonymousIdToken pseudonymousIdToken) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) zod);
        bhx.a(aQ, (Parcelable) null);
        c(2, aQ);
    }
}
