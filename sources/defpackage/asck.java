package defpackage;

import android.content.Intent;
import com.google.location.nearby.direct.bluetooth.state.BackgroundBleScanner$3;

/* renamed from: asck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asck extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ BackgroundBleScanner$3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asck(BackgroundBleScanner$3 backgroundBleScanner$3, String str, Intent intent) {
        super(str);
        this.b = backgroundBleScanner$3;
        this.a = intent;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.location.nearby.direct.bluetooth.state.BackgroundBleScanner$3 r0 = r7.b
            ascn r0 = r0.a
            android.content.Intent r1 = r7.a
            java.lang.String r1 = r1.getAction()
            jjg r2 = defpackage.asil.a
            int r2 = r1.hashCode()
            r3 = 1
            r4 = 0
            switch(r2) {
                case -2128145023: goto L_0x005c;
                case -1530327060: goto L_0x0052;
                case -1454123155: goto L_0x0048;
                case -737417248: goto L_0x003e;
                case 360422632: goto L_0x0034;
                case 575967096: goto L_0x002a;
                case 880469964: goto L_0x0020;
                case 1524764930: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0066
        L_0x0016:
            java.lang.String r2 = "com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 4
            goto L_0x0067
        L_0x0020:
            java.lang.String r2 = "com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 1
            goto L_0x0067
        L_0x002a:
            java.lang.String r2 = "com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 5
            goto L_0x0067
        L_0x0034:
            java.lang.String r2 = "android.bluetooth.adapter.action.BLE_STATE_CHANGED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 7
            goto L_0x0067
        L_0x003e:
            java.lang.String r2 = "com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 2
            goto L_0x0067
        L_0x0048:
            java.lang.String r2 = "android.intent.action.SCREEN_ON"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 0
            goto L_0x0067
        L_0x0052:
            java.lang.String r2 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 6
            goto L_0x0067
        L_0x005c:
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0066
            r2 = 3
            goto L_0x0067
        L_0x0066:
            r2 = -1
        L_0x0067:
            switch(r2) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x0091;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0086;
                case 6: goto L_0x0093;
                case 7: goto L_0x0093;
                default: goto L_0x006a;
            }
        L_0x006a:
            jjg r2 = defpackage.asil.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            r3 = 631(0x277, float:8.84E-43)
            java.lang.String r4 = "ascn"
            java.lang.String r5 = "a"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r2 = r2.a((java.lang.String) r4, (java.lang.String) r5, (int) r3, (java.lang.String) r6)
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "BackgroundBleScanner: Unexpected action=%s"
            r2.a((java.lang.String) r3, (java.lang.Object) r1)
            goto L_0x0093
        L_0x0086:
            r0.b()
            goto L_0x0093
        L_0x008a:
            r0.i = r4
            r0.h = r4
            goto L_0x0093
        L_0x008f:
            r0.i = r3
        L_0x0091:
            r0.h = r3
        L_0x0093:
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asck.run():void");
    }
}
