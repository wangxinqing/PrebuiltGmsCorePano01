package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.account.be.legacy.GoogleAccountDataChimeraService;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;
import com.google.android.gms.auth.firstparty.dataservice.VerifyPinRequest;
import com.google.android.gms.auth.firstparty.dataservice.VerifyPinResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gcp extends bhw implements gcq {
    private final fyq a;
    private final elt b;

    public gcp() {
        super("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
    }

    private static RemoteException a(Throwable th) {
        GoogleAccountDataChimeraService.a.a(th);
        return new RemoteException(th.getMessage());
    }

    public final GetAndAdvanceOtpCounterResponse b(String str) {
        Long l;
        try {
            this.a.a(Binder.getCallingUid());
            elt elt = this.b;
            ert a2 = elt.j.a(str);
            if (a2 == null) {
                elt.a.e("Could not get secret for account: %s.", iwd.a((Object) str));
                l = null;
            } else {
                Long a3 = elt.f.a(a2);
                if (a3 == null) {
                    elt.a.e("Could not get counter for account: %s.", iwd.a((Object) str));
                }
                l = a3;
            }
            return new GetAndAdvanceOtpCounterResponse(1, l);
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final String c(String str) {
        try {
            this.a.a(Binder.getCallingUid());
            return this.b.b(str);
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final void d() {
        try {
            this.a.a(Binder.getCallingUid());
            eli a2 = eli.a(this.b.d.a);
            if (a2.c()) {
                a2.a((fyx) null);
            }
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final Bundle a(String str) {
        try {
            this.a.a(Binder.getCallingUid());
            return this.b.a(str);
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public gcp(fyq fyq, elt elt) {
        super("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
        this.a = fyq;
        this.b = elt;
    }

    public final void c() {
        try {
            this.a.a(Binder.getCallingUid());
            SharedPreferences.Editor edit = new ivk(eli.a(this.b.d.a).b, "frp_preferences_storage", true, true).edit();
            edit.putBoolean("persistent_device_owner_restored", true);
            edit.commit();
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00b6=Splitter:B:35:0x00b6, B:22:0x0079=Splitter:B:22:0x0079} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse a(com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest r9) {
        /*
            r8 = this;
            int r0 = android.os.Binder.getCallingUid()
            fyq r1 = r8.a     // Catch:{ Exception -> 0x01bc }
            r1.a(r0)     // Catch:{ Exception -> 0x01bc }
            elt r0 = r8.b     // Catch:{ Exception -> 0x01bc }
            fyk r1 = r0.d     // Catch:{ Exception -> 0x01bc }
            android.content.Context r1 = r1.a     // Catch:{ Exception -> 0x01bc }
            eli r1 = defpackage.eli.a((android.content.Context) r1)     // Catch:{ Exception -> 0x01bc }
            boolean r2 = r1.a()     // Catch:{ Exception -> 0x01bc }
            r3 = 1
            if (r2 == 0) goto L_0x01b6
            java.lang.String r2 = r9.b     // Catch:{ Exception -> 0x01bc }
            boolean r4 = r1.a()     // Catch:{ Exception -> 0x01bc }
            r5 = 0
            if (r4 != 0) goto L_0x002d
            iwd r9 = defpackage.eli.a     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "Factory reset protection is not supported!"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            r9.d(r0, r1)     // Catch:{ Exception -> 0x01bc }
            goto L_0x0079
        L_0x002d:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x01bc }
            if (r4 == 0) goto L_0x003d
            iwd r9 = defpackage.eli.a     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "Check failed; accountId is null or empty!"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            r9.c(r0, r1)     // Catch:{ Exception -> 0x01bc }
            goto L_0x0079
        L_0x003d:
            iwd r4 = defpackage.eli.a     // Catch:{ Exception -> 0x01bc }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01bc }
            r6[r5] = r2     // Catch:{ Exception -> 0x01bc }
            java.lang.String r7 = "Checking account: %s."
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch:{ Exception -> 0x01bc }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            r4.c(r6, r7)     // Catch:{ Exception -> 0x01bc }
            java.lang.Object r4 = r1.d     // Catch:{ Exception -> 0x01bc }
            monitor-enter(r4)     // Catch:{ Exception -> 0x01bc }
            elk r1 = r1.c     // Catch:{ all -> 0x01b3 }
            fyw r1 = r1.b()     // Catch:{ all -> 0x01b3 }
            if (r1 == 0) goto L_0x00a3
            aucx r6 = r1.b     // Catch:{ all -> 0x01b3 }
            int r6 = r6.size()     // Catch:{ all -> 0x01b3 }
            if (r6 <= 0) goto L_0x00a3
            aucx r1 = r1.b     // Catch:{ all -> 0x01b3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01b3 }
        L_0x0067:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x01b3 }
            if (r6 != 0) goto L_0x008a
            iwd r9 = defpackage.eli.a     // Catch:{ all -> 0x01b3 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b3 }
            r0[r5] = r2     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = "Check failed! Account %s wasn't installed on any profile!"
            r9.d(r1, r0)     // Catch:{ all -> 0x01b3 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b3 }
        L_0x0079:
            iwd r9 = defpackage.elt.a     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "FRP local check failed! Wrong account used!"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            r9.d(r0, r1)     // Catch:{ Exception -> 0x01bc }
            r9 = 100
            com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse r9 = com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse.a(r9)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01bb
        L_0x008a:
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x01b3 }
            fyy r6 = (defpackage.fyy) r6     // Catch:{ all -> 0x01b3 }
            boolean r6 = defpackage.eli.a((defpackage.fyy) r6, (java.lang.String) r2)     // Catch:{ all -> 0x01b3 }
            if (r6 == 0) goto L_0x0067
            iwd r1 = defpackage.eli.a     // Catch:{ all -> 0x01b3 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b3 }
            r6[r5] = r2     // Catch:{ all -> 0x01b3 }
            java.lang.String r2 = "Check passed for %s"
            r1.c(r2, r6)     // Catch:{ all -> 0x01b3 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b3 }
            goto L_0x00b6
        L_0x00a3:
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = "profiles are empty"
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r1 = "container is null"
        L_0x00aa:
            iwd r2 = defpackage.eli.a     // Catch:{ all -> 0x01b3 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b3 }
            r6[r5] = r1     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = "Invalid DataBlockContainer! But letting it pass... [%s]"
            r2.d(r1, r6)     // Catch:{ all -> 0x01b3 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b3 }
        L_0x00b6:
            iwd r1 = defpackage.elt.a     // Catch:{ Exception -> 0x01bc }
            java.lang.String r2 = "FRP passed local check!"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            r1.d(r2, r4)     // Catch:{ Exception -> 0x01bc }
            avpg r1 = defpackage.avpg.c     // Catch:{ Exception -> 0x01bc }
            aucd r1 = r1.o()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r9 = r9.b     // Catch:{ Exception -> 0x01bc }
            boolean r2 = r1.c     // Catch:{ Exception -> 0x01bc }
            if (r2 != 0) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            r1.c()     // Catch:{ Exception -> 0x01bc }
            r1.c = r5     // Catch:{ Exception -> 0x01bc }
        L_0x00d1:
            aucj r2 = r1.b     // Catch:{ Exception -> 0x01bc }
            avpg r2 = (defpackage.avpg) r2     // Catch:{ Exception -> 0x01bc }
            r9.getClass()     // Catch:{ Exception -> 0x01bc }
            int r4 = r2.a     // Catch:{ Exception -> 0x01bc }
            r4 = r4 | r3
            r2.a = r4     // Catch:{ Exception -> 0x01bc }
            r2.b = r9     // Catch:{ Exception -> 0x01bc }
            aucj r9 = r1.i()     // Catch:{ Exception -> 0x01bc }
            avpg r9 = (defpackage.avpg) r9     // Catch:{ Exception -> 0x01bc }
            avph r1 = defpackage.avph.d     // Catch:{ Exception -> 0x01bc }
            aucd r1 = r1.o()     // Catch:{ Exception -> 0x01bc }
            elr r2 = r0.n     // Catch:{ Exception -> 0x01bc }
            fyk r2 = r0.d     // Catch:{ Exception -> 0x01bc }
            android.content.Context r2 = r2.a     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = "factoryRestProtection"
            r6 = 0
            java.lang.String r2 = defpackage.elr.a((android.content.Context) r2, (java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x01bc }
            boolean r4 = r1.c     // Catch:{ Exception -> 0x01bc }
            if (r4 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            r1.c()     // Catch:{ Exception -> 0x01bc }
            r1.c = r5     // Catch:{ Exception -> 0x01bc }
        L_0x0102:
            aucj r4 = r1.b     // Catch:{ Exception -> 0x01bc }
            avph r4 = (defpackage.avph) r4     // Catch:{ Exception -> 0x01bc }
            r2.getClass()     // Catch:{ Exception -> 0x01bc }
            int r6 = r4.a     // Catch:{ Exception -> 0x01bc }
            r6 = r6 | r3
            r4.a = r6     // Catch:{ Exception -> 0x01bc }
            r4.b = r2     // Catch:{ Exception -> 0x01bc }
            r2 = r6 & 1
            if (r2 != 0) goto L_0x0127
            java.lang.String r2 = ""
            r2.getClass()     // Catch:{ Exception -> 0x01bc }
            r6 = r6 | r3
            r4.a = r6     // Catch:{ Exception -> 0x01bc }
            r4.b = r2     // Catch:{ Exception -> 0x01bc }
            iwd r2 = defpackage.elt.a     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = "Droidguard results are null!"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            r2.d(r4, r6)     // Catch:{ Exception -> 0x01bc }
        L_0x0127:
            boolean r2 = r1.c     // Catch:{ Exception -> 0x01bc }
            if (r2 != 0) goto L_0x012c
            goto L_0x0131
        L_0x012c:
            r1.c()     // Catch:{ Exception -> 0x01bc }
            r1.c = r5     // Catch:{ Exception -> 0x01bc }
        L_0x0131:
            aucj r2 = r1.b     // Catch:{ Exception -> 0x01bc }
            avph r2 = (defpackage.avph) r2     // Catch:{ Exception -> 0x01bc }
            r9.getClass()     // Catch:{ Exception -> 0x01bc }
            r2.c = r9     // Catch:{ Exception -> 0x01bc }
            int r9 = r2.a     // Catch:{ Exception -> 0x01bc }
            r9 = r9 | 2
            r2.a = r9     // Catch:{ Exception -> 0x01bc }
            org.apache.http.entity.ByteArrayEntity r9 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ Exception -> 0x01bc }
            aucj r1 = r1.i()     // Catch:{ Exception -> 0x01bc }
            avph r1 = (defpackage.avph) r1     // Catch:{ Exception -> 0x01bc }
            byte[] r1 = r1.k()     // Catch:{ Exception -> 0x01bc }
            r9.<init>(r1)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r1 = "application/octet-stream"
            r9.setContentType(r1)     // Catch:{ Exception -> 0x01bc }
            fyk r1 = r0.d     // Catch:{ Exception -> 0x01a4 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r1 = r1.a()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r1.e     // Catch:{ Exception -> 0x01a4 }
            agvx r2 = defpackage.ent.g     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r2 = r2.c()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01a4 }
            fyk r0 = r0.d     // Catch:{ Exception -> 0x01a4 }
            android.content.Context r0 = r0.a     // Catch:{ Exception -> 0x01a4 }
            org.apache.http.HttpResponse r9 = defpackage.emt.a(r2, r1, r9, r0)     // Catch:{ Exception -> 0x01a4 }
            byte[] r9 = defpackage.emt.a(r9)     // Catch:{ Exception -> 0x01a4 }
            aubs r0 = defpackage.aubs.c()     // Catch:{ Exception -> 0x01a4 }
            avpk r1 = defpackage.avpk.b     // Catch:{ Exception -> 0x01a4 }
            aucj r9 = defpackage.aucj.a((defpackage.aucj) r1, (byte[]) r9, (defpackage.aubs) r0)     // Catch:{ Exception -> 0x01a4 }
            avpk r9 = (defpackage.avpk) r9     // Catch:{ Exception -> 0x01a4 }
            iwd r0 = defpackage.elt.a     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01a4 }
            int r2 = r9.a     // Catch:{ Exception -> 0x01a4 }
            avpj r2 = defpackage.avpj.a(r2)     // Catch:{ Exception -> 0x01a4 }
            if (r2 == 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            avpj r2 = defpackage.avpj.UNKNOWN     // Catch:{ Exception -> 0x01a4 }
        L_0x018b:
            r1[r5] = r2     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r2 = "FrpValidationRequestCode: %s."
            r0.c(r2, r1)     // Catch:{ Exception -> 0x01a4 }
            int r9 = r9.a     // Catch:{ Exception -> 0x01a4 }
            avpj r9 = defpackage.avpj.a(r9)     // Catch:{ Exception -> 0x01a4 }
            if (r9 == 0) goto L_0x019b
            goto L_0x019d
        L_0x019b:
            avpj r9 = defpackage.avpj.UNKNOWN     // Catch:{ Exception -> 0x01a4 }
        L_0x019d:
            int r9 = r9.g     // Catch:{ Exception -> 0x01a4 }
            com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse r9 = com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse.a(r9)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01bb
        L_0x01a4:
            r9 = move-exception
            iwd r0 = defpackage.elt.a     // Catch:{ Exception -> 0x01bc }
            java.lang.String r1 = "Error when communicating with server for FRP."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            r0.e(r1, r9, r2)     // Catch:{ Exception -> 0x01bc }
            com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse r9 = com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse.a(r5)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01bb
        L_0x01b3:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b3 }
            throw r9     // Catch:{ Exception -> 0x01bc }
        L_0x01b6:
            com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse r9 = com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse.a(r3)     // Catch:{ Exception -> 0x01bc }
        L_0x01bb:
            return r9
        L_0x01bc:
            r9 = move-exception
            android.os.RemoteException r9 = a((java.lang.Throwable) r9)
            goto L_0x01c3
        L_0x01c2:
            throw r9
        L_0x01c3:
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcp.a(com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest):com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse");
    }

    public final boolean d(String str) {
        Boolean bool;
        try {
            this.a.a(Binder.getCallingUid());
            enb enb = new enb(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("token_handle", enb.a));
            try {
                HttpResponse a2 = emt.a(ent.aI(), new UrlEncodedFormEntity(arrayList), (Map) null);
                if (a2.getStatusLine() == null || a2.getStatusLine().getStatusCode() != 200) {
                    bool = false;
                } else {
                    JSONObject jSONObject = new JSONObject(emt.b(a2));
                    if (!jSONObject.has("expires_in") || jSONObject.getInt("expires_in") < 0) {
                        bool = false;
                    } else {
                        bool = true;
                    }
                }
                return bool.booleanValue();
            } catch (UnsupportedEncodingException e) {
                e = e;
                throw new iiy(gei.INTNERNAL_ERROR, "Data error.", e);
            } catch (JSONException e2) {
                e = e2;
                throw new iiy(gei.INTNERNAL_ERROR, "Data error.", e);
            } catch (IOException e3) {
                throw new iiy(gei.NETWORK_ERROR, "Error accessing token info endpoint.", e3);
            } catch (iiy e4) {
                elt.a.e("Failed to check token handle", new Object[0]);
                return false;
            }
        } catch (Exception e5) {
            throw a((Throwable) e5);
        }
    }

    public final void b() {
        try {
            this.a.a(Binder.getCallingUid());
            elt elt = this.b;
            eli a2 = eli.a(elt.d.a);
            elm.a(false, elt.d.a);
            a2.a((List) new ArrayList(), false);
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final DeviceManagementInfoResponse a(Account account) {
        try {
            this.a.a(Binder.getCallingUid());
            return this.b.c(account);
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final TokenResponse a(AccountSignInRequest accountSignInRequest) {
        try {
            this.a.a(Binder.getCallingUid());
            return this.b.a(accountSignInRequest);
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final TokenResponse a(ConfirmCredentialsRequest confirmCredentialsRequest) {
        VerifyPinResponse verifyPinResponse;
        amkr a2;
        try {
            this.a.a(Binder.getCallingUid());
            elt elt = this.b;
            AccountCredentials accountCredentials = confirmCredentialsRequest.b;
            CaptchaSolution captchaSolution = confirmCredentialsRequest.c;
            Account a3 = accountCredentials.a();
            iva.a((Object) a3, (Object) "Account should be available.");
            if (accountCredentials.f != null) {
                ReauthSettingsResponse a4 = elt.g.a(new ReauthSettingsRequest(a3, false));
                if (a4 == null) {
                    a4 = elt.g.a(new ReauthSettingsRequest(a3, true));
                }
                if (a4.b == 0 && "ACTIVE".equals(a4.d.b)) {
                    elw elw = elt.g;
                    VerifyPinRequest verifyPinRequest = new VerifyPinRequest(4, (String) null, accountCredentials.f, a3, (String) null, (Bundle) null);
                    amrl.a((Object) verifyPinRequest);
                    amrl.a((Object) verifyPinRequest.d);
                    amrl.a((Object) verifyPinRequest.c);
                    String str = verifyPinRequest.e;
                    if (str == null) {
                        str = elw.a.d;
                    }
                    Account account = verifyPinRequest.d;
                    String a5 = elw.b.a(account);
                    if (TextUtils.isEmpty(a5)) {
                        Log.w("ReauthClient", "Not able to verifyPin. No LST for the account.");
                        verifyPinResponse = new VerifyPinResponse(5);
                    } else {
                        if (verifyPinRequest.f == null) {
                            new Bundle();
                        }
                        String str2 = verifyPinRequest.c;
                        String b2 = elw.a.b(str);
                        HashMap hashMap = new HashMap();
                        hashMap.put("token", a5);
                        hashMap.put("packageName", str);
                        hashMap.put("packageSignature", b2);
                        hashMap.put("pin", str2);
                        try {
                            try {
                                JSONObject jSONObject = new JSONObject(elw.a((String) ent.d.c(), str, hashMap));
                                int a6 = elw.a(jSONObject);
                                if (a6 == -1) {
                                    verifyPinResponse = new VerifyPinResponse(1, 0, jSONObject.getString("rapt"));
                                } else {
                                    verifyPinResponse = new VerifyPinResponse(a6);
                                }
                            } catch (JSONException e) {
                                Log.e("ReauthClient", "Error deserializing verify PIN response.", e);
                                verifyPinResponse = new VerifyPinResponse(1);
                            }
                        } catch (IOException e2) {
                            Log.w("ReauthClient", "Network error calling verify PIN.", e2);
                            verifyPinResponse = new VerifyPinResponse(2);
                        }
                        if (verifyPinResponse.b == 0 && jkr.b()) {
                            qub qub = elw.b;
                            a2 = amlv.a("AccountManager.notifyAccountAuthenticated");
                            qub.a.notifyAccountAuthenticated(account);
                            if (a2 != null) {
                                a2.close();
                            }
                        }
                    }
                    if (verifyPinResponse.b == 0) {
                        TokenResponse tokenResponse = new TokenResponse();
                        tokenResponse.a(gei.SUCCESS);
                        return tokenResponse;
                    }
                }
            }
            return elt.a(new enj(elt.d.a, accountCredentials, captchaSolution));
        } catch (Exception e3) {
            throw a((Throwable) e3);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final TokenResponse a(TokenRequest tokenRequest) {
        try {
            this.a.a(Binder.getCallingUid());
            iva.a((Object) tokenRequest, (Object) "TokenRequest cannot be null!");
            return this.b.a(tokenRequest.j, tokenRequest);
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final TokenResponse a(UpdateCredentialsRequest updateCredentialsRequest) {
        try {
            this.a.a(Binder.getCallingUid());
            elt elt = this.b;
            return elt.a(new enj(elt.d.a, updateCredentialsRequest.b, updateCredentialsRequest.c));
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    public final ValidateAccountCredentialsResponse a(AccountCredentials accountCredentials) {
        try {
            this.a.a(Binder.getCallingUid());
            enk enk = new enk(this.b.d.a, accountCredentials);
            try {
                String packageName = enk.b.getPackageName();
                String str = enk.c.c;
                eko a2 = enk.e.a(packageName);
                emw emw = enk.d;
                emw.a(enk.c);
                emw.c(enk.c.h);
                emw.b(enk.c.g);
                if (a2 != null) {
                    enk.d.b(a2.a, a2.b);
                    enk.d.a("system_partition", a2.d);
                }
                if (str != null) {
                    enk.d.a(str);
                }
                enk.d.a(enk.a);
                HttpResponse a3 = emt.a(ent.aD(), enk.b.getPackageName(), new UrlEncodedFormEntity(enk.d.a()), enk.b);
                a3.getStatusLine().getStatusCode();
                emz emz = new emz(emt.b(a3));
                gei gei = (gei) emz.a(emz.b);
                enk.a.a("ValidateAccountCredentials Status: %s.", gei);
                if (gei == gei.SUCCESS) {
                    return new ValidateAccountCredentialsResponse(1, 0, (String) emz.a(emz.a));
                }
                if (gei == gei.BAD_AUTHENTICATION) {
                    return new ValidateAccountCredentialsResponse(3);
                }
                if (gei == gei.NETWORK_ERROR) {
                    return new ValidateAccountCredentialsResponse(2);
                }
                return new ValidateAccountCredentialsResponse(1);
            } catch (ekp e) {
                throw new iiy(gei.BAD_REQUEST, "Error when fetching package info", e);
            } catch (IOException e2) {
                throw new iiy(gei.NETWORK_ERROR, "Error when calling server.", e2);
            } catch (IOException e3) {
                throw new iiy(gei.INTNERNAL_ERROR, "Error when parsing the response.", e3);
            } catch (iiy e4) {
                elt.a.a("validateAccountCredentials() -> %s.", e4, e4.a);
                return new ValidateAccountCredentialsResponse(1);
            }
        } catch (Exception e5) {
            throw a((Throwable) e5);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v28, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r11v39 */
    /* JADX WARNING: type inference failed for: r11v40 */
    /* JADX WARNING: type inference failed for: r11v41 */
    /* JADX WARNING: Code restructure failed: missing block: B:274:?, code lost:
        r8.a(defpackage.gei.BAD_REQUEST);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x078b A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:254:0x0757] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x07aa A[Catch:{ Exception -> 0x0809 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r21, android.os.Parcel r22, android.os.Parcel r23) {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            r3 = r23
            java.lang.String r4 = "createAccount() -> %s."
            r5 = 4
            java.lang.String r6 = "The work account whitelist can only be modified by device administrators"
            java.lang.String r7 = "com.google"
            java.lang.String r8 = "UTF-8"
            r9 = 2
            r10 = 3
            r11 = 0
            r12 = 1
            r13 = 0
            switch(r21) {
                case 1: goto L_0x0b4f;
                case 2: goto L_0x09e7;
                case 3: goto L_0x08e7;
                case 4: goto L_0x0810;
                case 5: goto L_0x0560;
                case 6: goto L_0x052d;
                case 7: goto L_0x0502;
                case 8: goto L_0x04ed;
                case 9: goto L_0x04d8;
                case 10: goto L_0x04c3;
                case 11: goto L_0x04ae;
                case 12: goto L_0x0017;
                case 13: goto L_0x0017;
                case 14: goto L_0x0017;
                case 15: goto L_0x0017;
                case 16: goto L_0x049d;
                case 17: goto L_0x0485;
                case 18: goto L_0x0467;
                case 19: goto L_0x0440;
                case 20: goto L_0x0419;
                case 21: goto L_0x0017;
                case 22: goto L_0x0017;
                case 23: goto L_0x03f2;
                case 24: goto L_0x035b;
                case 25: goto L_0x032e;
                case 26: goto L_0x0017;
                case 27: goto L_0x0319;
                case 28: goto L_0x0017;
                case 29: goto L_0x0310;
                case 30: goto L_0x02e5;
                case 31: goto L_0x02be;
                case 32: goto L_0x0017;
                case 33: goto L_0x0017;
                case 34: goto L_0x0283;
                case 35: goto L_0x0250;
                case 36: goto L_0x023b;
                case 37: goto L_0x022a;
                case 38: goto L_0x0219;
                case 39: goto L_0x0208;
                case 40: goto L_0x01f3;
                case 41: goto L_0x0067;
                case 42: goto L_0x002c;
                case 43: goto L_0x0023;
                case 44: goto L_0x001a;
                default: goto L_0x0017;
            }
        L_0x0017:
            r4 = r1
            r1 = 0
            return r1
        L_0x001a:
            r20.d()
            r23.writeNoException()
            r4 = r1
            goto L_0x0b65
        L_0x0023:
            r20.c()
            r23.writeNoException()
            r4 = r1
            goto L_0x0b65
        L_0x002c:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r2 = (android.accounts.Account) r2
            fyq r4 = r1.a     // Catch:{ Exception -> 0x0060 }
            int r5 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x0060 }
            r4.b(r5)     // Catch:{ Exception -> 0x0060 }
            elt r4 = r1.b     // Catch:{ Exception -> 0x0060 }
            r4.a()     // Catch:{ Exception -> 0x0060 }
            ese r4 = r4.m     // Catch:{ Exception -> 0x0060 }
            boolean r5 = defpackage.ese.a()     // Catch:{ Exception -> 0x0060 }
            if (r5 == 0) goto L_0x0056
            eny r4 = r4.c     // Catch:{ Exception -> 0x0060 }
            enx r5 = defpackage.eqb.k     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r2 = r4.a((android.accounts.Account) r2, (defpackage.enx) r5)     // Catch:{ Exception -> 0x0060 }
            r11 = r2
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ Exception -> 0x0060 }
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            r23.writeNoException()
            r3.writeStringArray(r11)
            r4 = r1
            goto L_0x0b65
        L_0x0060:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0067:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            java.lang.String[] r2 = r22.createStringArray()
            fyq r6 = r1.a     // Catch:{ Exception -> 0x01ec }
            int r7 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x01ec }
            r6.b(r7)     // Catch:{ Exception -> 0x01ec }
            elt r6 = r1.b     // Catch:{ Exception -> 0x01ec }
            r6.a()     // Catch:{ Exception -> 0x01ec }
            ese r6 = r6.m     // Catch:{ Exception -> 0x01ec }
            boolean r7 = defpackage.ese.a()     // Catch:{ Exception -> 0x01ec }
            if (r7 == 0) goto L_0x01e2
            iwd r7 = defpackage.ese.a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r8 = "Setting restriction to account"
            java.lang.Object[] r11 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01ec }
            r7.c(r8, r11)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r7 = "android:accounts:key_legacy_not_visible"
            java.lang.String r8 = "android:accounts:key_legacy_visible"
            if (r2 != 0) goto L_0x0145
            qub r11 = r6.b     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r11.a((android.accounts.Account) r4, (java.lang.String) r8, (int) r13)     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x0143
            qub r8 = r6.b     // Catch:{ Exception -> 0x01ec }
            r8.a((android.accounts.Account) r4, (java.lang.String) r7, (int) r13)     // Catch:{ Exception -> 0x01ec }
            qub r7 = r6.b     // Catch:{ Exception -> 0x01ec }
            java.util.Map r7 = r7.b(r4)     // Catch:{ Exception -> 0x01ec }
            java.util.Set r7 = r7.entrySet()     // Catch:{ Exception -> 0x01ec }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x01ec }
        L_0x00b3:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x00de
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x01ec }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r11 = r8.getKey()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r8 = r8.getValue()     // Catch:{ Exception -> 0x01ec }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x01ec }
            int r14 = r8.intValue()     // Catch:{ Exception -> 0x01ec }
            if (r14 != r12) goto L_0x00d2
            goto L_0x00d8
        L_0x00d2:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x01ec }
            if (r8 != r10) goto L_0x00b3
        L_0x00d8:
            qub r8 = r6.b     // Catch:{ Exception -> 0x01ec }
            r8.a((android.accounts.Account) r4, (java.lang.String) r11, (int) r13)     // Catch:{ Exception -> 0x01ec }
            goto L_0x00b3
        L_0x00de:
            fzh r7 = defpackage.esj.a     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r7 = r7.b()     // Catch:{ Exception -> 0x01ec }
            esj r7 = (defpackage.esj) r7     // Catch:{ Exception -> 0x01ec }
            java.util.List r7 = r7.a()     // Catch:{ Exception -> 0x01ec }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x01ec }
        L_0x00ee:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x01cc
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x01ec }
            qub r10 = r6.b     // Catch:{ Exception -> 0x01ec }
            int r10 = r10.b((android.accounts.Account) r4, (java.lang.String) r8)     // Catch:{ Exception -> 0x01ec }
            if (r10 != r5) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            if (r10 != r9) goto L_0x0141
        L_0x0105:
            iwd r10 = defpackage.ese.a     // Catch:{ Exception -> 0x01ec }
            java.lang.String r11 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r14 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01ec }
            int r14 = r14.length()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r15 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x01ec }
            int r15 = r15.length()     // Catch:{ Exception -> 0x01ec }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ec }
            int r14 = r14 + 23
            int r14 = r14 + r15
            r5.<init>(r14)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r14 = "Setting visibility to "
            r5.append(r14)     // Catch:{ Exception -> 0x01ec }
            r5.append(r8)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r14 = " "
            r5.append(r14)     // Catch:{ Exception -> 0x01ec }
            r5.append(r11)     // Catch:{ Exception -> 0x01ec }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01ec }
            java.lang.Object[] r11 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01ec }
            r10.b(r5, r11)     // Catch:{ Exception -> 0x01ec }
            qub r5 = r6.b     // Catch:{ Exception -> 0x01ec }
            r5.a((android.accounts.Account) r4, (java.lang.String) r8, (int) r9)     // Catch:{ Exception -> 0x01ec }
        L_0x0141:
            r5 = 4
            goto L_0x00ee
        L_0x0143:
            goto L_0x01e3
        L_0x0145:
            qub r5 = r6.b     // Catch:{ Exception -> 0x01ec }
            boolean r5 = r5.a((android.accounts.Account) r4, (java.lang.String) r8, (int) r10)     // Catch:{ Exception -> 0x01ec }
            if (r5 == 0) goto L_0x01e2
            qub r5 = r6.b     // Catch:{ Exception -> 0x01ec }
            r5.a((android.accounts.Account) r4, (java.lang.String) r7, (int) r10)     // Catch:{ Exception -> 0x01ec }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x01ec }
            r5.<init>()     // Catch:{ Exception -> 0x01ec }
            int r7 = r2.length     // Catch:{ Exception -> 0x01ec }
            r8 = 0
        L_0x0159:
            if (r8 < r7) goto L_0x01d5
            qub r7 = r6.b     // Catch:{ Exception -> 0x01ec }
            java.util.Map r7 = r7.b(r4)     // Catch:{ Exception -> 0x01ec }
            java.util.Set r5 = r5.entrySet()     // Catch:{ Exception -> 0x01ec }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x01ec }
        L_0x0169:
            boolean r8 = r5.hasNext()     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x0194
            java.lang.Object r8 = r5.next()     // Catch:{ Exception -> 0x01ec }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r9 = r8.getKey()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x01ec }
            boolean r10 = r6.b(r9)     // Catch:{ Exception -> 0x01ec }
            if (r10 != 0) goto L_0x0169
            java.lang.Object r8 = r8.getValue()     // Catch:{ Exception -> 0x01ec }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x01ec }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x01ec }
            qub r10 = r6.b     // Catch:{ Exception -> 0x01ec }
            r10.a((android.accounts.Account) r4, (java.lang.String) r9, (int) r8)     // Catch:{ Exception -> 0x01ec }
            r7.remove(r9)     // Catch:{ Exception -> 0x01ec }
            goto L_0x0169
        L_0x0194:
            java.util.Set r5 = r7.entrySet()     // Catch:{ Exception -> 0x01ec }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x01ec }
        L_0x019c:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x01ec }
            if (r7 == 0) goto L_0x01cc
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x01ec }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r8 = r7.getKey()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x01ec }
            boolean r8 = r6.b(r8)     // Catch:{ Exception -> 0x01ec }
            if (r8 != 0) goto L_0x019c
            java.lang.Object r8 = r7.getValue()     // Catch:{ Exception -> 0x01ec }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x01ec }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x01ec }
            if (r8 == 0) goto L_0x019c
            qub r8 = r6.b     // Catch:{ Exception -> 0x01ec }
            java.lang.Object r7 = r7.getKey()     // Catch:{ Exception -> 0x01ec }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01ec }
            r8.a((android.accounts.Account) r4, (java.lang.String) r7, (int) r13)     // Catch:{ Exception -> 0x01ec }
            goto L_0x019c
        L_0x01cc:
            eny r5 = r6.c     // Catch:{ Exception -> 0x01ec }
            enx r6 = defpackage.eqb.k     // Catch:{ Exception -> 0x01ec }
            r5.b(r4, r6, r2)     // Catch:{ Exception -> 0x01ec }
            r13 = 1
            goto L_0x01e3
        L_0x01d5:
            r9 = r2[r8]     // Catch:{ Exception -> 0x01ec }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01ec }
            r5.put(r9, r10)     // Catch:{ Exception -> 0x01ec }
            int r8 = r8 + 1
            goto L_0x0159
        L_0x01e2:
        L_0x01e3:
            r23.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r3, (boolean) r13)
            r4 = r1
            goto L_0x0b65
        L_0x01ec:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x01f3:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r2 = (android.accounts.Account) r2
            com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse r2 = r1.a((android.accounts.Account) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0208:
            java.lang.String r2 = r22.readString()
            boolean r2 = r1.d(r2)
            r23.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r3, (boolean) r2)
            r4 = r1
            goto L_0x0b65
        L_0x0219:
            java.lang.String r2 = r22.readString()
            java.lang.String r2 = r1.c(r2)
            r23.writeNoException()
            r3.writeString(r2)
            r4 = r1
            goto L_0x0b65
        L_0x022a:
            java.lang.String r2 = r22.readString()
            com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse r2 = r1.b(r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x023b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.shared.AccountCredentials.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r2 = (com.google.android.gms.auth.firstparty.shared.AccountCredentials) r2
            com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse r2 = r1.a((com.google.android.gms.auth.firstparty.shared.AccountCredentials) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0250:
            int r2 = android.os.Binder.getCallingUid()
            fyq r4 = r1.a     // Catch:{ Exception -> 0x027c }
            r4.b(r2)     // Catch:{ Exception -> 0x027c }
            elt r2 = r1.b     // Catch:{ Exception -> 0x027c }
            int r4 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x027c }
            fys r5 = r2.k     // Catch:{ Exception -> 0x027c }
            boolean r4 = r5.a((int) r4)     // Catch:{ Exception -> 0x027c }
            if (r4 == 0) goto L_0x0276
            ekt r2 = r2.l     // Catch:{ Exception -> 0x027c }
            boolean r2 = r2.a()     // Catch:{ Exception -> 0x027c }
            r23.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r3, (boolean) r2)
            r4 = r1
            goto L_0x0b65
        L_0x0276:
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ Exception -> 0x027c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x027c }
            throw r2     // Catch:{ Exception -> 0x027c }
        L_0x027c:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0283:
            java.lang.String r4 = r22.readString()
            java.lang.String r2 = r22.readString()
            int r5 = android.os.Binder.getCallingUid()
            fyq r7 = r1.a     // Catch:{ Exception -> 0x02b7 }
            r7.b(r5)     // Catch:{ Exception -> 0x02b7 }
            elt r5 = r1.b     // Catch:{ Exception -> 0x02b7 }
            int r7 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x02b7 }
            fys r8 = r5.k     // Catch:{ Exception -> 0x02b7 }
            boolean r7 = r8.a((int) r7)     // Catch:{ Exception -> 0x02b7 }
            if (r7 == 0) goto L_0x02b1
            ekt r5 = r5.l     // Catch:{ Exception -> 0x02b7 }
            boolean r2 = r5.a(r4, r2)     // Catch:{ Exception -> 0x02b7 }
            r23.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r3, (boolean) r2)
            r4 = r1
            goto L_0x0b65
        L_0x02b1:
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ Exception -> 0x02b7 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x02b7 }
            throw r2     // Catch:{ Exception -> 0x02b7 }
        L_0x02b7:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x02be:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r2 = (android.accounts.Account) r2
            int r4 = android.os.Binder.getCallingUid()
            fyq r5 = r1.a     // Catch:{ Exception -> 0x02de }
            r5.a(r4)     // Catch:{ Exception -> 0x02de }
            elt r4 = r1.b     // Catch:{ Exception -> 0x02de }
            java.lang.String r2 = r4.b((android.accounts.Account) r2)     // Catch:{ Exception -> 0x02de }
            r23.writeNoException()
            r3.writeString(r2)
            r4 = r1
            goto L_0x0b65
        L_0x02de:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x02e5:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r2 = (android.accounts.Account) r2
            int r4 = android.os.Binder.getCallingUid()
            if (r2 == 0) goto L_0x0306
            fyq r5 = r1.a     // Catch:{ Exception -> 0x02ff }
            r5.a(r4)     // Catch:{ Exception -> 0x02ff }
            elt r4 = r1.b     // Catch:{ Exception -> 0x02ff }
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData r11 = r4.a((android.accounts.Account) r2)     // Catch:{ Exception -> 0x02ff }
            goto L_0x0307
        L_0x02ff:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0306:
        L_0x0307:
            r23.writeNoException()
            defpackage.bhx.b(r3, r11)
            r4 = r1
            goto L_0x0b65
        L_0x0310:
            r20.b()
            r23.writeNoException()
            r4 = r1
            goto L_0x0b65
        L_0x0319:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest) r2
            com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse r2 = r1.a((com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x032e:
            java.lang.String r2 = r22.readString()
            int r4 = android.os.Binder.getCallingUid()
            fyq r5 = r1.a     // Catch:{ Exception -> 0x0354 }
            r5.a(r4)     // Catch:{ Exception -> 0x0354 }
            elt r4 = r1.b     // Catch:{ Exception -> 0x0354 }
            java.lang.String r5 = "AccountName must be provided"
            defpackage.iva.a((java.lang.String) r2, (java.lang.Object) r5)     // Catch:{ Exception -> 0x0354 }
            android.accounts.Account r5 = new android.accounts.Account     // Catch:{ Exception -> 0x0354 }
            r5.<init>(r2, r7)     // Catch:{ Exception -> 0x0354 }
            java.lang.String r2 = r4.b((android.accounts.Account) r5)     // Catch:{ Exception -> 0x0354 }
            r23.writeNoException()
            r3.writeString(r2)
            r4 = r1
            goto L_0x0b65
        L_0x0354:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x035b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.OtpRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.OtpRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.OtpRequest) r2
            int r4 = android.os.Binder.getCallingUid()
            fyq r5 = r1.a     // Catch:{ Exception -> 0x03eb }
            r5.b(r4)     // Catch:{ Exception -> 0x03eb }
            elt r4 = r1.b     // Catch:{ Exception -> 0x03eb }
            com.google.android.gms.auth.firstparty.shared.AppDescription r5 = r2.c     // Catch:{ Exception -> 0x03eb }
            java.lang.String r5 = r5.e     // Catch:{ Exception -> 0x03eb }
            boolean r6 = r2.e     // Catch:{ Exception -> 0x03eb }
            if (r6 != 0) goto L_0x0377
        L_0x0376:
            goto L_0x038a
        L_0x0377:
            fyk r6 = r4.d     // Catch:{ Exception -> 0x03eb }
            java.lang.String r6 = r6.d     // Catch:{ Exception -> 0x03eb }
            boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x03eb }
            if (r6 == 0) goto L_0x0376
            err r4 = r4.e     // Catch:{ Exception -> 0x03eb }
            java.lang.String r2 = r2.b     // Catch:{ Exception -> 0x03eb }
            java.util.List r2 = r4.a(r2, r13)     // Catch:{ Exception -> 0x03eb }
            goto L_0x03cc
        L_0x038a:
            byte[] r5 = r5.getBytes(r8)     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            java.lang.String r6 = "!"
            byte[] r6 = r6.getBytes(r8)     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            int r7 = r5.length     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            byte[] r8 = r2.d     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            if (r8 != 0) goto L_0x039a
            goto L_0x039e
        L_0x039a:
            int r8 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            int r9 = r6.length     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            int r8 = r8 + r9
            int r7 = r7 + r8
        L_0x039e:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            r7.put(r5)     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            byte[] r5 = r2.d     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            if (r5 != 0) goto L_0x03aa
            goto L_0x03b3
        L_0x03aa:
            java.nio.ByteBuffer r5 = r7.put(r6)     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            byte[] r6 = r2.d     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            r5.put(r6)     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
        L_0x03b3:
            err r4 = r4.e     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            java.lang.String r2 = r2.b     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            byte[] r5 = r7.array()     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            java.util.List r2 = r4.a(r2, r13, r5)     // Catch:{ UnsupportedEncodingException -> 0x03c0 }
            goto L_0x03cc
        L_0x03c0:
            r0 = move-exception
            r2 = r0
            iwd r4 = defpackage.elt.a     // Catch:{ Exception -> 0x03eb }
            java.lang.String r5 = "UTF-8 IS UNSUPPORTED ?!?!?!?!?"
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x03eb }
            r4.e(r5, r2, r6)     // Catch:{ Exception -> 0x03eb }
            r2 = r11
        L_0x03cc:
            if (r2 == 0) goto L_0x03dc
            boolean r4 = r2.isEmpty()     // Catch:{ Exception -> 0x03eb }
            if (r4 != 0) goto L_0x03dc
            java.lang.Object r2 = r2.get(r13)     // Catch:{ Exception -> 0x03eb }
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x03eb }
            goto L_0x03dd
        L_0x03dc:
        L_0x03dd:
            com.google.android.gms.auth.firstparty.dataservice.OtpResponse r2 = new com.google.android.gms.auth.firstparty.dataservice.OtpResponse     // Catch:{ Exception -> 0x03eb }
            r2.<init>(r12, r11)     // Catch:{ Exception -> 0x03eb }
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x03eb:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x03f2:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.AccountChangeEventsRequest r2 = (com.google.android.gms.auth.AccountChangeEventsRequest) r2
            int r4 = android.os.Binder.getCallingUid()
            fyq r5 = r1.a     // Catch:{ Exception -> 0x0412 }
            r5.a(r4)     // Catch:{ Exception -> 0x0412 }
            elt r4 = r1.b     // Catch:{ Exception -> 0x0412 }
            com.google.android.gms.auth.AccountChangeEventsResponse r2 = r4.a((com.google.android.gms.auth.AccountChangeEventsRequest) r2)     // Catch:{ Exception -> 0x0412 }
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0412:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0419:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest) r2
            int r4 = android.os.Binder.getCallingUid()
            fyq r5 = r1.a     // Catch:{ Exception -> 0x0439 }
            r5.a(r4)     // Catch:{ Exception -> 0x0439 }
            elt r4 = r1.b     // Catch:{ Exception -> 0x0439 }
            com.google.android.gms.auth.firstparty.dataservice.AccountRemovalResponse r2 = r4.a((com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest) r2)     // Catch:{ Exception -> 0x0439 }
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0439:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0440:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest) r2
            int r4 = android.os.Binder.getCallingUid()
            fyq r5 = r1.a     // Catch:{ Exception -> 0x0460 }
            r5.a(r4)     // Catch:{ Exception -> 0x0460 }
            elt r4 = r1.b     // Catch:{ Exception -> 0x0460 }
            com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse r2 = r4.a((com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest) r2)     // Catch:{ Exception -> 0x0460 }
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0460:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0467:
            android.os.Parcelable$Creator r3 = com.google.android.gms.auth.firstparty.dataservice.WebSetupConfigRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.auth.firstparty.dataservice.WebSetupConfigRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.WebSetupConfigRequest) r2
            int r2 = android.os.Binder.getCallingUid()
            fyq r3 = r1.a     // Catch:{ Exception -> 0x047e }
            r3.a(r2)     // Catch:{ Exception -> 0x047e }
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x047e }
            r2.<init>()     // Catch:{ Exception -> 0x047e }
            throw r2     // Catch:{ Exception -> 0x047e }
        L_0x047e:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0485:
            java.lang.String r4 = r22.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r5)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.a(r4, r2)
            r23.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r3, (boolean) r12)
            r4 = r1
            goto L_0x0b65
        L_0x049d:
            java.lang.String r2 = r22.readString()
            android.os.Bundle r2 = r1.a((java.lang.String) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x04ae:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest) r2
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r2 = r1.a((com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x04c3:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest) r2
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r2 = r1.a((com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x04d8:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest) r2
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r2 = r1.a((com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x04ed:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.TokenRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r2
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r2 = r1.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r2)
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0502:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest) r2
            int r2 = android.os.Binder.getCallingUid()
            fyq r4 = r1.a     // Catch:{ Exception -> 0x0526 }
            r4.a(r2)     // Catch:{ Exception -> 0x0526 }
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r2 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse     // Catch:{ Exception -> 0x0526 }
            r2.<init>()     // Catch:{ Exception -> 0x0526 }
            gei r4 = defpackage.gei.GPLUS_PROFILE_ERROR     // Catch:{ Exception -> 0x0526 }
            r2.a((defpackage.gei) r4)     // Catch:{ Exception -> 0x0526 }
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0526:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x052d:
            android.os.Parcelable$Creator r4 = com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest) r2
            int r2 = android.os.Binder.getCallingUid()
            fyq r4 = r1.a     // Catch:{ Exception -> 0x0559 }
            r4.a(r2)     // Catch:{ Exception -> 0x0559 }
            com.google.android.gms.auth.firstparty.dataservice.GplusInfoResponse r2 = new com.google.android.gms.auth.firstparty.dataservice.GplusInfoResponse     // Catch:{ Exception -> 0x0559 }
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0559 }
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            r4 = r1
            goto L_0x0b65
        L_0x0559:
            r0 = move-exception
            r2 = r0
            android.os.RemoteException r2 = a((java.lang.Throwable) r2)
            throw r2
        L_0x0560:
            android.os.Parcelable$Creator r5 = com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r2 = (com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest) r2
            int r5 = android.os.Binder.getCallingUid()
            fyq r6 = r1.a     // Catch:{ Exception -> 0x0809 }
            r6.a(r5)     // Catch:{ Exception -> 0x0809 }
            elt r5 = r1.b     // Catch:{ Exception -> 0x0809 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r6 = r2.n     // Catch:{ Exception -> 0x0809 }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r7 = r2.o     // Catch:{ Exception -> 0x0809 }
            com.google.android.gms.auth.firstparty.shared.CaptchaSolution r9 = r2.p     // Catch:{ Exception -> 0x0809 }
            java.lang.String r10 = "AppDescription cannot be null!"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r10)     // Catch:{ Exception -> 0x0809 }
            java.lang.String r10 = "AccountCredentials cannot be null!"
            defpackage.iva.a((java.lang.Object) r7, (java.lang.Object) r10)     // Catch:{ Exception -> 0x0809 }
            java.lang.String r10 = "GoogleAccountSetupRequest cannot be null!"
            defpackage.iva.a((java.lang.Object) r2, (java.lang.Object) r10)     // Catch:{ Exception -> 0x0809 }
            fyk r10 = r5.d     // Catch:{ Exception -> 0x0809 }
            android.content.Context r15 = r10.a     // Catch:{ Exception -> 0x0809 }
            enc r10 = new enc     // Catch:{ Exception -> 0x0809 }
            r14 = r10
            r16 = r6
            r17 = r7
            r18 = r2
            r19 = r9
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0809 }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r11 = r10.d     // Catch:{ iiy -> 0x07e6 }
            java.lang.String r11 = r11.c     // Catch:{ iiy -> 0x07e6 }
            emj r14 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r15 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r15.object()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            android.content.Context r15 = r14.a     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r13 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = "version"
            org.json.JSONStringer r12 = r13.key(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "3"
            r12.value(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            boolean r12 = defpackage.awkx.b()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "locale"
            if (r12 != 0) goto L_0x05ce
            org.json.JSONStringer r12 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.util.Locale r13 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            goto L_0x05e1
        L_0x05ce:
            java.util.Locale r12 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            int r16 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = r12.toLanguageTag()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r1.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r1.value(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x05e1:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r15.getSystemService(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "operatorCountry"
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = r1.getNetworkCountryIso()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "simCountry"
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.getSimCountryIso()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = "gmsCoreVersion"
            org.json.JSONStringer r1 = r1.key(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12 = 201216073(0xbfe5049, double:9.9413949E-316)
            r1.value(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = "sdkVersion"
            org.json.JSONStringer r1 = r1.key(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            long r12 = (long) r12     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r1.value(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r14.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = "androidId"
            org.json.JSONStringer r1 = r1.key(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = defpackage.iqi.a(r15)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r1.value(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            emj r1 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r12 = r10.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            boolean r12 = r12.c     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r13 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r14 = "agreeWebHistory"
            org.json.JSONStringer r13 = r13.key(r14)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r14 = "0"
            java.lang.String r15 = "1"
            if (r12 != 0) goto L_0x0648
            r12 = r14
            goto L_0x0649
        L_0x0648:
            r12 = r15
        L_0x0649:
            r13.value(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r12 = r10.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            boolean r12 = r12.d     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r13 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r21 = r14
            java.lang.String r14 = "agreePersonalizedContent"
            org.json.JSONStringer r13 = r13.key(r14)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r12 != 0) goto L_0x065f
            r14 = r21
            goto L_0x0660
        L_0x065f:
            r14 = r15
        L_0x0660:
            r13.value(r14)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            android.content.Context r12 = r10.a     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "createAccount"
            java.lang.String r12 = defpackage.elr.a((android.content.Context) r12, (java.lang.String) r13, (java.lang.String) r11)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r13 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r14 = "droidguard_results"
            org.json.JSONStringer r13 = r13.key(r14)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r13.value(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            com.google.android.gms.auth.firstparty.shared.CaptchaSolution r12 = r10.f     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r12 == 0) goto L_0x0694
            org.json.JSONStringer r13 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r14 = "captchaToken"
            org.json.JSONStringer r13 = r13.key(r14)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r14 = r12.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r13.value(r14)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "captchaAnswer"
            org.json.JSONStringer r1 = r1.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = r12.c     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r1.value(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x0694:
            if (r11 == 0) goto L_0x06a3
            emj r1 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = "username"
            org.json.JSONStringer r1 = r1.key(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r1.value(r11)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x06a3:
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r1 = r10.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.h     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r1 == 0) goto L_0x06b6
            emj r12 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r12.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "secondaryEmail"
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x06b6:
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r1 = r10.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.q     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r1 == 0) goto L_0x06c9
            emj r12 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r12.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "r_phone_number"
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x06c9:
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r1 = r10.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.r     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r1 == 0) goto L_0x06dc
            emj r12 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r12.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "r_country"
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x06dc:
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r1 = r10.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.f     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r1 == 0) goto L_0x06ef
            emj r12 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r12.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "firstName"
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x06ef:
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest r1 = r10.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.g     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r1 == 0) goto L_0x0702
            emj r12 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r12 = r12.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r13 = "lastName"
            org.json.JSONStringer r12 = r12.key(r13)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r12.value(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x0702:
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r1 = r10.d     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.f     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            if (r11 == 0) goto L_0x0715
            emj r11 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r11 = r11.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r12 = "password"
            org.json.JSONStringer r11 = r11.key(r12)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r11.value(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
        L_0x0715:
            emj r1 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r1.endObject()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            emj r1 = r10.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.json.JSONStringer r1 = r1.b     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.apache.http.entity.StringEntity r11 = new org.apache.http.entity.StringEntity     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            r11.<init>(r1, r8)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = defpackage.ent.aF()     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r8 = "/create"
            java.lang.String r1 = r1.concat(r8)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            com.google.android.gms.auth.firstparty.shared.AppDescription r8 = r10.c     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            java.lang.String r8 = r8.e     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            android.content.Context r10 = r10.a     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            org.apache.http.HttpResponse r1 = defpackage.emt.a(r1, r8, r11, r10)     // Catch:{ IOException -> 0x07da, JSONException -> 0x07ce }
            byte[] r1 = defpackage.emt.a(r1)     // Catch:{ IOException -> 0x07c2 }
            if (r1 != 0) goto L_0x074a
            java.lang.String r1 = ""
            goto L_0x0752
        L_0x074a:
            java.lang.String r8 = new java.lang.String     // Catch:{ iiy -> 0x07e6 }
            java.nio.charset.Charset r10 = defpackage.amqn.c     // Catch:{ iiy -> 0x07e6 }
            r8.<init>(r1, r10)     // Catch:{ iiy -> 0x07e6 }
            r1 = r8
        L_0x0752:
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r8 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse     // Catch:{ iiy -> 0x07e6 }
            r8.<init>()     // Catch:{ iiy -> 0x07e6 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            gei r1 = defpackage.fyo.a((org.json.JSONObject) r10)     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            gei r11 = defpackage.gei.SUCCESS     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            if (r11 == r1) goto L_0x0785
            gei r11 = defpackage.gei.ALREADY_HAS_GMAIL     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            if (r11 == r1) goto L_0x0785
            gei r11 = defpackage.gei.CAPTCHA     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            if (r11 == r1) goto L_0x077b
            gei r11 = defpackage.gei.BAD_REQUEST     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            if (r11 != r1) goto L_0x0781
            java.lang.String r11 = "detail"
            java.lang.String r10 = r10.getString(r11)     // Catch:{ JSONException -> 0x0779, IllegalArgumentException -> 0x078b }
            r8.f = r10     // Catch:{ JSONException -> 0x0779, IllegalArgumentException -> 0x078b }
            goto L_0x0781
        L_0x0779:
            r0 = move-exception
            goto L_0x0781
        L_0x077b:
            com.google.android.gms.auth.firstparty.shared.CaptchaChallenge r10 = defpackage.elq.a(r10)     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            r8.n = r10     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
        L_0x0781:
            r8.a((defpackage.gei) r1)     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            goto L_0x0793
        L_0x0785:
            gei r1 = defpackage.gei.SUCCESS     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            r8.a((defpackage.gei) r1)     // Catch:{ JSONException -> 0x078d, IllegalArgumentException -> 0x078b }
            goto L_0x0793
        L_0x078b:
            r0 = move-exception
            goto L_0x078e
        L_0x078d:
            r0 = move-exception
        L_0x078e:
            gei r1 = defpackage.gei.BAD_REQUEST     // Catch:{ iiy -> 0x07e6 }
            r8.a((defpackage.gei) r1)     // Catch:{ iiy -> 0x07e6 }
        L_0x0793:
            iwd r1 = defpackage.elt.a     // Catch:{ Exception -> 0x0809 }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0809 }
            gei r10 = r8.b()     // Catch:{ Exception -> 0x0809 }
            r12 = 0
            r11[r12] = r10     // Catch:{ Exception -> 0x0809 }
            r1.a(r4, r11)     // Catch:{ Exception -> 0x0809 }
            gei r1 = r8.b()     // Catch:{ Exception -> 0x0809 }
            gei r4 = defpackage.gei.SUCCESS     // Catch:{ Exception -> 0x0809 }
            if (r1 != r4) goto L_0x07c1
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r1 = new com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest     // Catch:{ Exception -> 0x0809 }
            r1.<init>()     // Catch:{ Exception -> 0x0809 }
            r1.b = r6     // Catch:{ Exception -> 0x0809 }
            r1.f = r7     // Catch:{ Exception -> 0x0809 }
            r4 = 1
            r1.c = r4     // Catch:{ Exception -> 0x0809 }
            boolean r2 = r2.l     // Catch:{ Exception -> 0x0809 }
            r1.d = r2     // Catch:{ Exception -> 0x0809 }
            r1.e = r9     // Catch:{ Exception -> 0x0809 }
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r8 = r5.a((com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest) r1)     // Catch:{ Exception -> 0x0809 }
            goto L_0x07ff
        L_0x07c1:
            goto L_0x07ff
        L_0x07c2:
            r0 = move-exception
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x07e6 }
            gei r5 = defpackage.gei.INTNERNAL_ERROR     // Catch:{ iiy -> 0x07e6 }
            java.lang.String r6 = "Error when parsing the response."
            r2.<init>(r5, r6, r1)     // Catch:{ iiy -> 0x07e6 }
            throw r2     // Catch:{ iiy -> 0x07e6 }
        L_0x07ce:
            r0 = move-exception
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x07e6 }
            gei r5 = defpackage.gei.BAD_REQUEST     // Catch:{ iiy -> 0x07e6 }
            java.lang.String r6 = "bad request"
            r2.<init>(r5, r6, r1)     // Catch:{ iiy -> 0x07e6 }
            throw r2     // Catch:{ iiy -> 0x07e6 }
        L_0x07da:
            r0 = move-exception
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x07e6 }
            gei r5 = defpackage.gei.NETWORK_ERROR     // Catch:{ iiy -> 0x07e6 }
            java.lang.String r6 = "Error when calling server."
            r2.<init>(r5, r6, r1)     // Catch:{ iiy -> 0x07e6 }
            throw r2     // Catch:{ iiy -> 0x07e6 }
        L_0x07e6:
            r0 = move-exception
            r1 = r0
            iwd r2 = defpackage.elt.a     // Catch:{ Exception -> 0x0809 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0809 }
            gei r5 = r1.a     // Catch:{ Exception -> 0x0809 }
            r7 = 0
            r6[r7] = r5     // Catch:{ Exception -> 0x0809 }
            r2.e(r4, r1, r6)     // Catch:{ Exception -> 0x0809 }
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r8 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse     // Catch:{ Exception -> 0x0809 }
            r8.<init>()     // Catch:{ Exception -> 0x0809 }
            gei r1 = r1.a     // Catch:{ Exception -> 0x0809 }
            r8.a((defpackage.gei) r1)     // Catch:{ Exception -> 0x0809 }
        L_0x07ff:
            r23.writeNoException()
            defpackage.bhx.b(r3, r8)
            r4 = r20
            goto L_0x0b65
        L_0x0809:
            r0 = move-exception
            r1 = r0
            android.os.RemoteException r1 = a((java.lang.Throwable) r1)
            throw r1
        L_0x0810:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.firstparty.dataservice.CheckRealNameRequest.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.auth.firstparty.dataservice.CheckRealNameRequest r1 = (com.google.android.gms.auth.firstparty.dataservice.CheckRealNameRequest) r1
            int r2 = android.os.Binder.getCallingUid()
            if (r1 == 0) goto L_0x08cf
            r4 = r20
            fyq r5 = r4.a     // Catch:{ Exception -> 0x08e0 }
            r5.a(r2)     // Catch:{ Exception -> 0x08e0 }
            elt r2 = r4.b     // Catch:{ Exception -> 0x08e0 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r5 = r1.b     // Catch:{ Exception -> 0x08e0 }
            java.lang.String r6 = r1.c     // Catch:{ Exception -> 0x08e0 }
            java.lang.String r1 = r1.d     // Catch:{ Exception -> 0x08e0 }
            elq r2 = r2.i     // Catch:{ Exception -> 0x08e0 }
            java.lang.String r5 = r5.e     // Catch:{ Exception -> 0x08e0 }
            org.json.JSONStringer r7 = new org.json.JSONStringer     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r7.<init>()     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r7.object()     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            android.content.Context r8 = r2.b     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r8 = defpackage.iqi.a(r8)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            if (r8 != 0) goto L_0x0842
            goto L_0x084d
        L_0x0842:
            elp r9 = defpackage.elp.ANDROID_ID     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r9 = r9.aF     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            org.json.JSONStringer r9 = r7.key(r9)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r9.value(r8)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
        L_0x084d:
            android.content.Context r8 = r2.b     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r9 = "device_country"
            java.lang.String r8 = defpackage.iqi.a(r8, r9, r11)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            elp r9 = defpackage.elp.OPERATOR_COUNTRY     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r9 = r9.aF     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            org.json.JSONStringer r9 = r7.key(r9)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r9.value(r8)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            elp r9 = defpackage.elp.DEVICE_COUNTRY     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r9 = r9.aF     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            org.json.JSONStringer r9 = r7.key(r9)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r9.value(r8)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            elp r8 = defpackage.elp.LANGUAGE     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r8 = r8.aF     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            org.json.JSONStringer r8 = r7.key(r8)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r9 = r9.getLanguage()     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r8.value(r9)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            elp r8 = defpackage.elp.FIRST_NAME     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r8 = r8.aF     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            org.json.JSONStringer r8 = r7.key(r8)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r8.value(r6)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            elp r6 = defpackage.elp.LAST_NAME     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r6 = r6.aF     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            org.json.JSONStringer r6 = r7.key(r6)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r6.value(r1)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r7.endObject()     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            agvx r1 = defpackage.ent.e     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.Object r1 = r1.c()     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r6 = r7.toString()     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            java.lang.String r1 = r2.a(r1, r6, r5)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            gei r1 = defpackage.fyo.a((org.json.JSONObject) r2)     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            gei r2 = defpackage.gei.GPLUS_INTERSTITIAL     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            if (r1 != r2) goto L_0x08b5
            goto L_0x08c9
        L_0x08b5:
            gei r2 = defpackage.gei.GPLUS_INVALID_CHAR     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            if (r1 == r2) goto L_0x08c9
            gei r2 = defpackage.gei.GPLUS_NICKNAME     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            if (r1 == r2) goto L_0x08c9
            gei r2 = defpackage.gei.GPLUS_OTHER     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            if (r1 == r2) goto L_0x08c9
            gei r1 = defpackage.gei.SUCCESS     // Catch:{ JSONException -> 0x08c6, IOException -> 0x08c4 }
            goto L_0x08c9
        L_0x08c4:
            r0 = move-exception
            goto L_0x08c7
        L_0x08c6:
            r0 = move-exception
        L_0x08c7:
            gei r1 = defpackage.gei.SUCCESS     // Catch:{ Exception -> 0x08e0 }
        L_0x08c9:
            com.google.android.gms.auth.firstparty.dataservice.CheckRealNameResponse r2 = new com.google.android.gms.auth.firstparty.dataservice.CheckRealNameResponse     // Catch:{ Exception -> 0x08e0 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x08e0 }
            goto L_0x08d8
        L_0x08cf:
            r4 = r20
            com.google.android.gms.auth.firstparty.dataservice.CheckRealNameResponse r2 = new com.google.android.gms.auth.firstparty.dataservice.CheckRealNameResponse     // Catch:{ Exception -> 0x08e0 }
            gei r1 = defpackage.gei.BAD_REQUEST     // Catch:{ Exception -> 0x08e0 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x08e0 }
        L_0x08d8:
            r23.writeNoException()
            defpackage.bhx.b(r3, r2)
            goto L_0x0b65
        L_0x08e0:
            r0 = move-exception
            r1 = r0
            android.os.RemoteException r1 = a((java.lang.Throwable) r1)
            throw r1
        L_0x08e7:
            r4 = r1
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.firstparty.dataservice.PasswordCheckRequest.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.auth.firstparty.dataservice.PasswordCheckRequest r1 = (com.google.android.gms.auth.firstparty.dataservice.PasswordCheckRequest) r1
            int r2 = android.os.Binder.getCallingUid()
            fyq r5 = r4.a     // Catch:{ Exception -> 0x09e0 }
            r5.a(r2)     // Catch:{ Exception -> 0x09e0 }
            if (r1 == 0) goto L_0x09d1
            elt r2 = r4.b     // Catch:{ Exception -> 0x09e0 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r5 = r1.f     // Catch:{ Exception -> 0x09e0 }
            elq r2 = r2.i     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r6 = r1.b     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r7 = r1.c     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r8 = r1.d     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r1 = r1.e     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r5 = r5.e     // Catch:{ Exception -> 0x09e0 }
            org.json.JSONStringer r12 = new org.json.JSONStringer     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r12.<init>()     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            org.json.JSONStringer r12 = r12.object()     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            elp r13 = defpackage.elp.USERNAME     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r13 = r13.aF     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            org.json.JSONStringer r13 = r12.key(r13)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r13.value(r6)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            if (r7 == 0) goto L_0x092c
            elp r13 = defpackage.elp.PASSWORD     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r13 = r13.aF     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            org.json.JSONStringer r13 = r12.key(r13)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r13.value(r7)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
        L_0x092c:
            if (r8 == 0) goto L_0x0939
            elp r7 = defpackage.elp.FIRST_NAME     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r7 = r7.aF     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            org.json.JSONStringer r7 = r12.key(r7)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r7.value(r8)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
        L_0x0939:
            if (r1 != 0) goto L_0x093c
            goto L_0x0947
        L_0x093c:
            elp r7 = defpackage.elp.LAST_NAME     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r7 = r7.aF     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            org.json.JSONStringer r7 = r12.key(r7)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r7.value(r1)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
        L_0x0947:
            r12.endObject()     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r7 = r2.d     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r2 = r2.a(r7, r12, r5)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            iwd r5 = defpackage.elq.a     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r6 = defpackage.iwd.a((java.lang.Object) r6)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r12 = 0
            r7[r12] = r6     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r6 = defpackage.iwd.a((java.lang.Object) r8)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r8 = 1
            r7[r8] = r6     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r1 = defpackage.iwd.a((java.lang.Object) r1)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r7[r9] = r1     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r1 = defpackage.iwd.a((java.lang.Object) r2)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r7[r10] = r1     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r1 = "Result of password rating for {account %s, first: %s, last %s}: %s"
            r5.c(r1, r7)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            gei r2 = defpackage.fyo.a((org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            gei r5 = defpackage.gei.SUCCESS     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            if (r5 != r2) goto L_0x09a9
            elp r5 = defpackage.elp.STRENGTH     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r5 = r5.aF     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            boolean r6 = r1.has(r5)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            if (r6 == 0) goto L_0x0994
            java.lang.String r5 = r1.getString(r5)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            goto L_0x0995
        L_0x0994:
            r5 = r11
        L_0x0995:
            elp r6 = defpackage.elp.DETAIL     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            java.lang.String r6 = r6.aF     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            boolean r7 = r1.has(r6)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            if (r7 == 0) goto L_0x09a6
            java.lang.String r11 = r1.getString(r6)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r1 = r11
            r11 = r5
            goto L_0x09aa
        L_0x09a6:
            r1 = r11
            r11 = r5
            goto L_0x09aa
        L_0x09a9:
            r1 = r11
        L_0x09aa:
            com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse r5 = new com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            r5.<init>(r2, r11, r1)     // Catch:{ JSONException -> 0x09bb, IllegalArgumentException -> 0x09b9, IOException -> 0x09b0 }
            goto L_0x09d8
        L_0x09b0:
            r0 = move-exception
            com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse r5 = new com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse     // Catch:{ Exception -> 0x09e0 }
            gei r1 = defpackage.gei.NETWORK_ERROR     // Catch:{ Exception -> 0x09e0 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x09e0 }
            goto L_0x09d8
        L_0x09b9:
            r0 = move-exception
            goto L_0x09bc
        L_0x09bb:
            r0 = move-exception
        L_0x09bc:
            r1 = r0
            iwd r2 = defpackage.elq.a     // Catch:{ Exception -> 0x09e0 }
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)     // Catch:{ Exception -> 0x09e0 }
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x09e0 }
            r2.e(r1, r5)     // Catch:{ Exception -> 0x09e0 }
            com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse r5 = new com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse     // Catch:{ Exception -> 0x09e0 }
            gei r1 = defpackage.gei.BAD_REQUEST     // Catch:{ Exception -> 0x09e0 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x09e0 }
            goto L_0x09d8
        L_0x09d1:
            com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse r5 = new com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse     // Catch:{ Exception -> 0x09e0 }
            gei r1 = defpackage.gei.BAD_REQUEST     // Catch:{ Exception -> 0x09e0 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x09e0 }
        L_0x09d8:
            r23.writeNoException()
            defpackage.bhx.b(r3, r5)
            goto L_0x0b65
        L_0x09e0:
            r0 = move-exception
            r1 = r0
            android.os.RemoteException r1 = a((java.lang.Throwable) r1)
            throw r1
        L_0x09e7:
            r4 = r1
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckRequest.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckRequest r1 = (com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckRequest) r1
            int r2 = android.os.Binder.getCallingUid()
            fyq r5 = r4.a     // Catch:{ Exception -> 0x0b48 }
            r5.a(r2)     // Catch:{ Exception -> 0x0b48 }
            if (r1 == 0) goto L_0x0b3a
            elt r2 = r4.b     // Catch:{ Exception -> 0x0b48 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r5 = r1.e     // Catch:{ Exception -> 0x0b48 }
            com.google.android.gms.auth.firstparty.shared.CaptchaSolution r6 = r1.f     // Catch:{ Exception -> 0x0b48 }
            com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse r7 = new com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse     // Catch:{ Exception -> 0x0b48 }
            gei r8 = defpackage.gei.BAD_REQUEST     // Catch:{ Exception -> 0x0b48 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0b48 }
            if (r5 == 0) goto L_0x0b39
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x0b48 }
            r8 = 0
            r7.<init>(r8)     // Catch:{ Exception -> 0x0b48 }
            elq r2 = r2.i     // Catch:{ Exception -> 0x0b48 }
            java.lang.String r5 = r5.e     // Catch:{ Exception -> 0x0b48 }
            org.json.JSONStringer r8 = new org.json.JSONStringer     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r8.<init>()     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONStringer r8 = r8.object()     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            android.accounts.Account r12 = r1.g     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r12 = r12.name     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            elp r13 = defpackage.elp.USERNAME     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r13 = r13.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONStringer r13 = r8.key(r13)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r13.value(r12)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r13 = r1.c     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r14 != 0) goto L_0x0a3f
            elp r14 = defpackage.elp.FIRST_NAME     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r14 = r14.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONStringer r14 = r8.key(r14)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r14.value(r13)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
        L_0x0a3f:
            java.lang.String r1 = r1.d     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            boolean r14 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r14 != 0) goto L_0x0a52
            elp r14 = defpackage.elp.LAST_NAME     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r14 = r14.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONStringer r14 = r8.key(r14)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r14.value(r1)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
        L_0x0a52:
            if (r6 == 0) goto L_0x0a7a
            java.lang.String r14 = r6.b     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r15 != 0) goto L_0x0a67
            elp r15 = defpackage.elp.CAPTCHA_TOKEN     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r15 = r15.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONStringer r15 = r8.key(r15)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r15.value(r14)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
        L_0x0a67:
            java.lang.String r6 = r6.c     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            boolean r14 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r14 != 0) goto L_0x0a7a
            elp r14 = defpackage.elp.CAPTCHA_ANSWER     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r14 = r14.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONStringer r14 = r8.key(r14)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r14.value(r6)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
        L_0x0a7a:
            r8.endObject()     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r14 = r11
            r6 = 0
        L_0x0a7f:
            if (r6 >= r10) goto L_0x0ab9
            boolean r15 = r7.get()     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r15 != 0) goto L_0x0ab9
            java.lang.String r15 = r2.c     // Catch:{ IOException -> 0x0ab3 }
            java.lang.String r11 = r8.toString()     // Catch:{ IOException -> 0x0ab3 }
            java.lang.String r14 = r2.a(r15, r11, r5)     // Catch:{ IOException -> 0x0ab3 }
            iwd r11 = defpackage.elq.a     // Catch:{ IOException -> 0x0ab1 }
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0ab1 }
            java.lang.String r19 = defpackage.iwd.a((java.lang.Object) r12)     // Catch:{ IOException -> 0x0ab1 }
            r17 = 0
            r15[r17] = r19     // Catch:{ IOException -> 0x0ab1 }
            java.lang.String r19 = defpackage.iwd.a((java.lang.Object) r13)     // Catch:{ IOException -> 0x0ab1 }
            r18 = 1
            r15[r18] = r19     // Catch:{ IOException -> 0x0ab1 }
            java.lang.String r19 = defpackage.iwd.a((java.lang.Object) r1)     // Catch:{ IOException -> 0x0ab1 }
            r15[r9] = r19     // Catch:{ IOException -> 0x0ab1 }
            java.lang.String r9 = "Req: [username: %s, firstName: %s, lastName: %s]"
            r11.c(r9, r15)     // Catch:{ IOException -> 0x0ab1 }
            goto L_0x0ab9
        L_0x0ab1:
            r0 = move-exception
            goto L_0x0ab4
        L_0x0ab3:
            r0 = move-exception
        L_0x0ab4:
            int r6 = r6 + 1
            r9 = 2
            r11 = 0
            goto L_0x0a7f
        L_0x0ab9:
            if (r14 != 0) goto L_0x0ac4
            com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse r7 = new com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            gei r1 = defpackage.gei.NETWORK_ERROR     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r7.<init>(r1)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            goto L_0x0b41
        L_0x0ac4:
            amzy r1 = defpackage.amzy.h()     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r2.<init>(r14)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            elp r5 = defpackage.elp.SUGGESTIONS     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r5 = r5.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            boolean r5 = r2.has(r5)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r5 == 0) goto L_0x0af7
            elp r1 = defpackage.elp.SUGGESTIONS     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r1 = r1.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            org.json.JSONArray r1 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            int r5 = r1.length()     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r6.<init>(r5)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r7 = 0
        L_0x0ae9:
            if (r7 >= r5) goto L_0x0af5
            java.lang.String r8 = r1.getString(r7)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r6.add(r8)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            int r7 = r7 + 1
            goto L_0x0ae9
        L_0x0af5:
            r1 = r6
            goto L_0x0af8
        L_0x0af7:
        L_0x0af8:
            gei r5 = defpackage.fyo.a((org.json.JSONObject) r2)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            gei r6 = defpackage.gei.USERNAME_UNAVAILABLE     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r5 != r6) goto L_0x0b16
            elp r6 = defpackage.elp.DETAIL     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r6 = r6.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            boolean r6 = r2.has(r6)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            if (r6 == 0) goto L_0x0b16
            elp r6 = defpackage.elp.DETAIL     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.String r6 = r6.aF     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            java.lang.Object r6 = r2.get(r6)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            goto L_0x0b17
        L_0x0b16:
            r11 = 0
        L_0x0b17:
            com.google.android.gms.auth.firstparty.shared.CaptchaChallenge r2 = defpackage.elq.a(r2)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse r7 = new com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            r7.<init>(r5, r11, r2, r1)     // Catch:{ JSONException -> 0x0b23, IllegalArgumentException -> 0x0b21 }
            goto L_0x0b39
        L_0x0b21:
            r0 = move-exception
            goto L_0x0b24
        L_0x0b23:
            r0 = move-exception
        L_0x0b24:
            r1 = r0
            iwd r2 = defpackage.elq.a     // Catch:{ Exception -> 0x0b48 }
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)     // Catch:{ Exception -> 0x0b48 }
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0b48 }
            r2.e(r1, r5)     // Catch:{ Exception -> 0x0b48 }
            com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse r7 = new com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse     // Catch:{ Exception -> 0x0b48 }
            gei r1 = defpackage.gei.BAD_REQUEST     // Catch:{ Exception -> 0x0b48 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x0b48 }
            goto L_0x0b41
        L_0x0b39:
            goto L_0x0b41
        L_0x0b3a:
            com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse r7 = new com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse     // Catch:{ Exception -> 0x0b48 }
            gei r1 = defpackage.gei.BAD_REQUEST     // Catch:{ Exception -> 0x0b48 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x0b48 }
        L_0x0b41:
            r23.writeNoException()
            defpackage.bhx.b(r3, r7)
            goto L_0x0b65
        L_0x0b48:
            r0 = move-exception
            r1 = r0
            android.os.RemoteException r1 = a((java.lang.Throwable) r1)
            throw r1
        L_0x0b4f:
            r4 = r1
            java.lang.String r1 = r22.readString()
            android.accounts.Account r2 = new android.accounts.Account
            r2.<init>(r1, r7)
            elt r1 = r4.b     // Catch:{ Exception -> 0x0b67 }
            com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData r1 = r1.a((android.accounts.Account) r2)     // Catch:{ Exception -> 0x0b67 }
            r23.writeNoException()
            defpackage.bhx.b(r3, r1)
        L_0x0b65:
            r1 = 1
            return r1
        L_0x0b67:
            r0 = move-exception
            r1 = r0
            android.os.RemoteException r1 = a((java.lang.Throwable) r1)
            goto L_0x0b6f
        L_0x0b6e:
            throw r1
        L_0x0b6f:
            goto L_0x0b6e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcp.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: enx} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        if (r11.equals(r5) == false) goto L_0x00b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r11, android.os.Bundle r12) {
        /*
            r10 = this;
            java.lang.String r0 = "password"
            java.lang.String r1 = "bootstrapBundle"
            int r2 = android.os.Binder.getCallingUid()
            fyq r3 = r10.a     // Catch:{ Exception -> 0x0138 }
            r3.a(r2)     // Catch:{ Exception -> 0x0138 }
            elt r2 = r10.b     // Catch:{ Exception -> 0x0138 }
            android.accounts.Account r3 = new android.accounts.Account     // Catch:{ Exception -> 0x0138 }
            java.lang.String r4 = "com.google"
            r3.<init>(r11, r4)     // Catch:{ Exception -> 0x0138 }
            android.os.Bundle r11 = r12.getBundle(r1)     // Catch:{ Exception -> 0x0138 }
            r12.remove(r1)     // Catch:{ Exception -> 0x0138 }
            r1 = 0
            r4 = 0
            if (r11 != 0) goto L_0x0023
            goto L_0x00dc
        L_0x0023:
            java.lang.String r5 = "partialBootstrapAssertion"
            byte[] r11 = r11.getByteArray(r5)     // Catch:{ Exception -> 0x0138 }
            if (r11 == 0) goto L_0x0034
            android.os.Parcelable$Creator r5 = com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest.CREATOR     // Catch:{ Exception -> 0x0138 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r11 = defpackage.ivy.a((byte[]) r11, (android.os.Parcelable.Creator) r5)     // Catch:{ Exception -> 0x0138 }
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r11 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r11     // Catch:{ Exception -> 0x0138 }
            goto L_0x0035
        L_0x0034:
            r11 = r1
        L_0x0035:
            if (r11 != 0) goto L_0x0042
            iwd r11 = defpackage.elt.a     // Catch:{ Exception -> 0x0138 }
            java.lang.String r0 = "Assertion expected for partial bootstrap, not found"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0138 }
            r11.d(r0, r5)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00dc
        L_0x0042:
            iwd r5 = defpackage.elt.a     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = "Completing partial restricted profile bootstrapping"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0138 }
            r5.b(r6, r7)     // Catch:{ Exception -> 0x0138 }
            fyk r5 = r2.d     // Catch:{ Exception -> 0x0138 }
            android.content.Context r5 = r5.a     // Catch:{ Exception -> 0x0138 }
            java.lang.Class<com.google.android.gms.auth.account.be.FinishBootstrapIntentOperation> r6 = com.google.android.gms.auth.account.be.FinishBootstrapIntentOperation.class
            java.lang.String r7 = "com.google.android.gms.auth.account.be.finish_bootstrap"
            android.content.Intent r6 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r5, (java.lang.Class) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = "bootstrapAccount"
            r6.putExtra(r7, r3)     // Catch:{ Exception -> 0x0138 }
            android.os.Messenger r7 = new android.os.Messenger     // Catch:{ Exception -> 0x0138 }
            els r8 = new els     // Catch:{ Exception -> 0x0138 }
            android.os.Looper r9 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0138 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0138 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = "messenger"
            r6.putExtra(r8, r7)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = "bootstrapAssertion"
            defpackage.ivy.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r11, (android.content.Intent) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x0138 }
            r5.startService(r6)     // Catch:{ Exception -> 0x0138 }
            java.util.concurrent.Semaphore r11 = defpackage.elt.b     // Catch:{ InterruptedException -> 0x0081 }
            r5 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ InterruptedException -> 0x0081 }
            r11.tryAcquire(r5, r7)     // Catch:{ InterruptedException -> 0x0081 }
            goto L_0x008b
        L_0x0081:
            r11 = move-exception
            iwd r5 = defpackage.elt.a     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = "Error waiting for count down"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0138 }
            r5.e(r6, r11, r7)     // Catch:{ Exception -> 0x0138 }
        L_0x008b:
            java.util.Map r11 = defpackage.elt.c     // Catch:{ Exception -> 0x0138 }
            boolean r11 = r11.containsKey(r3)     // Catch:{ Exception -> 0x0138 }
            if (r11 == 0) goto L_0x00dc
            iwd r11 = defpackage.elt.a     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = "Successful bootstrap of new profile"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0138 }
            r11.b(r5, r6)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "lst"
            java.lang.String r11 = r12.getString(r11)     // Catch:{ Exception -> 0x0138 }
            java.util.Map r5 = defpackage.elt.c     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0138 }
            if (r11 == 0) goto L_0x00b3
            boolean r11 = r11.equals(r5)     // Catch:{ Exception -> 0x0138 }
            if (r11 != 0) goto L_0x00c7
        L_0x00b2:
            goto L_0x00ba
        L_0x00b3:
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0138 }
            if (r11 != 0) goto L_0x00c7
            goto L_0x00b2
        L_0x00ba:
            eri r11 = new eri     // Catch:{ Exception -> 0x0138 }
            fyk r5 = r2.d     // Catch:{ Exception -> 0x0138 }
            android.content.Context r5 = r5.a     // Catch:{ Exception -> 0x0138 }
            r11.<init>(r5)     // Catch:{ Exception -> 0x0138 }
            r5 = 4
            r11.a(r5)     // Catch:{ Exception -> 0x0138 }
        L_0x00c7:
            enx r11 = defpackage.eqb.a     // Catch:{ Exception -> 0x0138 }
            java.util.Map r11 = defpackage.elt.c     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r11 = r11.get(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0138 }
            r12.remove(r0)     // Catch:{ Exception -> 0x0138 }
            r12.putString(r0, r11)     // Catch:{ Exception -> 0x0138 }
            java.util.Map r11 = defpackage.elt.c     // Catch:{ Exception -> 0x0138 }
            r11.remove(r3)     // Catch:{ Exception -> 0x0138 }
        L_0x00dc:
            enw r11 = new enw     // Catch:{ Exception -> 0x0138 }
            r11.<init>()     // Catch:{ Exception -> 0x0138 }
            java.util.Set r0 = r12.keySet()     // Catch:{ Exception -> 0x0138 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0138 }
        L_0x00e9:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x0138 }
            if (r5 == 0) goto L_0x0131
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0138 }
            awiq r6 = defpackage.awiq.a     // Catch:{ Exception -> 0x0138 }
            awir r6 = r6.a()     // Catch:{ Exception -> 0x0138 }
            boolean r6 = r6.a()     // Catch:{ Exception -> 0x0138 }
            if (r6 != 0) goto L_0x011a
            enx[] r6 = defpackage.eqb.p     // Catch:{ Exception -> 0x0138 }
            int r7 = r6.length     // Catch:{ Exception -> 0x0138 }
            r7 = 0
        L_0x0105:
            r8 = 14
            if (r7 >= r8) goto L_0x0118
            r8 = r6[r7]     // Catch:{ Exception -> 0x0138 }
            java.lang.String r9 = r8.a()     // Catch:{ Exception -> 0x0138 }
            boolean r9 = r9.equals(r5)     // Catch:{ Exception -> 0x0138 }
            if (r9 != 0) goto L_0x0123
            int r7 = r7 + 1
            goto L_0x0105
        L_0x0118:
            r8 = r1
            goto L_0x0123
        L_0x011a:
            anaf r6 = defpackage.eqb.q     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x0138 }
            r8 = r6
            enx r8 = (defpackage.enx) r8     // Catch:{ Exception -> 0x0138 }
        L_0x0123:
            if (r8 == 0) goto L_0x00e9
            java.lang.String r5 = r12.getString(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r5 = r8.a((java.lang.String) r5)     // Catch:{ Exception -> 0x0138 }
            r11.a(r8, r5)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00e9
        L_0x0131:
            eny r12 = r2.h     // Catch:{ Exception -> 0x0138 }
            r12.a((android.accounts.Account) r3, (defpackage.enw) r11)     // Catch:{ Exception -> 0x0138 }
            r11 = 1
            return r11
        L_0x0138:
            r11 = move-exception
            android.os.RemoteException r11 = a((java.lang.Throwable) r11)
            goto L_0x013f
        L_0x013e:
            throw r11
        L_0x013f:
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcp.a(java.lang.String, android.os.Bundle):boolean");
    }
}
