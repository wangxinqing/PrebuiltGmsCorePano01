package defpackage;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: khp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khp {
    public static final ith a = new ith("AuthorizationChecker", "");
    public volatile Runnable b;
    private final Context c;
    private final kkf d;
    private final lnn e;
    private final ExecutorService f;

    public khp(Context context, kkf kkf, lnn lnn, ExecutorService executorService) {
        this.c = context;
        this.d = kkf;
        this.e = lnn;
        this.f = executorService;
    }

    private static final khk a(VolleyError volleyError) {
        if (!(volleyError instanceof AuthFailureError)) {
            return new khk(volleyError.getMessage(), (Exception) volleyError);
        }
        AuthFailureError authFailureError = (AuthFailureError) volleyError;
        lrx a2 = lry.a(authFailureError.networkResponse);
        if (a2 == null || a2.c == null) {
            return new khk(String.format(Locale.US, "server returned response code %d", new Object[]{Integer.valueOf(authFailureError.networkResponse.statusCode)}));
        }
        return new khk(String.format(Locale.US, "Server returned error: %s. See https://developers.google.com/drive/handle-errors for details.", new Object[]{a2.c}));
    }

    private static khq a(khq khq, anax anax) {
        Set set = khq.e;
        iva.b(set.containsAll(anax));
        return !anax.containsAll(set) ? new khq(khq.a, khq.b, khq.c, khq.d, anax) : khq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.khn a(com.google.android.gms.common.internal.ClientContext r17) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r1 = r0.f
            android.content.Context r2 = r8.c
            hya r2 = defpackage.hya.a((android.content.Context) r2)
            boolean r2 = r2.b((java.lang.String) r1)
            anav r3 = defpackage.anax.j()     // Catch:{ khk -> 0x0104 }
            jzl[] r4 = defpackage.jzl.values()     // Catch:{ khk -> 0x0104 }
            int r5 = r4.length     // Catch:{ khk -> 0x0104 }
            r6 = 0
            r7 = 0
        L_0x001b:
            r9 = 1
            if (r7 >= r5) goto L_0x004a
            r10 = r4[r7]     // Catch:{ khk -> 0x0104 }
            java.lang.String r11 = r10.f     // Catch:{ khk -> 0x0104 }
            boolean r11 = r0.a((java.lang.String) r11)     // Catch:{ khk -> 0x0104 }
            if (r11 != 0) goto L_0x0029
            goto L_0x0033
        L_0x0029:
            boolean r11 = r10.h     // Catch:{ khk -> 0x0104 }
            if (r11 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            if (r2 == 0) goto L_0x0036
        L_0x0030:
            r3.b(r10)     // Catch:{ khk -> 0x0104 }
        L_0x0033:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x0036:
            khk r0 = new khk     // Catch:{ khk -> 0x0104 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ khk -> 0x0104 }
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ khk -> 0x0104 }
            java.lang.String r3 = r10.f     // Catch:{ khk -> 0x0104 }
            r2[r6] = r3     // Catch:{ khk -> 0x0104 }
            java.lang.String r3 = "Unsupported scope: %s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)     // Catch:{ khk -> 0x0104 }
            r0.<init>(r1)     // Catch:{ khk -> 0x0104 }
            throw r0     // Catch:{ khk -> 0x0104 }
        L_0x004a:
            anax r10 = r3.a()     // Catch:{ khk -> 0x0104 }
            boolean r3 = r10.isEmpty()     // Catch:{ khk -> 0x0104 }
            if (r3 != 0) goto L_0x00fc
            android.content.Context r3 = r8.c     // Catch:{ NameNotFoundException -> 0x00e8 }
            java.lang.String r3 = defpackage.jhg.e(r3, r1)     // Catch:{ NameNotFoundException -> 0x00e8 }
            if (r3 == 0) goto L_0x00d5
            com.google.android.gms.drive.auth.AppIdentity r4 = com.google.android.gms.drive.auth.AppIdentity.a(r1, r3)     // Catch:{ NameNotFoundException -> 0x00e8 }
            kkf r1 = r8.d
            android.accounts.Account r3 = r0.c
            java.lang.String r3 = r3.name
            kkz r7 = r1.c((java.lang.String) r3)
            kkf r1 = r8.d
            long r11 = r7.b
            khq r11 = r1.b((long) r11, (com.google.android.gms.drive.auth.AppIdentity) r4)
            if (r11 == 0) goto L_0x007e
            java.util.Set r1 = r11.e
            boolean r1 = r1.containsAll(r10)
            if (r1 == 0) goto L_0x007e
            r12 = 1
            goto L_0x007f
        L_0x007e:
            r12 = 0
        L_0x007f:
            if (r11 == 0) goto L_0x008e
            long r13 = java.lang.System.currentTimeMillis()
            r15 = r7
            long r6 = r11.d
            int r1 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x008f
            r13 = 0
            goto L_0x0090
        L_0x008e:
            r15 = r7
        L_0x008f:
            r13 = 1
        L_0x0090:
            if (r12 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            if (r13 == 0) goto L_0x00a6
            if (r2 == 0) goto L_0x0098
            goto L_0x00a6
        L_0x0098:
            r1 = r16
            r2 = r17
            r3 = r4
            r4 = r10
            r5 = r15
            r6 = r11
            r7 = r12
            khn r0 = r1.a(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x00a6:
            if (r2 == 0) goto L_0x00c4
            if (r13 == 0) goto L_0x00c4
            java.lang.Runnable r1 = r8.b
            if (r1 != 0) goto L_0x00c4
            kho r12 = new kho
            r1 = r12
            r2 = r16
            r3 = r17
            r5 = r10
            r6 = r15
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.b = r12
            java.util.concurrent.ExecutorService r0 = r8.f
            java.lang.Runnable r1 = r8.b
            r0.submit(r1)
        L_0x00c4:
            if (r13 != 0) goto L_0x00c9
            khm r0 = defpackage.khm.OK
            goto L_0x00cb
        L_0x00c9:
            khm r0 = defpackage.khm.OK_EXPIRED
        L_0x00cb:
            khq r1 = a(r11, r10)
            r2 = 0
            khn r0 = defpackage.khn.a(r0, r1, r9, r2)
            return r0
        L_0x00d5:
            khk r0 = new khk     // Catch:{ NameNotFoundException -> 0x00e8 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x00e8 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ NameNotFoundException -> 0x00e8 }
            r3 = 0
            r4[r3] = r1     // Catch:{ NameNotFoundException -> 0x00e8 }
            java.lang.String r5 = "No certificates for %s from package manager."
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)     // Catch:{ NameNotFoundException -> 0x00e8 }
            r0.<init>(r2)     // Catch:{ NameNotFoundException -> 0x00e8 }
            throw r0     // Catch:{ NameNotFoundException -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            khk r0 = new khk     // Catch:{ khk -> 0x0104 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ khk -> 0x0104 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ khk -> 0x0104 }
            r3 = 0
            r4[r3] = r1     // Catch:{ khk -> 0x0104 }
            java.lang.String r1 = "Package not found: %s"
            java.lang.String r1 = java.lang.String.format(r2, r1, r4)     // Catch:{ khk -> 0x0104 }
            r0.<init>(r1)     // Catch:{ khk -> 0x0104 }
            throw r0     // Catch:{ khk -> 0x0104 }
        L_0x00fc:
            khk r0 = new khk     // Catch:{ khk -> 0x0104 }
            java.lang.String r1 = "No valid Drive authorization scope provided."
            r0.<init>(r1)     // Catch:{ khk -> 0x0104 }
            throw r0     // Catch:{ khk -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            khm r1 = defpackage.khm.FAIL_PERMANENT
            khn r0 = defpackage.khn.a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khp.a(com.google.android.gms.common.internal.ClientContext):khn");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: com.google.android.gms.common.internal.ClientContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: khq} */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
        r6 = r13;
        r8 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        r1.d.b(r6.b, r8.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        r6 = r13;
        r8 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        r1.d.b(r6.b, r8.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0139, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013a, code lost:
        r7 = r12;
        r6 = r13;
        r8 = r14;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0157, code lost:
        if (r8 == 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016c, code lost:
        if (r5.contains(defpackage.jzl.APPDATA) != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016e, code lost:
        a.c("AuthorizationChecker", "Unexpected APPDATA scope requested for auth");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0182, code lost:
        r0 = defpackage.khm.OK_EXPIRED;
        defpackage.iva.b(!r5.contains(defpackage.jzl.APPDATA));
        r2 = new defpackage.khq(r22, "745476177629", r20, java.lang.System.currentTimeMillis(), r21);
        r1.d.b(r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01be, code lost:
        r6 = r13;
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c3, code lost:
        r1.d.b(r6.b, r2.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return defpackage.khn.a(defpackage.khm.FAIL_PERMANENT, a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return defpackage.khn.a(defpackage.khm.OK_EXPIRED, a(r8, r5), true, java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return defpackage.khn.a(defpackage.khm.FAIL_PERMANENT, a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return defpackage.khn.a(r0, r2, true, java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd A[ExcHandler: eif (e eif), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a A[ExcHandler: UserRecoverableAuthException (e com.google.android.gms.auth.UserRecoverableAuthException), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.khn a(com.google.android.gms.common.internal.ClientContext r19, com.google.android.gms.drive.auth.AppIdentity r20, defpackage.anax r21, defpackage.kkz r22, defpackage.khq r23, boolean r24) {
        /*
            r18 = this;
            r1 = r18
            r8 = r19
            r15 = r21
            r13 = r22
            r14 = r23
            r12 = r24
            long r16 = android.os.SystemClock.elapsedRealtime()
            r11 = 0
            r10 = 1
            lnn r0 = r1.e     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            lnu r2 = new lnu     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r3 = 2838(0xb16, float:3.977E-42)
            lns r0 = r0.a((com.google.android.gms.common.internal.ClientContext) r8, (int) r3)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r2.<init>(r0)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            iyu r0 = new iyu     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r0.<init>()     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.String r3 = "id"
            r0.a((java.lang.String) r3)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r3.<init>()     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.util.Formatter r4 = new java.util.Formatter     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r4.<init>(r3)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r6 = 0
            java.lang.String r7 = "self"
            java.lang.String r7 = defpackage.iyv.a(r7)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r5[r6] = r7     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.String r6 = "apps/%1$s"
            r4.format(r6, r5)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r0.a((java.lang.StringBuilder) r3)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.String r5 = r3.toString()     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            izb r2 = r2.a     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r4 = 0
            r6 = 0
            java.lang.Class<com.google.android.gms.drive.internal.model.App> r7 = com.google.android.gms.drive.internal.model.App.class
            r3 = r19
            jag r0 = r2.a((com.google.android.gms.common.internal.ClientContext) r3, (int) r4, (java.lang.String) r5, (java.lang.Object) r6, (java.lang.Class) r7)     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            com.google.android.gms.drive.internal.model.App r0 = (com.google.android.gms.drive.internal.model.App) r0     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.String r0 = r0.b     // Catch:{ VolleyError -> 0x00c5, IllegalArgumentException -> 0x01bd, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            long r2 = r2 - r16
            int r3 = (int) r2     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            agvx r2 = defpackage.jzq.p     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.Object r2 = r2.c()     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            long r6 = r2.longValue()     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            long r4 = r4 + r6
            khq r2 = new khq     // Catch:{ IllegalArgumentException -> 0x01bd, VolleyError -> 0x0139, UserRecoverableAuthException -> 0x011a, eif -> 0x00fd }
            r9 = r2
            r6 = 1
            r10 = r22
            r7 = r11
            r11 = r0
            r7 = r12
            r12 = r20
            r6 = r13
            r8 = r14
            r13 = r4
            r5 = r15
            r15 = r21
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            jzl r0 = defpackage.jzl.APPDATA     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            boolean r0 = r5.contains(r0)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            if (r0 != 0) goto L_0x0090
            r11 = 0
            goto L_0x00b5
        L_0x0090:
            if (r8 != 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            java.util.Set r0 = r8.e     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            jzl r4 = defpackage.jzl.APPDATA     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            boolean r0 = r0.contains(r4)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            if (r0 == 0) goto L_0x009f
            r11 = 0
            goto L_0x00b5
        L_0x009f:
            lnn r0 = r1.e     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            java.lang.String r11 = r0.a((defpackage.khq) r2)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            if (r11 != 0) goto L_0x00b5
            khm r0 = defpackage.khm.FAIL_TRANSIENT     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            khk r2 = new khk     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            java.lang.String r3 = "Could not retrieve the resourceId for app data"
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            khn r0 = defpackage.khn.a(r0, r2)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            return r0
        L_0x00b5:
            kkf r0 = r1.d     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            r0.b((defpackage.khq) r2, (java.lang.String) r11)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            khm r0 = defpackage.khm.OK     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            khn r0 = defpackage.khn.a(r0, r2, r7, r3)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            return r0
        L_0x00c5:
            r0 = move-exception
            r7 = r12
            r6 = r13
            r8 = r14
            r5 = r15
            com.android.volley.NetworkResponse r2 = r0.networkResponse     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            if (r2 == 0) goto L_0x00f2
            lrx r3 = defpackage.lry.a((com.android.volley.NetworkResponse) r2)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            if (r3 == 0) goto L_0x00f2
            int r2 = r2.statusCode     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            defpackage.lry.a(r2, r3)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            r4 = 403(0x193, float:5.65E-43)
            if (r2 != r4) goto L_0x00f2
            r2 = 101(0x65, float:1.42E-43)
            boolean r2 = r3.a(r2)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            if (r2 == 0) goto L_0x00f2
            ith r2 = defpackage.lnn.a     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            java.lang.String r3 = "Domain policy restriction: throwing auth exception."
            r2.b(r3)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            eif r2 = new eif     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            r2.<init>((java.lang.Throwable) r0)     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
        L_0x00f2:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00f9, VolleyError -> 0x00f7, UserRecoverableAuthException -> 0x00f5, eif -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            goto L_0x0100
        L_0x00f5:
            r0 = move-exception
            goto L_0x011d
        L_0x00f7:
            r0 = move-exception
            goto L_0x013e
        L_0x00f9:
            r0 = move-exception
            r2 = r8
            goto L_0x01c0
        L_0x00fd:
            r0 = move-exception
            r6 = r13
            r8 = r14
        L_0x0100:
            if (r8 != 0) goto L_0x0103
            goto L_0x010c
        L_0x0103:
            kkf r2 = r1.d
            long r3 = r6.b
            java.lang.String r5 = r8.b
            r2.b((long) r3, (java.lang.String) r5)
        L_0x010c:
            khm r2 = defpackage.khm.FAIL_PERMANENT
            khk r3 = new khk
            java.lang.String r4 = "See https://developers.google.com/drive/android/auth for details on authorizing an application."
            r3.<init>((java.lang.String) r4, (java.lang.Exception) r0)
            khn r0 = defpackage.khn.a(r2, r3)
            return r0
        L_0x011a:
            r0 = move-exception
            r6 = r13
            r8 = r14
        L_0x011d:
            if (r8 != 0) goto L_0x0120
            goto L_0x0129
        L_0x0120:
            kkf r2 = r1.d
            long r3 = r6.b
            java.lang.String r5 = r8.b
            r2.b((long) r3, (java.lang.String) r5)
        L_0x0129:
            khm r2 = defpackage.khm.FAIL_USER_CONSENT_REQUIRED
            khk r3 = new khk
            android.content.Intent r4 = r0.a()
            r3.<init>((java.lang.Exception) r0, (android.content.Intent) r4)
            khn r0 = defpackage.khn.a(r2, r3)
            return r0
        L_0x0139:
            r0 = move-exception
            r7 = r12
            r6 = r13
            r8 = r14
            r5 = r15
        L_0x013e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r16
            int r9 = (int) r2
            if (r7 == 0) goto L_0x0157
            khq r0 = a(r8, r5)
            khm r2 = defpackage.khm.OK_EXPIRED
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 1
            khn r0 = defpackage.khn.a(r2, r0, r4, r3)
            goto L_0x01bc
        L_0x0157:
            if (r8 == 0) goto L_0x015a
            goto L_0x01b2
        L_0x015a:
            r2 = r19
            java.lang.String r2 = r2.f
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01b2
            jzl r2 = defpackage.jzl.APPDATA
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0182
            ith r2 = a
            java.lang.String r3 = "AuthorizationChecker"
            java.lang.String r4 = "Unexpected APPDATA scope requested for auth"
            r2.c((java.lang.String) r3, (java.lang.String) r4)
            khm r2 = defpackage.khm.FAIL_PERMANENT
            khk r0 = a((com.android.volley.VolleyError) r0)
            khn r0 = defpackage.khn.a(r2, r0)
            goto L_0x01bc
        L_0x0182:
            khm r0 = defpackage.khm.OK_EXPIRED
            jzl r2 = defpackage.jzl.APPDATA
            boolean r2 = r5.contains(r2)
            r7 = 1
            r2 = r2 ^ r7
            defpackage.iva.b((boolean) r2)
            khq r10 = new khq
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "745476177629"
            r2 = r10
            r3 = r22
            r5 = r20
            r13 = 0
            r14 = 1
            r6 = r11
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r8)
            kkf r2 = r1.d
            r2.b((defpackage.khq) r10, (java.lang.String) r13)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            khn r0 = defpackage.khn.a(r0, r10, r14, r2)
            goto L_0x01bc
        L_0x01b2:
            khm r2 = defpackage.khm.FAIL_PERMANENT
            khk r0 = a((com.android.volley.VolleyError) r0)
            khn r0 = defpackage.khn.a(r2, r0)
        L_0x01bc:
            return r0
        L_0x01bd:
            r0 = move-exception
            r6 = r13
            r2 = r14
        L_0x01c0:
            if (r2 != 0) goto L_0x01c3
            goto L_0x01cc
        L_0x01c3:
            kkf r3 = r1.d
            long r4 = r6.b
            java.lang.String r2 = r2.b
            r3.b((long) r4, (java.lang.String) r2)
        L_0x01cc:
            khm r2 = defpackage.khm.FAIL_TRANSIENT
            khk r3 = new khk
            java.lang.String r4 = "Something went wrong while creating app data"
            r3.<init>((java.lang.String) r4, (java.lang.Exception) r0)
            khn r0 = defpackage.khn.a(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khp.a(com.google.android.gms.common.internal.ClientContext, com.google.android.gms.drive.auth.AppIdentity, anax, kkz, khq, boolean):khn");
    }
}
