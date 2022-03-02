package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalResponse;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: elt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elt {
    public static final iwd a = ehv.a("GoogleAccountDataServiceImpl");
    public static final Semaphore b = new Semaphore(0);
    public static final Map c = new nz(1);
    public final fyk d;
    public final err e;
    public final erl f;
    public final elw g;
    public final eny h = ((eny) eny.a.b());
    public final elq i = new elq(this.d.a);
    public final erk j;
    public final fys k;
    public final ekt l;
    public final ese m;
    public final elr n;
    private final gjo o;

    public elt(fyk fyk) {
        iva.a((Object) fyk);
        this.d = fyk;
        Context context = fyk.a;
        this.e = erm.a(context);
        this.f = new erv(context);
        this.g = new elw(fyk);
        this.j = new erk(context);
        this.k = (fys) fys.d.b();
        this.l = (ekt) ekt.a.b();
        this.o = gjn.a();
        this.m = (ese) ese.d.b();
        this.n = new elr(context);
    }

    public final Bundle a(String str) {
        Account account = new Account(str, "com.google");
        if (!jgu.a(this.d.a, account)) {
            return null;
        }
        eny eny = this.h;
        enw a2 = enw.a();
        enx[] enxArr = eqb.p;
        int length = enxArr.length;
        for (int i2 = 0; i2 < 14; i2++) {
            enx enx = enxArr[i2];
            Object a3 = eny.a(account, enx);
            if (a3 != null) {
                a2.a(enx, a3);
            }
        }
        return a2.b();
    }

    public final String b(Account account) {
        iva.a(account.name, (Object) "AccountName must be provided");
        String str = (String) this.h.a(account, eqb.c);
        a.b("getGoogleAccountId(%s): %s.", iwd.a((Object) account), iwd.a((Object) str));
        return str == null ? "" : str;
    }

    public final DeviceManagementInfoResponse c(Account account) {
        avpo a2 = emi.a(this.d.a, account);
        Locale locale = Locale.getDefault();
        int i2 = Build.VERSION.SDK_INT;
        String languageTag = locale.toLanguageTag();
        aucd o2 = avwf.e.o();
        long a3 = jhg.a(this.d.a);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avwf avwf = (avwf) o2.b;
        int i3 = avwf.a | 2;
        avwf.a = i3;
        avwf.c = a3;
        languageTag.getClass();
        avwf.a = i3 | 1;
        avwf.b = languageTag;
        try {
            String b2 = gwc.b(this.d.a);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avwf avwf2 = (avwf) o2.b;
            b2.getClass();
            avwf2.a |= 8;
            avwf2.d = b2;
        } catch (hxw | hxx | IOException e2) {
            a.d("Exception while trying to get checkin device data version info.", e2, new Object[0]);
        }
        avwf avwf3 = (avwf) o2.i();
        aucd o3 = avpp.d.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        avpp avpp = (avpp) o3.b;
        a2.getClass();
        avpp.c = a2;
        int i4 = avpp.a | 2;
        avpp.a = i4;
        avwf3.getClass();
        avpp.b = avwf3;
        avpp.a = i4 | 1;
        avpq avpq = (avpq) this.o.a("post", ent.f(), (avpp) o3.i(), avpq.c).get();
        if (avpq != null) {
            avwg avwg = avpq.b;
            if (avwg == null) {
                avwg = avwg.c;
            }
            if (avwg.a.size() > 0) {
                avwg avwg2 = avpq.b;
                if (avwg2 == null) {
                    avwg2 = avwg.c;
                }
                String str = ((avwi) avwg2.a.get(0)).b;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        jni.b(this.d.a).b(str, 0);
                        return new DeviceManagementInfoResponse(str, true);
                    } catch (PackageManager.NameNotFoundException e3) {
                        return new DeviceManagementInfoResponse(str, false);
                    }
                }
            }
        }
        return new DeviceManagementInfoResponse((String) null, false);
    }

    public final String b(String str) {
        end end = new end(str);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("access_token", end.a));
            HttpResponse a2 = emt.a(ent.aI(), new UrlEncodedFormEntity(arrayList), (Map) null);
            if (a2.getStatusLine() == null || a2.getStatusLine().getStatusCode() != 200) {
                return null;
            }
            return new JSONObject(emt.b(a2)).getString("token_handle");
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            throw new iiy(gei.INTNERNAL_ERROR, "Data error.", e);
        } catch (JSONException e3) {
            e = e3;
            throw new iiy(gei.INTNERNAL_ERROR, "Data error.", e);
        } catch (IOException e4) {
            throw new iiy(gei.NETWORK_ERROR, "Error accessing token info endpoint.", e4);
        } catch (iiy e5) {
            a.e("Failed to get token handle", e5, new Object[0]);
            return null;
        }
    }

    public final AccountChangeEventsResponse a(AccountChangeEventsRequest accountChangeEventsRequest) {
        elv a2 = elv.a(this.d.a);
        String a3 = a2.a();
        try {
            return new AccountChangeEventsResponse(a2.a(accountChangeEventsRequest.c, accountChangeEventsRequest.b));
        } finally {
            a2.a(a3);
        }
    }

    public final AccountRemovalResponse a(AccountRemovalRequest accountRemovalRequest) {
        iva.a((Object) accountRemovalRequest, (Object) "accountRemovalRequest cannot be null!");
        Account account = accountRemovalRequest.c;
        if (!jgu.a(this.d.a, account)) {
            return new AccountRemovalResponse(gei.BAD_USERNAME);
        }
        qub a2 = qub.a(this.d.a);
        try {
            if (Build.VERSION.SDK_INT < 22) {
                a2.c(account).getResult();
            } else {
                a2.e(account);
            }
            return new AccountRemovalResponse(gei.SUCCESS);
        } catch (OperationCanceledException e2) {
            return new AccountRemovalResponse(gei.USER_CANCEL);
        } catch (AuthenticatorException e3) {
            return new AccountRemovalResponse(gei.UNKNOWN_ERROR);
        } catch (IOException e4) {
            return new AccountRemovalResponse(gei.UNKNOWN_ERROR);
        }
    }

    public final ClearTokenResponse a(ClearTokenRequest clearTokenRequest) {
        qub a2 = qub.a(this.d.a);
        iva.a((Object) clearTokenRequest, (Object) "clearTokenRequest cannot be null!");
        a2.b("com.google", clearTokenRequest.b);
        a2.b("cn.google", clearTokenRequest.b);
        return new ClearTokenResponse(gei.SUCCESS);
    }

    public final GoogleAccountData a(Account account) {
        if (!jgu.a(this.d.a, account)) {
            return null;
        }
        Set set = (Set) this.h.a(account, eqb.f);
        return new GoogleAccountData(account, ((Boolean) this.h.a(account, eqb.i)).booleanValue(), set != null ? new ArrayList(set) : new ArrayList(), (String) this.h.a(account, eqb.g), (String) this.h.a(account, eqb.h));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01db, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ee A[Catch:{ IOException -> 0x02b2, all -> 0x02a3, ekp -> 0x0024, iiy -> 0x02bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0223 A[Catch:{ IOException -> 0x02b2, all -> 0x02a3, ekp -> 0x0024, iiy -> 0x02bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0224 A[Catch:{ IOException -> 0x02b2, all -> 0x02a3, ekp -> 0x0024, iiy -> 0x02bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x027e A[Catch:{ IOException -> 0x02b2, all -> 0x02a3, ekp -> 0x0024, iiy -> 0x02bd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.auth.firstparty.dataservice.TokenResponse a(com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r17) {
        /*
            r16 = this;
            java.lang.String r1 = "signIn() -> %s."
            r2 = r16
            fyk r0 = r2.d
            android.content.Context r0 = r0.a
            ena r3 = new ena
            r4 = r17
            r3.<init>(r0, r4)
            r5 = 1
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r0 = r3.f     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r6 = r0.f     // Catch:{ iiy -> 0x02bd }
            java.lang.String r6 = r6.c     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.AppDescription r0 = r0.b     // Catch:{ iiy -> 0x02bd }
            r7 = 0
            if (r0 == 0) goto L_0x002f
            ekq r8 = r3.g     // Catch:{ ekp -> 0x0024 }
            java.lang.String r0 = r0.e     // Catch:{ ekp -> 0x0024 }
            eko r0 = r8.a(r0)     // Catch:{ ekp -> 0x0024 }
            goto L_0x0030
        L_0x0024:
            r0 = move-exception
            iiy r3 = new iiy     // Catch:{ iiy -> 0x02bd }
            gei r6 = defpackage.gei.BAD_REQUEST     // Catch:{ iiy -> 0x02bd }
            java.lang.String r7 = "Error when fetching package info"
            r3.<init>(r6, r7, r0)     // Catch:{ iiy -> 0x02bd }
            throw r3     // Catch:{ iiy -> 0x02bd }
        L_0x002f:
            r0 = r7
        L_0x0030:
            elx r8 = r3.e     // Catch:{ iiy -> 0x02bd }
            java.lang.String r9 = "created"
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r10 = r3.f     // Catch:{ iiy -> 0x02bd }
            boolean r10 = r10.c     // Catch:{ iiy -> 0x02bd }
            r8.a((java.lang.String) r9, (boolean) r10)     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r9 = r3.f     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r9 = r9.f     // Catch:{ iiy -> 0x02bd }
            r8.a((com.google.android.gms.auth.firstparty.shared.AccountCredentials) r9)     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r9 = r3.f     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.CaptchaSolution r9 = r9.e     // Catch:{ iiy -> 0x02bd }
            r8.a((com.google.android.gms.auth.firstparty.shared.CaptchaSolution) r9)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r9 = "droidguard_results"
            android.content.Context r10 = r3.b     // Catch:{ iiy -> 0x02bd }
            java.lang.String r11 = "addAccount"
            java.lang.String r10 = defpackage.elr.a((android.content.Context) r10, (java.lang.String) r11, (java.lang.String) r6)     // Catch:{ iiy -> 0x02bd }
            r8.a((java.lang.String) r9, (java.lang.String) r10)     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r9 = r3.f     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r9 = r9.f     // Catch:{ iiy -> 0x02bd }
            java.lang.String r9 = r9.h     // Catch:{ iiy -> 0x02bd }
            r8.c(r9)     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r9 = r3.f     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r9 = r9.f     // Catch:{ iiy -> 0x02bd }
            java.lang.String r9 = r9.g     // Catch:{ iiy -> 0x02bd }
            r8.b(r9)     // Catch:{ iiy -> 0x02bd }
            if (r0 == 0) goto L_0x0073
            elx r8 = r3.e     // Catch:{ iiy -> 0x02bd }
            java.lang.String r9 = r0.a     // Catch:{ iiy -> 0x02bd }
            java.lang.String r0 = r0.b     // Catch:{ iiy -> 0x02bd }
            r8.b(r9, r0)     // Catch:{ iiy -> 0x02bd }
        L_0x0073:
            if (r6 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            elx r0 = r3.e     // Catch:{ iiy -> 0x02bd }
            r0.a((java.lang.String) r6)     // Catch:{ iiy -> 0x02bd }
        L_0x007b:
            elx r0 = r3.e     // Catch:{ iiy -> 0x02bd }
            iwd r6 = defpackage.ena.a     // Catch:{ iiy -> 0x02bd }
            r0.a(r6)     // Catch:{ iiy -> 0x02bd }
            elx r0 = r3.e     // Catch:{ IOException -> 0x02b2 }
            java.util.List r0 = r0.a()     // Catch:{ IOException -> 0x02b2 }
            org.apache.http.client.entity.UrlEncodedFormEntity r6 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ IOException -> 0x02b2 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r0 = defpackage.ent.aD()     // Catch:{ IOException -> 0x02b2 }
            android.content.Context r8 = r3.b     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ IOException -> 0x02b2 }
            android.content.Context r9 = r3.b     // Catch:{ IOException -> 0x02b2 }
            org.apache.http.HttpResponse r0 = defpackage.emt.a(r0, r8, r6, r9)     // Catch:{ IOException -> 0x02b2 }
            byte[] r6 = defpackage.ena.a(r0)     // Catch:{ iiy -> 0x02bd }
            ema r8 = new ema     // Catch:{ iiy -> 0x02bd }
            org.apache.http.StatusLine r0 = r0.getStatusLine()     // Catch:{ iiy -> 0x02bd }
            r0.getStatusCode()     // Catch:{ iiy -> 0x02bd }
            if (r6 != 0) goto L_0x00af
            java.lang.String r0 = ""
            goto L_0x00b6
        L_0x00af:
            java.lang.String r0 = new java.lang.String     // Catch:{ iiy -> 0x02bd }
            java.nio.charset.Charset r9 = defpackage.amqn.c     // Catch:{ iiy -> 0x02bd }
            r0.<init>(r6, r9)     // Catch:{ iiy -> 0x02bd }
        L_0x00b6:
            r8.<init>(r0)     // Catch:{ iiy -> 0x02bd }
            elz r0 = defpackage.ema.p     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r0 = r8.a(r0)     // Catch:{ iiy -> 0x02bd }
            gei r6 = defpackage.gei.SUCCESS     // Catch:{ iiy -> 0x02bd }
            if (r0 == r6) goto L_0x011b
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r0 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse     // Catch:{ iiy -> 0x02bd }
            r0.<init>()     // Catch:{ iiy -> 0x02bd }
            elz r6 = defpackage.ema.p     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r6 = r8.a(r6)     // Catch:{ iiy -> 0x02bd }
            gei r6 = (defpackage.gei) r6     // Catch:{ iiy -> 0x02bd }
            r0.a((defpackage.gei) r6)     // Catch:{ iiy -> 0x02bd }
            elz r6 = defpackage.ema.b     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r6 = r8.a(r6)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ iiy -> 0x02bd }
            elz r7 = defpackage.ema.c     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r7 = r8.a(r7)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ iiy -> 0x02bd }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ iiy -> 0x02bd }
            if (r9 == 0) goto L_0x00ea
        L_0x00e9:
            goto L_0x00f8
        L_0x00ea:
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ iiy -> 0x02bd }
            if (r9 != 0) goto L_0x00e9
            android.content.Context r3 = r3.b     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.CaptchaChallenge r3 = defpackage.ena.a(r3, r6, r7)     // Catch:{ iiy -> 0x02bd }
            r0.n = r3     // Catch:{ iiy -> 0x02bd }
        L_0x00f8:
            elz r3 = defpackage.ema.f     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r3 = r8.a(r3)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ iiy -> 0x02bd }
            elz r6 = defpackage.ema.m     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r6 = r8.a(r6)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ iiy -> 0x02bd }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ iiy -> 0x02bd }
            if (r7 == 0) goto L_0x0110
        L_0x010e:
            goto L_0x0294
        L_0x0110:
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ iiy -> 0x02bd }
            if (r7 != 0) goto L_0x010e
            r0.e = r6     // Catch:{ iiy -> 0x02bd }
            r0.f = r3     // Catch:{ iiy -> 0x02bd }
            goto L_0x010e
        L_0x011b:
            elz r0 = defpackage.ema.e     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r0 = r8.a(r0)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ iiy -> 0x02bd }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ iiy -> 0x02bd }
            if (r6 != 0) goto L_0x02a8
            android.accounts.Account r6 = new android.accounts.Account     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r9 = r3.f     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r9 = r9.f     // Catch:{ iiy -> 0x02bd }
            java.lang.String r9 = r9.i     // Catch:{ iiy -> 0x02bd }
            r6.<init>(r0, r9)     // Catch:{ iiy -> 0x02bd }
            elz r0 = defpackage.ema.o     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r0 = r8.a(r0)     // Catch:{ iiy -> 0x02bd }
            java.util.List r0 = (java.util.List) r0     // Catch:{ iiy -> 0x02bd }
            elz r9 = defpackage.ema.g     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r9 = r8.a(r9)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ iiy -> 0x02bd }
            elz r10 = defpackage.ema.h     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r10 = r8.a(r10)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r11 = r3.f     // Catch:{ iiy -> 0x02bd }
            com.google.android.gms.auth.firstparty.shared.AccountCredentials r11 = r11.f     // Catch:{ iiy -> 0x02bd }
            boolean r11 = r11.b     // Catch:{ iiy -> 0x02bd }
            enw r12 = defpackage.enw.a()     // Catch:{ iiy -> 0x02bd }
            enx r13 = defpackage.eqb.a     // Catch:{ iiy -> 0x02bd }
            elz r14 = defpackage.ema.i     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r14 = r8.a(r14)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ iiy -> 0x02bd }
            r12.a(r13, r14)     // Catch:{ iiy -> 0x02bd }
            enx r13 = defpackage.eqb.g     // Catch:{ iiy -> 0x02bd }
            elz r14 = defpackage.ema.g     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r14 = r8.a(r14)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ iiy -> 0x02bd }
            r12.a(r13, r14)     // Catch:{ iiy -> 0x02bd }
            enx r13 = defpackage.eqb.h     // Catch:{ iiy -> 0x02bd }
            elz r14 = defpackage.ema.h     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r14 = r8.a(r14)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ iiy -> 0x02bd }
            r12.a(r13, r14)     // Catch:{ iiy -> 0x02bd }
            enx r13 = defpackage.eqb.c     // Catch:{ iiy -> 0x02bd }
            elz r14 = defpackage.ema.a     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r14 = r8.a(r14)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ iiy -> 0x02bd }
            r12.a(r13, r14)     // Catch:{ iiy -> 0x02bd }
            enx r13 = defpackage.eqb.i     // Catch:{ iiy -> 0x02bd }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)     // Catch:{ iiy -> 0x02bd }
            r12.a(r13, r14)     // Catch:{ iiy -> 0x02bd }
            if (r0 == 0) goto L_0x019f
            enx r13 = defpackage.eqb.f     // Catch:{ iiy -> 0x02bd }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ iiy -> 0x02bd }
            r14.<init>(r0)     // Catch:{ iiy -> 0x02bd }
            r12.a(r13, r14)     // Catch:{ iiy -> 0x02bd }
        L_0x019f:
            eny r13 = r3.d     // Catch:{ iiy -> 0x02bd }
            r13.a((android.accounts.Account) r6, (defpackage.enw) r12)     // Catch:{ iiy -> 0x02bd }
            android.content.Context r12 = r3.b     // Catch:{ iiy -> 0x02bd }
            elv r12 = defpackage.elv.a((android.content.Context) r12)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r13 = r12.a()     // Catch:{ iiy -> 0x02bd }
            java.lang.String r14 = r6.name     // Catch:{ all -> 0x02a3 }
            r12.a(r14, r5, r7)     // Catch:{ all -> 0x02a3 }
            r12.a((java.lang.String) r13)     // Catch:{ iiy -> 0x02bd }
            eny r7 = r3.d     // Catch:{ iiy -> 0x02bd }
            enx r12 = defpackage.eqb.a     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r7 = r7.a((android.accounts.Account) r6, (defpackage.enx) r12)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ iiy -> 0x02bd }
            elz r12 = defpackage.ema.i     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r12 = r8.a(r12)     // Catch:{ iiy -> 0x02bd }
            if (r12 == 0) goto L_0x01d7
            elz r12 = defpackage.ema.i     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r12 = r8.a(r12)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ iiy -> 0x02bd }
            boolean r7 = r12.equals(r7)     // Catch:{ iiy -> 0x02bd }
            if (r7 != 0) goto L_0x01e8
            goto L_0x01dd
        L_0x01d7:
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ iiy -> 0x02bd }
            if (r7 != 0) goto L_0x01e8
        L_0x01dd:
            eri r7 = new eri     // Catch:{ iiy -> 0x02bd }
            android.content.Context r12 = r3.b     // Catch:{ iiy -> 0x02bd }
            r7.<init>(r12)     // Catch:{ iiy -> 0x02bd }
            r12 = 5
            r7.a(r12)     // Catch:{ iiy -> 0x02bd }
        L_0x01e8:
            boolean r7 = defpackage.ent.r()     // Catch:{ iiy -> 0x02bd }
            if (r7 == 0) goto L_0x021d
            android.content.SyncAdapterType[] r7 = android.content.ContentResolver.getSyncAdapterTypes()     // Catch:{ iiy -> 0x02bd }
            int r12 = r7.length     // Catch:{ iiy -> 0x02bd }
            r13 = 0
        L_0x01f4:
            if (r13 >= r12) goto L_0x021d
            r14 = r7[r13]     // Catch:{ iiy -> 0x02bd }
            java.lang.String r15 = r6.type     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = r14.accountType     // Catch:{ iiy -> 0x02bd }
            boolean r4 = r15.equals(r4)     // Catch:{ iiy -> 0x02bd }
            if (r4 == 0) goto L_0x021a
            java.lang.String r4 = r14.authority     // Catch:{ iiy -> 0x02bd }
            int r4 = android.content.ContentResolver.getIsSyncable(r6, r4)     // Catch:{ iiy -> 0x02bd }
            if (r4 != 0) goto L_0x021a
            java.lang.String r4 = r14.authority     // Catch:{ iiy -> 0x02bd }
            r15 = -1
            android.content.ContentResolver.setIsSyncable(r6, r4, r15)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = r14.authority     // Catch:{ iiy -> 0x02bd }
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ iiy -> 0x02bd }
            r14.<init>()     // Catch:{ iiy -> 0x02bd }
            android.content.ContentResolver.requestSync(r6, r4, r14)     // Catch:{ iiy -> 0x02bd }
        L_0x021a:
            int r13 = r13 + 1
            goto L_0x01f4
        L_0x021d:
            com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest r4 = r3.f     // Catch:{ iiy -> 0x02bd }
            boolean r4 = r4.d     // Catch:{ iiy -> 0x02bd }
            if (r4 != 0) goto L_0x0224
            goto L_0x0229
        L_0x0224:
            gsa r3 = r3.c     // Catch:{ iiy -> 0x02bd }
            r3.a((android.accounts.Account) r6)     // Catch:{ iiy -> 0x02bd }
        L_0x0229:
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r3 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse     // Catch:{ iiy -> 0x02bd }
            r3.<init>()     // Catch:{ iiy -> 0x02bd }
            gei r4 = defpackage.gei.SUCCESS     // Catch:{ iiy -> 0x02bd }
            r3.a((defpackage.gei) r4)     // Catch:{ iiy -> 0x02bd }
            elz r4 = defpackage.ema.d     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ iiy -> 0x02bd }
            r3.v = r4     // Catch:{ iiy -> 0x02bd }
            r3.a((android.accounts.Account) r6)     // Catch:{ iiy -> 0x02bd }
            r3.h = r9     // Catch:{ iiy -> 0x02bd }
            r3.i = r10     // Catch:{ iiy -> 0x02bd }
            r3.m = r11     // Catch:{ iiy -> 0x02bd }
            elz r4 = defpackage.ema.j     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ iiy -> 0x02bd }
            r3.g = r4     // Catch:{ iiy -> 0x02bd }
            elz r4 = defpackage.ema.l     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ iiy -> 0x02bd }
            r3.p = r4     // Catch:{ iiy -> 0x02bd }
            elz r4 = defpackage.ema.k     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ iiy -> 0x02bd }
            r3.q = r4     // Catch:{ iiy -> 0x02bd }
            elz r4 = defpackage.ema.n     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ iiy -> 0x02bd }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ iiy -> 0x02bd }
            boolean r4 = r4.booleanValue()     // Catch:{ iiy -> 0x02bd }
            r3.j = r4     // Catch:{ iiy -> 0x02bd }
            elz r4 = defpackage.ema.m     // Catch:{ iiy -> 0x02bd }
            java.lang.Object r4 = r8.a(r4)     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ iiy -> 0x02bd }
            r3.e = r4     // Catch:{ iiy -> 0x02bd }
            if (r0 == 0) goto L_0x0293
            java.lang.String r4 = "googleme"
            boolean r4 = r0.contains(r4)     // Catch:{ iiy -> 0x02bd }
            if (r4 != 0) goto L_0x0291
            java.lang.String r4 = "esmobile"
            boolean r0 = r0.contains(r4)     // Catch:{ iiy -> 0x02bd }
            if (r0 == 0) goto L_0x0293
            r3.l = r5     // Catch:{ iiy -> 0x02bd }
            goto L_0x0293
        L_0x0291:
            r3.k = r5     // Catch:{ iiy -> 0x02bd }
        L_0x0293:
            r0 = r3
        L_0x0294:
            iwd r3 = a
            java.lang.Object[] r4 = new java.lang.Object[r5]
            gei r5 = r0.b()
            r6 = 0
            r4[r6] = r5
            r3.a(r1, r4)
            return r0
        L_0x02a3:
            r0 = move-exception
            r12.a((java.lang.String) r13)     // Catch:{ iiy -> 0x02bd }
            throw r0     // Catch:{ iiy -> 0x02bd }
        L_0x02a8:
            iiy r0 = new iiy     // Catch:{ iiy -> 0x02bd }
            gei r3 = defpackage.gei.SERVER_ERROR     // Catch:{ iiy -> 0x02bd }
            java.lang.String r4 = "Empty email."
            r0.<init>(r3, r4)     // Catch:{ iiy -> 0x02bd }
            throw r0     // Catch:{ iiy -> 0x02bd }
        L_0x02b2:
            r0 = move-exception
            iiy r3 = new iiy     // Catch:{ iiy -> 0x02bd }
            gei r4 = defpackage.gei.NETWORK_ERROR     // Catch:{ iiy -> 0x02bd }
            java.lang.String r6 = "Error when calling server."
            r3.<init>(r4, r6, r0)     // Catch:{ iiy -> 0x02bd }
            throw r3     // Catch:{ iiy -> 0x02bd }
        L_0x02bd:
            r0 = move-exception
            iwd r3 = a
            java.lang.Object[] r4 = new java.lang.Object[r5]
            gei r5 = r0.a
            r6 = 0
            r4[r6] = r5
            r3.a(r1, r0, r4)
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r1 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse
            r1.<init>()
            gei r0 = r0.a
            r1.a((defpackage.gei) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elt.a(com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest):com.google.android.gms.auth.firstparty.dataservice.TokenResponse");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v99, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d7 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e7 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ec A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ed A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0327 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0348 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0468 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0490 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04b4 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04d2 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0509 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0512 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x053f A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x054e A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0557 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0573 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x057a A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0588 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x05f0 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05fc A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05fd A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0618 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0626 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0635 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0676 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0678 A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x068c A[Catch:{ all -> 0x0433, ekp -> 0x0bad, enl -> 0x0bab }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0714 A[Catch:{ IOException -> 0x0b7d, all -> 0x0904, all -> 0x090c, enl -> 0x0b89 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0717 A[Catch:{ IOException -> 0x0b7d, all -> 0x0904, all -> 0x090c, enl -> 0x0b89 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x073c A[Catch:{ IOException -> 0x0b7d, all -> 0x0904, all -> 0x090c, enl -> 0x0b89 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x075c A[Catch:{ IOException -> 0x0b7d, all -> 0x0904, all -> 0x090c, enl -> 0x0b89 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0778 A[Catch:{ IOException -> 0x0b7d, all -> 0x0904, all -> 0x090c, enl -> 0x0b89 }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07e8 A[Catch:{ IOException -> 0x0b7d, all -> 0x0904, all -> 0x090c, enl -> 0x0b89 }] */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0c74  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.auth.firstparty.dataservice.TokenResponse a(com.google.android.gms.auth.firstparty.shared.AppDescription r43, com.google.android.gms.auth.firstparty.dataservice.TokenRequest r44) {
        /*
            r42 = this;
            r10 = r44
            java.lang.String r1 = "Calling AppDescription cannot be null!"
            r2 = r43
            defpackage.iva.a((java.lang.Object) r2, (java.lang.Object) r1)
            java.lang.String r1 = "TokenRequest cannot be null!"
            defpackage.iva.a((java.lang.Object) r10, (java.lang.Object) r1)
            android.os.Bundle r1 = r44.b()
            java.lang.String r2 = "gads_service_connection_start_time_millis"
            r3 = -1
            long r1 = r1.getLong(r2, r3)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0025
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            r11 = r3
            goto L_0x0026
        L_0x0025:
            r11 = r3
        L_0x0026:
            long r13 = android.os.SystemClock.elapsedRealtime()
            r15 = r42
            fyk r1 = r15.d
            android.content.Context r2 = r1.a
            enh r9 = new enh
            fzh r1 = defpackage.ekt.a
            java.lang.Object r1 = r1.b()
            r3 = r1
            ekt r3 = (defpackage.ekt) r3
            fzi r1 = defpackage.enq.b
            java.lang.Object r1 = r1.b()
            r4 = r1
            enq r4 = (defpackage.enq) r4
            emu r5 = new emu
            r5.<init>()
            ene r6 = new ene
            r6.<init>(r2)
            enf r7 = new enf
            r7.<init>(r2)
            awja r1 = defpackage.awja.a
            awjb r1 = r1.a()
            boolean r1 = r1.e()
            r8 = 0
            if (r1 == 0) goto L_0x0067
            iby r1 = defpackage.ejg.a(r2)
            r16 = r1
            goto L_0x0069
        L_0x0067:
            r16 = r8
        L_0x0069:
            r1 = r9
            r15 = r8
            r8 = r44
            r15 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = 1
            r7 = 0
            java.lang.String r8 = "com.google.work"
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r9 = r15.f     // Catch:{ iiy -> 0x0c01 }
            android.accounts.Account r9 = r9.a()     // Catch:{ iiy -> 0x0c01 }
            java.lang.String r9 = r9.type     // Catch:{ iiy -> 0x0c01 }
            boolean r8 = r8.equals(r9)     // Catch:{ iiy -> 0x0c01 }
            if (r8 != 0) goto L_0x0087
            goto L_0x00f6
        L_0x0087:
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r8 = r15.f     // Catch:{ iiy -> 0x0c01 }
            iby r9 = r15.g     // Catch:{ iiy -> 0x0c01 }
            if (r9 == 0) goto L_0x00ea
            com.google.android.gms.auth.firstparty.shared.AppDescription r1 = r8.j     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            java.lang.String r1 = r1.e     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            iha r5 = defpackage.ihb.b()     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            com.google.android.gms.common.Feature[] r4 = new com.google.android.gms.common.Feature[r6]     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            com.google.android.gms.common.Feature r17 = defpackage.eia.f     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            r4[r7] = r17     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            r5.b = r4     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            ejh r4 = new ejh     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            r4.<init>(r1)     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            r5.a = r4     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            ihb r1 = r5.a()     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            acwa r1 = r9.a((defpackage.ihb) r1)     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            java.lang.Object r1 = defpackage.acws.a((defpackage.acwa) r1)     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            boolean r1 = r1.booleanValue()     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            if (r1 == 0) goto L_0x00b9
            goto L_0x00ea
        L_0x00b9:
            iiy r1 = new iiy     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            gei r4 = defpackage.gei.SERVICE_DISABLED     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            java.lang.String r5 = "Service not whitelisted"
            r1.<init>(r4, r5)     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
            throw r1     // Catch:{ ExecutionException -> 0x00de, InterruptedException -> 0x00cb }
        L_0x00c3:
            r0 = move-exception
            r1 = r0
            r19 = r11
            r28 = r13
            goto L_0x0c07
        L_0x00cb:
            r0 = move-exception
            r1 = r0
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ iiy -> 0x00c3 }
            r4.interrupt()     // Catch:{ iiy -> 0x00c3 }
            iiy r4 = new iiy     // Catch:{ iiy -> 0x00c3 }
            gei r5 = defpackage.gei.SERVICE_DISABLED     // Catch:{ iiy -> 0x00c3 }
            java.lang.String r8 = "Internal error"
            r4.<init>(r5, r8, r1)     // Catch:{ iiy -> 0x00c3 }
            throw r4     // Catch:{ iiy -> 0x00c3 }
        L_0x00de:
            r0 = move-exception
            r1 = r0
            iiy r4 = new iiy     // Catch:{ iiy -> 0x00c3 }
            gei r5 = defpackage.gei.SERVICE_DISABLED     // Catch:{ iiy -> 0x00c3 }
            java.lang.String r8 = "Internal error"
            r4.<init>(r5, r8, r1)     // Catch:{ iiy -> 0x00c3 }
            throw r4     // Catch:{ iiy -> 0x00c3 }
        L_0x00ea:
            ekt r1 = r15.b     // Catch:{ ekp -> 0x0bf1 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r4 = r8.j     // Catch:{ ekp -> 0x0bf1 }
            java.lang.String r4 = r4.e     // Catch:{ ekp -> 0x0bf1 }
            boolean r1 = r1.a(r4)     // Catch:{ ekp -> 0x0bf1 }
            if (r1 == 0) goto L_0x0be1
        L_0x00f6:
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r1 = r15.f     // Catch:{ enl -> 0x0bcf }
            android.os.Bundle r1 = r1.b()     // Catch:{ enl -> 0x0bcf }
            eie r1 = defpackage.eie.a(r1)     // Catch:{ enl -> 0x0bcf }
            boolean r1 = r1.d()     // Catch:{ enl -> 0x0bcf }
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r4 = r15.f     // Catch:{ enl -> 0x0bcf }
            boolean r5 = r4.m     // Catch:{ enl -> 0x0bcf }
            if (r5 != 0) goto L_0x010d
            r8 = 0
            goto L_0x01ca
        L_0x010d:
            if (r1 == 0) goto L_0x01c9
            enq r1 = r15.c     // Catch:{ enl -> 0x01c1 }
            defpackage.enq.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r4)     // Catch:{ enl -> 0x01c1 }
            java.lang.String r5 = r4.b     // Catch:{ enl -> 0x01c1 }
            boolean r8 = r1.a((java.lang.String) r5)     // Catch:{ enl -> 0x01c1 }
            if (r8 == 0) goto L_0x01b1
            java.lang.String r8 = "oauth2:"
            boolean r5 = r5.startsWith(r8)     // Catch:{ enl -> 0x01c1 }
            if (r5 != 0) goto L_0x0125
            goto L_0x0194
        L_0x0125:
            android.accounts.Account r5 = r4.a()     // Catch:{ enl -> 0x01c1 }
            java.lang.String r8 = r4.b     // Catch:{ enl -> 0x01c1 }
            r9 = 0
            java.lang.String r2 = r1.a(r4, r6, r9)     // Catch:{ enl -> 0x01c1 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ enl -> 0x01c1 }
            r9 = 7
            java.lang.String r8 = r8.substring(r9)     // Catch:{ enl -> 0x01c1 }
            java.lang.String r9 = " "
            java.lang.String[] r8 = r8.split(r9)     // Catch:{ enl -> 0x01c1 }
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ enl -> 0x01c1 }
            r3.<init>(r8)     // Catch:{ enl -> 0x01c1 }
            eny r8 = r1.d     // Catch:{ enl -> 0x01c1 }
            enx r9 = defpackage.eqb.a     // Catch:{ enl -> 0x01c1 }
            enx r9 = defpackage.eqh.b(r2)     // Catch:{ enl -> 0x01c1 }
            java.lang.Object r8 = r8.a((android.accounts.Account) r5, (defpackage.enx) r9)     // Catch:{ enl -> 0x01c1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ enl -> 0x01c1 }
            if (r8 == 0) goto L_0x0182
            java.lang.String r9 = ""
            r3.remove(r9)     // Catch:{ enl -> 0x01c1 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ enl -> 0x01c1 }
            java.lang.String r7 = " "
            java.lang.String[] r7 = r8.split(r7)     // Catch:{ enl -> 0x01c1 }
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch:{ enl -> 0x01c1 }
            r9.<init>(r7)     // Catch:{ enl -> 0x01c1 }
            boolean r3 = r9.containsAll(r3)     // Catch:{ enl -> 0x01c1 }
            if (r3 == 0) goto L_0x0180
            eis r8 = r1.a(r5, r2)     // Catch:{ enl -> 0x01c1 }
            if (r8 == 0) goto L_0x0180
            r8.c = r6     // Catch:{ enl -> 0x01c1 }
            r8.d = r6     // Catch:{ enl -> 0x01c1 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ enl -> 0x01c1 }
            r2.<init>(r9)     // Catch:{ enl -> 0x01c1 }
            r8.e = r2     // Catch:{ enl -> 0x01c1 }
            goto L_0x018d
        L_0x0180:
            r8 = 0
            goto L_0x018d
        L_0x0182:
            iwd r2 = defpackage.enq.a     // Catch:{ enl -> 0x01c1 }
            java.lang.String r3 = "Missing snowballing token: no granted scopes set."
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ enl -> 0x01c1 }
            r2.a(r3, r7)     // Catch:{ enl -> 0x01c1 }
            r8 = 0
        L_0x018d:
            if (r8 == 0) goto L_0x0194
            com.google.android.gms.auth.TokenData r8 = r8.a()     // Catch:{ enl -> 0x01c1 }
            goto L_0x01b2
        L_0x0194:
            r2 = 0
            r3 = 0
            java.lang.String r5 = r1.a(r4, r3, r2)     // Catch:{ enl -> 0x01c1 }
            android.accounts.Account r2 = r4.a()     // Catch:{ enl -> 0x01c1 }
            eis r1 = r1.a(r2, r5)     // Catch:{ enl -> 0x01c1 }
            if (r1 == 0) goto L_0x01af
            r1.c = r6     // Catch:{ enl -> 0x01c1 }
            r2 = 0
            r1.d = r2     // Catch:{ enl -> 0x01c1 }
            com.google.android.gms.auth.TokenData r8 = r1.a()     // Catch:{ enl -> 0x01c1 }
            goto L_0x01b2
        L_0x01af:
            r8 = 0
            goto L_0x01b2
        L_0x01b1:
            r8 = 0
        L_0x01b2:
            if (r8 == 0) goto L_0x01bf
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r1 = r15.f     // Catch:{ enl -> 0x01c1 }
            android.accounts.Account r1 = r1.a()     // Catch:{ enl -> 0x01c1 }
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r8 = defpackage.emu.a((android.accounts.Account) r1, (com.google.android.gms.auth.TokenData) r8)     // Catch:{ enl -> 0x01c1 }
            goto L_0x01ca
        L_0x01bf:
            r8 = 0
            goto L_0x01ca
        L_0x01c1:
            r0 = move-exception
            r1 = r0
            r19 = r11
            r28 = r13
            goto L_0x0bd5
        L_0x01c9:
            r8 = 0
        L_0x01ca:
            if (r8 == 0) goto L_0x01d3
            r3 = r10
            r19 = r11
            r28 = r13
            goto L_0x0c39
        L_0x01d3:
            ene r1 = r15.d     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r15.f     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            emk r3 = new emk     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            android.content.Context r4 = r1.b     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            r3.<init>(r4)     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            android.accounts.Account r4 = r2.a()     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            java.lang.String r5 = r2.b     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            android.os.Bundle r7 = r2.b()     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            eie r8 = defpackage.eie.a(r7)     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            com.google.android.gms.auth.firstparty.shared.ApplicationInformation r9 = r8.b()     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            if (r9 != 0) goto L_0x0251
            com.google.android.gms.auth.firstparty.shared.AppDescription r9 = r2.j     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            ekq r6 = r1.c     // Catch:{ ekp -> 0x0bbf, enl -> 0x0baf }
            r19 = r11
            java.lang.String r11 = r9.e     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            eko r6 = r6.a(r11)     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            boolean r11 = defpackage.ent.as()     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            if (r11 == 0) goto L_0x0238
            int r11 = defpackage.ent.at()     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            int r9 = r9.b     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            if (r11 == r9) goto L_0x020f
            r28 = r13
            goto L_0x023a
        L_0x020f:
            if (r4 == 0) goto L_0x0238
            java.lang.String r9 = r4.name     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            java.lang.String r11 = "cloudtestlabaccounts.com"
            boolean r9 = r9.endsWith(r11)     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            if (r9 == 0) goto L_0x0238
            java.lang.String r23 = defpackage.ent.au()     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            eko r9 = new eko     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            java.lang.String r11 = r6.a     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            r24 = 0
            boolean r12 = r6.d     // Catch:{ ekp -> 0x024e, enl -> 0x024b, iiy -> 0x0248 }
            r28 = r13
            long r13 = r6.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r21 = r9
            r22 = r11
            r25 = r12
            r26 = r13
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r6 = r9
            goto L_0x023a
        L_0x0238:
            r28 = r13
        L_0x023a:
            com.google.android.gms.auth.firstparty.shared.ApplicationInformation r9 = new com.google.android.gms.auth.firstparty.shared.ApplicationInformation     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r11 = r6.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r12 = r6.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r13 = r6.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r6 = r6.d     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r9.<init>(r11, r12, r13, r6)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x0255
        L_0x0248:
            r0 = move-exception
            goto L_0x0c04
        L_0x024b:
            r0 = move-exception
            goto L_0x0bb2
        L_0x024e:
            r0 = move-exception
            goto L_0x0bc2
        L_0x0251:
            r19 = r11
            r28 = r13
        L_0x0255:
            java.lang.String r6 = "clientPackageName"
            boolean r6 = r7.containsKey(r6)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r6 == 0) goto L_0x0277
            java.lang.String r6 = "clientPackageName"
            java.lang.String r6 = r7.getString(r6)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            ekq r11 = r1.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            eko r6 = r11.a(r6)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            com.google.android.gms.auth.firstparty.shared.ApplicationInformation r11 = new com.google.android.gms.auth.firstparty.shared.ApplicationInformation     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r12 = r6.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r13 = r6.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r14 = r6.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r6 = r6.d     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r11.<init>(r12, r13, r14, r6)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x0278
        L_0x0277:
            r11 = r9
        L_0x0278:
            eny r6 = r1.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            enx r12 = defpackage.eqb.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Object r6 = r6.a((android.accounts.Account) r4, (defpackage.enx) r12)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r12 = android.text.TextUtils.isEmpty(r6)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r12 != 0) goto L_0x0ba1
            java.lang.String r12 = "Email"
            java.lang.String r13 = r4.name     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r3.a((java.lang.String) r12, (java.lang.String) r13)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r12 = "Token"
            r3.a((java.lang.String) r12, (java.lang.String) r6)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r6 = defpackage.ent.aq()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r6 == 0) goto L_0x02c4
            eny r6 = r1.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            eqd r12 = defpackage.eqb.l     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Object r6 = r6.a((android.accounts.Account) r4, (defpackage.enx) r12)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r6 == 0) goto L_0x02c2
            long r21 = defpackage.ent.ar()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r12 = r12 - r21
            long r21 = r6.longValue()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Long r6 = java.lang.Long.valueOf(r21)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r21 = r6.longValue()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r6 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r6 <= 0) goto L_0x02c4
            r6 = 1
            goto L_0x02c5
        L_0x02c2:
            r6 = 1
            goto L_0x02c5
        L_0x02c4:
            r6 = 0
        L_0x02c5:
            boolean r12 = defpackage.awkb.b()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r12 == 0) goto L_0x02e7
            eny r12 = r1.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            eqd r13 = defpackage.eqb.m     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Object r12 = r12.a((android.accounts.Account) r4, (defpackage.enx) r13)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r12 == 0) goto L_0x02e7
            long r12 = r12.longValue()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r14 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r14 >= 0) goto L_0x02e5
            r12 = 0
            goto L_0x02e8
        L_0x02e5:
            r12 = 1
            goto L_0x02e8
        L_0x02e7:
            r12 = 0
        L_0x02e8:
            boolean r13 = r2.l     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r13 == 0) goto L_0x02ed
            goto L_0x0316
        L_0x02ed:
            java.util.Random r13 = new java.util.Random     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r13.<init>()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            float r13 = r13.nextFloat()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            double r13 = (double) r13     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            double r21 = defpackage.ent.d()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r23 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r23 < 0) goto L_0x0316
            if (r6 != 0) goto L_0x0316
            if (r12 == 0) goto L_0x0304
            goto L_0x0316
        L_0x0304:
            r39 = r2
            r2 = r3
            r6 = r4
            r25 = r5
            r22 = r7
            r23 = r8
            r26 = r9
            r24 = r11
            r21 = r15
            goto L_0x0496
        L_0x0316:
            elr r12 = r1.f     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r13 = "getToken"
            java.lang.String r14 = r4.name     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r10 = "flowName cannot be null!"
            defpackage.iva.a((java.lang.Object) r13, (java.lang.Object) r10)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r10 = defpackage.ent.N()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r10 != 0) goto L_0x0348
            iwd r10 = defpackage.elr.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r12 = "DroidGuard is turned off"
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r10.a(r12, r14)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r27 = r1
            r39 = r2
            r40 = r3
            r41 = r4
            r25 = r5
            r22 = r7
            r23 = r8
            r26 = r9
            r24 = r11
            r21 = r15
            r8 = 0
            goto L_0x0466
        L_0x0348:
            long r21 = defpackage.ent.a()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r17 = 0
            int r10 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r10 <= 0) goto L_0x044a
            hxj r10 = defpackage.hxj.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r21 = r15
            android.content.Context r15 = r12.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r10 = r10.b(r15)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r10 != 0) goto L_0x0437
            java.util.Map r10 = defpackage.elr.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            monitor-enter(r10)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.util.Map r15 = defpackage.elr.b     // Catch:{ all -> 0x0433 }
            java.lang.Object r15 = r15.get(r13)     // Catch:{ all -> 0x0433 }
            lxv r15 = (defpackage.lxv) r15     // Catch:{ all -> 0x0433 }
            if (r15 != 0) goto L_0x03bf
            lxs r15 = new lxs     // Catch:{ all -> 0x0433 }
            r22 = r7
            android.content.Context r7 = r12.c     // Catch:{ all -> 0x0433 }
            android.content.Context r7 = r7.getApplicationContext()     // Catch:{ all -> 0x0433 }
            r15.<init>(r7, r13)     // Catch:{ all -> 0x0433 }
            r23 = r8
            long r7 = defpackage.ent.b()     // Catch:{ all -> 0x0433 }
            r15.e = r7     // Catch:{ all -> 0x0433 }
            long r7 = defpackage.ent.a()     // Catch:{ all -> 0x0433 }
            r15.f = r7     // Catch:{ all -> 0x0433 }
            java.util.concurrent.ArrayBlockingQueue r7 = new java.util.concurrent.ArrayBlockingQueue     // Catch:{ all -> 0x0433 }
            r8 = 100
            r7.<init>(r8)     // Catch:{ all -> 0x0433 }
            lxv r8 = new lxv     // Catch:{ all -> 0x0433 }
            r24 = r11
            lxz r11 = r15.c     // Catch:{ all -> 0x0433 }
            r25 = r5
            java.lang.String r5 = r15.a     // Catch:{ all -> 0x0433 }
            r26 = r9
            com.google.android.gms.droidguard.DroidGuardResultsRequest r9 = r15.d     // Catch:{ all -> 0x0433 }
            r27 = r1
            r39 = r2
            long r1 = r15.e     // Catch:{ all -> 0x0433 }
            r40 = r3
            r41 = r4
            long r3 = r15.f     // Catch:{ all -> 0x0433 }
            r30 = r8
            r31 = r7
            r32 = r11
            r33 = r5
            r34 = r9
            r35 = r1
            r37 = r3
            r30.<init>(r31, r32, r33, r34, r35, r37)     // Catch:{ all -> 0x0433 }
            java.util.Map r1 = defpackage.elr.b     // Catch:{ all -> 0x0433 }
            r1.put(r13, r8)     // Catch:{ all -> 0x0433 }
            r15 = r8
            goto L_0x03d1
        L_0x03bf:
            r27 = r1
            r39 = r2
            r40 = r3
            r41 = r4
            r25 = r5
            r22 = r7
            r23 = r8
            r26 = r9
            r24 = r11
        L_0x03d1:
            monitor-exit(r10)     // Catch:{ all -> 0x0433 }
            java.util.Map r1 = r12.a(r14)     // Catch:{ RuntimeException -> 0x0425 }
            java.lang.Thread r2 = r15.i     // Catch:{ RuntimeException -> 0x0425 }
            monitor-enter(r2)     // Catch:{ RuntimeException -> 0x0425 }
            java.lang.Thread r3 = r15.i     // Catch:{ all -> 0x0421 }
            boolean r3 = r3.isAlive()     // Catch:{ all -> 0x0421 }
            if (r3 != 0) goto L_0x03e6
            java.lang.Thread r3 = r15.i     // Catch:{ all -> 0x0421 }
            r3.start()     // Catch:{ all -> 0x0421 }
        L_0x03e6:
            monitor-exit(r2)     // Catch:{ all -> 0x0421 }
            java.util.concurrent.ArrayBlockingQueue r2 = new java.util.concurrent.ArrayBlockingQueue     // Catch:{ RuntimeException -> 0x0425 }
            r3 = 1
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x0425 }
            lxt r3 = new lxt     // Catch:{ RuntimeException -> 0x0425 }
            r3.<init>(r1, r2)     // Catch:{ RuntimeException -> 0x0425 }
            java.util.concurrent.BlockingQueue r1 = r15.h     // Catch:{ RuntimeException -> 0x0425 }
            amri r3 = defpackage.amri.b(r3)     // Catch:{ RuntimeException -> 0x0425 }
            boolean r1 = r1.offer(r3)     // Catch:{ RuntimeException -> 0x0425 }
            if (r1 == 0) goto L_0x041a
            long r3 = r15.f     // Catch:{ InterruptedException -> 0x0412 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0412 }
            java.lang.Object r1 = r2.poll(r3, r1)     // Catch:{ InterruptedException -> 0x0412 }
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ InterruptedException -> 0x0412 }
            if (r8 != 0) goto L_0x0466
            java.lang.String r1 = "Synchronous getResults timed out."
            java.lang.String r8 = defpackage.mae.b(r1)     // Catch:{ InterruptedException -> 0x0412 }
            goto L_0x0466
        L_0x0412:
            r0 = move-exception
            java.lang.String r1 = "Synchronous getResults interrupted."
            java.lang.String r8 = defpackage.mae.b(r1)     // Catch:{ RuntimeException -> 0x0425 }
            goto L_0x0466
        L_0x041a:
            java.lang.String r1 = "Caching client max queue size reached."
            java.lang.String r8 = defpackage.mae.b(r1)     // Catch:{ RuntimeException -> 0x0425 }
            goto L_0x0466
        L_0x0421:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0421 }
            throw r1     // Catch:{ RuntimeException -> 0x0425 }
        L_0x0425:
            r0 = move-exception
            r1 = r0
            iwd r2 = defpackage.elr.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r3 = "DroidGuard runtime exception: "
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.e(r3, r1, r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8 = 0
            goto L_0x0466
        L_0x0433:
            r0 = move-exception
            r1 = r0
            monitor-exit(r10)     // Catch:{ all -> 0x0433 }
            throw r1     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x0437:
            r27 = r1
            r39 = r2
            r40 = r3
            r41 = r4
            r25 = r5
            r22 = r7
            r23 = r8
            r26 = r9
            r24 = r11
            goto L_0x045e
        L_0x044a:
            r27 = r1
            r39 = r2
            r40 = r3
            r41 = r4
            r25 = r5
            r22 = r7
            r23 = r8
            r26 = r9
            r24 = r11
            r21 = r15
        L_0x045e:
            java.util.Map r1 = r12.a(r14)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r8 = r12.a(r13, r1)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x0466:
            if (r8 == 0) goto L_0x0490
            java.lang.String r1 = "droidguard_results"
            r2 = r40
            r2.a((java.lang.String) r1, (java.lang.String) r8)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r6 == 0) goto L_0x048b
            java.lang.String r1 = "droidguardPeriodicUpdate"
            r3 = 1
            r2.a((java.lang.String) r1, (boolean) r3)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r1 = r27
            eny r3 = r1.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            eqd r4 = defpackage.eqb.l     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r6 = r41
            r3.b(r6, r4, r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x0496
        L_0x048b:
            r1 = r27
            r6 = r41
            goto L_0x0496
        L_0x0490:
            r1 = r27
            r2 = r40
            r6 = r41
        L_0x0496:
            r3 = r39
            int r4 = r3.o     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x04ae
            java.lang.String r5 = r3.p     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 == 0) goto L_0x04ae
            java.lang.String r7 = "delegation_type"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r7, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = "delegatee_user_id"
            r2.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x04ae:
            boolean r4 = r23.d()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x04d2
            gda r4 = r3.c()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            gda r5 = defpackage.gda.GRANTED     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == r5) goto L_0x04cc
            enn r4 = r1.d     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r9 = r26
            java.lang.String r5 = r9.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r7 = r25
            boolean r4 = r4.a(r6, r5, r7)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 != 0) goto L_0x04d0
            r4 = 0
            goto L_0x04e1
        L_0x04cc:
            r7 = r25
            r9 = r26
        L_0x04d0:
            r4 = 1
            goto L_0x04e1
        L_0x04d2:
            r7 = r25
            r9 = r26
            gda r4 = r3.c()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            gda r5 = defpackage.gda.GRANTED     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 != r5) goto L_0x04e0
            r4 = 1
            goto L_0x04e1
        L_0x04e0:
            r4 = 0
        L_0x04e1:
            java.lang.String r5 = "has_permission"
            r2.a((java.lang.String) r5, (boolean) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = "service"
            r2.a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = "app"
            java.lang.String r5 = r9.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = "client_sig"
            java.lang.String r5 = r9.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = "system_partition"
            boolean r5 = r9.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r4, (boolean) r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r11 = r24
            r2.a(r11)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = r3.r     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x050e
            java.lang.String r5 = "consent_result"
            r2.a((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x050e:
            com.google.android.gms.auth.firstparty.shared.FACLConfig r4 = r3.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x0553
            boolean r5 = r4.g     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 != 0) goto L_0x0517
            goto L_0x0526
        L_0x0517:
            boolean r5 = r4.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 != 0) goto L_0x0526
            java.lang.String r5 = "is_all_circles_visible"
            r2.d(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r5 = "visible_edges"
            r2.d(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x053b
        L_0x0526:
            java.lang.String r5 = "is_all_circles_visible"
            boolean r7 = r4.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r7 != 0) goto L_0x052f
            java.lang.String r7 = "0"
            goto L_0x0531
        L_0x052f:
            java.lang.String r7 = "1"
        L_0x0531:
            r2.a((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r5 = "visible_edges"
            java.lang.String r7 = r4.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x053b:
            boolean r5 = r4.f     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 == 0) goto L_0x054e
            java.lang.String r5 = "is_all_contacts_visible"
            boolean r4 = r4.d     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 != 0) goto L_0x0548
            java.lang.String r4 = "0"
            goto L_0x054a
        L_0x0548:
            java.lang.String r4 = "1"
        L_0x054a:
            r2.a((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x0553
        L_0x054e:
            java.lang.String r4 = "is_all_contacts_visible"
            r2.d(r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x0553:
            com.google.android.gms.auth.firstparty.shared.PACLConfig r4 = r3.f     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x056d
            java.lang.String r5 = "request_visible_actions"
            java.lang.String r7 = r4.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = r4.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x0568
            java.lang.String r5 = "p_acl_picker_data"
            r2.a((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x056d
        L_0x0568:
            java.lang.String r4 = "p_acl_picker_data"
            r2.d(r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x056d:
            aqll r4 = r23.a()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 != 0) goto L_0x057a
            aqll r4 = defpackage.aqll.k     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aucd r4 = r4.o()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x0584
        L_0x057a:
            aqll r4 = r23.a()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aqll r5 = defpackage.aqll.k     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aucd r4 = r5.a((defpackage.aucj) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x0584:
            boolean r5 = r11.d     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 == 0) goto L_0x05f0
            java.lang.String r5 = "is_consent_auto_approved_by_google_now"
            r7 = r22
            r8 = 0
            boolean r5 = r7.getBoolean(r5, r8)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r8 = r4.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r8 != 0) goto L_0x0596
            goto L_0x059c
        L_0x0596:
            r4.c()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8 = 0
            r4.c = r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x059c:
            aucj r8 = r4.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aqll r8 = (defpackage.aqll) r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r10 = r8.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r12 = 1
            r10 = r10 | r12
            r8.a = r10     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8.b = r5     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r5 = "reauth_proof_token"
            boolean r5 = r7.containsKey(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 == 0) goto L_0x05d0
            java.lang.String r5 = "reauth_proof_token"
            java.lang.String r5 = r7.getString(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            boolean r8 = r4.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r8 != 0) goto L_0x05bb
            goto L_0x05c1
        L_0x05bb:
            r4.c()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8 = 0
            r4.c = r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x05c1:
            aucj r8 = r4.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aqll r8 = (defpackage.aqll) r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r5.getClass()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r10 = r8.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r12 = 4
            r10 = r10 | r12
            r8.a = r10     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8.d = r5     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x05d0:
            java.lang.String r5 = r3.q     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 != 0) goto L_0x05d5
            goto L_0x05f8
        L_0x05d5:
            boolean r8 = r4.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r8 != 0) goto L_0x05da
            goto L_0x05e0
        L_0x05da:
            r4.c()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8 = 0
            r4.c = r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x05e0:
            aucj r8 = r4.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aqll r8 = (defpackage.aqll) r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r5.getClass()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r10 = r8.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r12 = 2
            r10 = r10 | r12
            r8.a = r10     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8.c = r5     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x05f8
        L_0x05f0:
            r7 = r22
            aqll r4 = defpackage.aqll.k     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aucd r4 = r4.o()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x05f8:
            boolean r5 = r4.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r5 != 0) goto L_0x05fd
            goto L_0x0603
        L_0x05fd:
            r4.c()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r5 = 0
            r4.c = r5     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x0603:
            aucj r5 = r4.b     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aqll r5 = (defpackage.aqll) r5     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8 = 2
            r5.g = r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            int r8 = r5.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r8 = r8 | 64
            r5.a = r8     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aucj r4 = r4.i()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            aqll r4 = (defpackage.aqll) r4     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x0626
            java.lang.String r5 = "token_request_options"
            byte[] r4 = r4.k()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = defpackage.jhy.c((byte[]) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x062b
        L_0x0626:
            java.lang.String r4 = "token_request_options"
            r2.d(r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x062b:
            long r4 = defpackage.ent.z()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r12 = 0
            int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0666
            eny r4 = r1.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            android.accounts.Account r3 = r3.a()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            enx r5 = defpackage.eqb.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Object r3 = r4.a((android.accounts.Account) r3, (defpackage.enx) r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r3 == 0) goto L_0x0664
            long r12 = r3.longValue()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r12 = r3.longValue()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r4 = r4 - r12
            long r12 = defpackage.ent.z()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            int r3 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0666
            r3 = 1
            goto L_0x0667
        L_0x0664:
            r3 = 1
            goto L_0x0667
        L_0x0666:
            r3 = 0
        L_0x0667:
            java.lang.String r4 = "check_email"
            r2.a((java.lang.String) r4, (boolean) r3)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            eny r1 = r1.e     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            enx r3 = defpackage.eqb.c     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.Object r1 = r1.a((android.accounts.Account) r6, (defpackage.enx) r3)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r1 != 0) goto L_0x0678
            r1 = 1
            goto L_0x0679
        L_0x0678:
            r1 = 0
        L_0x0679:
            java.lang.String r3 = "get_accountid"
            r2.a((java.lang.String) r3, (boolean) r1)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.util.Set r1 = r7.keySet()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x0686:
            boolean r3 = r1.hasNext()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r3 == 0) goto L_0x06dd
            java.lang.Object r3 = r1.next()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r4 = "_opt_"
            boolean r4 = r3.startsWith(r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 != 0) goto L_0x06c0
            java.lang.String r4 = "oauth2_"
            boolean r4 = r3.startsWith(r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x0686
            boolean r4 = r11.d     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x06a7
            goto L_0x06af
        L_0x06a7:
            java.lang.String r4 = "oauth2_foreground"
            boolean r4 = r3.equals(r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x0686
        L_0x06af:
            java.lang.String r4 = r7.getString(r3)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r5 = "oauth2_"
            boolean r5 = r3.startsWith(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            defpackage.iva.b((boolean) r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x0686
        L_0x06c0:
            boolean r4 = r9.d     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            if (r4 == 0) goto L_0x0686
            java.lang.String r4 = r7.getString(r3)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r5 = "_opt_"
            boolean r5 = r3.startsWith(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            defpackage.iva.b((boolean) r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r5 = 5
            java.lang.String r3 = r3.substring(r5)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            goto L_0x0686
        L_0x06dd:
            iwd r1 = defpackage.ene.a     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            r2.a(r1)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.util.List r1 = r2.a()     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ iiy -> 0x0bdf }
            org.apache.http.client.entity.UrlEncodedFormEntity r4 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ IOException -> 0x0b95 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0b95 }
            java.lang.String r1 = defpackage.ent.aD()     // Catch:{ IOException -> 0x0b95 }
            r5 = r21
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r6 = r5.f     // Catch:{ IOException -> 0x0b95 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r6 = r6.j     // Catch:{ IOException -> 0x0b95 }
            java.lang.String r6 = r6.e     // Catch:{ IOException -> 0x0b95 }
            android.content.Context r7 = r5.a     // Catch:{ IOException -> 0x0b95 }
            org.apache.http.HttpResponse r1 = defpackage.emt.a(r1, r6, r4, r7)     // Catch:{ IOException -> 0x0b95 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ iiy -> 0x0bdf }
            long r6 = r6 - r2
            enf r2 = r5.e     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r3 = r5.f     // Catch:{ enl -> 0x0b89 }
            org.apache.http.HttpEntity r4 = r1.getEntity()     // Catch:{ IOException -> 0x0b7d }
            java.io.InputStream r4 = defpackage.opc.a((org.apache.http.HttpEntity) r4)     // Catch:{ IOException -> 0x0b7d }
            if (r4 != 0) goto L_0x0717
            java.lang.String r4 = ""
            goto L_0x0723
        L_0x0717:
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x0b7d }
            byte[] r4 = defpackage.jjt.b((java.io.InputStream) r4)     // Catch:{ IOException -> 0x0b7d }
            java.nio.charset.Charset r8 = defpackage.amqn.c     // Catch:{ IOException -> 0x0b7d }
            r5.<init>(r4, r8)     // Catch:{ IOException -> 0x0b7d }
            r4 = r5
        L_0x0723:
            ems r5 = new ems     // Catch:{ enl -> 0x0b89 }
            org.apache.http.StatusLine r1 = r1.getStatusLine()     // Catch:{ enl -> 0x0b89 }
            r1.getStatusCode()     // Catch:{ enl -> 0x0b89 }
            java.lang.String r1 = r3.b     // Catch:{ enl -> 0x0b89 }
            android.os.Bundle r8 = r3.b()     // Catch:{ enl -> 0x0b89 }
            eie r8 = defpackage.eie.a(r8)     // Catch:{ enl -> 0x0b89 }
            boolean r8 = r8.d()     // Catch:{ enl -> 0x0b89 }
            if (r8 == 0) goto L_0x075c
            com.google.android.gms.auth.firstparty.shared.AppDescription r8 = r3.j     // Catch:{ enl -> 0x0b89 }
            java.lang.String r8 = r8.e     // Catch:{ enl -> 0x0b89 }
            java.lang.String r9 = r3.b     // Catch:{ enl -> 0x0b89 }
            gda r10 = r3.c()     // Catch:{ enl -> 0x0b89 }
            gda r11 = defpackage.gda.GRANTED     // Catch:{ enl -> 0x0b89 }
            if (r10 == r11) goto L_0x075a
            enn r10 = r2.c     // Catch:{ enl -> 0x0b89 }
            android.accounts.Account r11 = r3.a()     // Catch:{ enl -> 0x0b89 }
            boolean r8 = r10.a(r11, r8, r9)     // Catch:{ enl -> 0x0b89 }
            if (r8 == 0) goto L_0x0758
            r8 = 1
            goto L_0x0767
        L_0x0758:
            r8 = 0
            goto L_0x0767
        L_0x075a:
            r8 = 1
            goto L_0x0767
        L_0x075c:
            gda r8 = r3.c()     // Catch:{ enl -> 0x0b89 }
            gda r9 = defpackage.gda.GRANTED     // Catch:{ enl -> 0x0b89 }
            if (r8 == r9) goto L_0x0766
            r8 = 0
            goto L_0x0767
        L_0x0766:
            r8 = 1
        L_0x0767:
            r5.<init>(r4, r1, r8)     // Catch:{ enl -> 0x0b89 }
            android.accounts.Account r1 = r3.a()     // Catch:{ enl -> 0x0b89 }
            emr r4 = defpackage.ems.h     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ enl -> 0x0b89 }
            gei r8 = defpackage.gei.NEED_PERMISSION     // Catch:{ enl -> 0x0b89 }
            if (r4 != r8) goto L_0x07e8
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r2 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse     // Catch:{ enl -> 0x0b89 }
            r2.<init>()     // Catch:{ enl -> 0x0b89 }
            r2.a((android.accounts.Account) r1)     // Catch:{ enl -> 0x0b89 }
            gei r1 = defpackage.gei.NEED_PERMISSION     // Catch:{ enl -> 0x0b89 }
            r2.a((defpackage.gei) r1)     // Catch:{ enl -> 0x0b89 }
            emr r1 = defpackage.ems.j     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r1 = r5.a(r1)     // Catch:{ enl -> 0x0b89 }
            ggn r1 = (defpackage.ggn) r1     // Catch:{ enl -> 0x0b89 }
            if (r1 == 0) goto L_0x07cd
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ enl -> 0x0b89 }
            r3.<init>()     // Catch:{ enl -> 0x0b89 }
            aucx r4 = r1.a     // Catch:{ enl -> 0x0b89 }
            int r8 = r4.size()     // Catch:{ enl -> 0x0b89 }
            r9 = 0
        L_0x079b:
            if (r9 < r8) goto L_0x07bd
            r4 = 0
            r2.r = r4     // Catch:{ enl -> 0x0b89 }
            int r4 = r1.b     // Catch:{ enl -> 0x0b89 }
            int r4 = defpackage.ggm.a(r4)     // Catch:{ enl -> 0x0b89 }
            if (r4 == 0) goto L_0x07a9
            goto L_0x07aa
        L_0x07a9:
            r4 = 1
        L_0x07aa:
            int r4 = r4 + -1
            r2.s = r4     // Catch:{ enl -> 0x0b89 }
            java.util.List r4 = r2.o     // Catch:{ enl -> 0x0b89 }
            r4.clear()     // Catch:{ enl -> 0x0b89 }
            java.util.List r4 = r2.o     // Catch:{ enl -> 0x0b89 }
            r4.addAll(r3)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r1 = r1.c     // Catch:{ enl -> 0x0b89 }
            r2.y = r1     // Catch:{ enl -> 0x0b89 }
            goto L_0x07cd
        L_0x07bd:
            java.lang.Object r10 = r4.get(r9)     // Catch:{ enl -> 0x0b89 }
            ggt r10 = (defpackage.ggt) r10     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.firstparty.shared.ScopeDetail r10 = defpackage.fyn.a((defpackage.ggt) r10)     // Catch:{ enl -> 0x0b89 }
            r3.add(r10)     // Catch:{ enl -> 0x0b89 }
            int r9 = r9 + 1
            goto L_0x079b
        L_0x07cd:
            emr r1 = defpackage.ems.k     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r1 = r5.a(r1)     // Catch:{ enl -> 0x0b89 }
            if (r1 == 0) goto L_0x07e4
            emr r1 = defpackage.ems.k     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r1 = r5.a(r1)     // Catch:{ enl -> 0x0b89 }
            ggs r1 = (defpackage.ggs) r1     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.ResolutionData r1 = defpackage.emu.a(r1)     // Catch:{ enl -> 0x0b89 }
            r2.z = r1     // Catch:{ enl -> 0x0b89 }
            goto L_0x07e5
        L_0x07e4:
        L_0x07e5:
            r8 = r2
            goto L_0x0b72
        L_0x07e8:
            emr r4 = defpackage.ems.h     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ enl -> 0x0b89 }
            gei r8 = defpackage.gei.NEED_REMOTE_CONSENT     // Catch:{ enl -> 0x0b89 }
            if (r4 != r8) goto L_0x083a
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r2 = new com.google.android.gms.auth.firstparty.dataservice.TokenResponse     // Catch:{ enl -> 0x0b89 }
            r2.<init>()     // Catch:{ enl -> 0x0b89 }
            r2.a((android.accounts.Account) r1)     // Catch:{ enl -> 0x0b89 }
            gei r1 = defpackage.gei.NEED_REMOTE_CONSENT     // Catch:{ enl -> 0x0b89 }
            r2.a((defpackage.gei) r1)     // Catch:{ enl -> 0x0b89 }
            emr r1 = defpackage.ems.k     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r1 = r5.a(r1)     // Catch:{ enl -> 0x0b89 }
            if (r1 == 0) goto L_0x0815
            emr r1 = defpackage.ems.k     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r1 = r5.a(r1)     // Catch:{ enl -> 0x0b89 }
            ggs r1 = (defpackage.ggs) r1     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.ResolutionData r1 = defpackage.emu.a(r1)     // Catch:{ enl -> 0x0b89 }
            r2.z = r1     // Catch:{ enl -> 0x0b89 }
        L_0x0815:
            emr r1 = defpackage.ems.l     // Catch:{ NumberFormatException -> 0x0833 }
            java.lang.Object r1 = r5.a(r1)     // Catch:{ NumberFormatException -> 0x0833 }
            byte[] r1 = (byte[]) r1     // Catch:{ NumberFormatException -> 0x0833 }
            if (r1 == 0) goto L_0x0831
            emr r3 = defpackage.ems.f     // Catch:{ NumberFormatException -> 0x0833 }
            java.lang.Object r3 = r5.a(r3)     // Catch:{ NumberFormatException -> 0x0833 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x0833 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0833 }
            com.google.android.gms.auth.AuthzenBeginTxData r8 = new com.google.android.gms.auth.AuthzenBeginTxData     // Catch:{ NumberFormatException -> 0x0833 }
            r8.<init>(r3, r1)     // Catch:{ NumberFormatException -> 0x0833 }
            goto L_0x0835
        L_0x0831:
            r8 = 0
            goto L_0x0835
        L_0x0833:
            r0 = move-exception
            r8 = 0
        L_0x0835:
            if (r8 == 0) goto L_0x07e5
            r2.A = r8     // Catch:{ enl -> 0x0b89 }
            goto L_0x07e5
        L_0x083a:
            boolean r4 = defpackage.awkb.b()     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0841
            goto L_0x088d
        L_0x0841:
            emr r4 = defpackage.ems.g     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ enl -> 0x0b89 }
            if (r4 == 0) goto L_0x088d
            eny r4 = r2.e     // Catch:{ NumberFormatException -> 0x0866 }
            eqd r8 = defpackage.eqb.m     // Catch:{ NumberFormatException -> 0x0866 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0866 }
            emr r11 = defpackage.ems.g     // Catch:{ NumberFormatException -> 0x0866 }
            java.lang.Object r11 = r5.a(r11)     // Catch:{ NumberFormatException -> 0x0866 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0866 }
            long r11 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x0866 }
            long r9 = r9 + r11
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ NumberFormatException -> 0x0866 }
            r4.b(r1, r8, r9)     // Catch:{ NumberFormatException -> 0x0866 }
            goto L_0x088d
        L_0x0866:
            r0 = move-exception
            iwd r4 = defpackage.enf.a     // Catch:{ enl -> 0x0b89 }
            emr r8 = defpackage.ems.g     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r8 = r5.a(r8)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ enl -> 0x0b89 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r9 = "Invalid Rdg param "
            int r10 = r8.length()     // Catch:{ enl -> 0x0b89 }
            if (r10 != 0) goto L_0x0883
            java.lang.String r8 = new java.lang.String     // Catch:{ enl -> 0x0b89 }
            r8.<init>(r9)     // Catch:{ enl -> 0x0b89 }
            goto L_0x0887
        L_0x0883:
            java.lang.String r8 = r9.concat(r8)     // Catch:{ enl -> 0x0b89 }
        L_0x0887:
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ enl -> 0x0b89 }
            r4.c(r8, r10)     // Catch:{ enl -> 0x0b89 }
        L_0x088d:
            emr r4 = defpackage.ems.h     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ enl -> 0x0b89 }
            gei r8 = defpackage.gei.SUCCESS     // Catch:{ enl -> 0x0b89 }
            if (r4 != r8) goto L_0x0adf
            emr r4 = defpackage.ems.i     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.TokenData r4 = (com.google.android.gms.auth.TokenData) r4     // Catch:{ enl -> 0x0b89 }
            android.os.Bundle r8 = r3.b()     // Catch:{ enl -> 0x0b89 }
            eie r8 = defpackage.eie.a(r8)     // Catch:{ enl -> 0x0b89 }
            boolean r8 = r8.d()     // Catch:{ enl -> 0x0b89 }
            if (r8 != 0) goto L_0x08ae
            goto L_0x0912
        L_0x08ae:
            enq r8 = r2.d     // Catch:{ enl -> 0x0b89 }
            defpackage.enq.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r3)     // Catch:{ enl -> 0x0b89 }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ enl -> 0x0b89 }
            android.accounts.Account r9 = r3.a()     // Catch:{ enl -> 0x0b89 }
            java.lang.String r10 = r3.b     // Catch:{ enl -> 0x0b89 }
            boolean r10 = r8.a((java.lang.String) r10)     // Catch:{ enl -> 0x0b89 }
            if (r10 == 0) goto L_0x0912
            boolean r10 = r4.e     // Catch:{ enl -> 0x0b89 }
            java.util.List r11 = r4.f     // Catch:{ enl -> 0x0b89 }
            java.lang.String r10 = r8.a(r3, r10, r11)     // Catch:{ enl -> 0x0b89 }
            qub r11 = r8.c     // Catch:{ enl -> 0x0b89 }
            java.lang.String r12 = r4.b     // Catch:{ enl -> 0x0b89 }
            java.lang.String r13 = "AccountManager.setAuthToken"
            amkr r13 = defpackage.amlv.a((java.lang.String) r13)     // Catch:{ enl -> 0x0b89 }
            android.accounts.AccountManager r11 = r11.a     // Catch:{ all -> 0x0904 }
            r11.setAuthToken(r9, r10, r12)     // Catch:{ all -> 0x0904 }
            if (r13 != 0) goto L_0x08dc
            goto L_0x08df
        L_0x08dc:
            r13.close()     // Catch:{ enl -> 0x0b89 }
        L_0x08df:
            java.lang.Long r11 = r4.c     // Catch:{ enl -> 0x0b89 }
            if (r11 == 0) goto L_0x08ee
            eny r11 = r8.d     // Catch:{ enl -> 0x0b89 }
            enx r12 = defpackage.eqh.a(r10)     // Catch:{ enl -> 0x0b89 }
            java.lang.Long r13 = r4.c     // Catch:{ enl -> 0x0b89 }
            r11.b(r9, r12, r13)     // Catch:{ enl -> 0x0b89 }
        L_0x08ee:
            boolean r11 = r4.e     // Catch:{ enl -> 0x0b89 }
            if (r11 == 0) goto L_0x0912
            eny r8 = r8.d     // Catch:{ enl -> 0x0b89 }
            enx r10 = defpackage.eqh.b(r10)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r11 = " "
            java.util.List r12 = r4.f     // Catch:{ enl -> 0x0b89 }
            java.lang.String r11 = android.text.TextUtils.join(r11, r12)     // Catch:{ enl -> 0x0b89 }
            r8.b(r9, r10, r11)     // Catch:{ enl -> 0x0b89 }
            goto L_0x0912
        L_0x0904:
            r0 = move-exception
            r1 = r0
            if (r13 == 0) goto L_0x0911
            r13.close()     // Catch:{ all -> 0x090c }
            goto L_0x0911
        L_0x090c:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ enl -> 0x0b89 }
        L_0x0911:
            throw r1     // Catch:{ enl -> 0x0b89 }
        L_0x0912:
            emr r8 = defpackage.ems.c     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r8 = r5.a(r8)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ enl -> 0x0b89 }
            if (r8 != 0) goto L_0x091d
            goto L_0x095d
        L_0x091d:
            eny r9 = r2.e     // Catch:{ enl -> 0x0b89 }
            enx r10 = defpackage.eqb.a     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r9 = r9.a((android.accounts.Account) r1, (defpackage.enx) r10)     // Catch:{ enl -> 0x0b89 }
            boolean r9 = r8.equals(r9)     // Catch:{ enl -> 0x0b89 }
            if (r9 != 0) goto L_0x095d
            iwd r9 = defpackage.enf.a     // Catch:{ enl -> 0x0b89 }
            java.lang.String r10 = "Switching LST"
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ enl -> 0x0b89 }
            r9.c(r10, r12)     // Catch:{ enl -> 0x0b89 }
            eny r9 = r2.e     // Catch:{ enl -> 0x0b89 }
            enx r10 = defpackage.eqb.a     // Catch:{ enl -> 0x0b89 }
            r9.b(r1, r10, r8)     // Catch:{ enl -> 0x0b89 }
            emr r8 = defpackage.ems.b     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r8 = r5.a(r8)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ enl -> 0x0b89 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ enl -> 0x0b89 }
            if (r9 != 0) goto L_0x095d
            java.lang.String r9 = r1.name     // Catch:{ enl -> 0x0b89 }
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ enl -> 0x0b89 }
            if (r8 == 0) goto L_0x095d
            eri r8 = new eri     // Catch:{ enl -> 0x0b89 }
            android.content.Context r9 = r2.g     // Catch:{ enl -> 0x0b89 }
            r8.<init>(r9)     // Catch:{ enl -> 0x0b89 }
            r9 = 6
            r8.a(r9)     // Catch:{ enl -> 0x0b89 }
        L_0x095d:
            enw r8 = defpackage.enw.a()     // Catch:{ enl -> 0x0b89 }
            emr r9 = defpackage.ems.a     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r9 = r5.a(r9)     // Catch:{ enl -> 0x0b89 }
            if (r9 == 0) goto L_0x0976
            enx r9 = defpackage.eqb.c     // Catch:{ enl -> 0x0b89 }
            emr r10 = defpackage.ems.a     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r10 = r5.a(r10)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ enl -> 0x0b89 }
            r8.a(r9, r10)     // Catch:{ enl -> 0x0b89 }
        L_0x0976:
            emr r9 = defpackage.ems.b     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r9 = r5.a(r9)     // Catch:{ enl -> 0x0b89 }
            if (r9 == 0) goto L_0x09a9
            iwd r9 = defpackage.enf.a     // Catch:{ enl -> 0x0b89 }
            java.lang.String r10 = "Renaming account as TokenResponse contains EMAIL"
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ enl -> 0x0b89 }
            r9.c(r10, r12)     // Catch:{ enl -> 0x0b89 }
            ekj r9 = r2.f     // Catch:{ enl -> 0x0b89 }
            android.accounts.Account r10 = new android.accounts.Account     // Catch:{ enl -> 0x0b89 }
            emr r11 = defpackage.ems.b     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r11 = r5.a(r11)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ enl -> 0x0b89 }
            java.lang.String r12 = r1.type     // Catch:{ enl -> 0x0b89 }
            r10.<init>(r11, r12)     // Catch:{ enl -> 0x0b89 }
            r9.a(r1, r10)     // Catch:{ enl -> 0x0b89 }
            enx r9 = defpackage.eqb.e     // Catch:{ enl -> 0x0b89 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ enl -> 0x0b89 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ enl -> 0x0b89 }
            r8.a(r9, r10)     // Catch:{ enl -> 0x0b89 }
        L_0x09a9:
            emr r9 = defpackage.ems.e     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r9 = r5.a(r9)     // Catch:{ enl -> 0x0b89 }
            if (r9 == 0) goto L_0x09c2
            enx r9 = defpackage.eqb.f     // Catch:{ enl -> 0x0b89 }
            emr r10 = defpackage.ems.e     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r10 = r5.a(r10)     // Catch:{ enl -> 0x0b89 }
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ enl -> 0x0b89 }
            java.util.HashSet r10 = defpackage.angm.a((java.lang.Iterable) r10)     // Catch:{ enl -> 0x0b89 }
            r8.a(r9, r10)     // Catch:{ enl -> 0x0b89 }
        L_0x09c2:
            anax r9 = defpackage.enf.b     // Catch:{ enl -> 0x0b89 }
            java.lang.String r10 = r3.b     // Catch:{ enl -> 0x0b89 }
            boolean r9 = r9.contains(r10)     // Catch:{ enl -> 0x0b89 }
            if (r9 == 0) goto L_0x09cd
            goto L_0x09d3
        L_0x09cd:
            enx r9 = defpackage.eqb.d     // Catch:{ enl -> 0x0b89 }
            r10 = 0
            r8.a(r9, r10)     // Catch:{ enl -> 0x0b89 }
        L_0x09d3:
            eny r9 = r2.e     // Catch:{ enl -> 0x0b89 }
            r9.b(r1, r8)     // Catch:{ enl -> 0x0b89 }
            emr r8 = defpackage.ems.d     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r5 = r5.a(r8)     // Catch:{ enl -> 0x0b89 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ enl -> 0x0b89 }
            boolean r5 = r5.booleanValue()     // Catch:{ enl -> 0x0b89 }
            if (r5 == 0) goto L_0x0a46
            enn r2 = r2.c     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r5 = r3.j     // Catch:{ enl -> 0x0b89 }
            java.lang.String r5 = r5.e     // Catch:{ enl -> 0x0b89 }
            java.lang.String r3 = r3.b     // Catch:{ enl -> 0x0b89 }
            java.lang.String r3 = r2.a(r5, r3)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.a(r3)     // Catch:{ enl -> 0x0b89 }
            r9 = 0
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.i(r3)     // Catch:{ enl -> 0x0b89 }
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.h(r3)     // Catch:{ enl -> 0x0b89 }
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.b(r3)     // Catch:{ enl -> 0x0b89 }
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.g(r3)     // Catch:{ enl -> 0x0b89 }
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.c(r3)     // Catch:{ enl -> 0x0b89 }
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.d(r3)     // Catch:{ enl -> 0x0b89 }
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r5 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r8 = defpackage.epz.e(r3)     // Catch:{ enl -> 0x0b89 }
            r5.b(r1, r8, r9)     // Catch:{ enl -> 0x0b89 }
            eny r2 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r3 = defpackage.epz.f(r3)     // Catch:{ enl -> 0x0b89 }
            r2.b(r1, r3, r9)     // Catch:{ enl -> 0x0b89 }
            goto L_0x0ad8
        L_0x0a46:
            enn r2 = r2.c     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.firstparty.shared.AppDescription r5 = r3.j     // Catch:{ enl -> 0x0b89 }
            java.lang.String r5 = r5.e     // Catch:{ enl -> 0x0b89 }
            java.lang.String r8 = r3.b     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.firstparty.shared.PACLConfig r9 = r3.f     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.firstparty.shared.FACLConfig r3 = r3.e     // Catch:{ enl -> 0x0b89 }
            java.lang.String r5 = r2.a(r5, r8)     // Catch:{ enl -> 0x0b89 }
            eny r8 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r10 = defpackage.epz.a(r5)     // Catch:{ enl -> 0x0b89 }
            r11 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ enl -> 0x0b89 }
            r8.b(r1, r10, r12)     // Catch:{ enl -> 0x0b89 }
            if (r9 == 0) goto L_0x0a80
            eny r8 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r10 = defpackage.epz.i(r5)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r11 = r9.b     // Catch:{ enl -> 0x0b89 }
            r8.b(r1, r10, r11)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r8 = r9.c     // Catch:{ enl -> 0x0b89 }
            eny r9 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r10 = defpackage.epz.h(r5)     // Catch:{ enl -> 0x0b89 }
            if (r8 != 0) goto L_0x0a7d
            java.lang.String r8 = ""
        L_0x0a7d:
            r9.b(r1, r10, r8)     // Catch:{ enl -> 0x0b89 }
        L_0x0a80:
            if (r3 == 0) goto L_0x0ad8
            eny r8 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r9 = defpackage.epz.b(r5)     // Catch:{ enl -> 0x0b89 }
            boolean r10 = r3.b     // Catch:{ enl -> 0x0b89 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ enl -> 0x0b89 }
            r8.b(r1, r9, r10)     // Catch:{ enl -> 0x0b89 }
            eny r8 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r9 = defpackage.epz.g(r5)     // Catch:{ enl -> 0x0b89 }
            java.lang.String r10 = r3.c     // Catch:{ enl -> 0x0b89 }
            r8.b(r1, r9, r10)     // Catch:{ enl -> 0x0b89 }
            eny r8 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r9 = defpackage.epz.c(r5)     // Catch:{ enl -> 0x0b89 }
            boolean r10 = r3.d     // Catch:{ enl -> 0x0b89 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ enl -> 0x0b89 }
            r8.b(r1, r9, r10)     // Catch:{ enl -> 0x0b89 }
            eny r8 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r9 = defpackage.epz.d(r5)     // Catch:{ enl -> 0x0b89 }
            boolean r10 = r3.g     // Catch:{ enl -> 0x0b89 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ enl -> 0x0b89 }
            r8.b(r1, r9, r10)     // Catch:{ enl -> 0x0b89 }
            eny r8 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r9 = defpackage.epz.e(r5)     // Catch:{ enl -> 0x0b89 }
            boolean r10 = r3.e     // Catch:{ enl -> 0x0b89 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ enl -> 0x0b89 }
            r8.b(r1, r9, r10)     // Catch:{ enl -> 0x0b89 }
            eny r2 = r2.b     // Catch:{ enl -> 0x0b89 }
            enx r5 = defpackage.epz.f(r5)     // Catch:{ enl -> 0x0b89 }
            boolean r3 = r3.f     // Catch:{ enl -> 0x0b89 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ enl -> 0x0b89 }
            r2.b(r1, r5, r3)     // Catch:{ enl -> 0x0b89 }
        L_0x0ad8:
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r1 = defpackage.emu.a((android.accounts.Account) r1, (com.google.android.gms.auth.TokenData) r4)     // Catch:{ enl -> 0x0b89 }
            r8 = r1
            goto L_0x0b72
        L_0x0adf:
            emr r3 = defpackage.ems.h     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r3 = r5.a(r3)     // Catch:{ enl -> 0x0b89 }
            gei r3 = (defpackage.gei) r3     // Catch:{ enl -> 0x0b89 }
            gei r4 = defpackage.gei.DEVICE_MANAGEMENT_REQUIRED     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_INTERNAL_ERROR     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_SYNC_DISABLED     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_ADMIN_BLOCKED     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_ADMIN_PENDING_APPROVAL     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_STALE_SYNC_REQUIRED     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_DEACTIVATED     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_REQUIRED     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED     // Catch:{ enl -> 0x0b89 }
            boolean r4 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r4 != 0) goto L_0x0b54
            gei r4 = defpackage.gei.DM_SCREENLOCK_REQUIRED     // Catch:{ enl -> 0x0b89 }
            boolean r3 = r4.equals(r3)     // Catch:{ enl -> 0x0b89 }
            if (r3 != 0) goto L_0x0b54
            emr r3 = defpackage.ems.h     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r3 = r5.a(r3)     // Catch:{ enl -> 0x0b89 }
            gei r4 = defpackage.gei.BAD_AUTHENTICATION     // Catch:{ enl -> 0x0b89 }
            if (r3 != r4) goto L_0x0b65
            iwd r3 = defpackage.enf.a     // Catch:{ enl -> 0x0b89 }
            java.lang.String r4 = "Server returned bad_auth, clearing LST"
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ enl -> 0x0b89 }
            r3.c(r4, r9)     // Catch:{ enl -> 0x0b89 }
            eny r2 = r2.e     // Catch:{ enl -> 0x0b89 }
            enx r3 = defpackage.eqb.a     // Catch:{ enl -> 0x0b89 }
            r4 = 0
            r2.b(r1, r3, r4)     // Catch:{ enl -> 0x0b89 }
            goto L_0x0b65
        L_0x0b54:
            eny r2 = r2.e     // Catch:{ enl -> 0x0b89 }
            enx r3 = defpackage.eqb.d     // Catch:{ enl -> 0x0b89 }
            emr r4 = defpackage.ems.h     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ enl -> 0x0b89 }
            gei r4 = (defpackage.gei) r4     // Catch:{ enl -> 0x0b89 }
            java.lang.String r4 = r4.ac     // Catch:{ enl -> 0x0b89 }
            r2.b(r1, r3, r4)     // Catch:{ enl -> 0x0b89 }
        L_0x0b65:
            emr r2 = defpackage.ems.h     // Catch:{ enl -> 0x0b89 }
            java.lang.Object r2 = r5.a(r2)     // Catch:{ enl -> 0x0b89 }
            gei r2 = (defpackage.gei) r2     // Catch:{ enl -> 0x0b89 }
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r1 = defpackage.emu.a((android.accounts.Account) r1, (defpackage.gei) r2)     // Catch:{ enl -> 0x0b89 }
            r8 = r1
        L_0x0b72:
            android.os.Bundle r1 = r8.x     // Catch:{ enl -> 0x0b89 }
            java.lang.String r2 = "logging.network_latency_millis"
            r1.putLong(r2, r6)     // Catch:{ enl -> 0x0b89 }
            r3 = r44
            goto L_0x0c39
        L_0x0b7d:
            r0 = move-exception
            r1 = r0
            iiy r2 = new iiy     // Catch:{ enl -> 0x0b89 }
            gei r3 = defpackage.gei.INTNERNAL_ERROR     // Catch:{ enl -> 0x0b89 }
            java.lang.String r4 = "Error when parsing the response."
            r2.<init>(r3, r4, r1)     // Catch:{ enl -> 0x0b89 }
            throw r2     // Catch:{ enl -> 0x0b89 }
        L_0x0b89:
            r0 = move-exception
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x0bdf }
            gei r3 = defpackage.gei.INTNERNAL_ERROR     // Catch:{ iiy -> 0x0bdf }
            java.lang.String r4 = "Error saving the data."
            r2.<init>(r3, r4, r1)     // Catch:{ iiy -> 0x0bdf }
            throw r2     // Catch:{ iiy -> 0x0bdf }
        L_0x0b95:
            r0 = move-exception
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x0bdf }
            gei r3 = defpackage.gei.NETWORK_ERROR     // Catch:{ iiy -> 0x0bdf }
            java.lang.String r4 = "Error when calling server."
            r2.<init>(r3, r4, r1)     // Catch:{ iiy -> 0x0bdf }
            throw r2     // Catch:{ iiy -> 0x0bdf }
        L_0x0ba1:
            iiy r1 = new iiy     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            gei r2 = defpackage.gei.BAD_AUTHENTICATION     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            java.lang.String r3 = "Long live credential not available."
            r1.<init>(r2, r3)     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
            throw r1     // Catch:{ ekp -> 0x0bad, enl -> 0x0bab }
        L_0x0bab:
            r0 = move-exception
            goto L_0x0bb4
        L_0x0bad:
            r0 = move-exception
            goto L_0x0bc4
        L_0x0baf:
            r0 = move-exception
            r19 = r11
        L_0x0bb2:
            r28 = r13
        L_0x0bb4:
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x0bdf }
            gei r3 = defpackage.gei.INTNERNAL_ERROR     // Catch:{ iiy -> 0x0bdf }
            java.lang.String r4 = "Error when building the request."
            r2.<init>(r3, r4, r1)     // Catch:{ iiy -> 0x0bdf }
            throw r2     // Catch:{ iiy -> 0x0bdf }
        L_0x0bbf:
            r0 = move-exception
            r19 = r11
        L_0x0bc2:
            r28 = r13
        L_0x0bc4:
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x0bdf }
            gei r3 = defpackage.gei.BAD_REQUEST     // Catch:{ iiy -> 0x0bdf }
            java.lang.String r4 = "Error when building the request."
            r2.<init>(r3, r4, r1)     // Catch:{ iiy -> 0x0bdf }
            throw r2     // Catch:{ iiy -> 0x0bdf }
        L_0x0bcf:
            r0 = move-exception
            r19 = r11
            r28 = r13
            r1 = r0
        L_0x0bd5:
            iiy r2 = new iiy     // Catch:{ iiy -> 0x0bdf }
            gei r3 = defpackage.gei.INTNERNAL_ERROR     // Catch:{ iiy -> 0x0bdf }
            java.lang.String r4 = "Error when reading from cache."
            r2.<init>(r3, r4, r1)     // Catch:{ iiy -> 0x0bdf }
            throw r2     // Catch:{ iiy -> 0x0bdf }
        L_0x0bdf:
            r0 = move-exception
            goto L_0x0c06
        L_0x0be1:
            r19 = r11
            r28 = r13
            iiy r1 = new iiy     // Catch:{ ekp -> 0x0bef }
            gei r2 = defpackage.gei.SERVICE_DISABLED     // Catch:{ ekp -> 0x0bef }
            java.lang.String r3 = "Service not whitelisted."
            r1.<init>(r2, r3)     // Catch:{ ekp -> 0x0bef }
            throw r1     // Catch:{ ekp -> 0x0bef }
        L_0x0bef:
            r0 = move-exception
            goto L_0x0bf6
        L_0x0bf1:
            r0 = move-exception
            r19 = r11
            r28 = r13
        L_0x0bf6:
            r1 = r0
            iiy r2 = new iiy     // Catch:{ iiy -> 0x0bdf }
            gei r3 = defpackage.gei.BAD_REQUEST     // Catch:{ iiy -> 0x0bdf }
            java.lang.String r4 = "Invalid package name."
            r2.<init>(r3, r4, r1)     // Catch:{ iiy -> 0x0bdf }
            throw r2     // Catch:{ iiy -> 0x0bdf }
        L_0x0c01:
            r0 = move-exception
            r19 = r11
        L_0x0c04:
            r28 = r13
        L_0x0c06:
            r1 = r0
        L_0x0c07:
            iwd r2 = a
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            gei r3 = r1.a
            r5 = 0
            r4[r5] = r3
            android.accounts.Account r3 = r44.a()
            java.lang.String r3 = defpackage.iwd.a((java.lang.Object) r3)
            r5 = 1
            r4[r5] = r3
            r3 = r44
            com.google.android.gms.auth.firstparty.shared.AppDescription r5 = r3.j
            java.lang.String r5 = r5.e
            r6 = 2
            r4[r6] = r5
            java.lang.String r5 = r3.b
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "getToken() -> %s. Account: %s, App: %s, Service: %s"
            r2.e(r5, r1, r4)
            android.accounts.Account r2 = r44.a()
            gei r1 = r1.a
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r8 = defpackage.emu.a((android.accounts.Account) r2, (defpackage.gei) r1)
        L_0x0c39:
            iwd r1 = a
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            gei r4 = r8.b()
            r5 = 0
            r2[r5] = r4
            android.accounts.Account r4 = r44.a()
            java.lang.String r4 = defpackage.iwd.a((java.lang.Object) r4)
            r5 = 1
            r2[r5] = r4
            com.google.android.gms.auth.firstparty.shared.AppDescription r4 = r3.j
            java.lang.String r4 = r4.e
            r5 = 2
            r2[r5] = r4
            java.lang.String r3 = r3.b
            r4 = 3
            r2[r4] = r3
            java.lang.String r3 = "getToken() -> %s. Account: %s, App: %s, Service: %s"
            r1.a(r3, r2)
            long r1 = android.os.SystemClock.elapsedRealtime()
            android.os.Bundle r3 = r8.x
            long r1 = r1 - r28
            java.lang.String r4 = "logging.internal_service_latency_millis"
            r3.putLong(r4, r1)
            r1 = 0
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0c7d
            android.os.Bundle r1 = r8.x
            java.lang.String r2 = "logging.gads_connection_latency_millis"
            r3 = r19
            r1.putLong(r2, r3)
        L_0x0c7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elt.a(com.google.android.gms.auth.firstparty.shared.AppDescription, com.google.android.gms.auth.firstparty.dataservice.TokenRequest):com.google.android.gms.auth.firstparty.dataservice.TokenResponse");
    }

    public final TokenResponse a(enj enj) {
        TokenResponse tokenResponse;
        try {
            eko a2 = enj.g.a(enj.b.getPackageName());
            enj.f.a(enj.c);
            if (a2 != null) {
                enj.f.b(a2.a, a2.b);
                enj.f.a("system_partition", a2.d);
            }
            CaptchaSolution captchaSolution = enj.d;
            if (captchaSolution != null) {
                enj.f.a(captchaSolution);
            }
            enj.f.a(enj.a);
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(enj.f.a());
            String aD = ent.aD();
            String packageName = enj.b.getPackageName();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            iiv.a(enj.b, linkedHashMap, packageName);
            linkedHashMap.put(urlEncodedFormEntity.getContentType().getName(), urlEncodedFormEntity.getContentType().getValue());
            HttpResponse a3 = emt.a(aD, packageName, urlEncodedFormEntity, enj.b);
            a3.getStatusLine().getStatusCode();
            ema ema = new ema(emt.b(a3));
            if (((gei) ema.a(ema.p)) != gei.SUCCESS) {
                tokenResponse = new TokenResponse();
                tokenResponse.a((gei) ema.a(ema.p));
                String str = (String) ema.a(ema.b);
                String str2 = (String) ema.a(ema.c);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    tokenResponse.n = ena.a(enj.b, str, str2);
                }
                String str3 = (String) ema.a(ema.f);
                String str4 = (String) ema.a(ema.m);
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                    tokenResponse.e = str4;
                    tokenResponse.f = str3;
                }
            } else {
                Account a4 = enj.c.a();
                enj.e.b(a4, eqb.a, (String) ema.a(ema.i));
                tokenResponse = new TokenResponse();
                tokenResponse.a(gei.SUCCESS);
                tokenResponse.a(a4);
            }
            a.a("updateCreds() -> %s.", tokenResponse.b());
            return tokenResponse;
        } catch (ekp e2) {
            throw new iiy(gei.BAD_REQUEST, "Error when fetching package info", e2);
        } catch (IOException e3) {
            throw new iiy(gei.NETWORK_ERROR, "Error when calling server.", e3);
        } catch (IOException e4) {
            throw new iiy(gei.INTNERNAL_ERROR, "Error when parsing the response.", e4);
        } catch (iiy e5) {
            a.a("updateCreds() -> %s.", e5, e5.a);
            TokenResponse tokenResponse2 = new TokenResponse();
            tokenResponse2.a(e5.a);
            return tokenResponse2;
        }
    }

    public final void a() {
        int callingUid = Binder.getCallingUid();
        if (!this.k.b(callingUid)) {
            a.e(String.format("UID %s is not device or profile owner!", new Object[]{Integer.valueOf(callingUid)}), new Object[0]);
        }
    }
}
