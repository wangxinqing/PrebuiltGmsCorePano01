package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: dus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dus extends bhv implements duu {
    public dus(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void a(GetRecentContextCall$Request getRecentContextCall$Request, dux dux) {
        throw null;
    }

    public final void a(dux dux, String str) {
        throw null;
    }

    public final void a(dux dux, ActionImpl[] actionImplArr) {
        throw null;
    }

    public final void a(dux dux) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) dux);
        b(2, aQ);
    }

    public final void a(dux dux, UsageInfo[] usageInfoArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) dux);
        aQ.writeString((String) null);
        aQ.writeTypedArray(usageInfoArr, 0);
        b(1, aQ);
    }
}
