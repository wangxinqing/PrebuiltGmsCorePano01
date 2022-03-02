package com.google.android.gms.auth.account.be;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FinishBootstrapIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("FinishBootstrapMessengerService");
    private achf b;

    public FinishBootstrapIntentOperation() {
    }

    private static final Message a(Exception exc, String str) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return a(str);
    }

    public final void onCreate() {
        ibq ibq = abmq.a;
        this.b = abmq.a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb A[Catch:{ RemoteException -> 0x00f4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r9) {
        /*
            r8 = this;
            android.os.Bundle r0 = r9.getExtras()
            java.lang.String r1 = "messenger"
            java.lang.Object r0 = r0.get(r1)
            android.os.Messenger r0 = (android.os.Messenger) r0
            if (r0 == 0) goto L_0x00ff
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.auth.account.be.finish_bootstrap"
            java.lang.String r3 = r9.getAction()     // Catch:{ RemoteException -> 0x00f4 }
            boolean r2 = r2.equals(r3)     // Catch:{ RemoteException -> 0x00f4 }
            if (r2 == 0) goto L_0x00ea
            java.lang.String r2 = "bootstrapAccount"
            android.os.Parcelable r2 = r9.getParcelableExtra(r2)     // Catch:{ RemoteException -> 0x00f4 }
            android.accounts.Account r2 = (android.accounts.Account) r2     // Catch:{ RemoteException -> 0x00f4 }
            if (r2 != 0) goto L_0x002f
            java.lang.String r9 = "No bootstrap account"
            android.os.Message r9 = a(r9)     // Catch:{ RemoteException -> 0x00f4 }
            r0.send(r9)     // Catch:{ RemoteException -> 0x00f4 }
            return
        L_0x002f:
            java.lang.String r3 = "bootstrapAssertion"
            android.os.Parcelable$Creator r4 = com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest.CREATOR     // Catch:{ RemoteException -> 0x00f4 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r9 = defpackage.ivy.a((android.content.Intent) r9, (java.lang.String) r3, (android.os.Parcelable.Creator) r4)     // Catch:{ RemoteException -> 0x00f4 }
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r9 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r9     // Catch:{ RemoteException -> 0x00f4 }
            if (r9 == 0) goto L_0x00e0
            achf r3 = r8.b     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00d3 }
            acwa r9 = r3.b(r9)     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00d3 }
            java.lang.Object r9 = defpackage.acws.a((defpackage.acwa) r9)     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00d3 }
            com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest r9 = (com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest) r9     // Catch:{ ExecutionException -> 0x00d5, InterruptedException -> 0x00d3 }
            if (r9 == 0) goto L_0x00cc
            achf r3 = r8.b     // Catch:{ RemoteException -> 0x00f4 }
            acwa r9 = r3.c(r9)     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.Object r9 = defpackage.acws.a((defpackage.acwa) r9)     // Catch:{ ExecutionException -> 0x00c4, InterruptedException -> 0x00c2 }
            achx r9 = (defpackage.achx) r9     // Catch:{ ExecutionException -> 0x00c4, InterruptedException -> 0x00c2 }
            com.google.android.gms.smartdevice.setup.accounts.UserCredential[] r9 = r9.a     // Catch:{ ExecutionException -> 0x00c4, InterruptedException -> 0x00c2 }
            r3 = 0
            if (r9 != 0) goto L_0x005b
            goto L_0x00b3
        L_0x005b:
            int r4 = r9.length     // Catch:{ RemoteException -> 0x00f4 }
            if (r4 <= 0) goto L_0x00b3
            r5 = 0
        L_0x005f:
            if (r5 >= r4) goto L_0x00b2
            r6 = r9[r5]     // Catch:{ RemoteException -> 0x00f4 }
            int r7 = r6.c     // Catch:{ RemoteException -> 0x00f4 }
            if (r7 != 0) goto L_0x00af
            java.lang.String r9 = r6.e     // Catch:{ RemoteException -> 0x00f4 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ RemoteException -> 0x00f4 }
            r4 = 1
            if (r9 != 0) goto L_0x008d
            iwd r9 = a     // Catch:{ RemoteException -> 0x00f4 }
            r2 = 3
            boolean r9 = r9.a((int) r2)     // Catch:{ RemoteException -> 0x00f4 }
            if (r9 == 0) goto L_0x0086
            iwd r9 = a     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.String r3 = r6.d     // Catch:{ RemoteException -> 0x00f4 }
            r2[r1] = r3     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.String r3 = "Got a fallback URL, but we do not handle challenges. Reason: %s"
            r9.b(r3, r2)     // Catch:{ RemoteException -> 0x00f4 }
        L_0x0086:
            java.lang.String r9 = "Fallback url."
            android.os.Message r3 = a(r9)     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00b9
        L_0x008d:
            java.lang.String r9 = r6.f     // Catch:{ RemoteException -> 0x00f4 }
            android.os.Message r3 = android.os.Message.obtain(r3, r4)     // Catch:{ RemoteException -> 0x00f4 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00f4 }
            r4.<init>()     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.Class<com.google.android.gms.auth.account.be.FinishBootstrapIntentOperation> r5 = com.google.android.gms.auth.account.be.FinishBootstrapIntentOperation.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ RemoteException -> 0x00f4 }
            r4.setClassLoader(r5)     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.String r5 = "mastercredential"
            r4.putString(r5, r9)     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.String r9 = "dataAccount"
            r4.putParcelable(r9, r2)     // Catch:{ RemoteException -> 0x00f4 }
            r3.setData(r4)     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00b2
        L_0x00af:
            int r5 = r5 + 1
            goto L_0x005f
        L_0x00b2:
            goto L_0x00b9
        L_0x00b3:
            java.lang.String r9 = "Error while fetching credential."
            android.os.Message r3 = a(r9)     // Catch:{ RemoteException -> 0x00f4 }
        L_0x00b9:
            if (r3 != 0) goto L_0x00dc
            java.lang.String r9 = "bootstrap failed"
            android.os.Message r3 = a(r9)     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00dc
        L_0x00c2:
            r9 = move-exception
            goto L_0x00c5
        L_0x00c4:
            r9 = move-exception
        L_0x00c5:
            java.lang.String r2 = "Error calling api to exchange user creds"
            android.os.Message r3 = a(r9, r2)     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00dc
        L_0x00cc:
            java.lang.String r9 = "No partialRequest"
            android.os.Message r3 = a(r9)     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00dc
        L_0x00d3:
            r9 = move-exception
            goto L_0x00d6
        L_0x00d5:
            r9 = move-exception
        L_0x00d6:
            java.lang.String r2 = "Error calling api to populate target device info"
            android.os.Message r3 = a(r9, r2)     // Catch:{ RemoteException -> 0x00f4 }
        L_0x00dc:
            r0.send(r3)     // Catch:{ RemoteException -> 0x00f4 }
            return
        L_0x00e0:
            java.lang.String r9 = "No partial request to finish bootstrapping"
            android.os.Message r9 = a(r9)     // Catch:{ RemoteException -> 0x00f4 }
            r0.send(r9)     // Catch:{ RemoteException -> 0x00f4 }
            return
        L_0x00ea:
            java.lang.String r9 = "Unknown action"
            android.os.Message r9 = a(r9)     // Catch:{ RemoteException -> 0x00f4 }
            r0.send(r9)     // Catch:{ RemoteException -> 0x00f4 }
            return
        L_0x00f4:
            r9 = move-exception
            iwd r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Exception handling intent: "
            r0.e(r2, r9, r1)
            return
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.FinishBootstrapIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    FinishBootstrapIntentOperation(achd achd, achf achf) {
        this.b = achf;
    }

    private static final Message a(String str) {
        Message obtain = Message.obtain((Handler) null, 1001);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(FinishBootstrapIntentOperation.class.getClassLoader());
        bundle.putString("errorMsg", str);
        obtain.setData(bundle);
        return obtain;
    }
}
