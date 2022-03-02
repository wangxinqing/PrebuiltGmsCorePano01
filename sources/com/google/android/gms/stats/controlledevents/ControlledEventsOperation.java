package com.google.android.gms.stats.controlledevents;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ControlledEventsOperation extends IntentOperation {
    private nla a = null;

    /* access modifiers changed from: package-private */
    public final void a() {
        try {
            ihs.b().unregisterReceiver(this.a);
        } catch (IllegalArgumentException e) {
            acsh.a("ControlledEventsReceiverFailureIllegalUnregister");
        }
        this.a = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r14) {
        /*
            r13 = this;
            boolean r0 = defpackage.azmv.b()
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = r14.getAction()
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = -1
            switch(r1) {
                case -579664806: goto L_0x0035;
                case -402052697: goto L_0x002b;
                case 871387742: goto L_0x0021;
                case 2085626924: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x003f
        L_0x0017:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_WAKELOCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003f
            r0 = 0
            goto L_0x0040
        L_0x0021:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_BLE_SCAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x002b:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003f
            r0 = 2
            goto L_0x0040
        L_0x0035:
            java.lang.String r1 = "com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_PROCESS_CRASH"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003f
            r0 = 3
            goto L_0x0040
        L_0x003f:
            r0 = -1
        L_0x0040:
            r7 = 0
            java.lang.String r1 = "alarm_id_extra"
            if (r0 == 0) goto L_0x0120
            if (r0 == r5) goto L_0x00d6
            if (r0 == r3) goto L_0x0061
            if (r0 == r2) goto L_0x0053
            java.lang.String r14 = "ControlledEventsOperationUnknownAction"
            defpackage.acsh.a(r14)
            return
        L_0x0053:
            java.lang.String r0 = "ControlledEventsProcessCrashSuccess"
            defpackage.acsh.a(r0)
            int r14 = r14.getIntExtra(r1, r6)
            defpackage.acsi.a((int) r14)
            return
        L_0x0061:
            r2 = -1
            java.lang.String r0 = "wakeup_duration"
            long r2 = r14.getLongExtra(r0, r2)
            java.lang.String r0 = "wakeup_remaining_alarms"
            int r0 = r14.getIntExtra(r0, r6)
            java.lang.String r7 = "wakeup_number_of_attempts"
            int r4 = r14.getIntExtra(r7, r4)
            java.lang.String r7 = "ControlledEventsWakeupFailureTotal"
            if (r0 < 0) goto L_0x00b8
            long r8 = (long) r4
            long r10 = defpackage.azmv.c()
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0083
            goto L_0x00b8
        L_0x0083:
            boolean r2 = defpackage.acsg.a(r2)
            int r14 = r14.getIntExtra(r1, r6)
            defpackage.acsi.a((int) r14)
            if (r2 == 0) goto L_0x009c
            java.lang.String r14 = "ControlledEventsWakeupSuccess"
            defpackage.acsh.a(r14)
            if (r0 <= 0) goto L_0x00d5
            int r0 = r0 + r6
            defpackage.acsi.a((int) r0, (int) r4)
            return
        L_0x009c:
            long r1 = defpackage.azmv.c()
            int r14 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ae
            java.lang.String r14 = "ControlledEventsWakeupTotalNumRetries"
            defpackage.acsh.a(r14)
            int r4 = r4 + r5
            defpackage.acsi.a((int) r0, (int) r4)
            return
        L_0x00ae:
            java.lang.String r14 = "ControlledEventsWakeupFailureRetries"
            defpackage.acsh.a(r14)
            defpackage.acsh.a(r7, r0)
            return
        L_0x00b8:
            int r14 = r14.getIntExtra(r1, r6)
            defpackage.acsi.a((int) r14)
            if (r0 >= 0) goto L_0x00c7
            java.lang.String r14 = "ControlledEventsWakeupFailureOverscheduled"
            defpackage.acsh.a(r14)
        L_0x00c7:
            long r1 = (long) r4
            long r3 = defpackage.azmv.c()
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 <= 0) goto L_0x00d5
            if (r0 <= 0) goto L_0x00d5
            defpackage.acsh.a(r7, r0)
        L_0x00d5:
            return
        L_0x00d6:
            java.lang.String r0 = "bluetooth_low_energy_scan_duration"
            long r2 = r14.getLongExtra(r0, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            ihs r0 = defpackage.ihs.b()
            java.lang.String r4 = "bluetooth"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x010d
            boolean r4 = r0.isEnabled()
            if (r4 != 0) goto L_0x00f8
            goto L_0x010d
        L_0x00f8:
            acsd r4 = new acsd
            r4.<init>()
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask
            acse r7 = new acse
            r7.<init>(r0, r4, r2)
            r5.<init>(r7)
            r5.run()
            java.lang.String r0 = "ControlledEventsBleScanSuccess"
            goto L_0x0115
        L_0x010d:
            java.lang.String r0 = "ControlledEventsBleScanFailureAdapter"
            defpackage.acsh.a(r0)
            java.lang.String r0 = "ControlledEventsBleScanFailure"
        L_0x0115:
            defpackage.acsh.a(r0)
            int r14 = r14.getIntExtra(r1, r6)
            defpackage.acsi.a((int) r14)
            return
        L_0x0120:
            java.lang.String r0 = "wakelock_duration"
            long r2 = r14.getLongExtra(r0, r7)
            java.lang.String r0 = "wakelock_busy"
            boolean r0 = r14.getBooleanExtra(r0, r4)
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>()
            java.lang.String r5 = "android.intent.action.SCREEN_ON"
            r4.addAction(r5)
            com.google.android.gms.stats.controlledevents.ControlledEventsBroadcastReceiver r5 = new com.google.android.gms.stats.controlledevents.ControlledEventsBroadcastReceiver
            r5.<init>(r13)
            r13.a = r5
            ihs r5 = defpackage.ihs.b()
            nla r7 = r13.a
            r5.registerReceiver(r7, r4)
            if (r0 == 0) goto L_0x0152
            acsf r0 = new acsf
            r0.<init>()
            boolean r0 = defpackage.acsg.a(r0, r2)
            goto L_0x0156
        L_0x0152:
            boolean r0 = defpackage.acsg.a(r2)
        L_0x0156:
            nla r2 = r13.a
            if (r2 == 0) goto L_0x015d
            r13.a()
        L_0x015d:
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = "ControlledEventsWakelockFailure"
            goto L_0x0164
        L_0x0162:
            java.lang.String r0 = "ControlledEventsWakelockSuccess"
        L_0x0164:
            defpackage.acsh.a(r0)
            int r14 = r14.getIntExtra(r1, r6)
            defpackage.acsi.a((int) r14)
            return
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.controlledevents.ControlledEventsOperation.onHandleIntent(android.content.Intent):void");
    }
}
