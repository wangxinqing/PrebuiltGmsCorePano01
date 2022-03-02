package com.google.android.gms.auth.account.be.accountstate;

import android.content.Context;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoginAccountsChangedChimeraIntentService extends TracingIntentService {
    private static final iwd a = ehv.a("LoginAccountsChangedIntentService");
    private Context b;
    private ekm c;
    private ekr d;

    public LoginAccountsChangedChimeraIntentService() {
        super("LoginAccountsChangedIntentService");
    }

    private static final Set a(Set set) {
        ob obVar = new ob(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            obVar.add(((eku) it.next()).a);
        }
        return obVar;
    }

    public final void onCreate() {
        super.onCreate();
        this.b = this;
        this.c = new ekm(this.b);
        this.d = new ekr(this.b);
    }

    LoginAccountsChangedChimeraIntentService(Context context, ekr ekr) {
        super("LoginAccountsChangedIntentService");
        this.b = context;
        this.c = new ekm(this.b);
        this.d = ekr;
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073 A[Catch:{ IOException -> 0x0124, all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075 A[Catch:{ IOException -> 0x0124, all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105 A[Catch:{ IOException -> 0x0124, all -> 0x0132 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0029
            java.lang.String r2 = r10.getAction()     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = "android.accounts.LOGIN_ACCOUNTS_CHANGED"
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x0132 }
            if (r3 != 0) goto L_0x0032
            java.lang.String r3 = "BootOrGmsUpdated"
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x0132 }
            if (r3 != 0) goto L_0x0032
            iwd r3 = a     // Catch:{ all -> 0x0132 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0132 }
            r0[r1] = r2     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = "Received unknown action: %s. Stopping."
            r3.d(r1, r0)     // Catch:{ all -> 0x0132 }
            android.content.Context r0 = r9.b
        L_0x0025:
            defpackage.acrm.b(r0, r10)
            return
        L_0x0029:
            iwd r2 = a     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = "Received null intent, probably due to intent redelivery. Continuing."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0132 }
            r2.d(r3, r4)     // Catch:{ all -> 0x0132 }
        L_0x0032:
            android.content.Context r2 = r9.b     // Catch:{ IOException -> 0x0124 }
            elb r2 = defpackage.elb.a(r2)     // Catch:{ IOException -> 0x0124 }
            iwd r3 = a     // Catch:{ IOException -> 0x0124 }
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0124 }
            java.util.Set r5 = r2.a     // Catch:{ IOException -> 0x0124 }
            r4[r1] = r5     // Catch:{ IOException -> 0x0124 }
            java.util.Set r5 = r2.b     // Catch:{ IOException -> 0x0124 }
            r4[r0] = r5     // Catch:{ IOException -> 0x0124 }
            r0 = 2
            java.util.Set r5 = r2.c     // Catch:{ IOException -> 0x0124 }
            r4[r0] = r5     // Catch:{ IOException -> 0x0124 }
            java.lang.String r0 = "AccountsChange - added: %s removed: %s mutated: %s"
            r3.b(r0, r4)     // Catch:{ IOException -> 0x0124 }
            java.util.Set r0 = r2.a     // Catch:{ IOException -> 0x0124 }
            java.util.Set r0 = a((java.util.Set) r0)     // Catch:{ IOException -> 0x0124 }
            java.util.Set r3 = r2.b     // Catch:{ IOException -> 0x0124 }
            java.util.Set r3 = a((java.util.Set) r3)     // Catch:{ IOException -> 0x0124 }
            java.util.Set r4 = r2.c     // Catch:{ IOException -> 0x0124 }
            java.util.Set r4 = a((java.util.Set) r4)     // Catch:{ IOException -> 0x0124 }
            boolean r5 = r0.isEmpty()     // Catch:{ IOException -> 0x0124 }
            if (r5 == 0) goto L_0x0075
            boolean r5 = r3.isEmpty()     // Catch:{ IOException -> 0x0124 }
            if (r5 == 0) goto L_0x0075
            boolean r5 = r4.isEmpty()     // Catch:{ IOException -> 0x0124 }
            if (r5 == 0) goto L_0x0075
            goto L_0x00f9
        L_0x0075:
            ekm r5 = r9.c     // Catch:{ IOException -> 0x0124 }
            r6 = r0
            ob r6 = (defpackage.ob) r6     // Catch:{ IOException -> 0x0124 }
            int r6 = r6.b     // Catch:{ IOException -> 0x0124 }
            android.accounts.Account[] r6 = new android.accounts.Account[r6]     // Catch:{ IOException -> 0x0124 }
            java.lang.Object[] r0 = r0.toArray(r6)     // Catch:{ IOException -> 0x0124 }
            android.accounts.Account[] r0 = (android.accounts.Account[]) r0     // Catch:{ IOException -> 0x0124 }
            r6 = r3
            ob r6 = (defpackage.ob) r6     // Catch:{ IOException -> 0x0124 }
            int r6 = r6.b     // Catch:{ IOException -> 0x0124 }
            android.accounts.Account[] r6 = new android.accounts.Account[r6]     // Catch:{ IOException -> 0x0124 }
            java.lang.Object[] r3 = r3.toArray(r6)     // Catch:{ IOException -> 0x0124 }
            android.accounts.Account[] r3 = (android.accounts.Account[]) r3     // Catch:{ IOException -> 0x0124 }
            r6 = r4
            ob r6 = (defpackage.ob) r6     // Catch:{ IOException -> 0x0124 }
            int r6 = r6.b     // Catch:{ IOException -> 0x0124 }
            android.accounts.Account[] r6 = new android.accounts.Account[r6]     // Catch:{ IOException -> 0x0124 }
            java.lang.Object[] r4 = r4.toArray(r6)     // Catch:{ IOException -> 0x0124 }
            android.accounts.Account[] r4 = (android.accounts.Account[]) r4     // Catch:{ IOException -> 0x0124 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ IOException -> 0x0124 }
            java.lang.String r7 = "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"
            r6.<init>(r7)     // Catch:{ IOException -> 0x0124 }
            fzl r7 = new fzl     // Catch:{ IOException -> 0x0124 }
            r7.<init>()     // Catch:{ IOException -> 0x0124 }
            if (r0 == 0) goto L_0x00b9
            int r8 = r0.length     // Catch:{ IOException -> 0x0124 }
            if (r8 <= 0) goto L_0x00b9
            java.lang.String r8 = "com.google.android.gms.auth.category.ACCOUNT_ADDED"
            r6.addCategory(r8)     // Catch:{ IOException -> 0x0124 }
            fzk r8 = defpackage.ekm.b     // Catch:{ IOException -> 0x0124 }
            r7.b(r8, r0)     // Catch:{ IOException -> 0x0124 }
        L_0x00b9:
            if (r3 == 0) goto L_0x00c8
            int r0 = r3.length     // Catch:{ IOException -> 0x0124 }
            if (r0 <= 0) goto L_0x00c8
            java.lang.String r0 = "com.google.android.gms.auth.category.ACCOUNT_REMOVED"
            r6.addCategory(r0)     // Catch:{ IOException -> 0x0124 }
            fzk r0 = defpackage.ekm.c     // Catch:{ IOException -> 0x0124 }
            r7.b(r0, r3)     // Catch:{ IOException -> 0x0124 }
        L_0x00c8:
            if (r4 != 0) goto L_0x00cb
            goto L_0x00d8
        L_0x00cb:
            int r0 = r4.length     // Catch:{ IOException -> 0x0124 }
            if (r0 <= 0) goto L_0x00d8
            java.lang.String r0 = "com.google.android.gms.auth.category.ACCOUNT_MUTATED"
            r6.addCategory(r0)     // Catch:{ IOException -> 0x0124 }
            fzk r0 = defpackage.ekm.d     // Catch:{ IOException -> 0x0124 }
            r7.b(r0, r4)     // Catch:{ IOException -> 0x0124 }
        L_0x00d8:
            android.os.Bundle r0 = r7.a     // Catch:{ IOException -> 0x0124 }
            r6.putExtras(r0)     // Catch:{ IOException -> 0x0124 }
            java.util.Set r0 = r6.getCategories()     // Catch:{ IOException -> 0x0124 }
            if (r0 == 0) goto L_0x00f9
            android.os.Bundle r0 = r6.getExtras()     // Catch:{ IOException -> 0x0124 }
            if (r0 == 0) goto L_0x00f9
            iwd r0 = defpackage.ekm.a     // Catch:{ IOException -> 0x0124 }
            java.lang.String r3 = "Broadcasting account change."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0124 }
            r0.c(r3, r4)     // Catch:{ IOException -> 0x0124 }
            android.content.Context r0 = r5.g     // Catch:{ IOException -> 0x0124 }
            java.lang.String r3 = "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE"
            r0.sendBroadcast(r6, r3)     // Catch:{ IOException -> 0x0124 }
        L_0x00f9:
            java.util.Set r0 = r2.b     // Catch:{ IOException -> 0x0124 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0124 }
        L_0x00ff:
            boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x0124 }
            if (r2 == 0) goto L_0x012e
            java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x0124 }
            eku r2 = (defpackage.eku) r2     // Catch:{ IOException -> 0x0124 }
            ekr r3 = r9.d     // Catch:{ IOException -> 0x0124 }
            android.accounts.Account r4 = r2.a     // Catch:{ IOException -> 0x0124 }
            r3.b(r4)     // Catch:{ IOException -> 0x0124 }
            boolean r3 = defpackage.ent.aa()     // Catch:{ IOException -> 0x0124 }
            if (r3 == 0) goto L_0x00ff
            java.lang.String r2 = r2.c     // Catch:{ IOException -> 0x0124 }
            android.content.Context r3 = r9.b     // Catch:{ IOException -> 0x0124 }
            android.content.Intent r2 = com.google.android.gms.auth.account.be.accountstate.CredentialRevocationIntentOperation.a(r3, r2)     // Catch:{ IOException -> 0x0124 }
            r3.startService(r2)     // Catch:{ IOException -> 0x0124 }
            goto L_0x00ff
        L_0x0124:
            r0 = move-exception
            iwd r2 = a     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = "Error occurred getting AccountsChange"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0132 }
            r2.d(r3, r0, r1)     // Catch:{ all -> 0x0132 }
        L_0x012e:
            android.content.Context r0 = r9.b
            goto L_0x0025
        L_0x0132:
            r0 = move-exception
            android.content.Context r1 = r9.b
            defpackage.acrm.b(r1, r10)
            goto L_0x013a
        L_0x0139:
            throw r0
        L_0x013a:
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedChimeraIntentService.a(android.content.Intent):void");
    }
}
