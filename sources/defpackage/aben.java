package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.util.Set;

/* renamed from: aben  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aben extends nis {
    private final Account a;
    private final int b;
    private final GoogleSignInAccount c;
    private final String d;
    private final int e;
    private final Set f;
    private final String g;
    private final iue h;
    private final aber i;
    private final abai j;

    public aben(abev abev, ResolveAccountRequest resolveAccountRequest, iue iue, aber aber) {
        super(44, "ResolveAccount");
        String str = abev.c;
        iva.c(str);
        this.d = str;
        this.e = abev.d;
        this.f = abev.a();
        this.g = abev.j;
        this.j = abev.n;
        this.a = resolveAccountRequest.b;
        this.b = resolveAccountRequest.c;
        this.c = resolveAccountRequest.d;
        iva.a((Object) iue);
        this.h = iue;
        this.i = aber;
        iva.a((Object) abev.i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.accounts.Account} */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018f, code lost:
        if (r12.getBoolean(r13.length() == 0 ? new java.lang.String("x-client-auth:") : "x-client-auth:".concat(r13), false) == false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0193, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            boolean r0 = defpackage.jgu.e(r18)
            if (r0 != 0) goto L_0x024d
            aber r0 = r1.i
            java.lang.String r3 = r1.d
            int r4 = r1.b
            abec r0 = r0.c
            iwd r5 = defpackage.abec.a
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 1
            r6[r8] = r4
            java.lang.String r4 = "getAccount(package_name=%s, session_id=%d)"
            r5.a(r4, r6)
            java.util.Map r0 = r0.c
            java.lang.Object r0 = r0.get(r3)
            android.accounts.Account r0 = (android.accounts.Account) r0
            android.accounts.Account r3 = r1.a
            java.lang.String r4 = "com.google"
            boolean r3 = defpackage.jgu.a((android.accounts.Account) r3, (java.lang.String) r4)
            r5 = 5
            if (r3 != 0) goto L_0x0085
            java.lang.String r6 = r1.g
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0085
            android.accounts.Account r6 = r1.a
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = r6.name
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r9)
            java.lang.String r9 = r1.g
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "@"
            int r11 = r9.length()
            if (r11 != 0) goto L_0x0067
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10)
            goto L_0x006b
        L_0x0067:
            java.lang.String r9 = r10.concat(r9)
        L_0x006b:
            boolean r6 = r6.endsWith(r9)
            if (r6 == 0) goto L_0x0072
            goto L_0x0085
        L_0x0072:
            java.lang.String r0 = "ResolveAccountOperation"
            java.lang.String r2 = "The specified account doesn't belong to the specified hosted domain"
            android.util.Log.e(r0, r2)
            iue r0 = r1.h
            com.google.android.gms.common.internal.ResolveAccountResponse r2 = new com.google.android.gms.common.internal.ResolveAccountResponse
            r2.<init>((int) r5)
            r0.a(r2)
            return
        L_0x0085:
            if (r0 != 0) goto L_0x022a
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r6 = r1.c
            if (r6 == 0) goto L_0x0090
            java.lang.String r9 = r6.d
            if (r9 == 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            if (r3 == 0) goto L_0x0093
            goto L_0x00ad
        L_0x0093:
            android.accounts.Account r0 = r1.a
            if (r3 == 0) goto L_0x00a6
            defpackage.iva.a((java.lang.Object) r6)
            java.lang.String r0 = r6.d
            defpackage.iva.a((java.lang.Object) r0)
            android.accounts.Account r6 = new android.accounts.Account
            r6.<init>(r0, r4)
            r0 = r6
            goto L_0x00a7
        L_0x00a6:
        L_0x00a7:
            java.lang.String r4 = r1.d
            android.accounts.Account r0 = defpackage.jgu.a((android.content.Context) r2, (android.accounts.Account) r0, (java.lang.String) r4)
        L_0x00ad:
            if (r0 != 0) goto L_0x022a
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r1.c
            if (r0 != 0) goto L_0x00b4
            goto L_0x0105
        L_0x00b4:
            java.lang.String r6 = r0.i
            if (r6 == 0) goto L_0x0105
            java.lang.String r0 = r1.d
            defpackage.iva.a((java.lang.Object) r6)
            java.util.List r9 = defpackage.jgu.d(r2, r0)     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
        L_0x00c5:
            boolean r10 = r9.hasNext()     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            if (r10 == 0) goto L_0x00e5
            java.lang.Object r10 = r9.next()     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            android.accounts.Account r10 = (android.accounts.Account) r10     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            java.lang.String r11 = r10.name     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            java.lang.String r11 = defpackage.eig.c(r2, r11)     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            if (r11 == 0) goto L_0x00c5
            java.lang.String r11 = defpackage.abej.a(r11, r0)     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            boolean r11 = r6.equals(r11)     // Catch:{ eif -> 0x00eb, IOException -> 0x00e9, IllegalStateException -> 0x00e7 }
            if (r11 == 0) goto L_0x00c5
            r0 = r10
            goto L_0x010d
        L_0x00e5:
            r0 = 0
            goto L_0x010d
        L_0x00e7:
            r0 = move-exception
            goto L_0x00ec
        L_0x00e9:
            r0 = move-exception
            goto L_0x00ec
        L_0x00eb:
            r0 = move-exception
        L_0x00ec:
            java.lang.String r0 = "Could not resolve user from hashedUserId: "
            int r9 = r6.length()
            if (r9 != 0) goto L_0x00fa
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            goto L_0x00fe
        L_0x00fa:
            java.lang.String r6 = r0.concat(r6)
        L_0x00fe:
            java.lang.String r0 = "HashedUserIdHelper"
            android.util.Log.w(r0, r6)
            r0 = 0
            goto L_0x010d
        L_0x0105:
            android.accounts.Account r0 = r1.a
            java.lang.String r6 = r1.d
            android.accounts.Account r0 = defpackage.jgu.a((android.content.Context) r2, (android.accounts.Account) r0, (java.lang.String) r6)
        L_0x010d:
            if (r0 == 0) goto L_0x0112
            r4 = 0
            goto L_0x022b
        L_0x0112:
            android.accounts.Account r6 = r1.a
            if (r6 != 0) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            if (r3 != 0) goto L_0x0124
            iue r0 = r1.h
            com.google.android.gms.common.internal.ResolveAccountResponse r2 = new com.google.android.gms.common.internal.ResolveAccountResponse
            r2.<init>((int) r5)
            r0.a(r2)
            return
        L_0x0124:
            java.util.Set r5 = r1.f
            int r5 = r5.size()
            r6 = 4
            if (r5 <= 0) goto L_0x01f3
            aber r0 = r1.i
            java.lang.String r5 = r1.d
            int r9 = r1.e
            java.util.Set r10 = r1.f
            java.lang.String r11 = r1.g
            r12 = 44
            amsk r12 = defpackage.amsk.a((char) r12)
            amsk r12 = r12.a()
            azgh r13 = defpackage.azgh.a
            azgi r13 = r13.a()
            java.lang.String r13 = r13.a()
            java.lang.Iterable r12 = r12.a((java.lang.CharSequence) r13)
            java.util.HashSet r12 = defpackage.angm.a((java.lang.Iterable) r12)
            amqy r13 = defpackage.abep.a
            java.lang.Iterable r13 = defpackage.anbs.a((java.lang.Iterable) r10, (defpackage.amqy) r13)
            java.util.HashSet r13 = defpackage.angm.a((java.lang.Iterable) r13)
            angk r12 = defpackage.angm.b(r12, r13)
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0197
            hya r12 = defpackage.hya.a((android.content.Context) r18)
            boolean r12 = r12.b((java.lang.String) r5)
            if (r12 != 0) goto L_0x0195
            ivk r12 = defpackage.jgu.a((android.content.Context) r18)
            java.lang.String r13 = java.lang.String.valueOf(r5)
            java.lang.String r14 = "x-client-auth:"
            int r15 = r13.length()
            if (r15 != 0) goto L_0x0187
            java.lang.String r13 = new java.lang.String
            r13.<init>(r14)
            goto L_0x018b
        L_0x0187:
            java.lang.String r13 = r14.concat(r13)
        L_0x018b:
            boolean r12 = r12.getBoolean(r13, r7)
            if (r12 != 0) goto L_0x0192
            goto L_0x0197
        L_0x0192:
        L_0x0193:
            r0 = 0
            goto L_0x01f3
        L_0x0195:
            r0 = 0
            goto L_0x01f3
        L_0x0197:
            java.util.List r12 = defpackage.jgu.d(r2, r5)
            java.util.ArrayList r11 = defpackage.jgu.a((java.util.List) r12, (java.lang.String) r11)
            if (r11 == 0) goto L_0x01a6
            int r12 = r11.size()
            goto L_0x01a7
        L_0x01a6:
            r12 = 0
        L_0x01a7:
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x01aa:
            if (r13 >= r12) goto L_0x01ea
            java.lang.Object r16 = r11.get(r13)
            r4 = r16
            android.accounts.Account r4 = (android.accounts.Account) r4
            abfa r8 = defpackage.abfa.a((android.content.Context) r18)
            qah r7 = defpackage.qah.a((android.accounts.Account) r4, (java.lang.Iterable) r10)
            r7.a((int) r6)
            r7.a((java.lang.String) r5, (int) r9)
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r7 = r7.a()
            abfb r7 = r8.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r7)
            int r7 = r7.a
            if (r7 == 0) goto L_0x01d8
            r4 = 7
            if (r7 == r4) goto L_0x01d6
            r4 = 8
            if (r7 == r4) goto L_0x01d6
            goto L_0x01e1
        L_0x01d6:
            r15 = 1
            goto L_0x01e1
        L_0x01d8:
            if (r14 == 0) goto L_0x01e0
            abee r0 = r0.b
            defpackage.abee.a(r2, r5)
            goto L_0x0193
        L_0x01e0:
            r14 = r4
        L_0x01e1:
            if (r15 != 0) goto L_0x01e8
            int r13 = r13 + 1
            r7 = 0
            r8 = 1
            goto L_0x01aa
        L_0x01e8:
            r4 = 0
            goto L_0x01eb
        L_0x01ea:
            r4 = r14
        L_0x01eb:
            if (r15 != 0) goto L_0x01f2
            abee r0 = r0.b
            defpackage.abee.a(r2, r5)
        L_0x01f2:
            r0 = r4
        L_0x01f3:
            if (r0 == 0) goto L_0x01f7
            r4 = 1
            goto L_0x022b
        L_0x01f7:
            java.lang.String r0 = r1.d
            java.util.Set r3 = r1.f
            int r4 = r3.size()
            com.google.android.gms.common.api.Scope[] r4 = new com.google.android.gms.common.api.Scope[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            com.google.android.gms.common.api.Scope[] r3 = (com.google.android.gms.common.api.Scope[]) r3
            abai r4 = r1.j
            android.os.Bundle r4 = r4.a()
            int r5 = r1.b
            android.content.Intent r0 = com.google.android.gms.signin.activity.SignInChimeraActivity.a(r0, r3, r4, r5)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r4 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r3)
            iue r2 = r1.h
            com.google.android.gms.common.internal.ResolveAccountResponse r3 = new com.google.android.gms.common.internal.ResolveAccountResponse
            com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
            r4.<init>(r6, r0)
            r3.<init>((com.google.android.gms.common.ConnectionResult) r4)
            r2.a(r3)
            return
        L_0x022a:
            r4 = 0
        L_0x022b:
            irh r5 = new irh
            r5.<init>(r2, r0)
            android.accounts.Account r0 = r1.a
            if (r0 != 0) goto L_0x0236
            r8 = 1
            goto L_0x023b
        L_0x0236:
            if (r3 != 0) goto L_0x023a
            r8 = 0
            goto L_0x023b
        L_0x023a:
            r8 = 1
        L_0x023b:
            iue r0 = r1.h
            com.google.android.gms.common.internal.ResolveAccountResponse r2 = new com.google.android.gms.common.internal.ResolveAccountResponse
            r3 = 0
            r2.<init>((int) r3)
            r2.b = r5
            r2.d = r8
            r2.e = r4
            r0.a(r2)
            return
        L_0x024d:
            iue r0 = r1.h
            com.google.android.gms.common.internal.ResolveAccountResponse r2 = new com.google.android.gms.common.internal.ResolveAccountResponse
            r3 = 20
            r2.<init>((int) r3)
            r0.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aben.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.h.a(new ResolveAccountResponse(8));
    }
}
