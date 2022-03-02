package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceAccountExportController$ExportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: abpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abpr {
    public static final iwd a = acqa.a("D2D", "SourceAccountExportController");
    public final abps b;
    public final etl c;
    public final ExecutorService d;
    public final AtomicInteger e;
    public final Set f = new HashSet();
    public final Set g = new HashSet();
    public int h;
    private final Context i;
    private final acah j;
    private BroadcastReceiver k;

    public abpr(Context context, acah acah, abps abps, boolean z, boolean z2) {
        iva.a((Object) context);
        this.i = context;
        iva.a((Object) acah);
        this.j = acah;
        iva.a((Object) abps);
        this.b = abps;
        this.e = new AtomicInteger();
        this.d = acdx.a();
        this.c = esu.a(context, abvq.a(context, z, z2));
    }

    public final synchronized void a() {
        boolean z;
        String str;
        a.a("Using exportAccounts()", new Object[0]);
        this.f.clear();
        this.j.d(3);
        if (this.k == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "cleanup() must be called before retrying startAccountExport()");
        if (azmd.c()) {
            str = this.i.getResources().getQuantityString(R.plurals.smartdevice_d2d_copying_accounts, qub.a(this.i).a("com.google").length);
        } else {
            str = this.i.getString(R.string.smartdevice_d2d_target_copying_accounts);
        }
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.e(str);
        this.b.a(messagePayload);
        this.b.a(str);
        etn etn = new etn();
        etn.a(1);
        AccountTransferMsg a2 = etn.a();
        this.k = new SourceAccountExportController$ExportReceiver(this);
        this.i.registerReceiver(this.k, new IntentFilter("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP"));
        Status a3 = acqd.a(this.c.a(a2));
        a.b("exportAccounts(START_SESSION) status %s", a3);
        if (!a3.c()) {
            a("exportAccounts(START_SESSION) failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r6 = this;
            monitor-enter(r6)
            android.content.BroadcastReceiver r0 = r6.k     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0078
            iwd r0 = a     // Catch:{ all -> 0x007a }
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r3 = 0
            r2[r3] = r6     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "exportAccounts(END_SESSION) %s"
            r0.b(r4, r2)     // Catch:{ all -> 0x007a }
            acah r0 = r6.j     // Catch:{ all -> 0x007a }
            int r2 = r6.h     // Catch:{ all -> 0x007a }
            java.util.Set r4 = r6.f     // Catch:{ all -> 0x007a }
            int r4 = r4.size()     // Catch:{ all -> 0x007a }
            aucd r0 = r0.g     // Catch:{ all -> 0x007a }
            boolean r5 = r0.c     // Catch:{ all -> 0x007a }
            if (r5 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r0.c()     // Catch:{ all -> 0x007a }
            r0.c = r3     // Catch:{ all -> 0x007a }
        L_0x0028:
            aucj r0 = r0.b     // Catch:{ all -> 0x007a }
            anwi r0 = (defpackage.anwi) r0     // Catch:{ all -> 0x007a }
            anwi r5 = defpackage.anwi.d     // Catch:{ all -> 0x007a }
            int r5 = r0.a     // Catch:{ all -> 0x007a }
            r5 = r5 | r1
            r0.a = r5     // Catch:{ all -> 0x007a }
            r0.b = r2     // Catch:{ all -> 0x007a }
            r2 = r5 | 2
            r0.a = r2     // Catch:{ all -> 0x007a }
            r0.c = r4     // Catch:{ all -> 0x007a }
            r6.h = r3     // Catch:{ all -> 0x007a }
            java.util.Set r0 = r6.f     // Catch:{ all -> 0x007a }
            r0.clear()     // Catch:{ all -> 0x007a }
            etn r0 = new etn     // Catch:{ all -> 0x007a }
            r0.<init>()     // Catch:{ all -> 0x007a }
            r2 = 4
            r0.a((int) r2)     // Catch:{ all -> 0x007a }
            com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg r0 = r0.a()     // Catch:{ all -> 0x007a }
            etl r2 = r6.c     // Catch:{ all -> 0x007a }
            acwa r0 = r2.a(r0)     // Catch:{ all -> 0x007a }
            com.google.android.gms.common.api.Status r0 = defpackage.acqd.a((defpackage.acwa) r0)     // Catch:{ all -> 0x007a }
            boolean r2 = r0.c()     // Catch:{ all -> 0x007a }
            if (r2 != 0) goto L_0x006a
            iwd r2 = a     // Catch:{ all -> 0x007a }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r1[r3] = r0     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "error ending session %s"
            r2.e(r0, r1)     // Catch:{ all -> 0x007a }
        L_0x006a:
            android.content.BroadcastReceiver r0 = r6.k     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0078
            android.content.Context r1 = r6.i     // Catch:{ all -> 0x007a }
            r1.unregisterReceiver(r0)     // Catch:{ all -> 0x007a }
            r0 = 0
            r6.k = r0     // Catch:{ all -> 0x007a }
            monitor-exit(r6)
            return
        L_0x0078:
            monitor-exit(r6)
            return
        L_0x007a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpr.b():void");
    }

    public final void a(AccountTransferPayload accountTransferPayload) {
        a.a("Importing authenticator data", new Object[0]);
        AccountTransferMsg b2 = accountTransferPayload.b();
        if (b2 == null) {
            a("AccountTransferMsg is null");
            return;
        }
        etn etn = new etn();
        etn.a(3);
        etn.a(b2.e);
        etn.a(b2.c);
        Status a2 = acqd.a(this.c.a(etn.a()));
        a.a("importAccounts status = %s", a2);
        if (!a2.c()) {
            a("Failure importing data from target");
        }
    }

    public final void a(String str) {
        a.e(str, new Object[0]);
        this.b.a(10579, str);
    }
}
