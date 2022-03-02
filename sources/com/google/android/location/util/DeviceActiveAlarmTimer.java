package com.google.android.location.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceActiveAlarmTimer extends jgw {
    public final jgy b;
    public boolean c;
    public long d;
    public boolean e;
    public long f;
    private final ajpo g;
    private Handler h;
    private String i;
    private jgw j;
    private int k;
    private Collection l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceActiveAlarmTimer(Context context, Looper looper) {
        super("context");
        jgy a = jgy.a(context);
        ajpo ajpo = new ajpo(context);
        this.b = a;
        this.g = ajpo;
        this.h = new qvr(looper);
    }

    private final void f() {
        this.c = false;
        this.j = null;
        this.l = null;
        ajpo ajpo = this.g;
        if (jkr.b() && ajpo.f != null) {
            ajpo.a.unregisterReceiver(ajpo.c);
            ajpo.f = null;
        }
    }

    public final void a() {
        if (this.c) {
            d();
        }
    }

    public final void b() {
        if (this.c) {
            this.b.a((jgw) this);
            f();
        }
    }

    public final long c() {
        if (this.c) {
            return !this.e ? this.d - (SystemClock.elapsedRealtime() - this.f) : this.d;
        }
        return Long.MAX_VALUE;
    }

    public final void d() {
        jgw jgw = this.j;
        f();
        if (jgw != null) {
            jgw.a();
        }
    }

    public final void a(long j2, Collection collection, String str, jgw jgw) {
        if (!this.c) {
            ajpo ajpo = this.g;
            Handler handler = this.h;
            if (jkr.b()) {
                ajpo.e = ajpo.a();
                if (ajpo.f == null) {
                    ajpo.a.registerReceiver(ajpo.c, ajpo.d, (String) null, handler);
                }
                ajpo.f = this;
            }
            this.e = this.g.a();
        } else {
            this.b.a((jgw) this);
        }
        this.c = true;
        this.l = collection;
        this.k = 3;
        this.i = str;
        this.j = jgw;
        this.d = j2;
        if (!this.e) {
            e();
        }
    }

    public final void e() {
        this.f = SystemClock.elapsedRealtime();
        if (this.d > 0) {
            this.b.a(this.i, this.k, SystemClock.elapsedRealtime() + this.d, (jgw) this, this.h, isb.a(this.l));
            return;
        }
        d();
    }
}
