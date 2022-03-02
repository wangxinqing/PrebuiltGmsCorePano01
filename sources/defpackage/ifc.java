package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: ifc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ifc implements ifw, idv {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final hxk d;
    public final ifb e;
    final Map f;
    final Map g = new HashMap();
    final ise h;
    final Map i;
    public volatile iez j;
    int k;
    final iey l;
    final ifv m;
    final ibn n;
    private ConnectionResult o = null;

    public ifc(Context context, iey iey, Lock lock, Looper looper, hxk hxk, Map map, ise ise, Map map2, ibn ibn, ArrayList arrayList, ifv ifv) {
        this.c = context;
        this.a = lock;
        this.d = hxk;
        this.f = map;
        this.h = ise;
        this.i = map2;
        this.n = ibn;
        this.l = iey;
        this.m = ifv;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((idu) arrayList.get(i2)).b = this;
        }
        this.e = new ifb(this, looper);
        this.b = lock.newCondition();
        this.j = new ieu(this);
    }

    public final ConnectionResult a(long j2, TimeUnit timeUnit) {
        a();
        long nanos = timeUnit.toNanos(j2);
        while (e()) {
            if (nanos > 0) {
                try {
                    nanos = this.b.awaitNanos(nanos);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, (PendingIntent) null);
                }
            } else {
                c();
                return new ConnectionResult(14, (PendingIntent) null);
            }
        }
        if (d()) {
            return ConnectionResult.a;
        }
        ConnectionResult connectionResult = this.o;
        return connectionResult == null ? new ConnectionResult(13, (PendingIntent) null) : connectionResult;
    }

    public final boolean a(fwa fwa) {
        return false;
    }

    public final ConnectionResult b() {
        a();
        while (e()) {
            try {
                this.b.await();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (d()) {
            return ConnectionResult.a;
        }
        ConnectionResult connectionResult = this.o;
        return connectionResult == null ? new ConnectionResult(13, (PendingIntent) null) : connectionResult;
    }

    public final void c() {
        if (this.j.b()) {
            this.g.clear();
        }
    }

    public final boolean d() {
        return this.j instanceof iei;
    }

    public final boolean e() {
        return this.j instanceof iet;
    }

    public final void f() {
    }

    public final void g(Bundle bundle) {
        this.a.lock();
        try {
            this.j.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    public final idf b(idf idf) {
        idf.e();
        return this.j.a(idf);
    }

    public final idf a(idf idf) {
        idf.e();
        this.j.b(idf);
        return idf;
    }

    public final void a() {
        this.j.c();
    }

    public final void a(int i2) {
        this.a.lock();
        try {
            this.j.a(i2);
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.o = connectionResult;
            this.j = new ieu(this);
            this.j.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ifa ifa) {
        this.e.sendMessage(this.e.obtainMessage(1, ifa));
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.j);
        for (ibq ibq : this.i.keySet()) {
            printWriter.append(str).append(ibq.a).println(":");
            ((ibo) this.f.get(ibq.a())).a(concat, printWriter);
        }
    }
}
