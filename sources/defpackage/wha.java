package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: wha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wha extends Handler implements wbx {
    private vtx a;
    private vtx b;
    private vsh c;
    private final Set d = new ob();
    private final Set e = new ob();

    public wha() {
        super(Looper.getMainLooper());
    }

    private final void a(ShareTarget shareTarget, int i) {
        int i2 = 0;
        while (i2 < 100) {
            Message message = new Message();
            message.what = 2;
            message.obj = shareTarget;
            Bundle bundle = new Bundle();
            bundle.putByteArray("share_target_bytes", ivy.a(shareTarget));
            bundle.putInt("progress", i2);
            message.setData(bundle);
            sendMessageDelayed(message, (long) i);
            i2++;
            i += 100;
        }
        Message message2 = new Message();
        message2.what = 3;
        message2.obj = shareTarget;
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("share_target_bytes", ivy.a(shareTarget));
        message2.setData(bundle2);
        sendMessageDelayed(message2, (long) i);
    }

    public final int a(Contact contact) {
        return 13;
    }

    public final void a(int i) {
    }

    public final int b(Contact contact) {
        return 13;
    }

    public final synchronized int c(ShareTarget shareTarget) {
        return 0;
    }

    public final synchronized int d(ShareTarget shareTarget) {
        removeMessages(5, shareTarget);
        removeMessages(2, shareTarget);
        removeMessages(3, shareTarget);
        Message message = new Message();
        message.what = 7;
        message.obj = shareTarget;
        Bundle bundle = new Bundle();
        bundle.putByteArray("share_target_bytes", ivy.a(shareTarget));
        message.setData(bundle);
        sendMessage(message);
        return 0;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final List f() {
        return amzy.h();
    }

    public final void g() {
    }

    public final synchronized void h() {
        removeMessages(1);
        removeMessages(2);
        removeMessages(3);
        removeMessages(4);
        removeMessages(5);
        removeMessages(6);
        ((anih) vvj.a.d()).a("Mock event provider shutting down");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0271, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void handleMessage(android.os.Message r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.what     // Catch:{ all -> 0x02b3 }
            r1 = 2
            r2 = 1120403456(0x42c80000, float:100.0)
            switch(r0) {
                case 1: goto L_0x0272;
                case 2: goto L_0x0210;
                case 3: goto L_0x01af;
                case 4: goto L_0x0185;
                case 5: goto L_0x0124;
                case 6: goto L_0x00c3;
                case 7: goto L_0x0035;
                case 8: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            monitor-exit(r3)
            return
        L_0x000b:
            vtx r0 = r3.b     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0033
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "share_target_bytes"
            byte[] r4 = r4.getByteArray(r0)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.wib.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r4 = (com.google.android.gms.nearby.sharing.ShareTarget) r4     // Catch:{ all -> 0x02b3 }
            vtx r0 = r3.b     // Catch:{ all -> 0x02b3 }
            vtv r2 = new vtv     // Catch:{ all -> 0x02b3 }
            r2.<init>(r1)     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "BCD2A"
            r2.a = r1     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.TransferMetadata r1 = r2.a()     // Catch:{ all -> 0x02b3 }
            r0.a(r4, r1)     // Catch:{ all -> 0x02b3 }
        L_0x0033:
            monitor-exit(r3)
            return
        L_0x0035:
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "share_target_bytes"
            byte[] r4 = r4.getByteArray(r0)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.wib.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r4 = (com.google.android.gms.nearby.sharing.ShareTarget) r4     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r0 != 0) goto L_0x0067
            java.util.Set r0 = r3.e     // Catch:{ all -> 0x02b3 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r0 = r0.d()     // Catch:{ all -> 0x02b3 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "Unknown ShareTarget %s was cancelled. Ignoring."
            r0.a((java.lang.String) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x0067:
            vtv r0 = new vtv     // Catch:{ all -> 0x02b3 }
            r1 = 9
            r0.<init>(r1)     // Catch:{ all -> 0x02b3 }
            r0.a((float) r2)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.TransferMetadata r0 = r0.a()     // Catch:{ all -> 0x02b3 }
            java.util.Set r1 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0099
            vtx r1 = r3.a     // Catch:{ all -> 0x02b3 }
            if (r1 != 0) goto L_0x0090
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r0 = r0.d()     // Catch:{ all -> 0x02b3 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "Failed to cancel ShareTarget %s. No callback to invoke."
            r0.a((java.lang.String) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x0090:
            r1.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.d     // Catch:{ all -> 0x02b3 }
            r0.remove(r4)     // Catch:{ all -> 0x02b3 }
            goto L_0x00b4
        L_0x0099:
            vtx r1 = r3.b     // Catch:{ all -> 0x02b3 }
            if (r1 != 0) goto L_0x00ac
            jjg r0 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r0 = r0.d()     // Catch:{ all -> 0x02b3 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "Failed to cancel ShareTarget %s. No callback to invoke."
            r0.a((java.lang.String) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x00ac:
            r1.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.e     // Catch:{ all -> 0x02b3 }
            r0.remove(r4)     // Catch:{ all -> 0x02b3 }
        L_0x00b4:
            jjg r4 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02b3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "Mock file cancel injected"
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x00c3:
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "share_target_bytes"
            byte[] r4 = r4.getByteArray(r0)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.wib.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r4 = (com.google.android.gms.nearby.sharing.ShareTarget) r4     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r0 != 0) goto L_0x00e5
            java.util.Set r0 = r3.e     // Catch:{ all -> 0x02b3 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0122
        L_0x00e5:
            vtv r0 = new vtv     // Catch:{ all -> 0x02b3 }
            r1 = 7
            r0.<init>(r1)     // Catch:{ all -> 0x02b3 }
            r0.a((float) r2)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.TransferMetadata r0 = r0.a()     // Catch:{ all -> 0x02b3 }
            java.util.Set r1 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0107
            vtx r1 = r3.a     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0122
            r1.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.d     // Catch:{ all -> 0x02b3 }
            r0.remove(r4)     // Catch:{ all -> 0x02b3 }
            goto L_0x0113
        L_0x0107:
            vtx r1 = r3.b     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0122
            r1.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.e     // Catch:{ all -> 0x02b3 }
            r0.remove(r4)     // Catch:{ all -> 0x02b3 }
        L_0x0113:
            jjg r4 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02b3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "Mock file fail injected"
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x0122:
            monitor-exit(r3)
            return
        L_0x0124:
            vtx r0 = r3.b     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0183
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "share_target_bytes"
            byte[] r4 = r4.getByteArray(r0)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.wib.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r4 = (com.google.android.gms.nearby.sharing.ShareTarget) r4     // Catch:{ all -> 0x02b3 }
            vtx r0 = r3.b     // Catch:{ all -> 0x02b3 }
            vtv r1 = new vtv     // Catch:{ all -> 0x02b3 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.TransferMetadata r1 = r1.a()     // Catch:{ all -> 0x02b3 }
            r0.a(r4, r1)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = r4.j     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0153
            r0 = 2000(0x7d0, float:2.803E-42)
            r3.a((com.google.android.gms.nearby.sharing.ShareTarget) r4, (int) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x0174
        L_0x0153:
            android.os.Message r0 = new android.os.Message     // Catch:{ all -> 0x02b3 }
            r0.<init>()     // Catch:{ all -> 0x02b3 }
            r1 = 8
            r0.what = r1     // Catch:{ all -> 0x02b3 }
            r0.obj = r4     // Catch:{ all -> 0x02b3 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x02b3 }
            r1.<init>()     // Catch:{ all -> 0x02b3 }
            java.lang.String r2 = "share_target_bytes"
            byte[] r4 = defpackage.ivy.a(r4)     // Catch:{ all -> 0x02b3 }
            r1.putByteArray(r2, r4)     // Catch:{ all -> 0x02b3 }
            r0.setData(r1)     // Catch:{ all -> 0x02b3 }
            r1 = 1000(0x3e8, double:4.94E-321)
            r3.sendMessageDelayed(r0, r1)     // Catch:{ all -> 0x02b3 }
        L_0x0174:
            jjg r4 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02b3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "Mock connect injected"
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x0183:
            monitor-exit(r3)
            return
        L_0x0185:
            vsh r0 = r3.c     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x01ad
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "share_target_bytes"
            byte[] r4 = r4.getByteArray(r0)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.wib.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r4 = (com.google.android.gms.nearby.sharing.ShareTarget) r4     // Catch:{ all -> 0x02b3 }
            vsh r0 = r3.c     // Catch:{ all -> 0x02b3 }
            r0.a(r4)     // Catch:{ all -> 0x02b3 }
            jjg r4 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02b3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "Mock discovered shareTarget injected"
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
        L_0x01ad:
            monitor-exit(r3)
            return
        L_0x01af:
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "share_target_bytes"
            byte[] r4 = r4.getByteArray(r0)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.wib.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r4 = (com.google.android.gms.nearby.sharing.ShareTarget) r4     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r0 != 0) goto L_0x01d1
            java.util.Set r0 = r3.e     // Catch:{ all -> 0x02b3 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x020e
        L_0x01d1:
            vtv r0 = new vtv     // Catch:{ all -> 0x02b3 }
            r1 = 6
            r0.<init>(r1)     // Catch:{ all -> 0x02b3 }
            r0.a((float) r2)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.TransferMetadata r0 = r0.a()     // Catch:{ all -> 0x02b3 }
            java.util.Set r1 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x01f3
            vtx r1 = r3.a     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x020e
            r1.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.d     // Catch:{ all -> 0x02b3 }
            r0.remove(r4)     // Catch:{ all -> 0x02b3 }
            goto L_0x01ff
        L_0x01f3:
            vtx r1 = r3.b     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x020e
            r1.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.e     // Catch:{ all -> 0x02b3 }
            r0.remove(r4)     // Catch:{ all -> 0x02b3 }
        L_0x01ff:
            jjg r4 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02b3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "Mock file complete injected"
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x020e:
            monitor-exit(r3)
            return
        L_0x0210:
            android.os.Bundle r0 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "share_target_bytes"
            byte[] r0 = r0.getByteArray(r1)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r1 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = defpackage.wib.a(r0, r1)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r0 = (com.google.android.gms.nearby.sharing.ShareTarget) r0     // Catch:{ all -> 0x02b3 }
            java.util.Set r1 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x02b3 }
            if (r1 != 0) goto L_0x0232
            java.util.Set r1 = r3.e     // Catch:{ all -> 0x02b3 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0270
        L_0x0232:
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "progress"
            int r4 = r4.getInt(r1)     // Catch:{ all -> 0x02b3 }
            vtv r1 = new vtv     // Catch:{ all -> 0x02b3 }
            r2 = 5
            r1.<init>(r2)     // Catch:{ all -> 0x02b3 }
            float r4 = (float) r4     // Catch:{ all -> 0x02b3 }
            r1.a((float) r4)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.TransferMetadata r4 = r1.a()     // Catch:{ all -> 0x02b3 }
            java.util.Set r1 = r3.d     // Catch:{ all -> 0x02b3 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x025a
            vtx r1 = r3.a     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0270
            r1.a(r0, r4)     // Catch:{ all -> 0x02b3 }
            goto L_0x0261
        L_0x025a:
            vtx r1 = r3.b     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0270
            r1.a(r0, r4)     // Catch:{ all -> 0x02b3 }
        L_0x0261:
            jjg r4 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02b3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "Mock file progress injected"
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            monitor-exit(r3)
            return
        L_0x0270:
            monitor-exit(r3)
            return
        L_0x0272:
            vtx r0 = r3.a     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0009
            android.os.Bundle r4 = r4.getData()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "share_target_bytes"
            byte[] r4 = r4.getByteArray(r0)     // Catch:{ all -> 0x02b3 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.nearby.sharing.ShareTarget.CREATOR     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = defpackage.wib.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.ShareTarget r4 = (com.google.android.gms.nearby.sharing.ShareTarget) r4     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r3.d     // Catch:{ all -> 0x02b3 }
            r0.add(r4)     // Catch:{ all -> 0x02b3 }
            vtv r0 = new vtv     // Catch:{ all -> 0x02b3 }
            r0.<init>(r1)     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = r4.j     // Catch:{ all -> 0x02b3 }
            if (r1 == 0) goto L_0x0297
            goto L_0x029b
        L_0x0297:
            java.lang.String r1 = "BCD2A"
            r0.a = r1     // Catch:{ all -> 0x02b3 }
        L_0x029b:
            vtx r1 = r3.a     // Catch:{ all -> 0x02b3 }
            com.google.android.gms.nearby.sharing.TransferMetadata r0 = r0.a()     // Catch:{ all -> 0x02b3 }
            r1.a(r4, r0)     // Catch:{ all -> 0x02b3 }
            jjg r4 = defpackage.vvj.a     // Catch:{ all -> 0x02b3 }
            anie r4 = r4.d()     // Catch:{ all -> 0x02b3 }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "Mock incoming file injected"
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x0009
        L_0x02b3:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x02b7
        L_0x02b6:
            throw r4
        L_0x02b7:
            goto L_0x02b6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wha.handleMessage(android.os.Message):void");
    }

    public final synchronized int b(ShareTarget shareTarget) {
        if (this.d.contains(shareTarget)) {
            this.d.remove(shareTarget);
            vtx vtx = this.a;
            if (vtx != null) {
                vtx.a(shareTarget, new vtv(8).a());
                this.a = null;
            }
        }
        return 0;
    }

    public final synchronized List c() {
        return new ArrayList();
    }

    public final synchronized void b() {
        removeMessages(1);
        ((anih) vvj.a.d()).a("Mock advertising stopped");
    }

    private final void a(String str, String str2, boolean z, long j) {
        vsf vsf = new vsf();
        vsf.b = str;
        vsf.j = str2;
        vsf.n = z;
        vsf.i = false;
        if (str2 != null) {
            vsf.b();
        }
        ShareTarget a2 = vsf.a();
        Message message = new Message();
        message.what = 4;
        message.obj = a2;
        Bundle bundle = new Bundle();
        bundle.putByteArray("share_target_bytes", ivy.a(a2));
        message.setData(bundle);
        sendMessageDelayed(message, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(com.google.android.gms.nearby.sharing.ShareTarget r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Set r0 = r2.d     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0024 }
            r1 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.i     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            monitor-exit(r2)
            return r1
        L_0x0011:
            java.util.Set r0 = r2.e     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0020
            boolean r0 = r3.i     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            monitor-exit(r2)
            return r1
        L_0x0020:
            r2.a((com.google.android.gms.nearby.sharing.ShareTarget) r3, (int) r1)     // Catch:{ all -> 0x0024 }
            goto L_0x001e
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0028
        L_0x0027:
            throw r3
        L_0x0028:
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wha.a(com.google.android.gms.nearby.sharing.ShareTarget):int");
    }

    public final synchronized void a() {
        removeMessages(4);
        this.c = null;
        ((anih) vvj.a.d()).a("Mock discovery stopped");
    }

    public final void a(PrintWriter printWriter) {
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.provider.testing.MockEventProvider"}));
    }

    public final synchronized void a(String str, ShareTarget shareTarget, vtx vtx) {
        if (!this.e.contains(shareTarget)) {
            this.b = vtx;
            this.e.add(shareTarget);
            ((anih) vvj.a.d()).a("Sending to ShareTarget %s", (Object) shareTarget);
            Message message = new Message();
            message.what = 5;
            message.obj = shareTarget;
            Bundle bundle = new Bundle();
            bundle.putByteArray("share_target_bytes", ivy.a(shareTarget));
            message.setData(bundle);
            sendMessage(message);
        }
    }

    public final synchronized void a(String str, vtx vtx, wbq wbq) {
        if (wbq.a == wbw.HIGH_POWER) {
            this.a = vtx;
            vsf vsf = new vsf();
            vsf.b = "Alice's Pixel 2";
            vsf.j = null;
            vsf.i = true;
            ShareTarget a2 = vsf.a();
            vja vja = new vja("Foo.pdf");
            vja.b = 1000;
            a2.a(vja.a());
            Message message = new Message();
            message.what = 1;
            message.obj = a2;
            Bundle bundle = new Bundle();
            bundle.putByteArray("share_target_bytes", ivy.a(a2));
            message.setData(bundle);
            sendMessageDelayed(message, 2000);
            ((anih) vvj.a.d()).a("Mock advertising started");
        }
    }

    public final synchronized void a(vsh vsh, wbt wbt) {
        this.c = vsh;
        a("Alice's Chromebook", (String) null, false, 1000);
        a("Bob's Pixel 3", "Bob Smith", false, 2000);
        a("Charlie's iPhone", (String) null, true, 3000);
        a("Dennis's Smartwatch", "Dennis Smith", true, 4000);
        ((anih) vvj.a.d()).a("Mock discovery started");
    }
}
