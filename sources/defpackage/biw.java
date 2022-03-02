package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: biw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface biw extends IInterface {
    Bundle a(Account account, String str, Bundle bundle);

    Bundle a(Bundle bundle);

    Bundle a(String str, Bundle bundle);

    AccountChangeEventsResponse a(AccountChangeEventsRequest accountChangeEventsRequest);
}
