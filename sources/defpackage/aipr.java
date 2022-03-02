package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: aipr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aipr implements PendingIntent.OnFinished {
    final PendingIntent h;
    final long i;
    final String j;
    final long k = SystemClock.elapsedRealtime();
    final boolean l;
    final String m;
    final ajrb n;
    final ajbg o;
    final boolean p;

    public aipr(PendingIntent pendingIntent, long j2, ajbg ajbg, ajrb ajrb, boolean z, boolean z2, String str) {
        this.h = pendingIntent;
        this.i = j2;
        this.o = ajbg;
        this.m = str;
        this.p = z;
        this.l = z2;
        this.j = pendingIntent.getTargetPackage();
        this.n = ajrb;
    }

    public void a() {
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i2, String str, Bundle bundle) {
        this.o.c(ajbe.PENDING_INTENT);
    }

    public boolean a(Context context, Intent intent) {
        this.o.b(ajbe.PENDING_INTENT, 10000, this.n);
        try {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("sending to ");
            sb.append(valueOf);
            sb.toString();
            jjy.a(this.h, context, 0, intent, (PendingIntent.OnFinished) this);
            return true;
        } catch (PendingIntent.CanceledException e) {
            String valueOf2 = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("pendingIntent cancelled ");
            sb2.append(valueOf2);
            sb2.toString();
            this.o.c(ajbe.PENDING_INTENT);
            a();
            return false;
        }
    }
}
