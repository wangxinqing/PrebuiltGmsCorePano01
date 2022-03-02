package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RingChimeraService extends smx {
    public static final /* synthetic */ int o = 0;

    /* access modifiers changed from: protected */
    public final Runnable a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final avty b(Intent intent) {
        if (intent.getBooleanExtra("includeConnectivityStatus", false)) {
            return snh.c(this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final sng c() {
        return new sng(this, this);
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return R.drawable.mdm_ic_notification;
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return R.string.common_mdm_feature_name;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return R.color.mdm_accent_color;
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3.release();
        r0.c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r3 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r3 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r3 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r3.a = true;
        r3.interrupt();
        r0.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r3 = r0.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r3 == -1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r0.b.setStreamVolume(4, r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r3 = r0.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r3 != -1) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r0.b.setRingerMode(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        new defpackage.qvr().removeCallbacks(r0.f);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroy() {
        /*
            r13 = this;
            sng r0 = r13.h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0078
            android.content.Context r3 = r0.k
            android.content.BroadcastReceiver r4 = r0.g
            r3.unregisterReceiver(r4)
            snd r3 = r0.e
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3.cancel(r2)
            r0.e = r4
        L_0x0017:
            android.media.MediaPlayer r3 = r0.c     // Catch:{ IllegalStateException -> 0x0034 }
            if (r3 != 0) goto L_0x001c
            goto L_0x0027
        L_0x001c:
            boolean r3 = r3.isPlaying()     // Catch:{ IllegalStateException -> 0x0034 }
            if (r3 == 0) goto L_0x0027
            android.media.MediaPlayer r3 = r0.c     // Catch:{ IllegalStateException -> 0x0034 }
            r3.stop()     // Catch:{ IllegalStateException -> 0x0034 }
        L_0x0027:
            android.media.MediaPlayer r3 = r0.c
            if (r3 != 0) goto L_0x002c
            goto L_0x0041
        L_0x002c:
            r3.release()
            r0.c = r4
            goto L_0x0041
        L_0x0032:
            r1 = move-exception
            goto L_0x006d
        L_0x0034:
            r3 = move-exception
            java.lang.String r5 = "Error stopping playing ringtone."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0032 }
            defpackage.snn.a(r3, r5, r6)     // Catch:{ all -> 0x0032 }
            android.media.MediaPlayer r3 = r0.c
            if (r3 == 0) goto L_0x0041
            goto L_0x002c
        L_0x0041:
            snf r3 = r0.d
            if (r3 != 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            r3.a = r2
            r3.interrupt()
            r0.d = r4
        L_0x004d:
            int r3 = r0.h
            r4 = -1
            if (r3 == r4) goto L_0x0058
            android.media.AudioManager r5 = r0.b
            r6 = 4
            r5.setStreamVolume(r6, r3, r1)
        L_0x0058:
            int r3 = r0.i
            if (r3 != r4) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            android.media.AudioManager r4 = r0.b
            r4.setRingerMode(r3)
        L_0x0062:
            qvr r3 = new qvr
            r3.<init>()
            java.lang.Runnable r0 = r0.f
            r3.removeCallbacks(r0)
            goto L_0x0078
        L_0x006d:
            android.media.MediaPlayer r2 = r0.c
            if (r2 != 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            r2.release()
            r0.c = r4
        L_0x0077:
            throw r1
        L_0x0078:
            java.lang.String r0 = r13.g
            if (r0 != 0) goto L_0x007d
            goto L_0x009e
        L_0x007d:
            byte[] r0 = r13.l
            if (r0 != 0) goto L_0x009e
            avuj[] r3 = new defpackage.avuj[r2]
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x008a
            avuj r0 = defpackage.avuj.RING_DEVICE_INTERRUPTED
            goto L_0x008c
        L_0x008a:
            avuj r0 = defpackage.avuj.SUCCESS
        L_0x008c:
            r3[r1] = r0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = r13.g
            r8 = 0
            boolean r9 = defpackage.snh.a(r13)
            r10 = 0
            r11 = r13
            r12 = r13
            defpackage.smh.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x009e:
            android.content.BroadcastReceiver r0 = r13.a
            if (r0 != 0) goto L_0x00a3
            goto L_0x00a6
        L_0x00a3:
            r13.unregisterReceiver(r0)
        L_0x00a6:
            qvr r0 = r13.k
            if (r0 != 0) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            java.lang.Runnable r1 = r13.m
            r0.removeCallbacks(r1)
        L_0x00b0:
            android.view.View r0 = r13.e
            if (r0 != 0) goto L_0x00b5
            goto L_0x00ba
        L_0x00b5:
            android.view.WindowManager r1 = r13.d
            r1.removeView(r0)
        L_0x00ba:
            r13.stopForeground(r2)
            java.lang.String r0 = r13.b
            if (r0 == 0) goto L_0x00c7
            java.lang.String r1 = "com.google.android.gms.mdm.RING_CANCELED"
            defpackage.snq.a(r13, r0, r1)
        L_0x00c7:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.RingChimeraService.onDestroy():void");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        this.b = intent.getStringExtra("requestorNodeId");
        dlc a = dkh.a((Context) this).a("UA-45380032-2");
        dkj dkj = new dkj((byte[]) null);
        dkj.c("Wear");
        dkj.b("Received wearable command");
        dkj.d("Ring my phone");
        a.a(dkj.a());
        snq.a(this, this.b, "com.google.android.gms.mdm.RING_STARTED");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = crc.a;
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        stopSelf();
        return true;
    }
}
