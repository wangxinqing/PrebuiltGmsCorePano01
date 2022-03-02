package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: epa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class epa extends bhv implements IInterface {
    public epa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetTokenCallback");
    }

    public final void a(Status status, TokenResponse tokenResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) tokenResponse);
        c(2, aQ);
    }
}
