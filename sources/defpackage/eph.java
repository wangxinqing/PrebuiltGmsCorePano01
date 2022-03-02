package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;

/* renamed from: eph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface eph extends IInterface {
    void a(eom eom, Account account);

    void a(eom eom, String str);

    void a(eoq eoq, AccountChangeEventsRequest accountChangeEventsRequest);

    void a(eov eov, GetAccountsRequest getAccountsRequest);

    void a(epe epe, Account account, String str, Bundle bundle);

    void a(ifu ifu, ClearTokenRequest clearTokenRequest);
}
