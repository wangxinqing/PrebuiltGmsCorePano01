package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.auth.account.accounttransfer.RestoreDataSender$1;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ejm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ejm {
    private static final iwd a = ehv.a("AccountTransfer", "AccountTransferImporter");
    private final Context b;
    private final ejn c;
    private final achf d;
    private final qub e;
    private final eny f;
    private final ejo g;
    private final etl h;
    private final aedi i;

    public ejm(Context context, ejn ejn, achf achf, qub qub, eny eny, ejo ejo, etl etl) {
        this.b = context;
        this.c = ejn;
        this.d = achf;
        this.e = qub;
        this.f = eny;
        this.g = ejo;
        this.h = etl;
        this.i = aedi.a(jfm.a(1, 10), iiz.b(context), iiz.a(context));
    }

    private static Object a(acwa acwa) {
        return acws.a(acwa, ent.ag(), TimeUnit.SECONDS);
    }

    private final void b(List list) {
        Account[] a2 = this.e.a("com.google");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserCredential userCredential = (UserCredential) it.next();
            Account account = new Account(userCredential.b, "com.google");
            enw a3 = enw.a();
            a3.a(eqb.a, userCredential.f);
            if (userCredential.g != null) {
                a3.a(eqb.g, userCredential.g);
            }
            if (userCredential.h != null) {
                a3.a(eqb.h, userCredential.h);
            }
            if (jhx.a((Object[]) a2, (Object) account)) {
                this.f.b(account, a3);
            } else {
                this.f.a(account, a3);
            }
        }
    }

    private final void a(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2;
        achx achx = null;
        try {
            exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) a(this.d.b(exchangeAssertionsForUserCredentialsRequest));
            ejp.a((Object) exchangeAssertionsForUserCredentialsRequest2);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            a("populate-target-info-failure", ejp.a(e2));
            exchangeAssertionsForUserCredentialsRequest2 = null;
        }
        try {
            achx = (achx) a(this.d.c(exchangeAssertionsForUserCredentialsRequest2));
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            a("exchange-assertions-for-credentials-failed", ejp.a(e3));
        }
        UserCredential[] userCredentialArr = (UserCredential[]) ejp.a((Object[]) achx.a);
        String str = achx.b;
        String str2 = achx.c;
        try {
            ejo ejo = this.g;
            aosh f2 = aosh.f();
            ejo.a.sendBroadcast(new Intent("com.google.android.gms.smartdevice.setup.RESTORE_DATA").putExtra("restoreAccount", str).putExtra("restoreToken", str2).putExtra("resultReceiver", new RestoreDataSender$1(ejo.b, f2)).setPackage(ejo.a.getPackageName()));
            f2.get(ent.ah(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            a.d("RestoreDataSender.send() failed", e4, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(r1);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (UserCredential userCredential : userCredentialArr) {
            if (userCredential.c == 0) {
                arrayList.add(userCredential);
                if (!TextUtils.isEmpty(userCredential.e)) {
                    linkedList.add(userCredential);
                } else {
                    linkedList2.add(userCredential);
                }
            } else {
                a.e("UserCredential(accountIdentifier=%s, status=%s) not OK", userCredential.b, Integer.valueOf(userCredential.c));
            }
        }
        if (linkedList.isEmpty() && linkedList2.isEmpty()) {
            a("no-user-credentials-ok");
            throw new ejk("No UserCredentials OK");
        } else if (linkedList.isEmpty()) {
            b(linkedList2);
            ejp.a(this.h);
        } else {
            try {
                if (this.c.a().d) {
                    Intent className = new Intent().setClassName(this.b, "com.google.android.gms.smartdevice.setup.ui.AccountChallengeActivity");
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        UserCredential userCredential2 = (UserCredential) arrayList.get(i2);
                        Bundle bundle = new Bundle();
                        bundle.putString("name", userCredential2.b);
                        if (TextUtils.isEmpty(userCredential2.e)) {
                            bundle.putString("credential", userCredential2.f);
                        } else {
                            bundle.putString("url", userCredential2.e);
                        }
                        if (!TextUtils.isEmpty(userCredential2.g)) {
                            bundle.putString("firstName", userCredential2.g);
                        }
                        if (!TextUtils.isEmpty(userCredential2.h)) {
                            bundle.putString("lastName", userCredential2.h);
                        }
                        arrayList2.add(bundle);
                    }
                    PendingIntent activity = PendingIntent.getActivity(this.b, 0, className.putExtra("accounts", arrayList2), JGCastService.FLAG_PRIVATE_DISPLAY);
                    ejp.a((Object) activity);
                    etl etl = this.h;
                    iva.a((Object) "com.google");
                    iva.a((Object) activity);
                    etl.b((ihb) new etb(new UserChallengeRequest("com.google", activity)));
                    return;
                }
                b(linkedList2);
                etl etl2 = this.h;
                AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
                accountBootstrapPayload.f = new ArrayList(linkedList);
                accountBootstrapPayload.a.add(5);
                ejp.a(etl2, accountBootstrapPayload);
            } catch (InterruptedException | ExecutionException | TimeoutException e5) {
                a.e("handleAssertions() error", e5, new Object[0]);
                a("device-metadata-failed");
                ejp.b(this.h);
            }
        }
    }

    private final void a(String str) {
        this.i.a("IMPORT", str);
    }

    private final void a(String str, Status status) {
        a(str);
        throw new ejk(String.format("Import failed %s", new Object[]{status}));
    }

    private final void a(List list) {
        Challenge[] challengeArr;
        if (ent.aA()) {
            Account[] a2 = this.e.a("com.google");
            HashSet hashSet = new HashSet();
            for (Account account : a2) {
                hashSet.add(account.name);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                UserBootstrapInfo userBootstrapInfo = (UserBootstrapInfo) list.get(i2);
                if (hashSet.contains(userBootstrapInfo.b)) {
                    a.a("Account %s already on device, dropping from challenge request", iwd.a((Object) userBootstrapInfo.b));
                } else {
                    arrayList.add(userBootstrapInfo);
                }
            }
            if (!arrayList.isEmpty()) {
                list = arrayList;
            } else {
                ejp.a(this.h);
                return;
            }
        }
        try {
            challengeArr = (Challenge[]) ejp.a((Object[]) (Challenge[]) a(this.d.a((UserBootstrapInfo[]) list.toArray(new UserBootstrapInfo[0]))));
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Status a3 = ejp.a(e2);
            int i3 = a3.i;
            StringBuilder sb = new StringBuilder(33);
            sb.append("get-challenges-failed-");
            sb.append(i3);
            a(sb.toString(), a3);
            challengeArr = null;
        }
        etl etl = this.h;
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        accountBootstrapPayload.d = new ArrayList(Arrays.asList(challengeArr));
        accountBootstrapPayload.a.add(3);
        ejp.a(etl, accountBootstrapPayload);
    }

    public final void a() {
        a.b("handleAccountImportDataAvailable()", new Object[0]);
        try {
            AccountBootstrapPayload b2 = this.c.b();
            ArrayList arrayList = b2.c;
            if (arrayList == null) {
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = b2.e;
                if (exchangeAssertionsForUserCredentialsRequest == null) {
                    ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = b2.g;
                    if (exchangeSessionCheckpointsForUserCredentialsRequest != null) {
                        a.c("SessionCheckpoints: %s", exchangeSessionCheckpointsForUserCredentialsRequest);
                        throw new ejk("Unimplemented");
                    }
                    throw new ejk("AccountBootstrapPayload invalid");
                }
                a(exchangeAssertionsForUserCredentialsRequest);
                return;
            }
            a((List) arrayList);
        } catch (ejk | InterruptedException | ExecutionException | TimeoutException e2) {
            a.e("handleAccountImportDataAvailable() error", e2, new Object[0]);
            ejp.b(this.h);
        }
    }
}
