package com.google.android.gms.ipa.base;

import android.provider.MediaStore;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IpaGcmTaskChimeraService extends qwf {
    private static final qvz a = new qvz(MediaStore.Files.getContentUri("external"), 1);
    private static final qvz b = new qvz(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, 1);
    private static final qvz c = (jkr.c() ? new qvz(qtp.c, 1) : null);

    private static qxj a(boolean z) {
        long seconds = TimeUnit.DAYS.toSeconds(axvz.p());
        long seconds2 = TimeUnit.HOURS.toSeconds(axvz.o());
        qxi qxi = new qxi();
        qxi.k = "MediaStoreCorporaMaintenance";
        qxi.a(axvz.r());
        qxi.a(2);
        qxi.a(1, 1);
        qxi.i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        qxi.b(z);
        if (!axcc.g()) {
            qxi.a = seconds;
            qxi.b = seconds2;
        } else {
            qxi.a(qxe.a(seconds));
        }
        return qxi.b();
    }

    private static qwb b() {
        qwa qwa = new qwa();
        qwa.k = "MediaStoreInstantIndexTask";
        qwa.i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        qwa.b(1);
        qwa.a(0, 0);
        qwa.a(a);
        if (axvz.e()) {
            qwa.a(b);
        }
        return qwa.b();
    }

    private static qwb c() {
        qwa qwa = new qwa();
        qwa.k = "SmsCorpusInstantIndexingTask";
        qwa.i = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        qwa.b(1);
        qwa.a(0, 0);
        qwa.a(c);
        return qwa.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r13) {
        /*
            qwq r0 = defpackage.qwq.a((android.content.Context) r13)
            boolean r1 = defpackage.qrc.a(r13)
            r2 = 0
            java.lang.String r3 = "com.google.android.gms.ipa.base.IpaGcmTaskService"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x00e2
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            boolean r1 = r1.T()
            java.lang.String r6 = "maintenance_task_config"
            java.lang.String r7 = "MediastoreIndexerSharedPrefs"
            if (r1 == 0) goto L_0x0056
            qrg r1 = new qrg
            android.content.SharedPreferences r8 = r13.getSharedPreferences(r7, r2)
            r1.<init>(r8)
            android.content.SharedPreferences r1 = r1.a
            java.lang.String r8 = ""
            java.lang.String r1 = r1.getString(r6, r8)
            long r8 = defpackage.axvz.p()
            long r10 = defpackage.axvz.o()
            boolean r12 = defpackage.axvz.r()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            java.lang.String r8 = defpackage.qrc.a(r8, r10, r12)
            if (r1 == 0) goto L_0x004d
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            qxj r1 = a((boolean) r2)
            r0.a((defpackage.qxx) r1)
            goto L_0x0088
        L_0x0056:
            qxj r1 = a((boolean) r5)
            r0.a((defpackage.qxx) r1)
            qrg r1 = new qrg
            android.content.SharedPreferences r7 = r13.getSharedPreferences(r7, r2)
            r1.<init>(r7)
            long r7 = defpackage.axvz.p()
            long r9 = defpackage.axvz.o()
            boolean r11 = defpackage.axvz.r()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r7 = defpackage.qrc.a(r7, r9, r11)
            android.content.SharedPreferences r1 = r1.a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putString(r6, r7)
            r1.commit()
        L_0x0088:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS
            axvz r6 = defpackage.axvz.a
            axwa r6 = r6.a()
            long r6 = r6.B()
            long r6 = r1.toSeconds(r6)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            axvz r8 = defpackage.axvz.a
            axwa r8 = r8.a()
            long r8 = r8.A()
            long r8 = r1.toSeconds(r8)
            qxi r1 = new qxi
            r1.<init>()
            java.lang.String r10 = "MediaStoreBatchIndexingTask"
            r1.k = r10
            axvz r10 = defpackage.axvz.a
            axwa r10 = r10.a()
            boolean r10 = r10.P()
            r1.a((boolean) r10)
            r1.a((int) r4)
            r1.a(r5, r5)
            r1.i = r3
            r1.b((int) r5)
            boolean r10 = defpackage.axcc.g()
            if (r10 != 0) goto L_0x00d4
            r1.a = r6
            r1.b = r8
            goto L_0x00db
        L_0x00d4:
            qxe r6 = defpackage.qxe.a(r6)
            r1.a(r6)
        L_0x00db:
            qxj r1 = r1.b()
            r0.a((defpackage.qxx) r1)
        L_0x00e2:
            boolean r1 = defpackage.qtp.a((android.content.Context) r13)
            if (r1 == 0) goto L_0x0184
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r6 = r1.Y()
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r8 = r1.X()
            qxi r1 = new qxi
            r1.<init>()
            java.lang.String r10 = "SmsCorpusUpdateIndexTask"
            r1.k = r10
            axvz r10 = defpackage.axvz.a
            axwa r10 = r10.a()
            boolean r10 = r10.S()
            r1.a((boolean) r10)
            r1.a((int) r4)
            r1.a(r5, r5)
            r1.i = r3
            r1.b((int) r5)
            boolean r10 = defpackage.axcc.g()
            if (r10 != 0) goto L_0x0128
            r1.a = r6
            r1.b = r8
            goto L_0x012f
        L_0x0128:
            qxe r6 = defpackage.qxe.a(r6)
            r1.a(r6)
        L_0x012f:
            qxj r1 = r1.b()
            r0.a((defpackage.qxx) r1)
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r6 = r1.V()
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r8 = r1.U()
            qxi r1 = new qxi
            r1.<init>()
            java.lang.String r10 = "SmsCorpusBatchIndexingTask"
            r1.k = r10
            axvz r10 = defpackage.axvz.a
            axwa r10 = r10.a()
            boolean r10 = r10.R()
            r1.a((boolean) r10)
            r1.a((int) r4)
            r1.a(r5, r5)
            r1.i = r3
            r1.b((int) r5)
            boolean r10 = defpackage.axcc.g()
            if (r10 != 0) goto L_0x0176
            r1.a = r6
            r1.b = r8
            goto L_0x017d
        L_0x0176:
            qxe r6 = defpackage.qxe.a(r6)
            r1.a(r6)
        L_0x017d:
            qxj r1 = r1.b()
            r0.a((defpackage.qxx) r1)
        L_0x0184:
            boolean r1 = defpackage.axvz.g()
            if (r1 == 0) goto L_0x01aa
            boolean r1 = defpackage.qrc.a(r13)
            if (r1 == 0) goto L_0x0197
            qwb r1 = b()
            r0.a((defpackage.qxx) r1)
        L_0x0197:
            boolean r1 = defpackage.jkr.c()
            if (r1 == 0) goto L_0x01aa
            boolean r13 = defpackage.qtp.a((android.content.Context) r13)
            if (r13 == 0) goto L_0x01aa
            qwb r13 = c()
            r0.a((defpackage.qxx) r13)
        L_0x01aa:
            boolean r13 = defpackage.axvz.d()
            if (r13 == 0) goto L_0x0262
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.HOURS
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r6 = r1.d()
            long r6 = r13.toSeconds(r6)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MINUTES
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r8 = r1.c()
            long r8 = r13.toSeconds(r8)
            qxi r13 = new qxi
            r13.<init>()
            r13.i = r3
            java.lang.String r1 = "AppsCorpusMaintenance"
            r13.k = r1
            r13.a((boolean) r5)
            r13.a((int) r4)
            r13.a(r5, r5)
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            boolean r1 = r1.O()
            r13.b((boolean) r1)
            boolean r1 = defpackage.axcc.g()
            if (r1 != 0) goto L_0x01fc
            r13.a = r6
            r13.b = r8
            goto L_0x0203
        L_0x01fc:
            qxe r1 = defpackage.qxe.a(r6)
            r13.a(r1)
        L_0x0203:
            qxj r13 = r13.b()
            r0.a((defpackage.qxx) r13)
            boolean r13 = defpackage.axvz.c()
            if (r13 == 0) goto L_0x0262
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.HOURS
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r6 = r1.b()
            long r6 = r13.toSeconds(r6)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MINUTES
            axvz r1 = defpackage.axvz.a
            axwa r1 = r1.a()
            long r8 = r1.a()
            long r8 = r13.toSeconds(r8)
            qxi r13 = new qxi
            r13.<init>()
            r13.i = r3
            java.lang.String r1 = "AppUsageReportGeneration"
            r13.k = r1
            boolean r1 = defpackage.axcc.c()
            r13.a(r2, r1)
            r13.a((int) r4)
            r13.b((int) r5)
            boolean r1 = defpackage.axcc.g()
            if (r1 != 0) goto L_0x0253
            r13.a = r6
            r13.b = r8
            goto L_0x025a
        L_0x0253:
            qxe r1 = defpackage.qxe.a(r6)
            r13.a(r1)
        L_0x025a:
            qxj r13 = r13.b()
            r0.a((defpackage.qxx) r13)
            return
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ipa.base.IpaGcmTaskChimeraService.a(android.content.Context):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r4) {
        /*
            r3 = this;
            java.lang.String r4 = r4.a
            int r0 = r4.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -1952457874: goto L_0x0052;
                case -1102736980: goto L_0x0048;
                case -636879915: goto L_0x003e;
                case -245101092: goto L_0x0034;
                case 420331021: goto L_0x002a;
                case 1884131794: goto L_0x0020;
                case 1994427955: goto L_0x0016;
                case 2117151161: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x005c
        L_0x000c:
            java.lang.String r0 = "AppsCorpusMaintenance"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 6
            goto L_0x005d
        L_0x0016:
            java.lang.String r0 = "MediaStoreInstantIndexTask"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 2
            goto L_0x005d
        L_0x0020:
            java.lang.String r0 = "MediaStoreBatchIndexingTask"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x002a:
            java.lang.String r0 = "SmsCorpusUpdateIndexTask"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 5
            goto L_0x005d
        L_0x0034:
            java.lang.String r0 = "MediaStoreCorporaMaintenance"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 0
            goto L_0x005d
        L_0x003e:
            java.lang.String r0 = "SmsCorpusInstantIndexingTask"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 3
            goto L_0x005d
        L_0x0048:
            java.lang.String r0 = "AppUsageReportGeneration"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 7
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "SmsCorpusBatchIndexingTask"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 4
            goto L_0x005d
        L_0x005c:
            r0 = -1
        L_0x005d:
            switch(r0) {
                case 0: goto L_0x011e;
                case 1: goto L_0x0112;
                case 2: goto L_0x00dd;
                case 3: goto L_0x009d;
                case 4: goto L_0x0092;
                case 5: goto L_0x0087;
                case 6: goto L_0x0079;
                case 7: goto L_0x006b;
                default: goto L_0x0060;
            }
        L_0x0060:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r4
            java.lang.String r4 = "Unrecognized task tag: %s"
            defpackage.qoi.c(r4, r0)
            goto L_0x0129
        L_0x006b:
            qok r4 = defpackage.qok.a()
            qob r0 = new qob
            r0.<init>(r3)
            r4.a(r0)
            goto L_0x0129
        L_0x0079:
            qok r4 = defpackage.qok.a()
            qoa r0 = new qoa
            r0.<init>(r3)
            r4.a(r0)
            goto L_0x0129
        L_0x0087:
            qtp r4 = defpackage.qtp.c(r3)
            if (r4 == 0) goto L_0x0129
            r4.a((boolean) r2, (boolean) r2)
            goto L_0x0129
        L_0x0092:
            qtp r4 = defpackage.qtp.c(r3)
            if (r4 == 0) goto L_0x0129
            r4.a((boolean) r1, (boolean) r2)
            goto L_0x0129
        L_0x009d:
            defpackage.qtj.c(r3)     // Catch:{ all -> 0x00be }
            boolean r4 = defpackage.jkr.c()
            if (r4 == 0) goto L_0x0129
            boolean r4 = defpackage.axvz.g()
            if (r4 == 0) goto L_0x0129
            boolean r4 = defpackage.qtp.a((android.content.Context) r3)
            if (r4 == 0) goto L_0x0129
            qwq r4 = defpackage.qwq.a((android.content.Context) r3)
            qwb r0 = c()
            r4.a((defpackage.qxx) r0)
            goto L_0x0129
        L_0x00be:
            r4 = move-exception
            boolean r0 = defpackage.jkr.c()
            if (r0 == 0) goto L_0x00dc
            boolean r0 = defpackage.axvz.g()
            if (r0 == 0) goto L_0x00dc
            boolean r0 = defpackage.qtp.a((android.content.Context) r3)
            if (r0 == 0) goto L_0x00dc
            qwq r0 = defpackage.qwq.a((android.content.Context) r3)
            qwb r1 = c()
            r0.a((defpackage.qxx) r1)
        L_0x00dc:
            throw r4
        L_0x00dd:
            defpackage.qqb.a(r3)     // Catch:{ all -> 0x00f8 }
            qwq r4 = defpackage.qwq.a((android.content.Context) r3)
            boolean r0 = defpackage.axvz.g()
            if (r0 == 0) goto L_0x0129
            boolean r0 = defpackage.axvz.i()
            if (r0 == 0) goto L_0x0129
            qwb r0 = b()
            r4.a((defpackage.qxx) r0)
            goto L_0x0129
        L_0x00f8:
            r4 = move-exception
            qwq r0 = defpackage.qwq.a((android.content.Context) r3)
            boolean r1 = defpackage.axvz.g()
            if (r1 == 0) goto L_0x0111
            boolean r1 = defpackage.axvz.i()
            if (r1 != 0) goto L_0x010a
            goto L_0x0111
        L_0x010a:
            qwb r1 = b()
            r0.a((defpackage.qxx) r1)
        L_0x0111:
            throw r4
        L_0x0112:
            java.lang.Class<com.google.android.gms.ipa.mediastoreindexer.BatchIndexingIntentOperation> r4 = com.google.android.gms.ipa.mediastoreindexer.BatchIndexingIntentOperation.class
            java.lang.String r0 = "com.google.android.gms.ipa.mediastoreindexer.BATCH_INDEX"
            android.content.Intent r4 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r3, (java.lang.Class) r4, (java.lang.String) r0)
            r3.startService(r4)
            goto L_0x0129
        L_0x011e:
            java.lang.Class<com.google.android.gms.ipa.mediastoreindexer.CorporaMaintenanceIntentOperation> r4 = com.google.android.gms.ipa.mediastoreindexer.CorporaMaintenanceIntentOperation.class
            java.lang.String r0 = "com.google.android.gms.ipa.mediastoreindexer.REINDEX"
            android.content.Intent r4 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r3, (java.lang.Class) r4, (java.lang.String) r0)
            r3.startService(r4)
        L_0x0129:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ipa.base.IpaGcmTaskChimeraService.a(qxz):int");
    }
}
