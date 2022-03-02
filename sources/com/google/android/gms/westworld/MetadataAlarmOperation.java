package com.google.android.gms.westworld;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MetadataAlarmOperation extends IntentOperation {
    static synchronized void a(Context context, hph hph) {
        Class<MetadataAlarmOperation> cls = MetadataAlarmOperation.class;
        synchronized (cls) {
            hph.c("MetadataAlarmSet").a();
            jbs jbs = new jbs(context);
            PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, (Class) cls, new Intent("com.google.android.gms.westworld.action.METADATA_ALARM"), 0, 134217728);
            long c = azwc.a.a().c();
            jbs.a("WestworldPoll", 3, SystemClock.elapsedRealtime() + c, c, pendingIntent, "com.google.android.gms.westworld");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r1.d != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008f, code lost:
        if (defpackage.aecq.b(r1, r3) != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r9) {
        /*
            r8 = this;
            boolean r9 = defpackage.aecm.a()
            if (r9 != 0) goto L_0x0136
            ihs r9 = defpackage.ihs.b()
            hph r0 = defpackage.aecq.f(r9)
            java.lang.String r1 = "MetadataAlarmOperation"
            hox r1 = r0.c(r1)     // Catch:{ all -> 0x0131 }
            r1.a()     // Catch:{ all -> 0x0131 }
            boolean r1 = defpackage.azvd.b()     // Catch:{ all -> 0x0131 }
            r2 = 0
            if (r1 == 0) goto L_0x002e
            ihs r1 = defpackage.ihs.b()     // Catch:{ all -> 0x0131 }
            adry r3 = new adry     // Catch:{ all -> 0x0131 }
            r3.<init>()     // Catch:{ all -> 0x0131 }
            iby r1 = defpackage.adrz.a(r1, r3)     // Catch:{ all -> 0x0131 }
            r3 = r1
            r1 = r2
            goto L_0x0037
        L_0x002e:
            ihs r1 = defpackage.ihs.b()     // Catch:{ all -> 0x0131 }
            aupy r1 = defpackage.aecq.a((android.content.Context) r1)     // Catch:{ all -> 0x0131 }
            r3 = r2
        L_0x0037:
            boolean r4 = defpackage.azwv.h()     // Catch:{ all -> 0x0131 }
            r5 = 0
            if (r4 == 0) goto L_0x007f
            boolean r4 = defpackage.azwv.i()     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x012c
            boolean r4 = defpackage.azuo.b()     // Catch:{ all -> 0x0131 }
            if (r4 != 0) goto L_0x004c
            goto L_0x012c
        L_0x004c:
            if (r3 == 0) goto L_0x0059
            java.lang.String r4 = defpackage.azwv.l()     // Catch:{ all -> 0x0131 }
            boolean r4 = defpackage.aecq.a((defpackage.iby) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x012c
            goto L_0x0091
        L_0x0059:
            boolean r4 = defpackage.azux.b()     // Catch:{ all -> 0x0131 }
            r6 = 1
            if (r4 == 0) goto L_0x0069
            boolean r4 = r1.c     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0072
            boolean r4 = r1.b     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0072
            goto L_0x0071
        L_0x0069:
            boolean r4 = r1.c     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0072
            boolean r4 = r1.d     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0072
        L_0x0071:
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            boolean r4 = r1.e     // Catch:{ all -> 0x0131 }
            if (r4 != 0) goto L_0x0091
            boolean r4 = r1.b     // Catch:{ all -> 0x0131 }
            if (r4 != 0) goto L_0x0091
            if (r6 != 0) goto L_0x0091
            goto L_0x012c
        L_0x007f:
            boolean r4 = defpackage.azwv.i()     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x012c
            boolean r4 = defpackage.azuo.b()     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x012c
            boolean r4 = defpackage.aecq.b(r1, r3)     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x012c
        L_0x0091:
            java.lang.String r4 = "MetadataCanCollect"
            hox r4 = r0.c(r4)     // Catch:{ all -> 0x0131 }
            r4.a()     // Catch:{ all -> 0x0131 }
            java.lang.String r4 = "stats"
            java.lang.Object r4 = r9.getSystemService(r4)     // Catch:{ all -> 0x0131 }
            android.app.StatsManager r4 = (android.app.StatsManager) r4     // Catch:{ all -> 0x0131 }
            if (r4 != 0) goto L_0x00b1
            java.lang.String r9 = "MetadataFailedStatsmanager"
            hox r9 = r0.c(r9)     // Catch:{ all -> 0x0131 }
            r9.a()     // Catch:{ all -> 0x0131 }
        L_0x00ad:
            r0.d()
            return
        L_0x00b1:
            byte[] r4 = r4.getStatsMetadata()     // Catch:{ StatsUnavailableException -> 0x0121 }
            if (r4 != 0) goto L_0x00b8
            goto L_0x0117
        L_0x00b8:
            int r6 = r4.length     // Catch:{ all -> 0x0131 }
            if (r6 == 0) goto L_0x0117
            auqa r6 = defpackage.auqa.g     // Catch:{ all -> 0x0131 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x0131 }
            auay r4 = defpackage.auay.a((byte[]) r4)     // Catch:{ all -> 0x0131 }
            boolean r7 = r6.c     // Catch:{ all -> 0x0131 }
            if (r7 != 0) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            r6.c()     // Catch:{ all -> 0x0131 }
            r6.c = r5     // Catch:{ all -> 0x0131 }
        L_0x00cf:
            aucj r5 = r6.b     // Catch:{ all -> 0x0131 }
            auqa r5 = (defpackage.auqa) r5     // Catch:{ all -> 0x0131 }
            r4.getClass()     // Catch:{ all -> 0x0131 }
            r7 = 2
            r5.b = r7     // Catch:{ all -> 0x0131 }
            r5.c = r4     // Catch:{ all -> 0x0131 }
            java.lang.String r4 = "MetadataUploaded"
            hox r4 = r0.c(r4)     // Catch:{ all -> 0x0131 }
            r4.a()     // Catch:{ all -> 0x0131 }
            if (r3 == 0) goto L_0x0101
            java.lang.String r1 = defpackage.azwv.l()     // Catch:{ all -> 0x0131 }
            aucj r2 = r6.i()     // Catch:{ all -> 0x0131 }
            auqa r2 = (defpackage.auqa) r2     // Catch:{ all -> 0x0131 }
            byte[] r2 = r2.k()     // Catch:{ all -> 0x0131 }
            adsa r4 = defpackage.aecq.a()     // Catch:{ all -> 0x0131 }
            long r5 = defpackage.azvz.b()     // Catch:{ all -> 0x0131 }
            int r6 = (int) r5     // Catch:{ all -> 0x0131 }
            r3.a((java.lang.String) r1, (byte[]) r2, (defpackage.adsa) r4, (int) r6)     // Catch:{ all -> 0x0131 }
            goto L_0x012c
        L_0x0101:
            hol r4 = defpackage.aecq.d     // Catch:{ all -> 0x0131 }
            if (r4 == 0) goto L_0x0106
            goto L_0x0111
        L_0x0106:
            hol r4 = new hol     // Catch:{ all -> 0x0131 }
            java.lang.String r5 = defpackage.azwv.l()     // Catch:{ all -> 0x0131 }
            r4.<init>(r9, r5, r2)     // Catch:{ all -> 0x0131 }
            defpackage.aecq.d = r4     // Catch:{ all -> 0x0131 }
        L_0x0111:
            hol r2 = defpackage.aecq.d     // Catch:{ all -> 0x0131 }
            defpackage.aecq.a(r3, r2, r1, r0, r6)     // Catch:{ all -> 0x0131 }
            goto L_0x012c
        L_0x0117:
            java.lang.String r9 = "MetadataEmpty"
            hox r9 = r0.c(r9)     // Catch:{ all -> 0x0131 }
            r9.a()     // Catch:{ all -> 0x0131 }
            goto L_0x00ad
        L_0x0121:
            r9 = move-exception
            java.lang.String r9 = "MetadataFailedUnavailable"
            hox r9 = r0.c(r9)     // Catch:{ all -> 0x0131 }
            r9.a()     // Catch:{ all -> 0x0131 }
            goto L_0x00ad
        L_0x012c:
            a(r9, r0)     // Catch:{ all -> 0x0131 }
            goto L_0x00ad
        L_0x0131:
            r9 = move-exception
            r0.d()
            throw r9
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.westworld.MetadataAlarmOperation.onHandleIntent(android.content.Intent):void");
    }
}
