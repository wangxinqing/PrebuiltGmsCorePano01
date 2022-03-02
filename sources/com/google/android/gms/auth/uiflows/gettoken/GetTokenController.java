package com.google.android.gms.auth.uiflows.gettoken;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetTokenController implements Controller {
    public static final Parcelable.Creator CREATOR = new goa();
    private static final iwd a = ehv.a("GetToken", "GetTokenController");
    private final Context b;
    private final fzo c;
    private final fys d = ((fys) fys.d.b());
    private final AccountAuthenticatorResponse e;
    private final Account f;
    private final TokenRequest g;
    private final boolean h;
    private final boolean i;
    private final ijn j;
    private int k;

    public GetTokenController(AccountAuthenticatorResponse accountAuthenticatorResponse, TokenRequest tokenRequest, boolean z, boolean z2, ijn ijn, int i2) {
        ihs b2 = ihs.b();
        fzo fzo = new fzo(ihs.b());
        ihs.b().getPackageManager();
        this.b = b2;
        this.c = fzo;
        this.e = accountAuthenticatorResponse;
        iva.a((Object) tokenRequest);
        this.g = tokenRequest;
        Account a2 = tokenRequest.a();
        iva.a((Object) a2);
        this.f = a2;
        this.h = z;
        this.i = z2;
        this.j = ijn;
        this.k = i2;
    }

    private final Intent a(fzl fzl, gei gei) {
        String str;
        boolean booleanValue = ((Boolean) fzl.a(GetTokenChimeraActivity.b, false)).booleanValue();
        if (awja.a.a().b()) {
            str = gei.ac;
        } else {
            str = "dmStatus";
        }
        return ijk.a(this.b, this.f, false, this.i, this.j.a(), false, (String) null, true, str, booleanValue, 1, Bundle.EMPTY);
    }

    public final String b() {
        return "GetTokenController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeParcelable(this.j.a(), 0);
        parcel.writeInt(this.k);
    }

    private final gnw a(int i2, String str) {
        Intent putExtra = new Intent().putExtra("errorCode", i2).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i2, str);
        }
        return gnw.b(0, putExtra);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.google.android.gms.auth.firstparty.shared.PACLConfig} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gnw a(defpackage.gny r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 1001(0x3e9, float:1.403E-42)
            r3 = 10
            if (r1 == 0) goto L_0x03f6
            iwd r4 = a
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r7 = r1.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            int r7 = r1.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "Result with id=%d and resultCode=%d"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r4.b(r6, r7)
            fzl r4 = new fzl
            android.content.Intent r6 = r1.c
            if (r6 != 0) goto L_0x0038
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            goto L_0x003c
        L_0x0038:
            android.os.Bundle r6 = r6.getExtras()
        L_0x003c:
            r4.<init>(r6)
            int r4 = r1.a
            java.lang.String r7 = "user canceled"
            r10 = 22
            java.lang.String r11 = "device management not supported"
            r12 = 21
            r13 = 33
            java.lang.String r14 = "something went wrong"
            r15 = 6
            r6 = 40
            r5 = -1
            r9 = 32
            r8 = 5
            if (r4 == r3) goto L_0x01f0
            if (r4 == r6) goto L_0x015f
            r6 = 3
            if (r4 == r2) goto L_0x0157
            if (r4 == r9) goto L_0x011a
            if (r4 == r13) goto L_0x00f8
            switch(r4) {
                case 20: goto L_0x008f;
                case 21: goto L_0x006d;
                case 22: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x01fd
        L_0x0064:
            r0.k = r10
            java.lang.String r1 = "work service account"
            gnw r1 = r0.a((int) r15, (java.lang.String) r1)
            return r1
        L_0x006d:
            r0.k = r12
            int r2 = r1.b
            if (r2 == r5) goto L_0x007b
            if (r2 != 0) goto L_0x01fd
            gnw r1 = r0.a((int) r8, (java.lang.String) r14)
            return r1
        L_0x007b:
            android.content.Context r1 = r0.b
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            boolean r4 = r0.h
            boolean r5 = r0.i
            ijn r6 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity.a(r1, r2, r4, r5, r6)
            r2 = 0
            gnw r1 = defpackage.gnw.a(r3, r1, r2, r2)
            return r1
        L_0x008f:
            r2 = 20
            r0.k = r2
            int r2 = r1.b
            if (r2 == r5) goto L_0x00ab
            if (r2 == 0) goto L_0x00a2
            r3 = 2
            if (r2 != r3) goto L_0x01fd
            gnw r1 = r0.a((int) r8, (java.lang.String) r14)
            return r1
        L_0x00a2:
            java.lang.String r1 = "user did not reauth"
            r2 = 4
            gnw r1 = r0.a((int) r2, (java.lang.String) r1)
            return r1
        L_0x00ab:
            fzl r2 = new fzl
            android.content.Intent r1 = r1.c
            android.os.Bundle r1 = r1.getExtras()
            r2.<init>(r1)
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.b
            java.lang.Object r1 = r2.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            fzk r3 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.d
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.accounts.Account r3 = r0.f
            if (r3 == 0) goto L_0x00e6
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00e6
            android.accounts.Account r3 = r0.f
            java.lang.String r3 = r3.name
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x00e6
            eri r2 = new eri
            android.content.Context r3 = r0.b
            r2.<init>(r3)
            r3 = 8
            r2.a(r3)
        L_0x00e6:
            android.content.Context r2 = r0.b
            android.accounts.Account r3 = r0.f
            boolean r4 = r0.i
            ijn r5 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.common.UpdateCredentialsChimeraActivity.a(r2, r3, r1, r4, r5)
            r2 = 0
            gnw r1 = defpackage.gnw.a(r12, r1, r2, r2)
            return r1
        L_0x00f8:
            r0.k = r13
            int r1 = r1.b
            if (r1 != r5) goto L_0x0111
            android.content.Context r1 = r0.b
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            boolean r4 = r0.h
            boolean r5 = r0.i
            ijn r6 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity.a(r1, r2, r4, r5, r6)
            gnw r1 = defpackage.gnw.a(r3, r1)
            return r1
        L_0x0111:
            java.lang.String r1 = "missing lock screen"
            r2 = 4
            gnw r1 = r0.a((int) r2, (java.lang.String) r1)
            return r1
        L_0x011a:
            r2 = 4
            r0.k = r9
            int r1 = r1.b
            switch(r1) {
                case 2: goto L_0x0151;
                case 3: goto L_0x0149;
                case 4: goto L_0x0141;
                case 5: goto L_0x013b;
                case 6: goto L_0x0135;
                case 7: goto L_0x0151;
                case 8: goto L_0x0151;
                case 9: goto L_0x013b;
                default: goto L_0x0122;
            }
        L_0x0122:
            android.content.Context r1 = r0.b
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            boolean r4 = r0.h
            boolean r5 = r0.i
            ijn r6 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity.a(r1, r2, r4, r5, r6)
            gnw r1 = defpackage.gnw.a(r3, r1)
            return r1
        L_0x0135:
            gnw r1 = r0.a((int) r2, (java.lang.String) r7)
            return r1
        L_0x013b:
            gnw r1 = r0.a((int) r15, (java.lang.String) r11)
            return r1
        L_0x0141:
            java.lang.String r1 = "dm agent download install error"
            gnw r1 = r0.a((int) r6, (java.lang.String) r1)
            return r1
        L_0x0149:
            java.lang.String r1 = "dm agent data fetch error"
            gnw r1 = r0.a((int) r6, (java.lang.String) r1)
            return r1
        L_0x0151:
            gnw r1 = r0.a((int) r8, (java.lang.String) r14)
            return r1
        L_0x0157:
            java.lang.String r1 = "no network"
            gnw r1 = r0.a((int) r6, (java.lang.String) r1)
            return r1
        L_0x015f:
            r0.k = r6
            int r2 = r1.b
            if (r2 == r5) goto L_0x0170
            if (r2 != 0) goto L_0x01fd
            java.lang.String r1 = "user declined"
            r2 = 4
            gnw r1 = r0.a((int) r2, (java.lang.String) r1)
            return r1
        L_0x0170:
            android.content.Intent r1 = r1.c
            java.lang.String r2 = com.google.android.gms.auth.firstparty.dataservice.ConsentResult.a
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            com.google.android.gms.auth.firstparty.dataservice.ConsentResult r1 = (com.google.android.gms.auth.firstparty.dataservice.ConsentResult) r1
            gei r2 = r1.a()
            gei r4 = defpackage.gei.SUCCESS
            if (r2 == r4) goto L_0x01b0
            iwd r1 = a
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 49
            r5.<init>(r4)
            java.lang.String r4 = "Unexpected status in grant credentials response: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.d(r3, r4)
            java.lang.String r1 = r2.ac
            gnw r1 = r0.a((int) r8, (java.lang.String) r1)
            goto L_0x01ef
        L_0x01b0:
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            com.google.android.gms.auth.firstparty.shared.FACLConfig r4 = r1.e
            r2.e = r4
            com.google.android.gms.auth.firstparty.shared.PACLConfig r2 = r2.f
            java.lang.String r4 = r1.d
            r5 = 0
            if (r4 != 0) goto L_0x01be
            goto L_0x01ca
        L_0x01be:
            if (r2 == 0) goto L_0x01c3
            java.lang.String r5 = r2.b
            goto L_0x01c4
        L_0x01c3:
        L_0x01c4:
            com.google.android.gms.auth.firstparty.shared.PACLConfig r2 = new com.google.android.gms.auth.firstparty.shared.PACLConfig
            r2.<init>(r5, r4)
            r5 = r2
        L_0x01ca:
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            r2.f = r5
            gda r4 = r1.b()
            r2.a((defpackage.gda) r4)
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            java.lang.String r4 = r1.g
            r2.q = r4
            java.lang.String r1 = r1.h
            r2.r = r1
            android.content.Context r1 = r0.b
            boolean r4 = r0.h
            boolean r5 = r0.i
            ijn r6 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity.a(r1, r2, r4, r5, r6)
            gnw r1 = defpackage.gnw.a(r3, r1)
        L_0x01ef:
            return r1
        L_0x01f0:
            int r2 = r1.b
            if (r2 == r5) goto L_0x021c
            if (r2 != 0) goto L_0x01fd
            r1 = 4
            gnw r1 = r0.a((int) r1, (java.lang.String) r7)
            return r1
        L_0x01fd:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r1 = r1.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r3[r4] = r1
            java.lang.String r1 = "Result not handled with id %d and resultCode %d."
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r2.<init>(r1)
            throw r2
        L_0x021c:
            fzl r2 = new fzl
            android.content.Intent r1 = r1.c
            android.os.Bundle r1 = r1.getExtras()
            r2.<init>(r1)
            fzk r1 = com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity.a
            java.lang.Object r1 = r2.a(r1)
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r1 = (com.google.android.gms.auth.firstparty.dataservice.TokenResponse) r1
            if (r1 != 0) goto L_0x0243
            iwd r1 = a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Unable to get token"
            r1.d(r3, r2)
            java.lang.String r1 = "token response is null"
            gnw r1 = r0.a((int) r8, (java.lang.String) r1)
            goto L_0x03f5
        L_0x0243:
            gei r3 = r1.b()
            gei r4 = defpackage.gei.SUCCESS
            if (r3 != r4) goto L_0x02ab
            java.lang.String r4 = r1.d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0254
            goto L_0x02ab
        L_0x0254:
            android.accounts.Account r2 = r0.f
            android.accounts.Account r3 = r1.u
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0278
            iwd r2 = a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            android.accounts.Account r4 = r0.f
            r6 = 0
            r3[r6] = r4
            android.accounts.Account r4 = r1.u
            r7 = 1
            r3[r7] = r4
            java.lang.String r4 = "Account in TokenResponse does not match! Expected %s but got %s."
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r2.d(r3, r4)
        L_0x0278:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.accounts.Account r3 = r1.u
            java.lang.String r3 = r3.name
            java.lang.String r4 = "authAccount"
            android.content.Intent r2 = r2.putExtra(r4, r3)
            android.accounts.Account r3 = r1.u
            java.lang.String r3 = r3.type
            java.lang.String r4 = "accountType"
            android.content.Intent r2 = r2.putExtra(r4, r3)
            java.lang.String r1 = r1.d
            java.lang.String r3 = "authtoken"
            android.content.Intent r1 = r2.putExtra(r3, r1)
            android.accounts.AccountAuthenticatorResponse r2 = r0.e
            if (r2 == 0) goto L_0x02a4
            android.os.Bundle r3 = r1.getExtras()
            r2.onResult(r3)
        L_0x02a4:
            gnw r1 = defpackage.gnw.b(r5, r1)
            goto L_0x03f5
        L_0x02ab:
            int r4 = r3.ordinal()
            r5 = 1
            if (r4 == r5) goto L_0x03d2
            r5 = 8
            if (r4 == r5) goto L_0x0393
            r5 = 20
            if (r4 == r5) goto L_0x0347
            if (r4 == r12) goto L_0x0328
            switch(r4) {
                case 27: goto L_0x03d2;
                case 28: goto L_0x03d2;
                case 29: goto L_0x03d2;
                case 30: goto L_0x03d2;
                case 31: goto L_0x03d2;
                case 32: goto L_0x03d2;
                case 33: goto L_0x03d2;
                case 34: goto L_0x02ee;
                case 35: goto L_0x03d2;
                default: goto L_0x02bf;
            }
        L_0x02bf:
            iwd r1 = a
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 37
            r5.<init>(r4)
            java.lang.String r4 = "Unexpected status in token response: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.d(r2, r4)
            java.lang.String r1 = r3.ac
            gnw r1 = r0.a((int) r8, (java.lang.String) r1)
            goto L_0x03f5
        L_0x02ee:
            boolean r1 = defpackage.ent.F()
            if (r1 == 0) goto L_0x0306
            android.content.Context r1 = r0.b
            android.accounts.Account r2 = r0.f
            boolean r3 = r0.i
            ijn r4 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockChimeraActivity.a(r1, r2, r3, r4)
            gnw r1 = defpackage.gnw.a(r13, r1)
            goto L_0x03f5
        L_0x0306:
            int r1 = r0.k
            if (r1 < r9) goto L_0x030c
            goto L_0x03f0
        L_0x030c:
            android.content.Intent r1 = r0.a((defpackage.fzl) r2, (defpackage.gei) r3)
            if (r1 != 0) goto L_0x0318
            gnw r1 = r0.a((int) r15, (java.lang.String) r11)
            goto L_0x03f5
        L_0x0318:
            android.content.Context r2 = r0.b
            boolean r3 = r0.i
            ijn r4 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity.a(r2, r3, r4, r1)
            gnw r1 = defpackage.gnw.a(r9, r1)
            goto L_0x03f5
        L_0x0328:
            com.google.android.gms.auth.ResolutionData r1 = r1.z
            if (r1 == 0) goto L_0x03f0
            int r2 = r1.c
            r3 = 2
            if (r2 == r3) goto L_0x0333
            goto L_0x03f0
        L_0x0333:
            android.content.Context r2 = r0.b
            android.accounts.Account r3 = r0.f
            java.lang.String r4 = r1.d
            com.google.android.gms.auth.BrowserResolutionCookie[] r1 = r1.e
            ijn r5 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.consent.BrowserConsentChimeraActivity.a(r2, r3, r4, r1, r5)
            gnw r1 = defpackage.gnw.a(r6, r1)
            goto L_0x03f5
        L_0x0347:
            int r2 = r0.k
            if (r2 >= r6) goto L_0x03f0
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            android.os.Bundle r2 = r2.b()
            eie r2 = defpackage.eie.a(r2)
            boolean r3 = r2.d()
            java.lang.String r25 = r2.c()
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            com.google.android.gms.auth.firstparty.shared.AppDescription r4 = r2.j
            java.lang.String r5 = r4.e
            int r4 = r4.b
            java.lang.String r2 = r2.b
            android.accounts.Account r7 = r0.f
            java.lang.String r7 = r7.name
            java.util.List r8 = r1.c()
            java.util.ArrayList r20 = defpackage.fyn.a((java.util.List) r8)
            boolean r8 = r1.r
            int r9 = r1.s
            java.lang.String r1 = r1.y
            r10 = 1
            r24 = r3 ^ 1
            r16 = r5
            r17 = r4
            r18 = r2
            r19 = r7
            r21 = r8
            r22 = r9
            r23 = r1
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            gnw r1 = defpackage.gnw.a(r6, r1)
            goto L_0x03f5
        L_0x0393:
            int r1 = r0.k
            r2 = 20
            if (r1 >= r2) goto L_0x03f0
            fys r1 = r0.d
            android.accounts.Account r2 = r0.f
            boolean r1 = r1.a((android.accounts.Account) r2)
            if (r1 == 0) goto L_0x03b5
            android.content.Context r1 = r0.b
            r2 = 2131951904(0x7f130120, float:1.9540236E38)
            r3 = 2131951903(0x7f13011f, float:1.9540234E38)
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity.a(r1, r2, r3)
            r2 = 0
            gnw r1 = defpackage.gnw.a(r10, r1, r2, r2)
            goto L_0x03f5
        L_0x03b5:
            r2 = 0
            android.content.Context r1 = r0.b
            android.accounts.Account r3 = r0.f
            boolean r4 = r0.i
            ijn r5 = r0.j
            java.lang.String r6 = r3.type
            ijn r7 = r0.j
            r8 = 1
            java.lang.String r6 = defpackage.glk.a(r1, r8, r6, r7, r2)
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.b(r1, r3, r4, r5, r6)
            r3 = 20
            gnw r1 = defpackage.gnw.a(r3, r1, r2, r2)
            goto L_0x03f5
        L_0x03d2:
            int r1 = r0.k
            if (r1 >= r9) goto L_0x03f0
            android.content.Intent r1 = r0.a((defpackage.fzl) r2, (defpackage.gei) r3)
            if (r1 != 0) goto L_0x03e1
            gnw r1 = r0.a((int) r15, (java.lang.String) r11)
            goto L_0x03f5
        L_0x03e1:
            android.content.Context r2 = r0.b
            boolean r3 = r0.i
            ijn r4 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity.a(r2, r3, r4, r1)
            gnw r1 = defpackage.gnw.a(r9, r1)
            goto L_0x03f5
        L_0x03f0:
            gnw r1 = r0.a((int) r8, (java.lang.String) r14)
        L_0x03f5:
            return r1
        L_0x03f6:
            fzo r1 = r0.c
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0411
            android.content.Context r1 = r0.b
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r2 = r0.g
            boolean r4 = r0.h
            boolean r5 = r0.i
            ijn r6 = r0.j
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity.a(r1, r2, r4, r5, r6)
            gnw r1 = defpackage.gnw.a(r3, r1)
            return r1
        L_0x0411:
            fzl r1 = new fzl
            r1.<init>()
            fzk r3 = defpackage.gmz.j
            boolean r4 = r0.i
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.b(r3, r4)
            fzk r3 = defpackage.gmz.i
            ijn r4 = r0.j
            android.os.Bundle r4 = r4.a()
            r1.b(r3, r4)
            android.content.Context r3 = r0.b
            r4 = 2131952269(0x7f13028d, float:1.9540976E38)
            r5 = 2131951878(0x7f130106, float:1.9540183E38)
            android.content.Intent r3 = com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity.a(r3, r4, r5)
            android.os.Bundle r1 = r1.a
            android.content.Intent r1 = r3.putExtras(r1)
            gnw r1 = defpackage.gnw.a(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.gettoken.GetTokenController.a(gny):gnw");
    }
}
