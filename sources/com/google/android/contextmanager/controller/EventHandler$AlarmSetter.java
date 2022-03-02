package com.google.android.contextmanager.controller;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EventHandler$AlarmSetter extends nla {
    public final SparseArray a;
    public final HashMap b;
    public final long c;
    public final String d;
    public boolean e;
    public final /* synthetic */ bwn f;
    private final jbs g;
    private int h = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventHandler$AlarmSetter(bwn bwn) {
        super("contextmanager");
        this.f = bwn;
        this.g = new jbs(bwn.a);
        this.a = new SparseArray();
        this.b = new HashMap();
        this.c = SystemClock.elapsedRealtime();
        this.d = "CONTEXT_MANAGER_ALARM_WAKEUP";
        this.e = true;
    }

    public final void a(Context context, Intent intent) {
        if (!intent.hasExtra("alarmId") || !intent.hasExtra("sessionId")) {
            ((anih) ((anih) bxk.a.c()).a("com.google.android.contextmanager.controller.EventHandler$AlarmSetter", "a", 583, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EventHandler] No alarm id or session id found for intent: %s", (Object) intent);
        } else if (this.e) {
            this.f.a(new bwk(this, intent.getIntExtra("alarmId", Integer.MIN_VALUE), intent), bvq.a("EventHandler-delayed"));
        } else {
            ((anih) ((anih) bxk.a.c()).a("com.google.android.contextmanager.controller.EventHandler$AlarmSetter", "a", 589, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[EventHandler] Received an alarm but AlarmSetter has been stopped. intent=%s", (Object) intent);
        }
    }

    public final void a(Runnable runnable) {
        this.f.a();
        Pair pair = (Pair) this.b.get(runnable);
        if (pair != null) {
            int intValue = ((Integer) pair.first).intValue();
            this.g.a((PendingIntent) pair.second);
            this.b.remove(runnable);
            this.a.remove(intValue);
            Object[] objArr = {Integer.valueOf(intValue), Long.valueOf(this.c), runnable};
        }
    }

    public final void a(Runnable runnable, long j, bvp bvp) {
        this.f.a();
        a(runnable);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        int i = this.h + 1;
        this.h = i;
        Intent intent = new Intent(this.d);
        intent.setPackage("com.google.android.gms");
        intent.putExtra("alarmId", i);
        intent.putExtra("sessionId", this.c);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f.a, i, intent, 536870912);
        if (broadcast != null) {
            this.g.a(broadcast);
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.f.a, i, intent, 134217728);
        this.a.put(i, Pair.create(runnable, bvp));
        HashMap hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        hashMap.put(runnable, Pair.create(valueOf, broadcast2));
        Object[] objArr = {valueOf, Long.valueOf(j), Long.valueOf(this.c), runnable};
        int i2 = Build.VERSION.SDK_INT;
        this.g.b("CMAlarm", 2, elapsedRealtime, broadcast2, bvp.g);
    }
}
