package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: ebs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebs implements ebi {
    private final itv a;
    private final int b;
    private final String c;
    private final Account d;
    private final Account e;
    private final String[] f;
    private final boolean g;

    public ebs(itv itv, int i, String str, Account account, Account account2, String[] strArr, boolean z) {
        this.a = itv;
        this.b = i;
        this.c = str;
        iva.a((Object) account, (Object) "RequestedAccount cannot be null.");
        this.d = account;
        this.e = account2;
        this.f = strArr;
        this.g = z;
    }

    private final void a(Context context, int i, IBinder iBinder, Intent intent) {
        Bundle bundle = new Bundle();
        if (intent != null) {
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, intent, 134217728));
        }
        try {
            this.a.a(i, iBinder, bundle);
        } catch (RemoteException e2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010c, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        a(r12, 7, (android.os.IBinder) null, (android.content.Intent) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011d, code lost:
        a(r12, 4, (android.os.IBinder) null, ((com.google.android.gms.auth.UserRecoverableAuthException) r13).a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        a(r12, 8, (android.os.IBinder) null, (android.content.Intent) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012c, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010f A[ExcHandler: IOException (e java.io.IOException), Splitter:B:50:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r12, defpackage.eaw r13) {
        /*
            r11 = this;
            boolean r13 = defpackage.jgu.e(r12)
            r0 = 0
            r1 = 0
            if (r13 == 0) goto L_0x0032
            jgf r13 = new jgf
            r13.<init>(r12)
            android.content.Intent r2 = r13.a
            r3 = 2131952190(0x7f13023e, float:1.9540816E38)
            java.lang.String r4 = "com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE"
            r2.putExtra(r4, r3)
            r2 = 20
            java.lang.String r2 = defpackage.isf.c(r12, r2)
            android.content.Intent r3 = r13.a
            java.lang.String r4 = "com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE_STR"
            r3.putExtra(r4, r2)
            android.content.Intent r2 = r13.a
            java.lang.String r3 = "com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE"
            r2.putExtra(r3, r0)
            r0 = 6
            android.content.Intent r13 = r13.a
            r11.a(r12, r0, r1, r13)
            return
        L_0x0032:
            int r3 = r11.b
            java.lang.String r13 = r11.c
            java.lang.String r2 = "com.google.android.gms.appstate.APP_ID"
            java.lang.String r13 = defpackage.jhg.a((android.content.Context) r12, (java.lang.String) r13, (java.lang.String) r2)
            r2 = 10
            if (r13 != 0) goto L_0x0043
            java.lang.String r13 = ""
            goto L_0x0046
        L_0x0043:
            java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x0204 }
        L_0x0046:
            boolean r4 = android.text.TextUtils.isEmpty(r13)
            if (r4 != 0) goto L_0x004d
        L_0x004c:
            goto L_0x0076
        L_0x004d:
            int r4 = r11.b
            int r5 = android.os.Process.myUid()
            if (r4 == r5) goto L_0x004c
            java.lang.String r13 = r11.c
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "Missing metadata tag with the name \"com.google.android.gms.appstate.APP_ID\" in the application tag of the manifest for "
            int r3 = r13.length()
            if (r3 != 0) goto L_0x0069
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
            goto L_0x006d
        L_0x0069:
            java.lang.String r13 = r0.concat(r13)
        L_0x006d:
            java.lang.String r0 = "ValidateServiceOp"
            android.util.Log.e(r0, r13)
            r11.a(r12, r2, r1, r1)
            return
        L_0x0076:
            boolean r2 = r11.g
            r8 = 4
            if (r2 != 0) goto L_0x00c4
            android.accounts.Account r2 = r11.d
            java.lang.String r2 = r2.name
            java.lang.String r4 = "<<default account>>"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x008e
            java.lang.String r2 = r11.c
            java.lang.String r2 = defpackage.jgu.a((android.content.Context) r12, (java.lang.String) r2)
            goto L_0x009a
        L_0x008e:
            if (r2 == 0) goto L_0x009a
            java.lang.String r4 = r11.c
            boolean r4 = defpackage.jgu.d(r12, r2, r4)
            if (r4 != 0) goto L_0x009a
            r2 = r1
            goto L_0x00b3
        L_0x009a:
            java.lang.String r4 = r11.c
            java.util.List r4 = defpackage.jgu.d(r12, r4)
            if (r2 != 0) goto L_0x00b3
            int r2 = r4.size()
            r5 = 1
            if (r2 != r5) goto L_0x00b2
            java.lang.Object r2 = r4.get(r0)
            android.accounts.Account r2 = (android.accounts.Account) r2
            java.lang.String r2 = r2.name
            goto L_0x00b3
        L_0x00b2:
            r2 = r1
        L_0x00b3:
            if (r2 == 0) goto L_0x00b7
            r5 = r2
            goto L_0x00c9
        L_0x00b7:
            android.content.Intent r13 = defpackage.itg.a()
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r13.addFlags(r0)
            r11.a(r12, r8, r1, r13)
            return
        L_0x00c4:
            android.accounts.Account r2 = r11.e
            java.lang.String r2 = r2.name
            r5 = r2
        L_0x00c9:
            java.lang.String r2 = r11.c
            defpackage.iva.c(r5)
            android.accounts.Account r4 = com.google.android.gms.common.internal.ClientContext.c(r5)
            com.google.android.gms.common.internal.ClientContext r2 = com.google.android.gms.common.internal.ClientContext.a(r12, r3, r4, r2)
            if (r2 != 0) goto L_0x00d9
            goto L_0x00ed
        L_0x00d9:
            r4 = 0
        L_0x00da:
            java.lang.String[] r6 = r11.f
            int r7 = r6.length
            if (r4 >= r7) goto L_0x00ec
            r6 = r6[r4]
            boolean r6 = r2.a((java.lang.String) r6)
            if (r6 == 0) goto L_0x00ea
            int r4 = r4 + 1
            goto L_0x00da
        L_0x00ea:
            r9 = r1
            goto L_0x00ee
        L_0x00ec:
        L_0x00ed:
            r9 = r2
        L_0x00ee:
            if (r9 != 0) goto L_0x012d
            com.google.android.gms.common.internal.ClientContext r10 = new com.google.android.gms.common.internal.ClientContext     // Catch:{ eif -> 0x0115, IOException -> 0x010f }
            java.lang.String r7 = r11.c     // Catch:{ eif -> 0x0115, IOException -> 0x010f }
            r2 = r10
            r4 = r5
            r6 = r7
            r2.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ eif -> 0x0115, IOException -> 0x010f }
            java.lang.String[] r2 = r11.f     // Catch:{ eif -> 0x010c, IOException -> 0x010f }
            r10.a((java.lang.String[]) r2)     // Catch:{ eif -> 0x010c, IOException -> 0x010f }
            izw r2 = new izw     // Catch:{ eif -> 0x010c, IOException -> 0x010f }
            r2.<init>(r10, r1)     // Catch:{ eif -> 0x010c, IOException -> 0x010f }
            r2.b(r12)     // Catch:{ eif -> 0x010c, IOException -> 0x010f }
            r10.a((android.content.Context) r12)     // Catch:{ eif -> 0x010c, IOException -> 0x010f }
            r9 = r10
            goto L_0x012e
        L_0x010c:
            r13 = move-exception
            r9 = r10
            goto L_0x0116
        L_0x010f:
            r13 = move-exception
            r13 = 7
            r11.a(r12, r13, r1, r1)
            return
        L_0x0115:
            r13 = move-exception
        L_0x0116:
            r9.b((android.content.Context) r12)
            boolean r0 = r13 instanceof com.google.android.gms.auth.UserRecoverableAuthException
            if (r0 == 0) goto L_0x0127
            com.google.android.gms.auth.UserRecoverableAuthException r13 = (com.google.android.gms.auth.UserRecoverableAuthException) r13
            android.content.Intent r13 = r13.a()
            r11.a(r12, r8, r1, r13)
            return
        L_0x0127:
            r13 = 8
            r11.a(r12, r13, r1, r1)
            return
        L_0x012d:
        L_0x012e:
            java.lang.Object r3 = com.google.android.gms.appstate.service.AppStateAndroidChimeraService.b
            monitor-enter(r3)
            java.util.HashMap r2 = com.google.android.gms.appstate.service.AppStateAndroidChimeraService.a     // Catch:{ all -> 0x0201 }
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0201 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0201 }
            if (r2 == 0) goto L_0x01cd
            java.util.HashMap r4 = com.google.android.gms.appstate.service.AppStateAndroidChimeraService.a     // Catch:{ all -> 0x0201 }
            boolean r5 = r4.containsKey(r9)     // Catch:{ all -> 0x0201 }
            if (r5 == 0) goto L_0x015c
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x0201 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0201 }
        L_0x014b:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0201 }
            if (r5 == 0) goto L_0x015c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0201 }
            boolean r6 = r5.equals(r9)     // Catch:{ all -> 0x0201 }
            if (r6 == 0) goto L_0x014b
            goto L_0x015d
        L_0x015c:
            r5 = r1
        L_0x015d:
            com.google.android.gms.common.internal.ClientContext r5 = (com.google.android.gms.common.internal.ClientContext) r5     // Catch:{ all -> 0x0201 }
            boolean r4 = r5.equals(r9)     // Catch:{ all -> 0x0201 }
            if (r4 == 0) goto L_0x01ca
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0201 }
            java.util.List r6 = r9.g     // Catch:{ all -> 0x0201 }
            r4.<init>(r6)     // Catch:{ all -> 0x0201 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0201 }
            java.util.List r7 = r5.g     // Catch:{ all -> 0x0201 }
            r6.<init>(r7)     // Catch:{ all -> 0x0201 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0201 }
            if (r4 == 0) goto L_0x01ca
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0201 }
            java.util.List r6 = r9.h     // Catch:{ all -> 0x0201 }
            r4.<init>(r6)     // Catch:{ all -> 0x0201 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0201 }
            java.util.List r7 = r5.h     // Catch:{ all -> 0x0201 }
            r6.<init>(r7)     // Catch:{ all -> 0x0201 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0201 }
            if (r4 == 0) goto L_0x01ca
            android.os.Bundle r4 = r9.i     // Catch:{ all -> 0x0201 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x0201 }
            android.os.Bundle r6 = r5.i     // Catch:{ all -> 0x0201 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x0201 }
            boolean r6 = r4.equals(r6)     // Catch:{ all -> 0x0201 }
            if (r6 == 0) goto L_0x01ca
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0201 }
        L_0x01a3:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0201 }
            if (r6 == 0) goto L_0x01c2
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0201 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0201 }
            android.os.Bundle r7 = r9.i     // Catch:{ all -> 0x0201 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0201 }
            android.os.Bundle r8 = r5.i     // Catch:{ all -> 0x0201 }
            java.lang.Object r6 = r8.get(r6)     // Catch:{ all -> 0x0201 }
            boolean r6 = defpackage.ius.a(r7, r6)     // Catch:{ all -> 0x0201 }
            if (r6 != 0) goto L_0x01a3
            goto L_0x01ca
        L_0x01c2:
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0201 }
            eba r2 = (defpackage.eba) r2     // Catch:{ all -> 0x0201 }
            monitor-exit(r3)     // Catch:{ all -> 0x0201 }
            goto L_0x01cf
        L_0x01ca:
            monitor-exit(r3)     // Catch:{ all -> 0x0201 }
            r2 = r1
            goto L_0x01cf
        L_0x01cd:
            monitor-exit(r3)     // Catch:{ all -> 0x0201 }
            r2 = r1
        L_0x01cf:
            if (r2 != 0) goto L_0x01d2
            goto L_0x01db
        L_0x01d2:
            java.lang.String r3 = r2.a
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x01db
            goto L_0x01f2
        L_0x01db:
            eba r2 = new eba
            android.content.Context r3 = r12.getApplicationContext()
            r2.<init>(r3, r9, r13)
            java.lang.Object r13 = com.google.android.gms.appstate.service.AppStateAndroidChimeraService.b
            monitor-enter(r13)
            java.util.HashMap r3 = com.google.android.gms.appstate.service.AppStateAndroidChimeraService.a     // Catch:{ all -> 0x01fe }
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01fe }
            r4.<init>(r2)     // Catch:{ all -> 0x01fe }
            r3.put(r9, r4)     // Catch:{ all -> 0x01fe }
            monitor-exit(r13)     // Catch:{ all -> 0x01fe }
        L_0x01f2:
            boolean r13 = r11.g
            if (r13 != 0) goto L_0x01f9
            defpackage.jgu.a((android.content.Context) r12, (com.google.android.gms.common.internal.ClientContext) r9)
        L_0x01f9:
            r11.a(r12, r0, r2, r1)
            return
        L_0x01fe:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01fe }
            throw r12
        L_0x0201:
            r12 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0201 }
            throw r12
        L_0x0204:
            r0 = move-exception
            int r0 = r13.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r0 = r0 + 109
            r3.<init>(r0)
            java.lang.String r0 = "Application ID ("
            r3.append(r0)
            r3.append(r13)
            java.lang.String r13 = ") must be a numeric value. Please verify that your manifest refers to the correct project ID."
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            java.lang.String r0 = "ValidateServiceOp"
            android.util.Log.e(r0, r13)
            r11.a(r12, r2, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebs.a(android.content.Context, eaw):void");
    }
}
