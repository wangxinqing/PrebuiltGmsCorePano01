package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.ChimeraGetToken;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.auth.uiflows.common.FilteringRedirectChimeraActivity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: biv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class biv extends bhw implements biw {
    private final fys a;
    private final Context b;
    private final eka c;
    private final ekr d;
    private final goj e;
    private final qub f;
    private final ekq g;
    private final elt h;
    private final fyk i;

    public biv() {
        super("com.google.android.auth.IAuthManagerService");
    }

    private static Bundle a(Account account, TokenData tokenData) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", account.name);
        bundle.putString("accountType", account.type);
        if (tokenData != null) {
            bundle.putString("authtoken", tokenData.b);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("TokenData", tokenData);
            bundle.putBundle("tokenDetails", bundle2);
        }
        return bundle;
    }

    private final String b(Account account) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return this.h.b(account);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public biv(Context context) {
        super("com.google.android.auth.IAuthManagerService");
        eka eka = new eka(context);
        ekr ekr = new ekr(context);
        goj goj = new goj(context);
        qub a2 = qub.a(context);
        elt elt = new elt(new fyk(context));
        this.b = context;
        this.i = new fyk(context);
        this.c = eka;
        this.d = ekr;
        this.e = goj;
        this.f = a2;
        this.a = (fys) fys.d.b();
        this.g = (ekq) ekq.b.b();
        this.h = elt;
    }

    private final void a(anof anof) {
        if (awlv.b()) {
            aucd o = anon.v.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon = (anon) o.b;
            anon.c = 43;
            anon.a |= 1;
            anof.getClass();
            anon.s = anof;
            anon.b |= 512;
            this.e.b((anon) o.i());
        }
    }

    private final void a(anpd anpd) {
        Random random = new Random();
        long a2 = jhg.a(this.b);
        if (a2 != 0) {
            random.setSeed(a2);
        }
        if (random.nextDouble() < ent.t() || awlv.b()) {
            aucd o = anon.v.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon = (anon) o.b;
            anon.c = 1;
            int i2 = 1 | anon.a;
            anon.a = i2;
            anpd.getClass();
            anon.d = anpd;
            anon.a = i2 | 2;
            this.e.b((anon) o.i());
        }
    }

    public static void a(RuntimeException runtimeException, aucd aucd) {
        ChimeraGetToken.a.d("RuntimeException thrown during getToken()!", runtimeException, new Object[0]);
        aucd o = anpf.d.o();
        if (runtimeException.getMessage() != null) {
            String message = runtimeException.getMessage();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpf anpf = (anpf) o.b;
            message.getClass();
            anpf.a |= 2;
            anpf.c = message;
        }
        if (runtimeException instanceof eib) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpf anpf2 = (anpf) o.b;
            anpf2.b = 3;
            anpf2.a |= 1;
        } else if (runtimeException instanceof eip) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpf anpf3 = (anpf) o.b;
            anpf3.b = 2;
            anpf3.a |= 1;
        } else if (runtimeException instanceof SecurityException) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpf anpf4 = (anpf) o.b;
            anpf4.b = 1;
            anpf4.a |= 1;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpf anpf5 = (anpf) o.b;
            anpf5.b = 0;
            anpf5.a |= 1;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpd anpd = (anpd) aucd.b;
        anpf anpf6 = (anpf) o.i();
        anpd anpd2 = anpd.q;
        anpf6.getClass();
        anpd.p = anpf6;
        anpd.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
    }

    public final Bundle a(Account account) {
        try {
            int callingUid = Binder.getCallingUid();
            if (!this.a.b(callingUid)) {
                hya a2 = hya.a(this.b);
                int callingUid2 = Binder.getCallingUid();
                try {
                    a2.b(callingUid2).b();
                } catch (SecurityException e2) {
                    a2.b(callingUid2).b();
                    Log.e("GoogleSignatureVerifier", "flaky result", e2);
                }
            }
            ChimeraGetToken.a.d("Removing account by uid: %d", Integer.valueOf(callingUid));
            try {
                return (Bundle) this.f.d(account).getResult(5, TimeUnit.SECONDS);
            } catch (AuthenticatorException | OperationCanceledException | IOException e3) {
                ChimeraGetToken.a.d("Failed to remove %s account", e3, account);
                return null;
            }
        } catch (RuntimeException e4) {
            ChimeraGetToken.a.d("RuntimeException thrown in removeAccount()!", e4, new Object[0]);
            throw e4;
        }
    }

    public final Bundle a(Account account, Bundle bundle, AppDescription appDescription, boolean z, aucd aucd) {
        String b2 = b(account);
        if (!TextUtils.isEmpty(b2)) {
            eis eis = new eis();
            eis.a = b2;
            return a(account, eis.a());
        }
        TokenResponse a2 = a(account, "^^_account_id_^^", bundle, appDescription, z, aucd);
        String b3 = b(account);
        if (!TextUtils.isEmpty(b3)) {
            eis eis2 = new eis();
            eis2.a = b3;
            return a(account, eis2.a());
        }
        ChimeraGetToken.a.d("Failed to get account ID", new Object[0]);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpd anpd = (anpd) aucd.b;
        anpd anpd2 = anpd.q;
        "GET_ACCOUNT_ID_FAILED".getClass();
        anpd.a |= 1024;
        anpd.l = "GET_ACCOUNT_ID_FAILED";
        Bundle bundle2 = new Bundle();
        if (a2 != null) {
            bundle2.putString("Error", a2.b().ac);
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r8v2, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0415 A[Catch:{ all -> 0x04ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x042d A[Catch:{ all -> 0x04ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x057b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(android.accounts.Account r25, java.lang.String r26, android.os.Bundle r27) {
        /*
            r24 = this;
            r8 = r24
            r9 = r26
            java.lang.String r10 = "sync_extras"
            java.lang.String r11 = "callback_intent"
            java.lang.String r12 = "handle_notification"
            java.lang.String r0 = "service cannot be null"
            defpackage.iva.a((java.lang.String) r9, (java.lang.Object) r0)
            if (r27 != 0) goto L_0x0018
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = r0
            goto L_0x001a
        L_0x0018:
            r1 = r27
        L_0x001a:
            r2 = -1
            java.lang.String r0 = "service_connection_start_time_millis"
            long r2 = r1.getLong(r0, r2)
            long r13 = android.os.SystemClock.elapsedRealtime()
            anpd r0 = defpackage.anpd.q
            aucd r15 = r0.o()
            anpy r0 = defpackage.anpy.f
            aucd r7 = r0.o()
            r4 = 0
            r6 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            r15.c()
            r15.c = r6
        L_0x0048:
            aucj r0 = r15.b
            anpd r0 = (defpackage.anpd) r0
            int r2 = r0.a
            r2 = r2 | 64
            r0.a = r2
            r0.h = r4
        L_0x0054:
            r5 = 1
            int r0 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            java.lang.String r2 = defpackage.eig.b     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            if (r2 != 0) goto L_0x0073
            android.content.Context r3 = r8.b     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            jnh r3 = defpackage.jni.b(r3)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            java.lang.String[] r3 = r3.a((int) r0)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            if (r3 == 0) goto L_0x0073
            int r4 = r3.length     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            if (r4 != r5) goto L_0x0073
            r2 = r3[r6]     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            goto L_0x0074
        L_0x0073:
        L_0x0074:
            java.lang.String r3 = defpackage.eig.a     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            int r3 = r1.getInt(r3, r6)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            if (r3 != 0) goto L_0x0083
            fyk r3 = r8.i     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            int r3 = r3.a((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            goto L_0x0084
        L_0x0083:
        L_0x0084:
            eie r4 = defpackage.eie.a(r1)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            aqll r16 = r4.a()     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            amri r5 = defpackage.amri.c(r16)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            aqll r6 = defpackage.aqll.k     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            java.lang.Object r5 = r5.a((java.lang.Object) r6)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            aqll r5 = (defpackage.aqll) r5     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            com.google.android.gms.auth.firstparty.shared.ApplicationInformation r4 = r4.b()     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            if (r4 != 0) goto L_0x00c4
            ekq r4 = r8.g     // Catch:{ ekp -> 0x00a7 }
            eko r4 = r4.a(r2)     // Catch:{ ekp -> 0x00a7 }
            java.lang.String r4 = r4.b     // Catch:{ ekp -> 0x00a7 }
            goto L_0x00c8
        L_0x00a7:
            r0 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            java.lang.String r3 = "Invalid consumer package: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            int r4 = r2.length()     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            if (r4 != 0) goto L_0x00bc
            java.lang.String r2 = new java.lang.String     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            goto L_0x00c0
        L_0x00bc:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
        L_0x00c0:
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            throw r0     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
        L_0x00c4:
            java.lang.String r2 = r4.b     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            java.lang.String r4 = r4.c     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
        L_0x00c8:
            r6 = 5
            java.lang.Object r6 = r5.c(r6)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            aucd r6 = (defpackage.aucd) r6     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            r6.a((defpackage.aucj) r5)     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            boolean r5 = r6.c     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            if (r5 != 0) goto L_0x00d7
            goto L_0x00dd
        L_0x00d7:
            r6.c()     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            r5 = 0
            r6.c = r5     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
        L_0x00dd:
            aucj r5 = r6.b     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            aqll r5 = (defpackage.aqll) r5     // Catch:{ RuntimeException -> 0x03fd, all -> 0x03f3 }
            r22 = r13
            r13 = 1
            r5.i = r13     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            int r13 = r5.a     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            r13 = r13 | 512(0x200, float:7.175E-43)
            r5.a = r13     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            aucj r5 = r6.i()     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            aqll r5 = (defpackage.aqll) r5     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            eid r6 = new eid     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            r6.<init>(r1)     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            r6.a(r5)     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            eie r5 = r6.a()     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            android.os.Bundle r13 = r5.a     // Catch:{ RuntimeException -> 0x03ec, all -> 0x03e4 }
            if (r4 == 0) goto L_0x012d
            boolean r1 = r7.c     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            if (r1 != 0) goto L_0x0107
            goto L_0x010d
        L_0x0107:
            r7.c()     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r1 = 0
            r7.c = r1     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
        L_0x010d:
            aucj r1 = r7.b     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            anpy r1 = (defpackage.anpy) r1     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r4.getClass()     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            int r5 = r1.a     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r5 = r5 | 4
            r1.a = r5     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r1.d = r4     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            goto L_0x012d
        L_0x011d:
            r0 = move-exception
            r14 = r7
            r7 = r8
            r8 = 0
            r16 = 1
            goto L_0x03df
        L_0x0125:
            r0 = move-exception
            r14 = r7
            r7 = r8
            r8 = 0
            r16 = 1
            goto L_0x03e2
        L_0x012d:
            if (r2 == 0) goto L_0x014b
            boolean r1 = r7.c     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            if (r1 != 0) goto L_0x0135
            r6 = 0
            goto L_0x013b
        L_0x0135:
            r7.c()     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r6 = 0
            r7.c = r6     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
        L_0x013b:
            aucj r1 = r7.b     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            anpy r1 = (defpackage.anpy) r1     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r2.getClass()     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            int r4 = r1.a     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r5 = 1
            r4 = r4 | r5
            r1.a = r4     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r1.b = r2     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            goto L_0x014d
        L_0x014b:
            r5 = 1
            r6 = 0
        L_0x014d:
            android.content.Context r1 = r8.b     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            jnh r1 = defpackage.jni.b(r1)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            if (r3 != r0) goto L_0x0156
            goto L_0x0163
        L_0x0156:
            java.lang.String[] r1 = r1.a((int) r0)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            if (r1 == 0) goto L_0x0163
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r7.aj(r1)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
        L_0x0163:
            fzi r1 = defpackage.fyi.a     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            java.lang.Object r1 = r1.b()     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r16 = r1
            fyi r16 = (defpackage.fyi) r16     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            fyk r1 = r8.i     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            int r4 = r1.f     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            r17 = r4
            r18 = r0
            r19 = r2
            r20 = r3
            r21 = r1
            com.google.android.gms.auth.firstparty.shared.AppDescription r0 = r16.a(r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            android.content.Context r1 = r8.b     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            hya r1 = defpackage.hya.a((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            int r2 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            boolean r14 = r1.a((int) r2)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            java.lang.String r1 = "^^_account_id_^^"
            boolean r1 = r1.equals(r9)     // Catch:{ RuntimeException -> 0x0125, all -> 0x011d }
            if (r1 != 0) goto L_0x031d
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r13
            r16 = 1
            r5 = r0
            r8 = 0
            r6 = r14
            r14 = r7
            r7 = r15
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r6 = r1.a((android.accounts.Account) r2, (java.lang.String) r3, (android.os.Bundle) r4, (com.google.android.gms.auth.firstparty.shared.AppDescription) r5, (boolean) r6, (defpackage.aucd) r7)     // Catch:{ RuntimeException -> 0x0318, all -> 0x0313 }
            if (r6 == 0) goto L_0x0264
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r13
            r5 = r0
            r7 = r15
            android.os.Bundle r0 = r1.a((android.accounts.Account) r2, (java.lang.String) r3, (android.os.Bundle) r4, (com.google.android.gms.auth.firstparty.shared.AppDescription) r5, (com.google.android.gms.auth.firstparty.dataservice.TokenResponse) r6, (defpackage.aucd) r7)     // Catch:{ RuntimeException -> 0x0318, all -> 0x0313 }
            boolean r1 = r14.c
            if (r1 != 0) goto L_0x01bb
            goto L_0x01c0
        L_0x01bb:
            r14.c()
            r14.c = r8
        L_0x01c0:
            aucj r1 = r14.b
            anpy r1 = (defpackage.anpy) r1
            r26.getClass()
            int r2 = r1.a
            r2 = r2 | 2
            r1.a = r2
            r1.c = r9
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x01d4
            goto L_0x01d9
        L_0x01d4:
            r15.c()
            r15.c = r8
        L_0x01d9:
            aucj r1 = r15.b
            anpd r1 = (defpackage.anpd) r1
            aucj r2 = r14.i()
            anpy r2 = (defpackage.anpy) r2
            r2.getClass()
            r1.g = r2
            int r2 = r1.a
            r2 = r2 | 32
            r1.a = r2
            boolean r1 = r13.getBoolean(r12)
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x01f7
            goto L_0x01fc
        L_0x01f7:
            r15.c()
            r15.c = r8
        L_0x01fc:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 2
            r2.a = r3
            r2.c = r1
            boolean r1 = r13.containsKey(r11)
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0211
            goto L_0x0216
        L_0x0211:
            r15.c()
            r15.c = r8
        L_0x0216:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 4
            r2.a = r3
            r2.d = r1
            boolean r1 = r13.containsKey(r10)
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x022b
            goto L_0x0230
        L_0x022b:
            r15.c()
            r15.c = r8
        L_0x0230:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 8
            r2.a = r3
            r2.e = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r22
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0247
            goto L_0x024c
        L_0x0247:
            r15.c()
            r15.c = r8
        L_0x024c:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 1
            r3.a = r4
            r3.b = r1
            aucj r1 = r15.i()
            anpd r1 = (defpackage.anpd) r1
            r7 = r24
            r7.a((defpackage.anpd) r1)
            return r0
        L_0x0264:
            r7 = r24
            boolean r0 = r14.c
            if (r0 != 0) goto L_0x026b
            goto L_0x0270
        L_0x026b:
            r14.c()
            r14.c = r8
        L_0x0270:
            aucj r0 = r14.b
            anpy r0 = (defpackage.anpy) r0
            r26.getClass()
            int r1 = r0.a
            r1 = r1 | 2
            r0.a = r1
            r0.c = r9
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0284
            goto L_0x0289
        L_0x0284:
            r15.c()
            r15.c = r8
        L_0x0289:
            aucj r0 = r15.b
            anpd r0 = (defpackage.anpd) r0
            aucj r1 = r14.i()
            anpy r1 = (defpackage.anpy) r1
            r1.getClass()
            r0.g = r1
            int r1 = r0.a
            r1 = r1 | 32
            r0.a = r1
            boolean r0 = r13.getBoolean(r12)
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x02a7
            goto L_0x02ac
        L_0x02a7:
            r15.c()
            r15.c = r8
        L_0x02ac:
            aucj r1 = r15.b
            anpd r1 = (defpackage.anpd) r1
            int r2 = r1.a
            r2 = r2 | 2
            r1.a = r2
            r1.c = r0
            boolean r0 = r13.containsKey(r11)
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x02c1
            goto L_0x02c6
        L_0x02c1:
            r15.c()
            r15.c = r8
        L_0x02c6:
            aucj r1 = r15.b
            anpd r1 = (defpackage.anpd) r1
            int r2 = r1.a
            r2 = r2 | 4
            r1.a = r2
            r1.d = r0
            boolean r0 = r13.containsKey(r10)
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x02db
            goto L_0x02e0
        L_0x02db:
            r15.c()
            r15.c = r8
        L_0x02e0:
            aucj r1 = r15.b
            anpd r1 = (defpackage.anpd) r1
            int r2 = r1.a
            r2 = r2 | 8
            r1.a = r2
            r1.e = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r22
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x02f7
            goto L_0x02fc
        L_0x02f7:
            r15.c()
            r15.c = r8
        L_0x02fc:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 1
            r2.a = r3
            r2.b = r0
            aucj r0 = r15.i()
            anpd r0 = (defpackage.anpd) r0
            r7.a((defpackage.anpd) r0)
            r0 = 0
            return r0
        L_0x0313:
            r0 = move-exception
            r7 = r24
            goto L_0x03df
        L_0x0318:
            r0 = move-exception
            r7 = r24
            goto L_0x03e2
        L_0x031d:
            r6 = r7
            r7 = r8
            r8 = 0
            r16 = 1
            r1 = r24
            r2 = r25
            r3 = r13
            r4 = r0
            r5 = r14
            r14 = r6
            r6 = r15
            android.os.Bundle r0 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x03dd, all -> 0x03db }
            boolean r1 = r14.c
            if (r1 != 0) goto L_0x0334
            goto L_0x0339
        L_0x0334:
            r14.c()
            r14.c = r8
        L_0x0339:
            aucj r1 = r14.b
            anpy r1 = (defpackage.anpy) r1
            r26.getClass()
            int r2 = r1.a
            r2 = r2 | 2
            r1.a = r2
            r1.c = r9
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x034d
            goto L_0x0352
        L_0x034d:
            r15.c()
            r15.c = r8
        L_0x0352:
            aucj r1 = r15.b
            anpd r1 = (defpackage.anpd) r1
            aucj r2 = r14.i()
            anpy r2 = (defpackage.anpy) r2
            r2.getClass()
            r1.g = r2
            int r2 = r1.a
            r2 = r2 | 32
            r1.a = r2
            boolean r1 = r13.getBoolean(r12)
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0370
            goto L_0x0375
        L_0x0370:
            r15.c()
            r15.c = r8
        L_0x0375:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 2
            r2.a = r3
            r2.c = r1
            boolean r1 = r13.containsKey(r11)
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x038a
            goto L_0x038f
        L_0x038a:
            r15.c()
            r15.c = r8
        L_0x038f:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 4
            r2.a = r3
            r2.d = r1
            boolean r1 = r13.containsKey(r10)
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x03a4
            goto L_0x03a9
        L_0x03a4:
            r15.c()
            r15.c = r8
        L_0x03a9:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 8
            r2.a = r3
            r2.e = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r22
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x03c0
            goto L_0x03c5
        L_0x03c0:
            r15.c()
            r15.c = r8
        L_0x03c5:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 1
            r3.a = r4
            r3.b = r1
            aucj r1 = r15.i()
            anpd r1 = (defpackage.anpd) r1
            r7.a((defpackage.anpd) r1)
            return r0
        L_0x03db:
            r0 = move-exception
            goto L_0x03df
        L_0x03dd:
            r0 = move-exception
            goto L_0x03e2
        L_0x03df:
            r1 = r13
            goto L_0x04eb
        L_0x03e2:
            r1 = r13
            goto L_0x0405
        L_0x03e4:
            r0 = move-exception
            r14 = r7
            r7 = r8
            r8 = 0
            r16 = 1
            goto L_0x04eb
        L_0x03ec:
            r0 = move-exception
            r14 = r7
            r7 = r8
            r8 = 0
            r16 = 1
            goto L_0x0405
        L_0x03f3:
            r0 = move-exception
            r22 = r13
            r16 = 1
            r14 = r7
            r7 = r8
            r8 = 0
            goto L_0x04eb
        L_0x03fd:
            r0 = move-exception
            r22 = r13
            r16 = 1
            r14 = r7
            r7 = r8
            r8 = 0
        L_0x0405:
            a((java.lang.RuntimeException) r0, (defpackage.aucd) r15)     // Catch:{ all -> 0x04ea }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x04ea }
            r2.<init>()     // Catch:{ all -> 0x04ea }
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ all -> 0x04ea }
            boolean r3 = r3 instanceof java.lang.InterruptedException     // Catch:{ all -> 0x04ea }
            if (r3 != 0) goto L_0x042d
            boolean r3 = r0 instanceof java.lang.SecurityException     // Catch:{ all -> 0x04ea }
            if (r3 != 0) goto L_0x0423
            iwd r3 = com.google.android.gms.auth.ChimeraGetToken.a     // Catch:{ all -> 0x04ea }
            java.lang.String r4 = "Exception while trying to get token."
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x04ea }
            r3.e(r4, r0, r5)     // Catch:{ all -> 0x04ea }
            goto L_0x0436
        L_0x0423:
            iwd r2 = com.google.android.gms.auth.ChimeraGetToken.a     // Catch:{ all -> 0x04ea }
            java.lang.String r3 = "Exception while trying to get token for security reasons."
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x04ea }
            r2.e(r3, r0, r4)     // Catch:{ all -> 0x04ea }
            throw r0     // Catch:{ all -> 0x04ea }
        L_0x042d:
            iwd r0 = com.google.android.gms.auth.ChimeraGetToken.a     // Catch:{ all -> 0x04ea }
            java.lang.String r3 = "Failed to get token or recovery information. Likely due to BlockingServiceConnection interruption."
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x04ea }
            r0.d(r3, r4)     // Catch:{ all -> 0x04ea }
        L_0x0436:
            java.lang.String r0 = "Error"
            gei r3 = defpackage.gei.INTNERNAL_ERROR     // Catch:{ all -> 0x04ea }
            java.lang.String r3 = r3.ac     // Catch:{ all -> 0x04ea }
            r2.putString(r0, r3)     // Catch:{ all -> 0x04ea }
            boolean r0 = r14.c
            if (r0 != 0) goto L_0x0444
            goto L_0x0449
        L_0x0444:
            r14.c()
            r14.c = r8
        L_0x0449:
            aucj r0 = r14.b
            anpy r0 = (defpackage.anpy) r0
            r26.getClass()
            int r3 = r0.a
            r3 = r3 | 2
            r0.a = r3
            r0.c = r9
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x045d
            goto L_0x0462
        L_0x045d:
            r15.c()
            r15.c = r8
        L_0x0462:
            aucj r0 = r15.b
            anpd r0 = (defpackage.anpd) r0
            aucj r3 = r14.i()
            anpy r3 = (defpackage.anpy) r3
            r3.getClass()
            r0.g = r3
            int r3 = r0.a
            r3 = r3 | 32
            r0.a = r3
            boolean r0 = r1.getBoolean(r12)
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0480
            goto L_0x0485
        L_0x0480:
            r15.c()
            r15.c = r8
        L_0x0485:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 2
            r3.a = r4
            r3.c = r0
            boolean r0 = r1.containsKey(r11)
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x049a
            goto L_0x049f
        L_0x049a:
            r15.c()
            r15.c = r8
        L_0x049f:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 4
            r3.a = r4
            r3.d = r0
            boolean r0 = r1.containsKey(r10)
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x04b4
            goto L_0x04b9
        L_0x04b4:
            r15.c()
            r15.c = r8
        L_0x04b9:
            aucj r1 = r15.b
            anpd r1 = (defpackage.anpd) r1
            int r3 = r1.a
            r3 = r3 | 8
            r1.a = r3
            r1.e = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r22
            boolean r3 = r15.c
            if (r3 == 0) goto L_0x04d4
            r15.c()
            r15.c = r8
        L_0x04d4:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 1
            r3.a = r4
            r3.b = r0
            aucj r0 = r15.i()
            anpd r0 = (defpackage.anpd) r0
            r7.a((defpackage.anpd) r0)
            return r2
        L_0x04ea:
            r0 = move-exception
        L_0x04eb:
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x04f0
            goto L_0x04f5
        L_0x04f0:
            r14.c()
            r14.c = r8
        L_0x04f5:
            aucj r2 = r14.b
            anpy r2 = (defpackage.anpy) r2
            r26.getClass()
            int r3 = r2.a
            r3 = r3 | 2
            r2.a = r3
            r2.c = r9
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0509
            goto L_0x050e
        L_0x0509:
            r15.c()
            r15.c = r8
        L_0x050e:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            aucj r3 = r14.i()
            anpy r3 = (defpackage.anpy) r3
            r3.getClass()
            r2.g = r3
            int r3 = r2.a
            r3 = r3 | 32
            r2.a = r3
            boolean r2 = r1.getBoolean(r12)
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x052c
            goto L_0x0531
        L_0x052c:
            r15.c()
            r15.c = r8
        L_0x0531:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 2
            r3.a = r4
            r3.c = r2
            boolean r2 = r1.containsKey(r11)
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0546
            goto L_0x054b
        L_0x0546:
            r15.c()
            r15.c = r8
        L_0x054b:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 4
            r3.a = r4
            r3.d = r2
            boolean r1 = r1.containsKey(r10)
            boolean r2 = r15.c
            if (r2 != 0) goto L_0x0560
            goto L_0x0565
        L_0x0560:
            r15.c()
            r15.c = r8
        L_0x0565:
            aucj r2 = r15.b
            anpd r2 = (defpackage.anpd) r2
            int r3 = r2.a
            r3 = r3 | 8
            r2.a = r3
            r2.e = r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r22
            boolean r3 = r15.c
            if (r3 == 0) goto L_0x0580
            r15.c()
            r15.c = r8
        L_0x0580:
            aucj r3 = r15.b
            anpd r3 = (defpackage.anpd) r3
            int r4 = r3.a
            r4 = r4 | 1
            r3.a = r4
            r3.b = r1
            aucj r1 = r15.i()
            anpd r1 = (defpackage.anpd) r1
            r7.a((defpackage.anpd) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biv.a(android.accounts.Account, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final Bundle a(Account account, String str, Bundle bundle, AppDescription appDescription, TokenResponse tokenResponse, aucd aucd) {
        PACLConfig pACLConfig;
        Bitmap bitmap;
        Account account2 = account;
        Bundle bundle2 = bundle;
        AppDescription appDescription2 = appDescription;
        TokenResponse tokenResponse2 = tokenResponse;
        aucd aucd2 = aucd;
        String str2 = tokenResponse.b().ac;
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        anpd anpd = (anpd) aucd2.b;
        anpd anpd2 = anpd.q;
        str2.getClass();
        anpd.a |= 1024;
        anpd.l = str2;
        long j = tokenResponse2.x.getLong("logging.gads_connection_latency_millis", -1);
        if (j >= 0) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            anpd anpd3 = (anpd) aucd2.b;
            anpd3.a |= 128;
            anpd3.i = j;
        }
        long j2 = tokenResponse2.x.getLong("logging.internal_service_latency_millis", -1);
        if (j2 >= 0) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            anpd anpd4 = (anpd) aucd2.b;
            anpd4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            anpd4.j = j2;
        }
        long j3 = tokenResponse2.x.getLong("logging.network_latency_millis", -1);
        if (j3 >= 0) {
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            anpd anpd5 = (anpd) aucd2.b;
            anpd5.a |= 512;
            anpd5.k = j3;
        }
        TokenData tokenData = tokenResponse2.w;
        if (tokenData == null) {
            Bundle bundle3 = new Bundle();
            boolean equals = gei.NEED_PERMISSION.equals(tokenResponse.b());
            if (awmz.a.a().a()) {
                equals = gei.NEED_PERMISSION.equals(tokenResponse.b()) || gei.NEED_REMOTE_CONSENT.equals(tokenResponse.b());
            }
            if (equals && jgu.e(this.b)) {
                bundle3.putString("Error", gei.PERMISSION_DENIED.ac);
                return bundle3;
            }
            bundle3.putString("Error", tokenResponse.b().ac);
            iwd iwd = ChimeraGetToken.a;
            String valueOf = String.valueOf(tokenResponse.b().ac);
            iwd.d(valueOf.length() == 0 ? new String("GetToken failed with status code: ") : "GetToken failed with status code: ".concat(valueOf), new Object[0]);
            if (gei.a(tokenResponse.b())) {
                AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) bundle2.getParcelable("accountManagerResponse");
                String string = bundle2.getString("request_visible_actions");
                Bitmap bitmap2 = null;
                if (string != null) {
                    pACLConfig = new PACLConfig(string, (String) null);
                } else {
                    pACLConfig = null;
                }
                TokenWorkflowRequest tokenWorkflowRequest = new TokenWorkflowRequest();
                tokenWorkflowRequest.j = accountAuthenticatorResponse;
                tokenWorkflowRequest.a(account2);
                tokenWorkflowRequest.b = str;
                tokenWorkflowRequest.a(bundle2);
                tokenWorkflowRequest.f = pACLConfig;
                tokenWorkflowRequest.h = appDescription2;
                tokenWorkflowRequest.g = bundle2.getBoolean("suppressProgressScreen", false);
                Intent a2 = fzm.a(FilteringRedirectChimeraActivity.a(this.b, this.c.a(tokenWorkflowRequest), ChimeraGetToken.b, accountAuthenticatorResponse));
                bundle3.putParcelable("userRecoveryIntent", a2);
                if (bundle2.getBoolean("handle_notification", false) && equals) {
                    ekr ekr = this.d;
                    String str3 = appDescription2.e;
                    if (ekr.c(account2)) {
                        String string2 = ekr.a.getString(R.string.app_level_title);
                        Drawable b2 = ekr.b.b(str3);
                        if (b2 != null) {
                            if (b2 instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) b2).getBitmap();
                                ekr.a(String.format("%s:%s:%s:%s", new Object[]{"com.google.android.gms.auth.TokenNotificationManager", account2.name, account2.type, str3}), PendingIntent.getActivity(ekr.a, 0, a2, 134217728), account, string2, bitmap, false);
                            } else {
                                bitmap2 = Bitmap.createBitmap(b2.getIntrinsicWidth(), b2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmap2);
                                b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                                b2.draw(canvas);
                            }
                        }
                        bitmap = bitmap2;
                        ekr.a(String.format("%s:%s:%s:%s", new Object[]{"com.google.android.gms.auth.TokenNotificationManager", account2.name, account2.type, str3}), PendingIntent.getActivity(ekr.a, 0, a2, 134217728), account, string2, bitmap, false);
                    }
                }
            }
            return bundle3;
        }
        boolean z = tokenData.d;
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        anpd anpd6 = (anpd) aucd2.b;
        anpd6.a |= 16;
        anpd6.f = z;
        return a(account2, tokenData);
    }

    public final Bundle a(Bundle bundle) {
        Account[] accountArr;
        try {
            if (hya.a(this.b).a(Binder.getCallingUid())) {
                String[] stringArray = bundle.getStringArray("account_features");
                String string = bundle.getString("accountType");
                if (stringArray == null) {
                    accountArr = this.f.a(string);
                } else {
                    try {
                        accountArr = (Account[]) this.f.a(string, stringArray).getResult(5, TimeUnit.SECONDS);
                    } catch (OperationCanceledException e2) {
                        e = e2;
                        ChimeraGetToken.a.d("Failed to get %s accounts with features %s", e, string, Arrays.toString(stringArray));
                        return null;
                    } catch (AuthenticatorException e3) {
                        e = e3;
                        ChimeraGetToken.a.d("Failed to get %s accounts with features %s", e, string, Arrays.toString(stringArray));
                        return null;
                    } catch (IOException e4) {
                        e = e4;
                        ChimeraGetToken.a.d("Failed to get %s accounts with features %s", e, string, Arrays.toString(stringArray));
                        return null;
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray("accounts", accountArr);
                return bundle2;
            }
            throw new SecurityException("Caller isn't signed with recognized keys!");
        } catch (RuntimeException e5) {
            ChimeraGetToken.a.d("RuntimeException thrown in getAccounts()!", e5, new Object[0]);
            throw e5;
        }
    }

    /* JADX INFO: finally extract failed */
    public final Bundle a(String str, Bundle bundle) {
        ClearTokenRequest clearTokenRequest = new ClearTokenRequest();
        clearTokenRequest.b = str;
        Bundle bundle2 = new Bundle();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ClearTokenResponse a2 = this.h.a(clearTokenRequest);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            aucd o = anof.d.o();
            boolean equals = gei.c(a2.b).equals(gei.SUCCESS);
            bundle2.putBoolean("booleanResult", equals);
            boolean z = !equals;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anof anof = (anof) o.b;
            int i2 = anof.a | 1;
            anof.a = i2;
            anof.b = z;
            anof.c = 1;
            anof.a = i2 | 2;
            a((anof) o.i());
            return bundle2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final AccountChangeEventsResponse a(AccountChangeEventsRequest accountChangeEventsRequest) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            AccountChangeEventsResponse a2 = this.h.a(accountChangeEventsRequest);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            aucd o = anof.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anof anof = (anof) o.b;
            int i2 = anof.a | 1;
            anof.a = i2;
            anof.b = false;
            anof.c = 2;
            anof.a = 2 | i2;
            a((anof) o.i());
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public final TokenResponse a(Account account, String str, Bundle bundle, AppDescription appDescription, boolean z, aucd aucd) {
        TokenRequest tokenRequest = new TokenRequest(account, str);
        boolean startsWith = str.startsWith("audience:server:client_id:");
        String str2 = "1";
        if (startsWith && awkj.a.a().a() && !bundle.containsKey("oauth2_include_email")) {
            bundle.putString("oauth2_include_email", str2);
        }
        String string = bundle.getString("request_visible_actions");
        if (string != null) {
            tokenRequest.f = new PACLConfig(string, (String) null);
        }
        if (z) {
            tokenRequest.m = bundle.getBoolean("UseCache", true);
        }
        bundle.remove("UseCache");
        if (awkr.a.a().a()) {
            if (!(!bundle.getBoolean("handle_notification"))) {
                str2 = "0";
            }
            bundle.putString("oauth2_foreground", str2);
        }
        for (String str3 : bundle.keySet()) {
            if (str3 != null) {
                if (!str3.startsWith("_opt_")) {
                    if (str3.startsWith("oauth2_")) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        anpd anpd = (anpd) aucd.b;
                        anpd anpd2 = anpd.q;
                        str3.getClass();
                        if (!anpd.n.a()) {
                            anpd.n = aucj.a(anpd.n);
                        }
                        anpd.n.add(str3);
                    }
                } else if (z) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    anpd anpd3 = (anpd) aucd.b;
                    anpd anpd4 = anpd.q;
                    str3.getClass();
                    if (!anpd3.m.a()) {
                        anpd3.m = aucj.a(anpd3.m);
                    }
                    anpd3.m.add(str3);
                } else {
                    bundle.remove(str3);
                }
            }
        }
        int i2 = bundle.getInt("delegation_type", 0);
        String string2 = bundle.getString("delegatee_user_id");
        if (!(!z || i2 == 0 || string2 == null)) {
            tokenRequest.o = i2;
            iva.c(string2);
            tokenRequest.p = string2;
        }
        bundle.remove("delegation_type");
        bundle.remove("delegatee_user_id");
        tokenRequest.j = appDescription;
        tokenRequest.a(bundle);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            TokenResponse a2 = this.h.a(tokenRequest.j, tokenRequest);
            if (a2 == null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anpd anpd5 = (anpd) aucd.b;
                anpd anpd6 = anpd.q;
                anpd5.a |= 2048;
                anpd5.o = true;
                ChimeraGetToken.a.d("Getting token failed and returned null!", new Object[0]);
            }
            return a2;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        Bundle bundle;
        switch (i2) {
            case 1:
                Bundle a2 = a(new Account(parcel.readString(), "com.google"), parcel.readString(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a2);
                break;
            case 2:
                Bundle a3 = a(parcel.readString(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a3);
                break;
            case 3:
                AccountChangeEventsResponse a4 = a((AccountChangeEventsRequest) bhx.a(parcel, AccountChangeEventsRequest.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a4);
                break;
            case 5:
                Bundle a5 = a((Account) bhx.a(parcel, Account.CREATOR), parcel.readString(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a5);
                break;
            case 6:
                Bundle a6 = a((Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a6);
                break;
            case 7:
                Bundle a7 = a((Account) bhx.a(parcel, Account.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a7);
                break;
            case 8:
                String readString = parcel.readString();
                if (!ese.b()) {
                    ChimeraGetToken.a.d("requestGoogleAccountsAccess API is disabled", new Object[0]);
                    bundle = esf.a();
                } else {
                    int callingUid = Binder.getCallingUid();
                    ese ese = (ese) ese.d.b();
                    String[] a8 = jni.b(this.b).a(callingUid);
                    if (a8 != null) {
                        boolean z = false;
                        for (String equals : a8) {
                            if (equals.equals(readString)) {
                                z = true;
                            }
                        }
                        if (z) {
                            bundle = ese.a(readString, hya.a(this.b).a(callingUid));
                        }
                    }
                    iwd iwd = ChimeraGetToken.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(readString).length() + 44);
                    sb.append("Package ");
                    sb.append(readString);
                    sb.append(" does not belong to (uid=");
                    sb.append(callingUid);
                    iwd.d(sb.toString(), new Object[0]);
                    bundle = esf.a();
                }
                parcel2.writeNoException();
                bhx.b(parcel2, bundle);
                break;
            default:
                return false;
        }
        return true;
    }
}
