package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.google.android.gms.auth.account.authenticator.ChromeOsAuthDelegateService;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: eka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eka implements gdn {
    private static final iwd a = ehv.a("AuthDelegateWrapper");
    private final Context b;
    private final Intent c;

    public eka(Context context) {
        Intent intent;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        ekh ekh = ekh.a;
        if (ekh.b(applicationContext)) {
            intent = jkr.e() ? new Intent().setAction("com.google.android.gms.auth.account.authenticator.tv.service.START").setPackage("com.google.android.gms") : ekh.a();
        } else {
            if (awjg.a.a().a()) {
                jix.g(applicationContext);
            }
            ResolveInfo resolveActivity = applicationContext.getPackageManager().resolveActivity(ChromeOsAuthDelegateService.a(), 0);
            intent = (resolveActivity == null || resolveActivity.activityInfo == null || (resolveActivity.activityInfo.applicationInfo.flags & 129) == 0) ? new Intent().setClassName(applicationContext, "com.google.android.gms.auth.account.authenticator.DefaultAuthDelegateService") : new Intent().setAction("com.google.android.gms.auth.account.authenticator.chromeos.START").setPackage("com.google.android.gms");
        }
        this.c = intent;
    }

    public final PendingIntent a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
        return a((ejz) new ejy(accountRemovalAllowedWorkflowRequest));
    }

    public final IBinder asBinder() {
        throw new UnsupportedOperationException("No binder!");
    }

    public final PendingIntent b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        return a((ejz) new ejx(updateCredentialsWorkflowRequest));
    }

    public final PendingIntent a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
        return a((ejz) new ejr(confirmCredentialsWorkflowRequest));
    }

    public final PendingIntent a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        return a((ejz) new ejv(finishSessionWorkflowRequest));
    }

    public final PendingIntent a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        return a((ejz) new ejs(setupAccountWorkflowRequest));
    }

    public final PendingIntent a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        return a((ejz) new ejt(startAddAccountSessionWorkflowRequest));
    }

    public final PendingIntent a(TokenWorkflowRequest tokenWorkflowRequest) {
        if (ekh.a.b(this.b)) {
            tokenWorkflowRequest.f = null;
            tokenWorkflowRequest.b();
        }
        return a((ejz) new ejw(tokenWorkflowRequest));
    }

    public final PendingIntent a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        return a((ejz) new eju(updateCredentialsWorkflowRequest));
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [android.os.IInterface] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        a.e("Error while trying to execute against auth delegate.", r13, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        throw new java.lang.RuntimeException(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ed, code lost:
        defpackage.jca.a().a(r12.b, (android.content.ServiceConnection) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[ExcHandler: RemoteException | InterruptedException (r13v6 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:19:0x0076] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PendingIntent a(defpackage.ejz r13) {
        /*
            r12 = this;
            java.lang.String r0 = "com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService"
            fyk r1 = new fyk
            android.content.Context r2 = r12.b
            r1.<init>(r2)
            hwz r2 = new hwz
            r2.<init>()
            android.content.pm.PackageManager r3 = r1.b
            android.content.Intent r4 = r12.c
            r9 = 0
            android.content.pm.ResolveInfo r3 = r3.resolveService(r4, r9)
            if (r3 == 0) goto L_0x0059
            android.content.pm.ServiceInfo r4 = r3.serviceInfo
            if (r4 == 0) goto L_0x0051
            android.content.pm.ServiceInfo r4 = r3.serviceInfo
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            if (r4 == 0) goto L_0x0047
            int r4 = r1.f
            android.content.pm.ServiceInfo r5 = r3.serviceInfo
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            int r5 = r5.uid
            android.content.pm.PackageManager r6 = r1.b
            int r4 = r6.checkSignatures(r4, r5)
            if (r4 != 0) goto L_0x0034
            goto L_0x0047
        L_0x0034:
            java.lang.SecurityException r13 = new java.lang.SecurityException
            java.lang.String r0 = "Cannot delegate to Service with different signature."
            r13.<init>(r0)
            iwd r0 = a
            java.lang.String r1 = r13.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r0.e(r1, r13, r2)
            throw r13
        L_0x0047:
            android.content.Intent r4 = r12.c
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            java.lang.String r3 = r3.packageName
            r4.setPackage(r3)
            goto L_0x0059
        L_0x0051:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Couldn't resolve AuthDelegateService intent to a delegate service."
            r13.<init>(r0)
            throw r13
        L_0x0059:
            int r10 = defpackage.ent.aC()
            r11 = 0
        L_0x005e:
            if (r11 >= r10) goto L_0x00f7
            jca r3 = defpackage.jca.a()
            android.content.Context r4 = r12.b
            android.content.Intent r6 = r12.c
            r8 = 1
            java.lang.String r5 = "AuthDelegateWrapper"
            r7 = r2
            boolean r3 = r3.a((android.content.Context) r4, (java.lang.String) r5, (android.content.Intent) r6, (android.content.ServiceConnection) r7, (int) r8)
            if (r3 != 0) goto L_0x0075
            int r11 = r11 + 1
            goto L_0x005e
        L_0x0075:
            r3 = 0
            android.os.IBinder r4 = r2.a()     // Catch:{ InterruptedException -> 0x0094, RemoteException -> 0x0092 }
            if (r4 == 0) goto L_0x008f
            android.os.IInterface r5 = r4.queryLocalInterface(r0)     // Catch:{ InterruptedException -> 0x0094, RemoteException -> 0x0092 }
            boolean r6 = r5 instanceof defpackage.gdn     // Catch:{ InterruptedException -> 0x0094, RemoteException -> 0x0092 }
            if (r6 != 0) goto L_0x008b
            gdl r5 = new gdl     // Catch:{ InterruptedException -> 0x0094, RemoteException -> 0x0092 }
            r5.<init>(r4)     // Catch:{ InterruptedException -> 0x0094, RemoteException -> 0x0092 }
            r3 = r5
            goto L_0x00ae
        L_0x008b:
            gdn r5 = (defpackage.gdn) r5     // Catch:{ InterruptedException -> 0x0094, RemoteException -> 0x0092 }
            r3 = r5
            goto L_0x00ae
        L_0x008f:
            goto L_0x00ae
        L_0x0090:
            r13 = move-exception
            goto L_0x00ed
        L_0x0092:
            r13 = move-exception
            goto L_0x00de
        L_0x0094:
            r4 = move-exception
            android.os.IBinder r4 = r2.a()     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            if (r4 == 0) goto L_0x00ad
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            boolean r3 = r0 instanceof defpackage.gdn     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            if (r3 != 0) goto L_0x00a9
            gdl r3 = new gdl     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            r3.<init>(r4)     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            goto L_0x00ae
        L_0x00a9:
            r3 = r0
            gdn r3 = (defpackage.gdn) r3     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            goto L_0x00ae
        L_0x00ad:
        L_0x00ae:
            android.app.PendingIntent r13 = r13.a(r3)     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            int r0 = r13.getCreatorUid()     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            boolean r0 = r1.a((int) r0)     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            if (r0 == 0) goto L_0x00c8
            jca r0 = defpackage.jca.a()
            android.content.Context r1 = r12.b
            r0.a((android.content.Context) r1, (android.content.ServiceConnection) r2)
            return r13
        L_0x00c8:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            java.lang.String r13 = defpackage.fyk.a((android.app.PendingIntent) r13)     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            r0[r9] = r13     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            java.lang.String r13 = "Invalid delegate %s! Only first party auth delegates are supported."
            java.lang.String r13 = java.lang.String.format(r13, r0)     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            r0.<init>(r13)     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
            throw r0     // Catch:{ RemoteException -> 0x0092, InterruptedException -> 0x00dd }
        L_0x00dd:
            r13 = move-exception
        L_0x00de:
            iwd r0 = a     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "Error while trying to execute against auth delegate."
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x0090 }
            r0.e(r1, r13, r3)     // Catch:{ all -> 0x0090 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0090 }
            r0.<init>(r13)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x00ed:
            jca r0 = defpackage.jca.a()
            android.content.Context r1 = r12.b
            r0.a((android.content.Context) r1, (android.content.ServiceConnection) r2)
            throw r13
        L_0x00f7:
            ekd r13 = new ekd
            java.lang.String r0 = "Unable to bind to auth delegate service."
            r13.<init>(r0)
            goto L_0x0100
        L_0x00ff:
            throw r13
        L_0x0100:
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eka.a(ejz):android.app.PendingIntent");
    }
}
