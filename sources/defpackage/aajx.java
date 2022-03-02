package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;

/* renamed from: aajx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aajx extends bhv implements aajz {
    public aajx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
    }

    public final void a(aajw aajw) {
        throw null;
    }

    public final void b(aajw aajw) {
        throw null;
    }

    public final void c(aajw aajw) {
        throw null;
    }

    public final void a(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, aajw aajw) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getGlobalSearchSourcesCall$Request);
        bhx.a(aQ, (IInterface) aajw);
        b(2, aQ);
    }

    public final void a(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, aajw aajw) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setIncludeInGlobalSearchCall$Request);
        bhx.a(aQ, (IInterface) aajw);
        b(8, aQ);
    }
}
