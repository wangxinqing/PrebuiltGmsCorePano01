package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: abpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abpt {
    private static final iwd a = acqa.a("D2D", "SourceAccountTransferController");
    private final Context b;
    private final acah c;
    private final abps d;
    private final achf e;
    private final boolean f;
    private final boolean g;
    private final ArrayList h;

    public abpt(Context context, acah acah, abps abps, boolean z, boolean z2, ArrayList arrayList, achf achf) {
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) acah);
        this.c = acah;
        iva.a((Object) abps);
        this.d = abps;
        this.f = z;
        this.g = z2;
        this.h = arrayList;
        this.e = achf;
    }

    private final void a(int i, String str) {
        a.e(str, new Object[0]);
        this.d.a(i, str);
    }

    public final void a() {
        int length;
        int i;
        a.a("Sending BootstrapInfos.", new Object[0]);
        acah acah = this.c;
        acah.d(2);
        int a2 = acdy.a(this.h);
        aucd aucd = acah.f;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anwj anwj = (anwj) aucd.b;
        anwj anwj2 = anwj.g;
        anwj.a |= 2;
        anwj.c = a2;
        if (acpd.a(this.b).a("com.google").length != 0) {
            ArrayList arrayList = this.h;
            Account[] accountArr = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.h.size();
                accountArr = new Account[size];
                for (int i2 = 0; i2 < size; i2++) {
                    BootstrapAccount bootstrapAccount = (BootstrapAccount) this.h.get(i2);
                    accountArr[i2] = new Account(bootstrapAccount.b, bootstrapAccount.c);
                }
            }
            if (accountArr == null || (length = accountArr.length) <= 0) {
                a(10573, "No accounts to bootstrap");
                return;
            }
            try {
                UserBootstrapInfo[] userBootstrapInfoArr = (UserBootstrapInfo[]) acws.a(this.e.a(accountArr));
                AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
                accountBootstrapPayload.b = new ArrayList(Arrays.asList(userBootstrapInfoArr));
                accountBootstrapPayload.a.add(2);
                MessagePayload messagePayload = new MessagePayload();
                messagePayload.a(accountBootstrapPayload);
                Resources resources = this.b.getResources();
                if (!azmd.c()) {
                    i = R.plurals.smartdevice_d2d_setting_up_accounts_and_data_text;
                } else {
                    i = R.plurals.smartdevice_d2d_copying_accounts;
                }
                String quantityString = resources.getQuantityString(i, length);
                messagePayload.e(quantityString);
                this.d.a(messagePayload);
                this.d.a(quantityString);
            } catch (InterruptedException | ExecutionException e2) {
                a.a(e2);
                a(10573, "Error trying to fetch user bootstrap info");
            }
        } else {
            a(10573, "No accounts found");
        }
    }

    public final void a(AccountBootstrapPayload accountBootstrapPayload) {
        if (accountBootstrapPayload.c != null) {
            a.a("Processing Challenges using connectionless client", new Object[0]);
            iva.a((Object) accountBootstrapPayload);
            ArrayList arrayList = accountBootstrapPayload.c;
            iva.a((Object) arrayList);
            try {
                Assertion[] assertionArr = (Assertion[]) acws.a(this.e.a((Challenge[]) arrayList.toArray(new Challenge[arrayList.size()]), this.g, false));
                if (assertionArr == null || assertionArr.length <= 0) {
                    a(10578, "Assertions are empty.");
                } else {
                    ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) acws.a(this.e.a((ExchangeAssertionsForUserCredentialsRequest) acws.a(this.e.a(assertionArr))));
                    if (!TextUtils.isEmpty(exchangeAssertionsForUserCredentialsRequest.g)) {
                        aucd aucd = this.c.f;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        anwj anwj = (anwj) aucd.b;
                        anwj anwj2 = anwj.g;
                        anwj.a |= 4;
                        anwj.d = true;
                    }
                    a.a("Sending ExchangeAssertionsForUserCredentialsRequest.", new Object[0]);
                    AccountBootstrapPayload accountBootstrapPayload2 = new AccountBootstrapPayload();
                    accountBootstrapPayload2.d = exchangeAssertionsForUserCredentialsRequest;
                    accountBootstrapPayload2.a.add(4);
                    MessagePayload messagePayload = new MessagePayload();
                    messagePayload.a(accountBootstrapPayload2);
                    this.d.a(messagePayload);
                }
            } catch (InterruptedException | ExecutionException e2) {
                int i = acqd.a(e2).i;
                StringBuilder sb = new StringBuilder(59);
                sb.append("Error while processing challenges. Status code: ");
                sb.append(i);
                a(10578, sb.toString());
            }
        }
        if (accountBootstrapPayload.e != null) {
            a.a("Processing UserCredentials.", new Object[0]);
            iva.a((Object) accountBootstrapPayload);
            ArrayList arrayList2 = accountBootstrapPayload.e;
            iva.a((Object) arrayList2);
            iva.b(this.f, "Target asked to process UserCredentials, but BootstrapOptions don't require source-side challenges.");
            this.d.a();
            this.d.a((List) aceh.a((List) arrayList2));
        }
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            String string = bundle.getString("name");
            String string2 = bundle.getString("sessionCheckpoint");
            if (TextUtils.isEmpty(string2)) {
                iwd iwd = a;
                String valueOf = String.valueOf(string);
                iwd.b(valueOf.length() == 0 ? new String("Session checkpoint is empty: ") : "Session checkpoint is empty: ".concat(valueOf), new Object[0]);
            } else {
                arrayList2.add(new SessionCheckpoint(string, string2));
            }
        }
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = new ExchangeSessionCheckpointsForUserCredentialsRequest(arrayList2);
        a.a("Sending ExchangeSessionCheckpointsForUserCredentialsRequest.", new Object[0]);
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.f = exchangeSessionCheckpointsForUserCredentialsRequest;
        accountBootstrapPayload.a.add(6);
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(accountBootstrapPayload);
        this.d.a(messagePayload);
    }
}
