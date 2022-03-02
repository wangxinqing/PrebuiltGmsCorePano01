package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: biu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class biu extends bhv implements biw {
    public biu(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle a(Account account, String str, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        Parcel a = a(5, aQ);
        Bundle bundle2 = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    public final Bundle a(Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        Parcel a = a(6, aQ);
        Bundle bundle2 = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    public final Bundle a(String str, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        Parcel a = a(2, aQ);
        Bundle bundle2 = (Bundle) bhx.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    public final AccountChangeEventsResponse a(AccountChangeEventsRequest accountChangeEventsRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) accountChangeEventsRequest);
        Parcel a = a(3, aQ);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) bhx.a(a, AccountChangeEventsResponse.CREATOR);
        a.recycle();
        return accountChangeEventsResponse;
    }
}
