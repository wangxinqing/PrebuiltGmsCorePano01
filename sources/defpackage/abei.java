package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: abei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abei extends nis {
    private final abev a;
    private final abdr b;
    private final abfa c;
    private final icc d;
    private final abez e;
    private final iby f;

    public abei(abev abev, abdr abdr) {
        super(44, "GetCurrentAccount");
        iva.a((Object) abev);
        this.a = abev;
        iva.a((Object) abdr);
        this.b = abdr;
        this.c = abfa.a((Context) abev.b);
        if (azgz.b()) {
            iby iby = abev.o;
            iva.a((Object) iby);
            this.f = iby;
            this.d = null;
        } else {
            icc icc = abev.m;
            iva.a((Object) icc);
            this.d = icc;
            this.f = null;
        }
        iva.a((Object) abev.i);
        if (azgw.b()) {
            this.e = abez.a;
        } else {
            this.e = null;
        }
    }

    private final void a(Status status, GoogleSignInAccount googleSignInAccount) {
        this.b.a(status, googleSignInAccount);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v6, resolved type: xfh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: xfh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v89, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r23v1, types: [ile, java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r23v4 */
    /* JADX WARNING: type inference failed for: r23v5 */
    /* JADX WARNING: type inference failed for: r23v7 */
    /* JADX WARNING: type inference failed for: r23v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0144, code lost:
        r2 = (defpackage.qad) r2.b();
        r13 = r2.a;
        r21 = defpackage.abej.a(r13, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x048e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r25) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "exp"
            java.lang.String r2 = "picture"
            java.lang.String r3 = "email"
            java.lang.String r4 = "family_name"
            java.lang.String r5 = "given_name"
            java.lang.String r6 = "name"
            abev r7 = r1.a
            android.accounts.Account r7 = r7.h()
            java.lang.String r8 = "GetCurrentAccountOpr"
            r9 = 0
            if (r7 != 0) goto L_0x0024
            java.lang.String r0 = "SignInService has no stored account"
            android.util.Log.e(r8, r0)
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            r1.a(r0, r9)
            return
        L_0x0024:
            abev r10 = r1.a
            java.util.Set r10 = r10.d()
            if (r10 == 0) goto L_0x002d
            goto L_0x0032
        L_0x002d:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
        L_0x0032:
            abez r11 = r1.e
            if (r11 == 0) goto L_0x0051
            abev r12 = r1.a
            java.lang.String r12 = r12.c
            boolean r11 = r11.b(r12, r7)
            if (r11 == 0) goto L_0x0051
            abez r10 = r1.e
            abev r11 = r1.a
            java.lang.String r12 = r11.c
            android.accounts.Account r11 = r11.h()
            java.util.Set r10 = r10.a(r12, r11)
            defpackage.iva.a((java.lang.Object) r10)
        L_0x0051:
            boolean r11 = r10.isEmpty()
            r12 = 4
            if (r11 != 0) goto L_0x00b3
            abfa r11 = r1.c
            qah r13 = defpackage.qah.a((android.accounts.Account) r7, (java.lang.Iterable) r10)
            r13.a((int) r12)
            abev r14 = r1.a
            java.lang.String r15 = r14.c
            int r14 = r14.d
            r13.a((java.lang.String) r15, (int) r14)
            abev r14 = r1.a
            java.lang.String r14 = r14.l
            r13.b((java.lang.String) r14)
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r13 = r13.a()
            abfb r11 = r11.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r13)
            boolean r13 = r11.a()
            if (r13 == 0) goto L_0x009d
            amri r13 = r11.c
            java.lang.Object r13 = r13.b()
            com.google.android.gms.auth.TokenData r13 = (com.google.android.gms.auth.TokenData) r13
            boolean r13 = r13.e
            if (r13 == 0) goto L_0x00b4
            amri r10 = r11.c
            java.lang.Object r10 = r10.b()
            com.google.android.gms.auth.TokenData r10 = (com.google.android.gms.auth.TokenData) r10
            java.util.List r10 = r10.f
            defpackage.iva.a((java.lang.Object) r10)
            java.util.Set r10 = defpackage.jkx.a((java.util.Collection) r10)
            goto L_0x00b4
        L_0x009d:
            int r0 = r11.a
            r2 = 10
            if (r0 != r12) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            if (r0 == r2) goto L_0x00a9
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x00ae
        L_0x00a9:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2)
        L_0x00ae:
            r1.a(r0, r9)
            return
        L_0x00b3:
            r11 = r9
        L_0x00b4:
            com.google.android.gms.common.api.Scope r13 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.a
            boolean r13 = r10.contains(r13)
            com.google.android.gms.common.api.Scope r14 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.b
            boolean r14 = r10.contains(r14)
            com.google.android.gms.common.api.Scope r15 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.c
            boolean r15 = r10.contains(r15)
            abev r9 = r1.a
            boolean r9 = r9.g
            r12 = 1
            if (r9 == 0) goto L_0x025c
            java.lang.String r9 = "id token required, issuing request"
            android.util.Log.v(r8, r9)
            abev r9 = r1.a
            java.lang.String r9 = r9.h
            qah r9 = defpackage.qah.a((android.accounts.Account) r7, (java.lang.String) r9)
            r11 = 4
            r9.a((int) r11)
            abev r11 = r1.a
            java.lang.String r13 = r11.c
            int r11 = r11.d
            r9.a((java.lang.String) r13, (int) r11)
            abev r11 = r1.a
            java.lang.String r11 = r11.l
            r9.b((java.lang.String) r11)
            abev r11 = r1.a
            android.accounts.Account r13 = r11.e
            if (r13 == 0) goto L_0x00fe
            android.accounts.Account r11 = r11.h()
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x0110
        L_0x00fe:
            abev r11 = r1.a
            boolean r11 = r11.g()
            r9.a((boolean) r11)
            abev r11 = r1.a
            boolean r11 = r11.f()
            r9.b((boolean) r11)
        L_0x0110:
            abfa r11 = r1.c
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r9 = r9.a()
            abfb r9 = r11.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r9)
            boolean r11 = r9.a()
            if (r11 == 0) goto L_0x0258
            amri r9 = r9.c
            java.lang.Object r9 = r9.b()
            com.google.android.gms.auth.TokenData r9 = (com.google.android.gms.auth.TokenData) r9
            java.lang.String r14 = r9.b
            azhf r9 = defpackage.azhf.a
            azhg r9 = r9.a()
            boolean r9 = r9.a()
            if (r9 == 0) goto L_0x0198
            abev r0 = r1.a
            java.lang.String r0 = r0.c
            amri r2 = defpackage.qae.a(r14)
            boolean r3 = r2.a()
            if (r3 == 0) goto L_0x0195
            java.lang.Object r2 = r2.b()
            qad r2 = (defpackage.qad) r2
            java.lang.String r13 = r2.a
            java.lang.String r21 = defpackage.abej.a(r13, r0)
            if (r21 == 0) goto L_0x0195
            amri r0 = r2.e
            java.lang.Object r0 = r0.c()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            amri r0 = r2.b
            java.lang.Object r0 = r0.c()
            r16 = r0
            java.lang.String r16 = (java.lang.String) r16
            amri r0 = r2.c
            java.lang.Object r0 = r0.c()
            r17 = r0
            java.lang.String r17 = (java.lang.String) r17
            amri r0 = r2.d
            java.lang.Object r0 = r0.c()
            r18 = r0
            java.lang.String r18 = (java.lang.String) r18
            amri r0 = r2.f
            java.lang.Object r0 = r0.c()
            r19 = r0
            android.net.Uri r19 = (android.net.Uri) r19
            amri r0 = r2.g
            java.lang.Object r0 = r0.c()
            r20 = r0
            java.lang.Long r20 = (java.lang.Long) r20
            r22 = r10
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x024d
        L_0x0195:
            r0 = 0
            goto L_0x024d
        L_0x0198:
            abev r9 = r1.a
            java.lang.String r9 = r9.c
            java.lang.String r11 = "\\."
            java.lang.String[] r11 = r14.split(r11)
            int r13 = r11.length
            r15 = 3
            if (r13 >= r15) goto L_0x01ae
            java.lang.String r0 = "Malformed id token - incorrect number of parts"
            android.util.Log.w(r8, r0)
            r0 = 0
            goto L_0x024d
        L_0x01ae:
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0246 }
            r11 = r11[r12]     // Catch:{ UnsupportedEncodingException -> 0x0246 }
            byte[] r11 = defpackage.jhy.c((java.lang.String) r11)     // Catch:{ UnsupportedEncodingException -> 0x0246 }
            java.lang.String r12 = "UTF-8"
            r13.<init>(r11, r12)     // Catch:{ UnsupportedEncodingException -> 0x0246 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x023e }
            r11.<init>(r13)     // Catch:{ JSONException -> 0x023e }
            java.lang.String r12 = "sub"
            java.lang.String r13 = r11.getString(r12)     // Catch:{ JSONException -> 0x023e }
            boolean r12 = r11.has(r6)     // Catch:{ JSONException -> 0x023e }
            if (r12 == 0) goto L_0x01d3
            java.lang.String r6 = r11.getString(r6)     // Catch:{ JSONException -> 0x023e }
            r16 = r6
            goto L_0x01d5
        L_0x01d3:
            r16 = 0
        L_0x01d5:
            boolean r6 = r11.has(r5)     // Catch:{ JSONException -> 0x023e }
            if (r6 == 0) goto L_0x01e3
            java.lang.String r5 = r11.getString(r5)     // Catch:{ JSONException -> 0x023e }
            r17 = r5
            goto L_0x01e5
        L_0x01e3:
            r17 = 0
        L_0x01e5:
            boolean r5 = r11.has(r4)     // Catch:{ JSONException -> 0x023e }
            if (r5 == 0) goto L_0x01f3
            java.lang.String r4 = r11.getString(r4)     // Catch:{ JSONException -> 0x023e }
            r18 = r4
            goto L_0x01f5
        L_0x01f3:
            r18 = 0
        L_0x01f5:
            boolean r4 = r11.has(r3)     // Catch:{ JSONException -> 0x023e }
            if (r4 == 0) goto L_0x0202
            java.lang.String r3 = r11.getString(r3)     // Catch:{ JSONException -> 0x023e }
            r15 = r3
            goto L_0x0203
        L_0x0202:
            r15 = 0
        L_0x0203:
            boolean r3 = r11.has(r2)     // Catch:{ JSONException -> 0x023e }
            if (r3 == 0) goto L_0x0215
            java.lang.String r2 = r11.getString(r2)     // Catch:{ JSONException -> 0x023e }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ JSONException -> 0x023e }
            r19 = r2
            goto L_0x0217
        L_0x0215:
            r19 = 0
        L_0x0217:
            boolean r2 = r11.has(r0)     // Catch:{ JSONException -> 0x023e }
            if (r2 == 0) goto L_0x022d
            java.lang.String r0 = r11.getString(r0)     // Catch:{ JSONException -> 0x023e }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ JSONException -> 0x023e }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ JSONException -> 0x023e }
            r20 = r0
            goto L_0x022f
        L_0x022d:
            r20 = 0
        L_0x022f:
            java.lang.String r21 = defpackage.abej.a(r13, r9)     // Catch:{ JSONException -> 0x023e }
            if (r21 == 0) goto L_0x023c
            r22 = r10
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x023e }
            goto L_0x024d
        L_0x023c:
            r0 = 0
            goto L_0x024d
        L_0x023e:
            r0 = move-exception
            java.lang.String r0 = "Malformed id token - could not json decode claims"
            android.util.Log.w(r8, r0)
            r0 = 0
            goto L_0x024d
        L_0x0246:
            r0 = move-exception
            java.lang.String r0 = "Malformed id token - UTF-8 encoding is not supported"
            android.util.Log.w(r8, r0)
            r0 = 0
        L_0x024d:
            if (r0 != 0) goto L_0x0254
            java.lang.String r2 = "Can't get a valid id token"
            android.util.Log.w(r8, r2)
        L_0x0254:
            r14 = r0
            r2 = 0
            goto L_0x03c5
        L_0x0258:
            r2 = 0
            r14 = 0
            goto L_0x03c5
        L_0x025c:
            java.lang.String r0 = r7.name     // Catch:{ eif -> 0x026a, IOException -> 0x0268, IllegalStateException -> 0x0266 }
            r2 = r25
            java.lang.String r0 = defpackage.eig.c(r2, r0)     // Catch:{ eif -> 0x026a, IOException -> 0x0268, IllegalStateException -> 0x0266 }
            r2 = r0
            goto L_0x0271
        L_0x0266:
            r0 = move-exception
            goto L_0x026b
        L_0x0268:
            r0 = move-exception
            goto L_0x026b
        L_0x026a:
            r0 = move-exception
        L_0x026b:
            java.lang.String r0 = "Can't get user id"
            android.util.Log.w(r8, r0)
            r2 = 0
        L_0x0271:
            if (r14 == 0) goto L_0x0277
            java.lang.String r0 = r7.name
            r3 = r0
            goto L_0x0278
        L_0x0277:
            r3 = 0
        L_0x0278:
            if (r13 != 0) goto L_0x0285
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r23 = 0
            goto L_0x037b
        L_0x0285:
            boolean r0 = defpackage.azgz.b()
            java.lang.String r4 = "Interrupted while waiting for account info"
            r5 = 1
            if (r0 != 0) goto L_0x02e8
            icc r0 = r1.d
            if (r0 == 0) goto L_0x02e4
            com.google.android.gms.common.ConnectionResult r0 = r0.f()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x02e4
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r12)
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            ibq r12 = defpackage.wlt.a
            icc r12 = r1.d
            java.lang.String r13 = r7.name
            r14 = 0
            icf r12 = defpackage.xco.a(r12, r13, r14)
            abeh r13 = new abeh
            r13.<init>(r9, r0)
            r12.a((defpackage.icm) r13)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x02d1 }
            r0.await(r5, r12)     // Catch:{ InterruptedException -> 0x02d1 }
            java.lang.Object r0 = r9.get()     // Catch:{ InterruptedException -> 0x02d1 }
            r14 = r0
            xfh r14 = (defpackage.xfh) r14     // Catch:{ InterruptedException -> 0x02d1 }
            icc r0 = r1.d
            r0.g()
            r23 = r14
            r14 = 0
            goto L_0x0324
        L_0x02cf:
            r0 = move-exception
            goto L_0x02de
        L_0x02d1:
            r0 = move-exception
            android.util.Log.w(r8, r4)     // Catch:{ all -> 0x02cf }
            icc r0 = r1.d
            r0.g()
            r14 = 0
            r23 = 0
            goto L_0x0324
        L_0x02de:
            icc r2 = r1.d
            r2.g()
            throw r0
        L_0x02e4:
            r14 = 0
            r23 = 0
            goto L_0x0324
        L_0x02e8:
            iby r0 = r1.f
            if (r0 == 0) goto L_0x0321
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r12)
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            iby r12 = r1.f
            r14 = 0
            icf r12 = r12.a((defpackage.wkz) r14)
            abeg r13 = new abeg
            r13.<init>(r9, r0)
            r12.a((defpackage.icm) r13)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x031a }
            boolean r5 = r0.await(r5, r12)     // Catch:{ InterruptedException -> 0x031a }
            if (r5 == 0) goto L_0x0316
            java.lang.Object r0 = r9.get()     // Catch:{ InterruptedException -> 0x031a }
            xfh r0 = (defpackage.xfh) r0     // Catch:{ InterruptedException -> 0x031a }
            r23 = r0
            goto L_0x0324
        L_0x0316:
            r0.countDown()     // Catch:{ InterruptedException -> 0x031a }
            goto L_0x0322
        L_0x031a:
            r0 = move-exception
            android.util.Log.w(r8, r4)
            r23 = r14
            goto L_0x0324
        L_0x0321:
            r14 = 0
        L_0x0322:
            r23 = r14
        L_0x0324:
            if (r23 == 0) goto L_0x0373
            abef r0 = new abef
            r0.<init>(r7)
            java.util.Iterator r4 = r23.iterator()
            defpackage.amrl.a((java.lang.Object) r4)
            defpackage.amrl.a((java.lang.Object) r0)
        L_0x0335:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0346
            java.lang.Object r5 = r4.next()
            boolean r6 = r0.a(r5)
            if (r6 == 0) goto L_0x0335
            goto L_0x0347
        L_0x0346:
            r5 = r14
        L_0x0347:
            xaa r5 = (defpackage.xaa) r5
            if (r5 == 0) goto L_0x0363
            java.lang.String r0 = r5.d()
            java.lang.String r4 = r5.f()
            java.lang.String r6 = r5.g()
            java.lang.String r9 = r5.i()
            if (r2 != 0) goto L_0x0362
            java.lang.String r2 = r5.h()
            goto L_0x0367
        L_0x0362:
            goto L_0x0367
        L_0x0363:
            r0 = r14
            r4 = r0
            r6 = r4
            r9 = r6
        L_0x0367:
            r23.c()
            r16 = r0
            r17 = r4
            r18 = r6
            r23 = r9
            goto L_0x037b
        L_0x0373:
            r16 = r14
            r17 = r16
            r18 = r17
            r23 = r18
        L_0x037b:
            if (r2 == 0) goto L_0x0388
            abev r0 = r1.a
            java.lang.String r0 = r0.c
            java.lang.String r0 = defpackage.abej.a(r2, r0)
            r21 = r0
            goto L_0x038a
        L_0x0388:
            r21 = r14
        L_0x038a:
            if (r21 != 0) goto L_0x038e
            r2 = r14
            goto L_0x03c5
        L_0x038e:
            if (r15 == 0) goto L_0x0392
            r13 = r2
            goto L_0x0393
        L_0x0392:
            r13 = r14
        L_0x0393:
            if (r23 == 0) goto L_0x039c
            android.net.Uri r0 = android.net.Uri.parse(r23)
            r19 = r0
            goto L_0x039e
        L_0x039c:
            r19 = r14
        L_0x039e:
            if (r11 == 0) goto L_0x03ad
            amri r0 = r11.c
            java.lang.Object r0 = r0.b()
            com.google.android.gms.auth.TokenData r0 = (com.google.android.gms.auth.TokenData) r0
            java.lang.Long r0 = r0.c
            r20 = r0
            goto L_0x03ba
        L_0x03ad:
            long r4 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r11
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r20 = r0
        L_0x03ba:
            r0 = 0
            r2 = r14
            r14 = r0
            r15 = r3
            r22 = r10
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r14 = r0
        L_0x03c5:
            if (r14 == 0) goto L_0x0478
            abev r0 = r1.a
            boolean r3 = r0.f
            if (r3 == 0) goto L_0x0478
            java.util.Set r0 = r0.e()
            abez r3 = r1.e
            if (r3 == 0) goto L_0x03f0
            abev r4 = r1.a
            java.lang.String r4 = r4.c
            boolean r3 = r3.b(r4, r7)
            if (r3 == 0) goto L_0x03f0
            abez r0 = r1.e
            abev r3 = r1.a
            java.lang.String r4 = r3.c
            android.accounts.Account r3 = r3.h()
            java.util.Set r0 = r0.a(r4, r3)
            defpackage.iva.a((java.lang.Object) r0)
        L_0x03f0:
            abev r3 = r1.a
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x03fb
            java.lang.String r3 = "consent"
            goto L_0x03fd
        L_0x03fb:
            java.lang.String r3 = "auto"
        L_0x03fd:
            abev r4 = r1.a
            android.accounts.Account r4 = r4.h()
            abev r5 = r1.a
            java.lang.String r5 = r5.h
            qah r0 = defpackage.qah.a(r4, r5, r0)
            r4 = 4
            r0.a((int) r4)
            abev r4 = r1.a
            java.lang.String r5 = r4.c
            int r4 = r4.d
            r0.a((java.lang.String) r5, (int) r4)
            abev r4 = r1.a
            boolean r4 = r4.g()
            r0.a((boolean) r4)
            abev r4 = r1.a
            boolean r4 = r4.f()
            r0.b((boolean) r4)
            r0.a((java.lang.String) r3)
            abev r3 = r1.a
            java.lang.String r3 = r3.l
            r0.b((java.lang.String) r3)
            abfa r3 = r1.c
            com.google.android.gms.auth.firstparty.dataservice.TokenRequest r0 = r0.a()
            abfb r0 = r3.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r0)
            boolean r3 = r0.a()
            if (r3 == 0) goto L_0x0470
            amri r2 = r0.c
            java.lang.Object r2 = r2.b()
            com.google.android.gms.auth.TokenData r2 = (com.google.android.gms.auth.TokenData) r2
            java.lang.String r2 = r2.b
            r14.g = r2
            abfa r2 = r1.c
            amri r0 = r0.c
            java.lang.Object r0 = r0.b()
            com.google.android.gms.auth.TokenData r0 = (com.google.android.gms.auth.TokenData) r0
            java.lang.String r0 = r0.b
            android.content.Context r2 = r2.b     // Catch:{ eif -> 0x0464, IOException -> 0x0462 }
            defpackage.eig.b(r2, r0)     // Catch:{ eif -> 0x0464, IOException -> 0x0462 }
            goto L_0x0479
        L_0x0462:
            r0 = move-exception
            goto L_0x0465
        L_0x0464:
            r0 = move-exception
        L_0x0465:
            iwd r2 = defpackage.abfa.a
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Error clearing cached token."
            r2.d(r4, r0, r3)
            goto L_0x0479
        L_0x0470:
            java.lang.String r0 = "Unexpected failure retrieving server auth code."
            android.util.Log.e(r8, r0)
            r9 = r2
            goto L_0x047a
        L_0x0478:
        L_0x0479:
            r9 = r14
        L_0x047a:
            abez r0 = r1.e
            if (r0 == 0) goto L_0x0489
            abev r2 = r1.a
            java.lang.String r3 = r2.c
            android.accounts.Account r2 = r2.h()
            r0.c(r3, r2)
        L_0x0489:
            if (r9 != 0) goto L_0x048e
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x0490
        L_0x048e:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x0490:
            r1.a(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abei.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.b.a(status, (GoogleSignInAccount) null);
    }
}
