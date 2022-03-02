package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.cast.JGCastService;
import java.io.PrintWriter;

/* renamed from: aaan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaan {
    public boolean a;
    private boolean b;
    private boolean c;
    private final Intent d = new Intent("com.google.android.gms.gcm.TRIGGER_IDLE");
    private amri e = ampu.a;

    public final synchronized void a(PrintWriter printWriter) {
        printWriter.println("\nIdleness tracker states:");
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(16);
        sb.append("isScreenOn:");
        sb.append(z);
        printWriter.println(sb.toString());
        boolean z2 = this.c;
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append("isDockIdle:");
        sb2.append(z2);
        printWriter.println(sb2.toString());
        boolean z3 = this.b;
        StringBuilder sb3 = new StringBuilder(17);
        sb3.append("device idle:");
        sb3.append(z3);
        printWriter.println(sb3.toString());
    }

    public final synchronized boolean a() {
        return this.b;
    }

    public final synchronized void b() {
        if (!this.b) {
            if (this.a) {
                if (!this.c) {
                }
            }
            this.b = true;
            aabg.a().d.b(7);
        }
    }

    public final synchronized void a(jbs jbs, String str) {
        if (!str.equals("android.intent.action.DOCK_ACTIVE")) {
            this.a = true;
            this.c = false;
        } else {
            this.c = false;
        }
        if (this.e.a()) {
            jbs.a((PendingIntent) this.e.b());
            this.e = ampu.a;
        }
        if (this.b) {
            this.b = false;
        }
    }

    public final synchronized void a(jbs jbs, String str, Context context) {
        if (str.equals("android.intent.action.DOCK_IDLE")) {
            this.c = true;
        } else {
            this.a = false;
            this.c = false;
        }
        if (!this.e.a()) {
            this.e = amri.b(PendingIntent.getBroadcast(context, 0, this.d, JGCastService.FLAG_PRIVATE_DISPLAY));
            jbs jbs2 = jbs;
            jbs2.a("GCM", 3, axbn.a.a().H() + SystemClock.elapsedRealtime(), (PendingIntent) this.e.b(), "com.google.android.gms");
        }
    }
}
