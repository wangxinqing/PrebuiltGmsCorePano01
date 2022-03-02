package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: eqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqr extends nis {
    private final eov a;
    private final GetAccountsRequest b;

    public eqr(eov eov, GetAccountsRequest getAccountsRequest) {
        super(224, "GetAccountsGoogleAuthOperation");
        this.a = eov;
        this.b = getAccountsRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        Account[] accountArr;
        GetAccountsRequest getAccountsRequest = this.b;
        String[] strArr = getAccountsRequest.b;
        String str = getAccountsRequest.a;
        iwd a2 = ehv.a("GetAccountsOperation");
        qub a3 = qub.a(context);
        if (strArr != null) {
            try {
                accountArr = (Account[]) a3.a(str, strArr).getResult(5, TimeUnit.SECONDS);
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                a2.d("Failed to get %s accounts with features %s", e, str, Arrays.toString(strArr));
                eqj eqj = new eqj(10);
                eqj.a = e;
                throw eqj.a();
            }
        } else {
            accountArr = a3.a(str);
        }
        this.a.a(Status.a, Arrays.asList(accountArr));
    }

    public final void a(Status status) {
        this.a.a(status, (List) null);
    }
}
