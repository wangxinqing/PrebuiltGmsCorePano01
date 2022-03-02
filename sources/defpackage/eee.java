package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.google.android.gms.audiomodem.PlaybackCapabilityHelper$1;
import com.google.android.gms.audiomodem.PlaybackCapabilityHelper$2;

/* renamed from: eee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eee {
    public final Context a;
    public final qvr b;
    public eed c;
    public boolean d;
    public final edm e;
    public boolean f;
    public final IntentFilter g;
    public final BroadcastReceiver h = new PlaybackCapabilityHelper$1(this, "nearby");
    public final TelephonyManager i;
    public boolean j;
    public final PhoneStateListener k = new eec(this);
    public final BroadcastReceiver l = new PlaybackCapabilityHelper$2(this, "nearby");
    private final AudioManager m;

    public eee(Context context) {
        this.a = context;
        this.b = new qvr();
        this.m = (AudioManager) context.getSystemService("audio");
        this.e = new edm(context);
        this.g = new IntentFilter("android.intent.action.HEADSET_PLUG");
        int i2 = Build.VERSION.SDK_INT;
        this.g.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        this.i = (TelephonyManager) context.getSystemService("phone");
        context.registerReceiver(this.l, new IntentFilter("android.intent.action.NEW_OUTGOING_CALL"), (String) null, this.b);
        this.i.listen(this.k, 32);
    }

    public final void a() {
        this.c = null;
        try {
            this.a.unregisterReceiver(this.h);
            this.f = false;
        } catch (IllegalArgumentException e2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r3 = this;
            boolean r0 = r3.j
            if (r0 != 0) goto L_0x0045
            android.media.AudioManager r0 = r3.m
            boolean r0 = r0.isWiredHeadsetOn()
            if (r0 != 0) goto L_0x0043
            edm r0 = r3.e
            android.media.AudioManager r1 = r0.a
            boolean r1 = r1.isBluetoothA2dpOn()
            if (r1 == 0) goto L_0x0019
            jjg r0 = defpackage.edx.a
            goto L_0x0045
        L_0x0019:
            android.media.AudioManager r1 = r0.a
            boolean r1 = r1.isBluetoothScoOn()
            if (r1 == 0) goto L_0x0024
            jjg r0 = defpackage.edx.a
            goto L_0x0045
        L_0x0024:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            android.bluetooth.BluetoothHeadset r2 = r0.b     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003d
            android.bluetooth.BluetoothHeadset r0 = r0.b     // Catch:{ all -> 0x0040 }
            java.util.List r0 = r0.getConnectedDevices()     // Catch:{ all -> 0x0040 }
            int r0 = r0.size()     // Catch:{ all -> 0x0040 }
            if (r0 <= 0) goto L_0x003d
            jjg r0 = defpackage.edx.a     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x0045
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            r0 = 1
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r0
        L_0x0043:
            jjg r0 = defpackage.edx.a
        L_0x0045:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eee.b():boolean");
    }

    public final void c() {
        eed eed;
        boolean z = this.d;
        boolean b2 = b();
        this.d = b2;
        if (b2 != z && (eed = this.c) != null) {
            jjg jjg = edx.a;
            eed.a(b2);
        }
    }

    public final boolean a(eed eed) {
        if (eed != null) {
            ((anih) ((anih) edx.a.c()).a("eee", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("requestStartPlayback() called during outstanding request");
        }
        this.c = eed;
        if (!this.f) {
            this.a.registerReceiver(this.h, this.g, (String) null, this.b);
            this.f = true;
        }
        boolean b2 = b();
        this.d = b2;
        return b2;
    }
}
