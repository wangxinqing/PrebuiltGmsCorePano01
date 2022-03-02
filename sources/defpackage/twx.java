package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.discovery.fastpair.autotest.AutoTestBroadcastReceiver;

/* renamed from: twx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twx extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ AutoTestBroadcastReceiver b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public twx(AutoTestBroadcastReceiver autoTestBroadcastReceiver, String str, Intent intent) {
        super(str);
        this.b = autoTestBroadcastReceiver;
        this.a = intent;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.nearby.discovery.fastpair.autotest.AutoTestBroadcastReceiver r0 = r8.b
            android.content.Intent r1 = r8.a
            arwg r2 = r0.b
            r2.b()
            java.lang.String r2 = r1.getAction()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0021
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairAutoTestReceiver: Receive unknown intent!"
            r0.a((java.lang.String) r1)
            return
        L_0x0021:
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = r1.getAction()
            java.lang.String r4 = "FastPairAutoTestReceiver: Received action %s"
            r2.a((java.lang.String) r4, (java.lang.Object) r3)
            java.lang.String r2 = r1.getAction()
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -2055695898: goto L_0x0060;
                case -1832302012: goto L_0x0056;
                case -1267455128: goto L_0x004c;
                case 515039796: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x006a
        L_0x0042:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_DELETE_LOCAL_CACHE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006a
            r2 = 2
            goto L_0x006b
        L_0x004c:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_TEAR_DOWN"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006a
            r2 = 1
            goto L_0x006b
        L_0x0056:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_CONSENT"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006a
            r2 = 3
            goto L_0x006b
        L_0x0060:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006a
            r2 = 0
            goto L_0x006b
        L_0x006a:
            r2 = -1
        L_0x006b:
            if (r2 == 0) goto L_0x00cb
            if (r2 == r7) goto L_0x00b0
            if (r2 == r6) goto L_0x007b
            if (r2 == r5) goto L_0x0074
            goto L_0x00af
        L_0x0074:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.d = r1
            return
        L_0x007b:
            java.lang.String r2 = "com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS"
            boolean r3 = r1.hasExtra(r2)
            if (r3 == 0) goto L_0x00af
            jjg r3 = defpackage.tsp.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            java.lang.String r4 = "FastPairAutoTestReceiver: Delete local cache for auto test subsequence pairing."
            r3.a((java.lang.String) r4)
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Context r0 = r0.c
            java.lang.Class<ttf> r2 = defpackage.ttf.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r2)
            ttf r0 = (defpackage.ttf) r0
            r0.c(r1)
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r0 == 0) goto L_0x00af
            android.bluetooth.BluetoothDevice r0 = r0.getRemoteDevice(r1)
            r0.removeBond()
            return
        L_0x00af:
            return
        L_0x00b0:
            android.content.Context r0 = r0.c
            java.lang.Class<arxg> r1 = defpackage.arxg.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r1)
            arxg r0 = (defpackage.arxg) r0
            r0.a((boolean) r4)
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairAutoTestReceiver: setAutoTestRunning to false"
            r0.a((java.lang.String) r1)
            return
        L_0x00cb:
            android.content.Context r0 = r0.c
            java.lang.Class<arxg> r1 = defpackage.arxg.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r1)
            arxg r0 = (defpackage.arxg) r0
            r0.a((boolean) r7)
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairAutoTestReceiver: setAutoTestRunning to true"
            r0.a((java.lang.String) r1)
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairAutoTestReceiver: %s"
            java.lang.String r2 = "fast pair auto tester device UI test supported!"
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twx.run():void");
    }
}
