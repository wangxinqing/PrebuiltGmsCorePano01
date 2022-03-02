package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.location.WifiScan;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.ulr.ApiBleRate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ajmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajmd extends ajlz {
    public final ajks b;
    private final ajls f;
    private FutureTask g;
    private final ahya h;
    private final jfv i = new jfv(1, 10);

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r0 = r0.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            java.util.concurrent.FutureTask r0 = r4.g
            if (r0 != 0) goto L_0x0005
            goto L_0x0011
        L_0x0005:
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L_0x0011
            java.util.concurrent.FutureTask r0 = r4.g
            r1 = 1
            r0.cancel(r1)
        L_0x0011:
            ajks r0 = r4.b
            if (r0 == 0) goto L_0x002f
            ajhf r0 = r0.k
            com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver r1 = r0.b
            if (r1 == 0) goto L_0x002f
            aoru r2 = r1.b
            r3 = 0
            if (r2 != 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            r2.shutdownNow()
            r1.b = r3
        L_0x0026:
            android.content.Context r1 = r0.c
            com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver r2 = r0.b
            r1.unregisterReceiver(r2)
            r0.b = r3
        L_0x002f:
            super.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmd.a():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ajmd(defpackage.ajme r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            jfp r2 = defpackage.ajme.a()
            java.lang.String r3 = "UlrDispSvcSlow"
            r0.<init>(r1, r2, r3)
            android.content.Context r2 = r1.b
            ajld r7 = defpackage.ajld.a((android.content.Context) r2)
            ajks r2 = new ajks
            android.content.Context r4 = r1.b
            ajmm r5 = r1.c
            ajmo r6 = r1.d
            ajii r15 = r1.m
            ajik r3 = r1.n
            ajim r14 = r1.o
            rom r13 = r1.f
            ajmn r12 = r1.e
            java.lang.String r8 = "ULR_HISTORIAN_STATE"
            r9 = 0
            android.content.SharedPreferences r11 = r4.getSharedPreferences(r8, r9)
            java.lang.String r8 = "connectivity"
            java.lang.Object r8 = r4.getSystemService(r8)
            r16 = r8
            android.net.ConnectivityManager r16 = (android.net.ConnectivityManager) r16
            java.lang.String r8 = "power"
            java.lang.Object r8 = r4.getSystemService(r8)
            android.os.PowerManager r8 = (android.os.PowerManager) r8
            ajhe r10 = new ajhe
            r10.<init>(r8)
            com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver r17 = new com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver
            r17.<init>()
            ajhf r18 = new ajhf
            r8 = r18
            r9 = r4
            r19 = r10
            r10 = r12
            r20 = r12
            r12 = r16
            r16 = r13
            r13 = r19
            r19 = r14
            r14 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.util.Random r14 = new java.util.Random
            long r8 = java.lang.System.currentTimeMillis()
            r14.<init>(r8)
            r9 = r3
            r3 = r2
            r8 = r15
            r10 = r19
            r11 = r16
            r12 = r20
            r13 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.b = r2
            android.content.Context r2 = r1.b
            ajls r2 = defpackage.ajls.a(r2)
            r0.f = r2
            android.content.Context r1 = r1.b
            ahxz r1 = defpackage.ahxz.a(r1)
            r0.h = r1
            jfv r1 = new jfv
            r2 = 1
            r3 = 10
            r1.<init>(r2, r3)
            r0.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmd.<init>(ajme):void");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        int i2 = ajme.v;
        int i3 = Build.VERSION.SDK_INT;
        String action = intent.getAction();
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("DispatchingService.Slow dispatching ");
        sb.append(valueOf);
        sb.toString();
        if ("com.google.android.location.reporting.UPLOAD".equals(action)) {
            FutureTask futureTask = this.g;
            if (futureTask != null && !futureTask.isDone()) {
                ajix.a("GCoreUlr", "Previous upload task still in progress");
                return;
            }
            long bS = aztb.a.a().bS();
            FutureTask futureTask2 = new FutureTask(new ajmc(this), (Object) null);
            this.g = futureTask2;
            this.i.execute(futureTask2);
            try {
                this.g.get(bS, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | CancellationException e) {
                ajix.b("GCoreUlr", "Upload task interrupted or cancelled", e);
                ajjb.a("UlrUploadTaskCancelled");
            } catch (TimeoutException e2) {
                StringBuilder sb2 = new StringBuilder(51);
                sb2.append("Upload task timed out after ");
                sb2.append(bS);
                sb2.append("ms ");
                ajix.b("GCoreUlr", sb2.toString(), (Throwable) e2);
                ajjb.a("UlrUploadTaskTimeout");
            } catch (ExecutionException e3) {
                ajix.a("GCoreUlr", 7, "Upload task exception", e3);
            }
        } else if ("com.google.android.location.reporting.ACTION_INSISTENT_SYNC".equals(action)) {
            Account a = ajmj.a(intent);
            if (a != null && azsg.a.a().a()) {
                Account account = new Account(ajnw.b(a.name), a.type);
                intent.putExtra("account", account);
                a = account;
            }
            if (a != null && this.h.a(a)) {
                ajls ajls = this.f;
                String stringExtra = intent.getStringExtra("label");
                Account account2 = (Account) intent.getParcelableExtra("account");
                Boolean a2 = ajls.a(intent, "reportingEnabled");
                Boolean a3 = ajls.a(intent, "historyEnabled");
                Boolean a4 = ajls.a(intent, "ulrRelatedSettingChange");
                try {
                    ajls.a(account2, a2, a3, a4.booleanValue(), intent.getStringExtra("auditToken"));
                } catch (babk | eif | IOException e4) {
                    ajix.a("GCoreUlr", "Insistent sync failed, requesting regular sync with retry", e4);
                    ReportingSyncChimeraService.a(account2, stringExtra, ajls.a);
                    ajjb.a("UlrSyncException");
                }
            } else {
                String valueOf2 = String.valueOf(rmp.a(a));
                ajix.b("GCoreUlr", 42, valueOf2.length() == 0 ? new String("Received sync request for invalid account: ") : "Received sync request for invalid account: ".concat(valueOf2));
            }
        } else {
            String valueOf3 = String.valueOf(intent);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
            sb3.append("Unsupported Slow action in ");
            sb3.append(valueOf3);
            ajix.c("GCoreUlr", 19, sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(WifiScan wifiScan) {
        ajix.b("GCoreUlr", (Throwable) new UnsupportedOperationException("DispatchingService.Slow unexpectedly received wifi scan"));
    }

    /* access modifiers changed from: protected */
    public final void a(ApiBleRate apiBleRate) {
        ajix.a("GCoreUlr", 18, (Throwable) new UnsupportedOperationException("DispatchingService.Slow unexpectedly received BLE rate changed"));
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        ajix.a("GCoreUlr", 18, (Throwable) new UnsupportedOperationException("DispatchingService.Slow unexpectedly received a BLE scan"));
    }
}
