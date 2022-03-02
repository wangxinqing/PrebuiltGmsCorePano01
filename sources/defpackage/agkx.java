package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Debug;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: agkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkx implements Runnable {
    final /* synthetic */ agky a;
    private final long b;

    public agkx(agky agky, long j) {
        this.a = agky;
        this.b = j;
    }

    public final void run() {
        agky agky = this.a;
        anhq anhq = agky.a;
        long a2 = agky.k.a();
        if (this.b <= a2) {
            this.a.d();
            return;
        }
        agky agky2 = this.a;
        Intent registerReceiver = agky2.c.registerReceiver((BroadcastReceiver) null, agky2.j);
        agky agky3 = this.a;
        aucd o = baqz.e.o();
        bara a3 = agky3.a(registerReceiver);
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqz baqz = (baqz) o.b;
        a3.getClass();
        baqz.b = a3;
        baqz.a |= 1;
        baqz baqz2 = (baqz) o.i();
        File e = this.a.e();
        if (e != null) {
            this.a.f();
            String absolutePath = e.getAbsolutePath();
            agky agky4 = this.a;
            Debug.startMethodTracingSampling(absolutePath, agky4.e, agky4.f);
            agky agky5 = this.a;
            agky agky6 = this.a;
            agky5.m = ((aorv) agky5.d.a()).a((Runnable) new agkw(agky6, e, baqz2, Float.valueOf(agky6.b(registerReceiver)), Long.valueOf(this.b), Long.valueOf(a2)), this.b - a2, TimeUnit.MILLISECONDS);
            return;
        }
        ((anhn) ((anhn) agky.a.c()).a("agkx", "run", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't create file, aborting method sampling");
    }
}
