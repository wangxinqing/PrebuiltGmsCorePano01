package com.google.android.gms.auth.account.be.channelid;

import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChannelBindingStateChimeraIntentService extends TracingIntentService {
    private static final iwd b = new iwd("GLSUser", "ChannelBindingStateChimeraIntentService");
    private static final Lock c = new ReentrantLock();
    fzf a;

    public ChannelBindingStateChimeraIntentService() {
        super("ChannelBindingStateIntentService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x00db, all -> 0x00d4, Exception -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[Catch:{ all -> 0x00db, all -> 0x00d4, Exception -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[Catch:{ all -> 0x00db, all -> 0x00d4, Exception -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r9) {
        /*
            r8 = this;
            java.lang.String r9 = "stored_binding_state"
            r0 = 0
            ihs r1 = defpackage.ihs.b()     // Catch:{ IOException -> 0x00f4 }
            java.util.concurrent.locks.Lock r2 = c     // Catch:{ IOException -> 0x00f4 }
            r2.lock()     // Catch:{ IOException -> 0x00f4 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ all -> 0x00ed }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "auth.channel.store.properties"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x00ed }
            fzf r1 = new fzf     // Catch:{ all -> 0x00ed }
            r1.<init>(r2)     // Catch:{ all -> 0x00ed }
            r8.a = r1     // Catch:{ all -> 0x00ed }
            java.util.concurrent.locks.Lock r1 = c     // Catch:{ IOException -> 0x00f4 }
            r1.unlock()     // Catch:{ IOException -> 0x00f4 }
            java.util.concurrent.locks.Lock r1 = c     // Catch:{ Exception -> 0x00e2 }
            r1.lock()     // Catch:{ Exception -> 0x00e2 }
            fzf r1 = r8.a     // Catch:{ all -> 0x00db }
            java.lang.String r1 = r1.a(r9)     // Catch:{ all -> 0x00db }
            java.util.concurrent.locks.Lock r2 = c     // Catch:{ Exception -> 0x00e2 }
            r2.unlock()     // Catch:{ Exception -> 0x00e2 }
            boolean r2 = defpackage.ent.Z()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r3 = "true"
            java.lang.String r4 = "false"
            if (r2 == 0) goto L_0x004d
            fzh r2 = defpackage.iit.a     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object r2 = r2.b()     // Catch:{ Exception -> 0x00e2 }
            iit r2 = (defpackage.iit) r2     // Catch:{ Exception -> 0x00e2 }
            boolean r2 = r2.a()     // Catch:{ Exception -> 0x00e2 }
            if (r2 == 0) goto L_0x004d
            r2 = r3
            goto L_0x004e
        L_0x004d:
            r2 = r4
        L_0x004e:
            java.util.concurrent.locks.Lock r5 = c     // Catch:{ Exception -> 0x00e2 }
            r5.lock()     // Catch:{ Exception -> 0x00e2 }
            fzf r5 = r8.a     // Catch:{ all -> 0x00d4 }
            r5.a(r9, r2, r1)     // Catch:{ all -> 0x00d4 }
            fzf r9 = r8.a     // Catch:{ all -> 0x00d4 }
            r9.a()     // Catch:{ all -> 0x00d4 }
            java.util.concurrent.locks.Lock r9 = c     // Catch:{ Exception -> 0x00e2 }
            r9.unlock()     // Catch:{ Exception -> 0x00e2 }
            if (r1 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r4
        L_0x0066:
            iwd r9 = b     // Catch:{ Exception -> 0x00e2 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00e2 }
            r5[r0] = r1     // Catch:{ Exception -> 0x00e2 }
            r6 = 1
            r5[r6] = r2     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r7 = "Saved state is %s, new state is %s"
            r9.b(r7, r5)     // Catch:{ Exception -> 0x00e2 }
            boolean r9 = r4.equals(r1)     // Catch:{ Exception -> 0x00e2 }
            if (r9 == 0) goto L_0x00d3
            boolean r9 = r3.equals(r2)     // Catch:{ Exception -> 0x00e2 }
            if (r9 == 0) goto L_0x00d3
            iwd r9 = b     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r1 = "Server requests we re-auth to get a bound token."
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00e2 }
            r9.b(r1, r2)     // Catch:{ Exception -> 0x00e2 }
            iwd r9 = b
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Channel-bound LST requirement enabled by gservices flag update. Resetting LST"
            r9.b(r2, r1)
            java.lang.String r9 = r8.getPackageName()
            java.lang.String r1 = "com.google"
            java.util.List r9 = defpackage.jgu.c(r8, r9, r1)
            int r1 = r9.size()
            r2 = 0
        L_0x00a2:
            if (r2 >= r1) goto L_0x00d3
            java.lang.Object r3 = r9.get(r2)
            android.accounts.Account r3 = (android.accounts.Account) r3
            java.lang.String r4 = r3.name
            java.lang.String r5 = "@google.com"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L_0x00d0
            fzi r4 = defpackage.eny.a
            java.lang.Object r4 = r4.b()
            eny r4 = (defpackage.eny) r4
            enx r5 = defpackage.eqb.a
            java.lang.String r7 = ""
            r4.b(r3, r5, r7)
            iwd r4 = b
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r3 = r3.name
            r5[r0] = r3
            java.lang.String r3 = "Reset LST for account %s"
            r4.b(r3, r5)
        L_0x00d0:
            int r2 = r2 + 1
            goto L_0x00a2
        L_0x00d3:
            return
        L_0x00d4:
            r9 = move-exception
            java.util.concurrent.locks.Lock r1 = c     // Catch:{ Exception -> 0x00e2 }
            r1.unlock()     // Catch:{ Exception -> 0x00e2 }
            throw r9     // Catch:{ Exception -> 0x00e2 }
        L_0x00db:
            r9 = move-exception
            java.util.concurrent.locks.Lock r1 = c     // Catch:{ Exception -> 0x00e2 }
            r1.unlock()     // Catch:{ Exception -> 0x00e2 }
            throw r9     // Catch:{ Exception -> 0x00e2 }
        L_0x00e2:
            r9 = move-exception
            iwd r1 = b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Errors while handling Channel ID status changes"
            r1.e(r2, r9, r0)
            return
        L_0x00ed:
            r9 = move-exception
            java.util.concurrent.locks.Lock r1 = c     // Catch:{ IOException -> 0x00f4 }
            r1.unlock()     // Catch:{ IOException -> 0x00f4 }
            throw r9     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            r9 = move-exception
            iwd r1 = b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Errors while handling channel-binding requirement status changes"
            r1.e(r2, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.channelid.ChannelBindingStateChimeraIntentService.a(android.content.Intent):void");
    }
}
