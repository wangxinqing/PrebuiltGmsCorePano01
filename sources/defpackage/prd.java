package defpackage;

import android.content.Intent;
import com.google.android.gms.icing.service.IndexWorkerChimeraService;

/* renamed from: prd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prd extends ppr {
    final /* synthetic */ Intent a;
    final /* synthetic */ IndexWorkerChimeraService b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public prd(IndexWorkerChimeraService indexWorkerChimeraService, aonk aonk, Intent intent) {
        super(aonk, 1);
        this.b = indexWorkerChimeraService;
        this.a = intent;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f1, code lost:
        if (r4.equals("update-app-params") != false) goto L_0x0231;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r24 = this;
            r1 = r24
            android.content.Intent r0 = r1.a
            r2 = 0
            if (r0 == 0) goto L_0x0629
            java.lang.String r0 = r0.getAction()
            com.google.android.gms.icing.service.IndexWorkerChimeraService r3 = r1.b
            prm r3 = r3.b
            ppp r3 = r3.c
            if (r0 == 0) goto L_0x0629
            java.lang.String r4 = "com.google.android.gms.icing.INDEX_SERVICE"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0022
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            r0.a()
            goto L_0x0629
        L_0x0022:
            android.content.Intent r4 = r1.a
            java.lang.String r4 = r4.getAction()
            java.lang.String r5 = "android.intent.action.PACKAGE_ADDED"
            boolean r5 = r4.equals(r5)
            java.lang.String r6 = "Couldn't handle %s intent due to initialization failure."
            if (r5 != 0) goto L_0x05a5
            java.lang.String r5 = "android.intent.action.PACKAGE_REPLACED"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x05a5
            java.lang.String r5 = "android.intent.action.PACKAGE_CHANGED"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x05a5
            java.lang.String r5 = "android.intent.action.PACKAGE_DATA_CLEARED"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x05a5
            java.lang.String r5 = "android.intent.action.PACKAGE_REMOVED"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0054
            goto L_0x05a5
        L_0x0054:
            java.lang.String r4 = "android.intent.action.BOOT_COMPLETED"
            boolean r4 = r0.equals(r4)
            r5 = 0
            if (r4 != 0) goto L_0x0563
            java.lang.String r4 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r7 = r0.equals(r4)
            if (r7 != 0) goto L_0x048c
            java.lang.String r7 = "com.google.android.gms.phenotype.COMMITTED"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x048c
            java.lang.String r7 = com.google.android.gms.icing.service.SystemEventIntentOperation.a
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x048c
            java.lang.String r7 = com.google.android.gms.icing.service.SystemEventIntentOperation.b
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0080
            goto L_0x048c
        L_0x0080:
            java.lang.String r4 = "android.intent.action.LOCALE_CHANGED"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00bb
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            osf r0 = r0.a()
            android.content.Context r3 = r0.b
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            java.util.Locale r3 = r3.locale
            java.lang.String r3 = r3.getLanguage()
            boolean r4 = r0.d()
            if (r4 == 0) goto L_0x00b3
            ppp r4 = r0.c
            oru r5 = new oru
            aonk r6 = defpackage.aonk.REPARSE_GLOBAL_SEARCH_SECTION_MAPPINGS
            r5.<init>(r0, r6, r3)
            r4.d(r5)
            goto L_0x0629
        L_0x00b3:
            java.lang.String r0 = "Global Search Section Mappings reparsing skipped because init failed"
            defpackage.oso.b(r0)
            goto L_0x0629
        L_0x00bb:
            java.lang.String r4 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r7 = r0.equals(r4)
            java.lang.String r8 = "android.intent.action.DEVICE_STORAGE_OK"
            if (r7 != 0) goto L_0x041c
            boolean r7 = r0.equals(r8)
            if (r7 == 0) goto L_0x00ce
            goto L_0x041c
        L_0x00ce:
            java.lang.String r4 = "com.google.android.gms.icing.INDEX_CONTENT_PROVIDER"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x010a
            android.content.Intent r0 = r1.a
            android.os.Bundle r0 = r0.getExtras()
            r3 = -1
            if (r0 == 0) goto L_0x00e8
            java.lang.String r5 = "delay"
            long r5 = r0.getLong(r5, r3)
            goto L_0x00e9
        L_0x00e8:
            r5 = r3
        L_0x00e9:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0101
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            osf r0 = r0.a()
            ppp r3 = r0.c
            orq r4 = new orq
            aonk r7 = defpackage.aonk.RETRY_FAILED_INDEXING_CORPORA
            r4.<init>(r0, r7, r5)
            r3.d(r4)
            goto L_0x0629
        L_0x0101:
            android.content.Intent r0 = r1.a
            java.lang.String r3 = "Received invalid intent: %s"
            defpackage.oso.b((java.lang.String) r3, (java.lang.Object) r0)
            goto L_0x0629
        L_0x010a:
            java.lang.String r4 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01b8
            boolean r0 = defpackage.axsp.e()
            java.lang.String r4 = "Gcm message parse failed: %s"
            if (r0 != 0) goto L_0x0144
            android.content.Intent r0 = r1.a
            byte[] r0 = com.google.android.gms.icing.GcmReceiverChimeraService.a(r0)
            if (r0 == 0) goto L_0x0629
            aubs r3 = defpackage.aubs.c()     // Catch:{ auda -> 0x013a }
            pqz r5 = defpackage.pqz.d     // Catch:{ auda -> 0x013a }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r0, (defpackage.aubs) r3)     // Catch:{ auda -> 0x013a }
            pqz r0 = (defpackage.pqz) r0     // Catch:{ auda -> 0x013a }
            com.google.android.gms.icing.service.IndexWorkerChimeraService r3 = r1.b
            osf r3 = r3.a()
            r3.a((defpackage.pqz) r0)
            goto L_0x0629
        L_0x013a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            defpackage.oso.b((java.lang.String) r4, (java.lang.Object) r0)
            goto L_0x0629
        L_0x0144:
            com.google.android.gms.icing.service.IndexWorkerChimeraService r5 = r1.b
            android.content.Intent r6 = r1.a
            java.lang.String r0 = "icing-gcm-msg-base64"
            boolean r0 = r6.hasExtra(r0)
            if (r0 == 0) goto L_0x0176
            byte[] r0 = com.google.android.gms.icing.GcmReceiverChimeraService.a(r6)
            if (r0 == 0) goto L_0x0176
            aubs r7 = defpackage.aubs.c()     // Catch:{ auda -> 0x0163 }
            pqz r8 = defpackage.pqz.d     // Catch:{ auda -> 0x0163 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r8, (byte[]) r0, (defpackage.aubs) r7)     // Catch:{ auda -> 0x0163 }
            pqz r0 = (defpackage.pqz) r0     // Catch:{ auda -> 0x0163 }
            goto L_0x016c
        L_0x0163:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            defpackage.oso.b((java.lang.String) r4, (java.lang.Object) r0)
            r0 = r2
        L_0x016c:
            if (r0 != 0) goto L_0x016f
            goto L_0x0176
        L_0x016f:
            osf r4 = r5.a()
            r4.a((defpackage.pqz) r0)
        L_0x0176:
            java.lang.String r0 = "icing-fpop-user-actions-base64"
            boolean r4 = r6.hasExtra(r0)
            if (r4 == 0) goto L_0x0629
            byte[] r0 = com.google.android.gms.icing.GcmReceiverChimeraService.a(r6, r0)
            auay r14 = defpackage.auay.a((byte[]) r0)
            if (r14 == 0) goto L_0x0629
            osf r9 = r5.a()
            boolean r0 = r9.d()
            if (r0 == 0) goto L_0x01b0
            pst r0 = new pst
            android.content.Context r7 = r9.b
            pas r8 = r9.t
            com.google.android.gms.icing.nativeindex.NativeIndex r10 = r9.n
            ozs r11 = r9.a()
            oyt r12 = r9.n()
            oyq r13 = r9.r
            agpk r15 = r9.v
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3.d(r0)
            goto L_0x0629
        L_0x01b0:
            java.lang.String r0 = "Unable to run ActionDeletionsPushTask because of IndexManager initialization failure"
            defpackage.oso.b(r0)
            goto L_0x0629
        L_0x01b8:
            java.lang.String r4 = "com.google.android.gms.icing.GCM_TASK"
            boolean r4 = r0.equals(r4)
            r6 = 1
            if (r4 == 0) goto L_0x032a
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            osf r0 = r0.a()
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x01d5
            java.lang.String r0 = "Couldn't run gcm task due to initialization failure"
            defpackage.oso.e(r0)
            goto L_0x0629
        L_0x01d5:
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            android.content.Intent r4 = r1.a
            osf r15 = r0.a()
            java.lang.String r7 = "tag"
            java.lang.String r4 = r4.getStringExtra(r7)
            int r7 = r4.hashCode()
            switch(r7) {
                case -1038446582: goto L_0x0226;
                case -377711994: goto L_0x021c;
                case 216563530: goto L_0x0212;
                case 317649683: goto L_0x0208;
                case 526899711: goto L_0x01fe;
                case 1470091582: goto L_0x01f4;
                case 1984331318: goto L_0x01eb;
                default: goto L_0x01ea;
            }
        L_0x01ea:
            goto L_0x0230
        L_0x01eb:
            java.lang.String r6 = "update-app-params"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0230
            goto L_0x0231
        L_0x01f4:
            java.lang.String r5 = "drain-request-queue"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0230
            r5 = 3
            goto L_0x0231
        L_0x01fe:
            java.lang.String r5 = "Maintenance.BatchDownload.24h"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0230
            r5 = 5
            goto L_0x0231
        L_0x0208:
            java.lang.String r5 = "maintenance"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0230
            r5 = 4
            goto L_0x0231
        L_0x0212:
            java.lang.String r5 = "Maintenance.BatchProcessing.24h"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0230
            r5 = 6
            goto L_0x0231
        L_0x021c:
            java.lang.String r5 = "app-history-upload"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0230
            r5 = 1
            goto L_0x0231
        L_0x0226:
            java.lang.String r5 = "action-deletions-download-push-triggered"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0230
            r5 = 2
            goto L_0x0231
        L_0x0230:
            r5 = -1
        L_0x0231:
            switch(r5) {
                case 0: goto L_0x0306;
                case 1: goto L_0x02df;
                case 2: goto L_0x02b2;
                case 3: goto L_0x02a9;
                case 4: goto L_0x026a;
                case 5: goto L_0x0243;
                case 6: goto L_0x023b;
                default: goto L_0x0234;
            }
        L_0x0234:
            java.lang.String r0 = "Received unexpected gcm tag: %s"
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r4)
            goto L_0x0629
        L_0x023b:
            java.lang.String r0 = "No tasks to execute in maintenance window: %s"
            defpackage.oso.a((java.lang.String) r0, (java.lang.Object) r4)
            goto L_0x0629
        L_0x0243:
            boolean r0 = defpackage.axsp.e()
            if (r0 == 0) goto L_0x0629
            psk r0 = new psk
            android.content.Context r8 = r15.b
            pas r9 = r15.t
            com.google.android.gms.icing.nativeindex.NativeIndex r11 = r15.n
            ozs r12 = r15.a()
            oyt r13 = r15.n()
            oyq r14 = r15.r
            agpk r4 = r15.v
            agpa r16 = defpackage.agpa.PERIODIC_SYNC
            r7 = r0
            r10 = r15
            r15 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.d(r0)
            goto L_0x0629
        L_0x026a:
            java.lang.String r4 = "IndexWorkerChimeraService: starting maintenance"
            defpackage.oso.a(r4)
            boolean r4 = defpackage.axrm.b()
            if (r4 == 0) goto L_0x0281
            android.content.Context r4 = r0.getApplicationContext()
            psd r4 = defpackage.psd.a(r4)
            r4.a()
        L_0x0281:
            osf r4 = r0.a()
            r4.h()
            oxg r4 = new oxg
            osf r0 = r0.a()
            r4.<init>(r0)
            r3.d(r4)
            agvx r0 = defpackage.ozx.b
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0629
            android.content.Context r0 = r15.b
            defpackage.pnm.c(r0)
            goto L_0x0629
        L_0x02a9:
            owf r0 = r15.q
            if (r0 == 0) goto L_0x0629
            r0.b()
            goto L_0x0629
        L_0x02b2:
            boolean r0 = defpackage.axsp.e()
            if (r0 == 0) goto L_0x0629
            boolean r0 = defpackage.axsp.d()
            if (r0 == 0) goto L_0x0629
            psk r0 = new psk
            android.content.Context r8 = r15.b
            pas r9 = r15.t
            com.google.android.gms.icing.nativeindex.NativeIndex r11 = r15.n
            ozs r12 = r15.a()
            oyt r13 = r15.n()
            oyq r14 = r15.r
            agpk r4 = r15.v
            agpa r16 = defpackage.agpa.CHANGE_NOTIFICATION
            r7 = r0
            r10 = r15
            r15 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.d(r0)
            goto L_0x0629
        L_0x02df:
            opx r0 = new opx
            android.content.Context r8 = r15.b
            prp r9 = r15.g
            ozs r10 = r15.a()
            ozb r11 = r15.m
            pas r12 = r15.t
            com.google.android.gms.icing.nativeindex.NativeIndex r13 = r15.n
            oyq r14 = r15.r
            oyt r16 = r15.n()
            agtt r4 = r15.u
            agpk r5 = r15.v
            r7 = r0
            r17 = r4
            r18 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.d(r0)
            goto L_0x0629
        L_0x0306:
            aamd r0 = new aamd
            android.content.Context r4 = r15.b
            prp r5 = r15.g
            ozs r20 = r15.a()
            ozb r6 = r15.m
            pas r7 = r15.t
            pqf r8 = r15.e
            r17 = r0
            r18 = r4
            r19 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r3.d(r0)
            goto L_0x0629
        L_0x032a:
            java.lang.String r3 = "com.google.android.gms.chimera.container.CONTAINER_UPDATED"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x034c
            java.lang.String r3 = "com.google.android.chimera.IntentOperation.NEW_MODULE"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x034c
            java.lang.String r3 = "android.intent.action.MY_PACKAGE_REPLACED"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0344
            goto L_0x034c
        L_0x0344:
            java.lang.String r3 = "Received unexpected intent: %s"
            defpackage.oso.b((java.lang.String) r3, (java.lang.Object) r0)
            goto L_0x0629
        L_0x034c:
            boolean r0 = defpackage.axsd.d()
            if (r0 == 0) goto L_0x03e3
            java.io.File r0 = new java.io.File
            com.google.android.gms.icing.service.IndexWorkerChimeraService r3 = r1.b
            osf r3 = r3.a()
            android.content.Context r3 = r3.b
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r4 = "unpacked/shared/cld3model/cld3-model-0001"
            r0.<init>(r3, r4)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x03e3
            java.io.File r0 = r0.getParentFile()
            defpackage.jjc.a((java.io.File) r0)
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            osf r0 = r0.a()
            android.content.Context r0 = r0.b
            java.io.File r3 = new java.io.File
            java.io.File r5 = r0.getFilesDir()
            java.lang.String r5 = r5.getAbsolutePath()
            r3.<init>(r5, r4)
            java.lang.String r4 = "cld3model/gmscore_model.smfb"
            boolean r5 = r3.exists()
            if (r5 != 0) goto L_0x03e0
            java.io.File r5 = r3.getParentFile()     // Catch:{ IOException -> 0x03d6 }
            if (r5 != 0) goto L_0x0396
            goto L_0x03ca
        L_0x0396:
            boolean r7 = r5.exists()     // Catch:{ IOException -> 0x03d6 }
            if (r7 != 0) goto L_0x03ca
            boolean r7 = r5.mkdirs()     // Catch:{ IOException -> 0x03d6 }
            if (r7 != 0) goto L_0x03ca
            java.lang.String r0 = r5.getPath()     // Catch:{ IOException -> 0x03d6 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x03d6 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x03d6 }
            int r4 = r4 + 44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03d6 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x03d6 }
            java.lang.String r4 = "Unable to create parent directory "
            r5.append(r4)     // Catch:{ IOException -> 0x03d6 }
            r5.append(r0)     // Catch:{ IOException -> 0x03d6 }
            java.lang.String r0 = " for asset"
            r5.append(r0)     // Catch:{ IOException -> 0x03d6 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x03d6 }
            defpackage.oso.b(r0)     // Catch:{ IOException -> 0x03d6 }
            goto L_0x03e3
        L_0x03ca:
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x03d6 }
            java.io.InputStream r0 = r0.open(r4)     // Catch:{ IOException -> 0x03d6 }
            defpackage.jjc.a((java.io.InputStream) r0, (java.io.File) r3)     // Catch:{ IOException -> 0x03d6 }
            goto L_0x03e0
        L_0x03d6:
            r0 = move-exception
            java.lang.String r4 = "Unable to open asset cld3model/gmscore_model.smfb"
            defpackage.oso.a((java.lang.Throwable) r0, (java.lang.String) r4)
            r3.delete()
            goto L_0x03e3
        L_0x03e0:
            r3.getAbsolutePath()
        L_0x03e3:
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            java.lang.String r3 = "package replaced"
            r0.a(r3)
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            qwq r0 = r0.b()
            com.google.android.gms.icing.appindexing.service.PeriodicRebuildIndexChimeraService.a(r0)
            java.lang.String r0 = "Registering phenotype on container/module update."
            defpackage.oso.a(r0)
            boolean r0 = defpackage.axrm.b()
            if (r0 == 0) goto L_0x040b
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            android.content.Context r0 = r0.getApplicationContext()
            psd r0 = defpackage.psd.a(r0)
            r0.a()
        L_0x040b:
            java.lang.String r0 = "Registering IDD GCM Tasks on container/module update."
            defpackage.oso.a(r0)
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            qwq r0 = r0.b()
            defpackage.osp.a(r0, r6)
            goto L_0x0629
        L_0x041c:
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            osf r0 = r0.a()
            android.content.Intent r3 = r1.a
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 23
            r9.<init>(r7)
            java.lang.String r7 = "Got storage broadcast: "
            r9.append(r7)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            defpackage.oso.a(r5)
            java.lang.String r3 = r3.getAction()
            boolean r5 = r0.d()
            if (r5 != 0) goto L_0x0455
            defpackage.oso.e((java.lang.String) r6, (java.lang.Object) r3)
            goto L_0x0629
        L_0x0455:
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0629
            boolean r4 = r8.equals(r3)
            if (r4 == 0) goto L_0x0470
            ppp r3 = r0.c
            osc r4 = new osc
            aonk r5 = defpackage.aonk.HANDLE_DEVICE_STORAGE_OK
            r4.<init>(r0, r5)
            r3.d(r4)
            goto L_0x0629
        L_0x0470:
            paw r0 = new paw
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Unknown intent action "
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0484
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0488
        L_0x0484:
            java.lang.String r2 = r3.concat(r2)
        L_0x0488:
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x048c:
            java.lang.String r3 = "Received config update event: "
            int r5 = r0.length()
            if (r5 != 0) goto L_0x049a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            goto L_0x049e
        L_0x049a:
            java.lang.String r5 = r3.concat(r0)
        L_0x049e:
            defpackage.oso.d(r5)
            boolean r3 = r0.equals(r4)
            if (r3 != 0) goto L_0x04f0
            android.content.Intent r3 = r1.a
            java.lang.String r4 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r5 = "com.google.android.gms.icing"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x04b8
            goto L_0x04f0
        L_0x04b8:
            android.content.Intent r3 = r1.a
            java.lang.String r3 = r3.getStringExtra(r4)
            int r4 = r0.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 35
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "Action '"
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = "' intended for '"
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = "', ignoring"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            defpackage.oso.d(r0)
            goto L_0x0629
        L_0x04f0:
            int r3 = r0.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 40
            r4.<init>(r3)
            java.lang.String r3 = "Processing config change triggered by '"
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = "'"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            defpackage.oso.d(r0)
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            osf r0 = r0.a()
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x0521
            java.lang.String r3 = "Couldn't handle GServices change due to initialization failure"
            defpackage.oso.e(r3)
            goto L_0x052d
        L_0x0521:
            ppp r3 = r0.c
            ori r4 = new ori
            aonk r5 = defpackage.aonk.HANDLE_GSERVICES_CHANGED
            r4.<init>(r0, r5)
            r3.d(r4)
        L_0x052d:
            android.content.Context r0 = r0.b
            com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateChimeraService.a((android.content.Context) r0)
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            agvx r3 = defpackage.ozx.a
            java.lang.Object r3 = r3.c()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            android.content.SharedPreferences r0 = r0.c()
            r5 = 0
            java.lang.String r7 = "maintenance_frequency_ms"
            long r5 = r0.getLong(r7, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0629
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putLong(r7, r3)
            r0.apply()
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            java.lang.String r3 = "GserviceValue changed"
            r0.a(r3)
            goto L_0x0629
        L_0x0563:
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            android.content.SharedPreferences r0 = r0.c()
            java.lang.String r3 = "maintenance_scheduled"
            boolean r0 = r0.getBoolean(r3, r5)
            if (r0 == 0) goto L_0x0577
            java.lang.String r0 = "Not scheduling maintenance on boot, because one was already scheduled"
            defpackage.oso.a(r0)
            goto L_0x0590
        L_0x0577:
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            java.lang.String r3 = "boot completed"
            r0.a(r3)
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            qwq r0 = r0.b()
            com.google.android.gms.icing.appindexing.service.PeriodicRebuildIndexChimeraService.a(r0)
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            qwq r0 = r0.b()
            defpackage.osp.a(r0, r5)
        L_0x0590:
            boolean r0 = defpackage.axrm.b()
            if (r0 == 0) goto L_0x0629
            com.google.android.gms.icing.service.IndexWorkerChimeraService r0 = r1.b
            android.content.Context r0 = r0.getApplicationContext()
            psd r0 = defpackage.psd.a(r0)
            r0.a()
            goto L_0x0629
        L_0x05a5:
            com.google.android.gms.icing.service.IndexWorkerChimeraService r3 = r1.b
            osf r3 = r3.a()
            boolean r4 = r3.d()
            if (r4 != 0) goto L_0x05b5
            defpackage.oso.b((java.lang.String) r6, (java.lang.Object) r0)
            goto L_0x0629
        L_0x05b5:
            android.content.Intent r0 = r1.a
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 31
            r7.<init>(r5)
            java.lang.String r5 = "Got package manager broadcast: "
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            defpackage.oso.a(r4)
            java.lang.String r4 = r0.getAction()
            boolean r5 = r3.d()
            if (r5 != 0) goto L_0x05e7
            defpackage.oso.e((java.lang.String) r6, (java.lang.Object) r4)
            goto L_0x05fe
        L_0x05e7:
            pxl r4 = new pxl
            android.content.Context r5 = r3.b
            r4.<init>(r5, r0)
            ppp r0 = r3.c
            osa r5 = new osa
            aonk r6 = defpackage.aonk.HANDLE_PACKAGE_MANAGER_BROADCAST
            java.lang.String r7 = r4.c()
            r5.<init>(r3, r6, r7, r4)
            r0.d(r5)
        L_0x05fe:
            android.content.Context r0 = r3.b
            pxl r4 = new pxl
            android.content.Intent r5 = r1.a
            r4.<init>(r0, r5)
            agvx r5 = defpackage.ozx.aq
            java.lang.Object r5 = r5.c()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0629
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x061c
            goto L_0x0622
        L_0x061c:
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x0629
        L_0x0622:
            prp r3 = r3.g
            android.content.Intent r4 = r1.a
            com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService.a((android.content.Context) r0, (defpackage.prp) r3, (android.content.Intent) r4)
        L_0x0629:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prd.a():java.lang.Object");
    }
}
