package com.google.location.nearby.direct.bluetooth.state;

import android.content.BroadcastReceiver;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothEventReceiverLogger extends nla {
    public static final Set a = new HashSet();
    private static final String[] b = {"com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.adapter.action.SCAN_MODE_CHANGED", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.DISCOVERY_STARTED", "android.bluetooth.adapter.action.DISCOVERY_FINISHED", "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED"};
    private final BroadcastReceiver c;

    public BluetoothEventReceiverLogger(BroadcastReceiver broadcastReceiver) {
        super("nearby");
        iva.a((Object) broadcastReceiver);
        this.c = broadcastReceiver;
        a.addAll(Arrays.asList(b));
    }

    private static void a(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN: ");
            sb.append(i);
            sb.toString();
        }
    }

    private static void b(int i) {
        if (i != 20 && i != 21 && i != 23) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN: ");
            sb.append(i);
            sb.toString();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x00cf
            java.lang.String r0 = r6.getAction()
            java.util.Set r1 = a
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x00b4
            android.os.Bundle r1 = r6.getExtras()
            int r2 = r0.hashCode()
            switch(r2) {
                case -1780914469: goto L_0x0056;
                case -1530327060: goto L_0x004c;
                case -737417248: goto L_0x0042;
                case -206700896: goto L_0x0038;
                case 6759640: goto L_0x002e;
                case 1123270207: goto L_0x0024;
                case 1260591598: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0060
        L_0x001a:
            java.lang.String r2 = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0060
            r0 = 5
            goto L_0x0061
        L_0x0024:
            java.lang.String r2 = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0060
            r0 = 2
            goto L_0x0061
        L_0x002e:
            java.lang.String r2 = "android.bluetooth.adapter.action.DISCOVERY_STARTED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0060
            r0 = 3
            goto L_0x0061
        L_0x0038:
            java.lang.String r2 = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0060
            r0 = 6
            goto L_0x0061
        L_0x0042:
            java.lang.String r2 = "com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0060
            r0 = 0
            goto L_0x0061
        L_0x004c:
            java.lang.String r2 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0060
            r0 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r2 = "android.bluetooth.adapter.action.DISCOVERY_FINISHED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0060
            r0 = 4
            goto L_0x0061
        L_0x0060:
            r0 = -1
        L_0x0061:
            switch(r0) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x009e;
                case 2: goto L_0x0089;
                case 3: goto L_0x0086;
                case 4: goto L_0x0083;
                case 5: goto L_0x007b;
                case 6: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x00ae
        L_0x0065:
            java.lang.String r0 = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE"
            int r0 = r1.getInt(r0)
            java.lang.String r2 = "android.bluetooth.adapter.extra.SCAN_MODE"
            int r1 = r1.getInt(r2)
            jjg r2 = defpackage.asil.a
            b(r0)
            b(r1)
            goto L_0x00ae
        L_0x007b:
            jjg r0 = defpackage.asil.a
            java.lang.String r0 = "android.bluetooth.adapter.extra.LOCAL_NAME"
            r1.getString(r0)
            goto L_0x00ae
        L_0x0083:
            jjg r0 = defpackage.asil.a
            goto L_0x00ae
        L_0x0086:
            jjg r0 = defpackage.asil.a
            goto L_0x00ae
        L_0x0089:
            java.lang.String r0 = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE"
            int r0 = r1.getInt(r0)
            java.lang.String r2 = "android.bluetooth.adapter.extra.CONNECTION_STATE"
            int r1 = r1.getInt(r2)
            jjg r2 = defpackage.asil.a
            a(r0)
            a(r1)
            goto L_0x00ae
        L_0x009e:
            java.lang.String r0 = "android.bluetooth.adapter.extra.PREVIOUS_STATE"
            r1.getInt(r0)
            java.lang.String r0 = "android.bluetooth.adapter.extra.STATE"
            r1.getInt(r0)
            jjg r0 = defpackage.asil.a
            goto L_0x00ae
        L_0x00ac:
            jjg r0 = defpackage.asil.a
        L_0x00ae:
            android.content.BroadcastReceiver r0 = r4.c
            r0.onReceive(r5, r6)
            return
        L_0x00b4:
            jjg r5 = defpackage.asil.a
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r6 = 52
            java.lang.String r1 = "com.google.location.nearby.direct.bluetooth.state.BluetoothEventReceiverLogger"
            java.lang.String r2 = "a"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r5 = r5.a((java.lang.String) r1, (java.lang.String) r2, (int) r6, (java.lang.String) r3)
            anih r5 = (defpackage.anih) r5
            java.lang.String r6 = "BluetoothEvent: Invalid bluetooth action: %s"
            r5.a((java.lang.String) r6, (java.lang.Object) r0)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.location.nearby.direct.bluetooth.state.BluetoothEventReceiverLogger.a(android.content.Context, android.content.Intent):void");
    }
}
