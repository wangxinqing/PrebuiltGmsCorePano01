package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eoo extends bhv implements eoq {
    public eoo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    public final void a(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) accountChangeEventsResponse);
        c(2, aQ);
    }
}
