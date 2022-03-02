package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bml {
    public static final long a = TimeUnit.SECONDS.toMillis(60);
    public String b;
    public ExecutorService c;
    public ThreadPoolExecutor d;
    public final bnh e;
    public final ReentrantLock f;
    public final Map g = qug.a();
    public int h;
    public final Queue i;
    public final Map j;
    public final Context k;
    public final bmg l;
    public final boolean m;
    public final Runnable n;

    public bml(ReentrantLock reentrantLock, bnh bnh, Context context, bmg bmg) {
        boolean z = false;
        this.h = 0;
        this.i = new ConcurrentLinkedQueue();
        this.j = qug.a();
        this.n = new bmc(this);
        this.f = reentrantLock;
        this.e = bnh;
        this.k = context;
        this.l = bmg;
        bkn.b();
        if (hei.j()) {
            bkn.b();
            if (awxo.a.a().c()) {
                z = true;
            }
        }
        this.m = z;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    static /* synthetic */ void a(bml bml) {
        bml.h--;
    }

    public final bmh a(Intent intent, int i2, int i3, List list) {
        return new bmh(this, intent, i2, i3, list);
    }
}
