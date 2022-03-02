package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.common.api.Status;

/* renamed from: eoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eoz extends bhv implements IInterface {
    public eoz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback");
    }

    public final void a(Status status, GoogleAccountData googleAccountData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) googleAccountData);
        c(2, aQ);
    }
}
