package com.google.android.gms.audiomodem.service;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioModemChimeraService extends egh implements thm {
    private efq e;
    private thl f;

    private final boolean a(String str) {
        return getPackageManager().checkPermission(str, "com.google.android.gms") == 0;
    }

    public final thl a() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final egg b() {
        return new efz(this);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        startService(jhg.g("com.google.android.gms.audiomodem.service.AudioModemService.START"));
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return a("android.permission.READ_PHONE_STATE") && a("android.permission.RECORD_AUDIO");
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        efz e2 = e();
        if (e2 != null) {
            e2.dump(fileDescriptor, printWriter, strArr);
        }
    }

    public final efz e() {
        return (efz) this.a;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.audiomodem.service.AudioModemService.START".equals(intent.getAction())) {
            return null;
        }
        if (this.a == null) {
            if (d()) {
                this.a = b();
            }
        }
        this.d.post(new egc(this));
        return this.e;
    }

    public final void onCreate() {
        super.onCreate();
        this.e = new efq(this, this);
        thl thl = new thl(this);
        this.f = thl;
        thl.a(eew.class, (Object) new eew(this));
    }
}
