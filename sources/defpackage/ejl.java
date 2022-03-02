package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ejl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ejl {
    public static final iwd a = ehv.a("AccountTransfer", "AccountTransferExporter");
    public final etl b;
    private final ejn c;
    private final achf d;
    private final qub e;
    private final aedi f;

    public ejl(Context context, ejn ejn, achf achf, qub qub, etl etl) {
        this.c = ejn;
        this.d = achf;
        this.e = qub;
        this.b = etl;
        this.f = aedi.a(jfm.a(1, 10), iiz.b(context), iiz.a(context));
    }

    private final ExchangeAssertionsForUserCredentialsRequest a(List list, boolean z) {
        Assertion[] assertionArr;
        acwa a2 = this.d.a((Challenge[]) list.toArray(new Challenge[0]), z, false);
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = null;
        try {
            assertionArr = (Assertion[]) ejp.a((Object[]) (Assertion[]) a(a2));
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Status a3 = ejp.a(e2);
            a(String.format(Locale.US, "convert-challenges-to-assertions-%d", new Object[]{Integer.valueOf(a3.i)}), a3);
            assertionArr = null;
        }
        try {
            ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) a(this.d.a(assertionArr));
            ejp.a((Object) exchangeAssertionsForUserCredentialsRequest2);
            exchangeAssertionsForUserCredentialsRequest = exchangeAssertionsForUserCredentialsRequest2;
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            Status a4 = ejp.a(e3);
            a(String.format(Locale.US, "partial-exchange-assertions-%d", new Object[]{Integer.valueOf(a4.i)}), a4);
        }
        try {
            ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest3 = (ExchangeAssertionsForUserCredentialsRequest) a(this.d.a(exchangeAssertionsForUserCredentialsRequest));
            ejp.a((Object) exchangeAssertionsForUserCredentialsRequest3);
            return exchangeAssertionsForUserCredentialsRequest3;
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            Status a5 = ejp.a(e4);
            a(String.format(Locale.US, "populate-source-info-%d", new Object[]{Integer.valueOf(a5.i)}), a5);
            return exchangeAssertionsForUserCredentialsRequest;
        }
    }

    public final void b() {
        UserBootstrapInfo[] userBootstrapInfoArr;
        Account[] accountArr = (Account[]) ejp.a((Object) this.e.a("com.google"));
        if (accountArr.length == 0) {
            ejp.a(this.b);
            return;
        }
        try {
            userBootstrapInfoArr = (UserBootstrapInfo[]) ejp.a((Object[]) (UserBootstrapInfo[]) a(this.d.a(accountArr)));
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Status a2 = ejp.a(e2);
            a(String.format(Locale.US, "get-bootstrap-infos-%d", new Object[]{Integer.valueOf(a2.i)}), a2);
            userBootstrapInfoArr = null;
        }
        etl etl = this.b;
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.c = new ArrayList(Arrays.asList(userBootstrapInfoArr));
        accountBootstrapPayload.a.add(2);
        ejp.a(etl, accountBootstrapPayload);
    }

    private static Object a(acwa acwa) {
        return acws.a(acwa, ent.ag(), TimeUnit.SECONDS);
    }

    private final void a(String str, Status status) {
        this.f.a("EXPORT", str);
        throw new ejk(String.format("Export failed %s", new Object[]{status}));
    }

    private final void a(List list) {
        boolean z = false;
        try {
            z = this.c.a().b;
        } catch (ejk | InterruptedException | ExecutionException | TimeoutException e2) {
            a.d("GoogleAccountTransferClient#getDeviceMetadata() failed error", e2, new Object[0]);
        }
        ExchangeAssertionsForUserCredentialsRequest a2 = a(list, z);
        etl etl = this.b;
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.e = a2;
        accountBootstrapPayload.a.add(4);
        ejp.a(etl, accountBootstrapPayload);
    }

    public final void a() {
        a.b("handleAccountExportDataAvailable()", new Object[0]);
        try {
            AccountBootstrapPayload b2 = this.c.b();
            ArrayList arrayList = b2.d;
            if (arrayList == null) {
                ArrayList arrayList2 = b2.f;
                if (arrayList2 != null) {
                    a.c("UserCredentials: %s", arrayList2);
                    throw new ejk("Unimplemented");
                }
                throw new ejk("AccountBootstrapPayload invalid");
            }
            a((List) arrayList);
        } catch (ejk | InterruptedException | ExecutionException | TimeoutException e2) {
            a.e("handleAccountExportDataAvailable() error", e2, new Object[0]);
            ejp.b(this.b);
        }
    }
}
