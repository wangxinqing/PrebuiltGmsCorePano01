package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.MutateRequest;

/* renamed from: apmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apmr extends bhv implements apmt {
    public apmr(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    public final CallStatus a(ifu ifu, MutateRequest mutateRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) mutateRequest);
        Parcel a = a(8, aQ);
        CallStatus callStatus = (CallStatus) bhx.a(a, CallStatus.CREATOR);
        a.recycle();
        return callStatus;
    }

    public final void a(apmq apmq, GetIndexableRequest getIndexableRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) apmq);
        bhx.a(aQ, (Parcelable) getIndexableRequest);
        b(5, aQ);
    }
}
