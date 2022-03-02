package defpackage;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;

/* renamed from: abzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abzt {
    private static final acpz a = acqa.a("ManagedAccountHelper");
    private final Context b;
    private final gbs c;
    private final enz d;
    private final DevicePolicyManager e;

    public abzt(Context context) {
        gck gck = new gck(context.getApplicationContext());
        enz a2 = eoa.a(context.getApplicationContext());
        this.b = context.getApplicationContext();
        this.c = gck;
        this.e = (DevicePolicyManager) context.getApplicationContext().getSystemService("device_policy");
        this.d = a2;
    }

    public final Intent a(Account account, Bundle bundle, ManagedAuthOptions managedAuthOptions) {
        Bundle a2 = managedAuthOptions.a();
        if (managedAuthOptions.b == 1) {
            a2.putBoolean("smartdevice.do_active", true);
        }
        Intent a3 = ijk.a(this.b, account, true, false, bundle, false, "com.google.android.gms", jhg.f(), (String) null, ijk.b(this.b, account), 2, a2);
        if (a3 == null) {
            a.d("Failed to resolve device management intent", new Object[0]);
        }
        return a3;
    }

    public final boolean a() {
        int i = Build.VERSION.SDK_INT;
        DevicePolicyManager devicePolicyManager = this.e;
        return (devicePolicyManager == null || devicePolicyManager.getDeviceOwner() == null) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.accounts.Account r8) {
        /*
            r7 = this;
            azjn r0 = defpackage.azjn.a
            azjo r0 = r0.a()
            boolean r0 = r0.k()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007d
            acpz r0 = a
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "Use AccountDataServiceClient."
            r0.b(r4, r3)
            enz r0 = r7.d
            iha r3 = defpackage.ihb.b()
            com.google.android.gms.common.Feature[] r4 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r5 = defpackage.eia.a
            r4[r2] = r5
            r3.b = r4
            epj r4 = new epj
            r4.<init>(r8)
            r3.a = r4
            ihb r3 = r3.a()
            iby r0 = (defpackage.iby) r0
            acwa r0 = r0.b((defpackage.ihb) r3)
            azjn r3 = defpackage.azjn.a     // Catch:{ ExecutionException -> 0x004d, InterruptedException -> 0x004b, TimeoutException -> 0x0049 }
            azjo r3 = r3.a()     // Catch:{ ExecutionException -> 0x004d, InterruptedException -> 0x004b, TimeoutException -> 0x0049 }
            long r3 = r3.i()     // Catch:{ ExecutionException -> 0x004d, InterruptedException -> 0x004b, TimeoutException -> 0x0049 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x004d, InterruptedException -> 0x004b, TimeoutException -> 0x0049 }
            java.lang.Object r3 = defpackage.acws.a(r0, r3, r5)     // Catch:{ ExecutionException -> 0x004d, InterruptedException -> 0x004b, TimeoutException -> 0x0049 }
            com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse r3 = (com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse) r3     // Catch:{ ExecutionException -> 0x004d, InterruptedException -> 0x004b, TimeoutException -> 0x0049 }
            goto L_0x008d
        L_0x0049:
            r3 = move-exception
            goto L_0x004e
        L_0x004b:
            r3 = move-exception
            goto L_0x004e
        L_0x004d:
            r3 = move-exception
        L_0x004e:
            java.lang.Exception r0 = r0.e()
            boolean r4 = r0 instanceof defpackage.ibr
            if (r4 == 0) goto L_0x0076
            acpz r4 = a
            ibr r0 = (defpackage.ibr) r0
            int r0 = r0.a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 43
            r5.<init>(r6)
            java.lang.String r6 = "getDeviceManagementInfo status: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r4.d(r0, r5)
        L_0x0076:
            acpz r0 = a
            r0.a((java.lang.Throwable) r3)
            r3 = 0
            goto L_0x008d
        L_0x007d:
            gbs r0 = r7.c
            gce r3 = new gce
            r3.<init>(r8)
            gck r0 = (defpackage.gck) r0
            java.lang.Object r0 = r0.a((defpackage.gcj) r3)
            r3 = r0
            com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse r3 = (com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse) r3
        L_0x008d:
            if (r3 == 0) goto L_0x0099
            java.lang.String r0 = r3.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            acpz r3 = a
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r4[r1] = r8
            java.lang.String r8 = "isManagedAccount(%s) = %s"
            r3.a(r8, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzt.a(android.accounts.Account):boolean");
    }
}
