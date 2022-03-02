package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: abta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abta {
    private static final iwd a = acqa.a("D2D", "TargetAccountTransferController");
    private final Context b;
    private final acan c;
    private final absz d;
    private final achf e;
    private final boolean f;
    private final boolean g;

    public abta(Context context, acan acan, absz absz, boolean z, boolean z2, achf achf) {
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) acan);
        this.c = acan;
        iva.a((Object) absz);
        this.d = absz;
        this.f = z;
        this.g = z2;
        this.e = achf;
    }

    private final void a(int i, String str) {
        a.e(str, new Object[0]);
        this.d.a(i, str);
    }

    public final void a(AccountBootstrapPayload accountBootstrapPayload) {
        AccountBootstrapPayload accountBootstrapPayload2 = accountBootstrapPayload;
        this.c.b(2);
        ArrayList arrayList = accountBootstrapPayload2.b;
        boolean z = false;
        if (arrayList != null) {
            a.a("Processing UserBootstrapInfos", new Object[0]);
            iva.a((Object) arrayList);
            if (arrayList.size() > 0) {
                try {
                    Challenge[] challengeArr = (Challenge[]) acws.a(this.e.a((UserBootstrapInfo[]) arrayList.toArray(new UserBootstrapInfo[arrayList.size()])));
                    if (challengeArr != null && challengeArr.length > 0) {
                        MessagePayload messagePayload = new MessagePayload();
                        AccountBootstrapPayload accountBootstrapPayload3 = new AccountBootstrapPayload();
                        messagePayload.a(accountBootstrapPayload3);
                        accountBootstrapPayload3.c = new ArrayList(Arrays.asList(challengeArr));
                        accountBootstrapPayload3.a.add(3);
                        this.d.a(messagePayload);
                    } else {
                        a(10573, "No challenges were returned in the UserBootstrapInfos.");
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    a(acqd.a(e2).i, "Failure processing user bootstrap info.");
                }
            } else {
                a(10573, "UserBootstrapInfos are empty.");
            }
        }
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = accountBootstrapPayload2.d;
        if (exchangeAssertionsForUserCredentialsRequest != null) {
            a.a("Processing ExchangeAssertionsForUserCredentialsRequest", new Object[0]);
            try {
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) acws.a(this.e.b(exchangeAssertionsForUserCredentialsRequest));
                exchangeAssertionsForUserCredentialsRequest2.a(this.f);
                achx achx = (achx) acws.a(this.e.c(exchangeAssertionsForUserCredentialsRequest2));
                UserCredential[] userCredentialArr = achx.a;
                if (userCredentialArr != null) {
                    aucd aucd = this.c.j;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    anxj anxj = anxj.g;
                    ((anxj) aucd.b).f = aucj.s();
                    int length = userCredentialArr.length;
                    ArrayList arrayList2 = new ArrayList(length);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        UserCredential userCredential = userCredentialArr[i];
                        int i3 = userCredential.c;
                        if (i3 == 0) {
                            arrayList2.add(userCredential);
                            if (TextUtils.isEmpty(userCredential.e)) {
                                arrayList3.add(userCredential);
                            } else {
                                arrayList4.add(userCredential);
                            }
                        } else {
                            aucd aucd2 = this.c.j;
                            aucd o = anxh.c.o();
                            if (o.c) {
                                o.c();
                                o.c = z;
                            }
                            anxh anxh = (anxh) o.b;
                            anxh.a |= 1;
                            anxh.b = i3;
                            if (aucd2.c) {
                                aucd2.c();
                                aucd2.c = false;
                            }
                            anxj anxj2 = (anxj) aucd2.b;
                            anxh anxh2 = (anxh) o.i();
                            anxh2.getClass();
                            if (!anxj2.f.a()) {
                                anxj2.f = aucj.a(anxj2.f);
                            }
                            anxj2.f.add(anxh2);
                            iwd iwd = a;
                            String str = userCredential.b;
                            int i4 = userCredential.c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                            sb.append("Account (");
                            sb.append(str);
                            sb.append(") not OK (Status: ");
                            sb.append(i4);
                            sb.append(")");
                            iwd.b(sb.toString(), new Object[0]);
                            i2++;
                            this.d.a(new BootstrapAccount(userCredential.b, "com.google"));
                        }
                        i++;
                        z = false;
                    }
                    if (i2 > 0) {
                        iwd iwd2 = a;
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append(i2);
                        sb2.append(" account(s) were not added.");
                        iwd2.c(sb2.toString(), new Object[0]);
                    }
                    acan acan = this.c;
                    int length2 = userCredentialArr.length;
                    aucd aucd3 = acan.j;
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    anxj anxj3 = (anxj) aucd3.b;
                    anxj3.a |= 1;
                    anxj3.b = length2;
                    int size = arrayList3.size();
                    aucd aucd4 = acan.j;
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    anxj anxj4 = (anxj) aucd4.b;
                    anxj4.a |= 2;
                    anxj4.c = size;
                    int size2 = arrayList4.size();
                    aucd aucd5 = acan.j;
                    if (aucd5.c) {
                        aucd5.c();
                        aucd5.c = false;
                    }
                    anxj anxj5 = (anxj) aucd5.b;
                    anxj5.a |= 4;
                    anxj5.d = size2;
                    if (arrayList2.isEmpty()) {
                        a(10500, "No credentials successfully fetched.");
                    } else {
                        String str2 = achx.b;
                        String str3 = achx.c;
                        this.d.a(str2, str3);
                        iwd iwd3 = a;
                        String valueOf = String.valueOf(str2);
                        iwd3.a(valueOf.length() == 0 ? new String("restoreAccountId: ") : "restoreAccountId: ".concat(valueOf), new Object[0]);
                        iwd iwd4 = a;
                        String valueOf2 = String.valueOf(str3);
                        iwd4.a(valueOf2.length() == 0 ? new String("restoreToken: ") : "restoreToken: ".concat(valueOf2), new Object[0]);
                        if (arrayList4.isEmpty()) {
                            acds.a(this.b, arrayList3);
                            this.d.a((List) aceh.a(userCredentialArr));
                            this.d.a();
                        } else if (!this.f) {
                            this.d.b(aceh.a((List) arrayList2));
                            if (this.g) {
                                this.d.a();
                            }
                        } else {
                            if (!arrayList3.isEmpty()) {
                                acds.a(this.b, arrayList3);
                                this.d.a((List) aceh.a((List) arrayList3));
                            }
                            ArrayList arrayList5 = new ArrayList(arrayList2);
                            MessagePayload messagePayload2 = new MessagePayload();
                            AccountBootstrapPayload accountBootstrapPayload4 = new AccountBootstrapPayload();
                            messagePayload2.a(accountBootstrapPayload4);
                            accountBootstrapPayload4.e = arrayList5;
                            accountBootstrapPayload4.a.add(5);
                            this.d.a(messagePayload2);
                        }
                    }
                } else {
                    a(10573, "Request returned no user credentials.");
                }
            } catch (InterruptedException | ExecutionException e3) {
                int i5 = acqd.a(e3).i;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("API Failure with error code: ");
                sb3.append(i5);
                a(10573, sb3.toString());
            }
        }
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = accountBootstrapPayload2.f;
        if (exchangeSessionCheckpointsForUserCredentialsRequest != null) {
            a.a("Processing ExchangeSessionCheckpointsForUserCredentialsRequest", new Object[0]);
            if (exchangeSessionCheckpointsForUserCredentialsRequest.b.size() > 0) {
                try {
                    achf achf = this.e;
                    iva.a((Object) exchangeSessionCheckpointsForUserCredentialsRequest);
                    acjn acjn = new acjn(exchangeSessionCheckpointsForUserCredentialsRequest);
                    iha b2 = ihb.b();
                    b2.a = acjn;
                    UserCredential[] userCredentialArr2 = (UserCredential[]) acws.a(((iby) achf).a(b2.a()));
                    if (userCredentialArr2 == null || userCredentialArr2.length == 0) {
                        a(10500, "Exchanging session checkpoints did not return any credentials.");
                        return;
                    } else {
                        acds.a(this.b, userCredentialArr2);
                        this.d.a((List) aceh.a(userCredentialArr2));
                    }
                } catch (InterruptedException | ExecutionException e4) {
                    a(acqd.a(e4).i, "Failure trying to exchange checkpoints for user credentials.");
                    return;
                }
            }
            this.d.a();
        }
    }
}
