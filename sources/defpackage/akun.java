package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: akun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akun implements akma {
    public int[] a;
    private final long b = SystemClock.elapsedRealtime();
    private final akhj c;
    private final boolean d;
    private final int e;
    private final ConnectivityManager f;
    private final akuk g;
    private final Queue h;

    public akun(ConnectivityManager connectivityManager, akhj akhj, boolean z, int i, akuk akuk) {
        this.f = connectivityManager;
        this.c = akhj;
        this.d = z;
        this.e = i;
        this.g = akuk;
        this.h = new ArrayDeque();
    }

    public static aobv b() {
        aucd o = aobv.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobv aobv = (aobv) o.b;
        aobv.b = 3;
        aobv.a |= 1;
        aocg aocg = aocg.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobv aobv2 = (aobv) o.b;
        aocg.getClass();
        aobv2.g = aocg;
        aobv2.a |= 64;
        return (aobv) o.i();
    }

    public final aobv a(int i) {
        aucd o = aobv.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobv aobv = (aobv) o.b;
        aobv.b = 1;
        aobv.a = 1 | aobv.a;
        int c2 = c();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobv aobv2 = (aobv) o.b;
        aobv2.e = c2 - 1;
        aobv2.a |= 8;
        int d2 = d();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobv aobv3 = (aobv) o.b;
        aobv3.h = d2 - 1;
        int i2 = aobv3.a | 128;
        aobv3.a = i2;
        aobv3.a = i2 | 4;
        aobv3.d = i;
        aoch aoch = aoch.f;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobv aobv4 = (aobv) o.b;
        aoch.getClass();
        aobv4.f = aoch;
        aobv4.a |= 16;
        return (aobv) o.i();
    }

    public final int c() {
        NetworkInfo activeNetworkInfo = this.f.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return 1;
        }
        if (activeNetworkInfo.getType() != 1) {
            return activeNetworkInfo.getType() == 0 ? 3 : 4;
        }
        return 2;
    }

    public final int d() {
        Intent registerReceiver = this.g.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("scale", -1);
            float f2 = (intExtra2 == -1 || intExtra3 == -1 || intExtra3 == 0) ? -1.0f : ((float) intExtra2) / ((float) intExtra3);
            if (intExtra != -1) {
                if (intExtra != 0) {
                    return 4;
                }
                if (f2 != -1.0f) {
                    return f2 >= 0.2f ? 3 : 2;
                }
                return 1;
            }
        }
        return 1;
    }

    public final aocf a() {
        aucd o = aocf.s.o();
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aocf aocf = (aocf) o.b;
        int i = aocf.a | 8;
        aocf.a = i;
        aocf.d = seconds;
        boolean z = this.d;
        int i2 = i | 16;
        aocf.a = i2;
        aocf.e = z;
        int i3 = this.e;
        aocf.a = i2 | 32;
        aocf.g = i3;
        int[] iArr = this.a;
        if (iArr != null) {
            List b2 = aoog.b(iArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aocf aocf2 = (aocf) o.b;
            if (!aocf2.f.a()) {
                aocf2.f = aucj.a(aocf2.f);
            }
            auab.a((Iterable) b2, (List) aocf2.f);
        }
        return (aocf) o.i();
    }

    public final aocf a(aobb aobb) {
        aocf a2 = a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 3;
        int i = aocf.a | 2;
        aocf.a = i;
        if (aobb != null) {
            aobb.getClass();
            aocf.j = aobb;
            aocf.a = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return (aocf) aucd.i();
    }

    public final aocf a(aobv aobv) {
        aocf a2 = a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 1;
        int i = aocf.a | 2;
        aocf.a = i;
        if (aobv != null) {
            aobv.getClass();
            aocf.h = aobv;
            aocf.a = i | 64;
        }
        return (aocf) aucd.i();
    }

    public final aocf a(aocn aocn) {
        aocf a2 = a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 10;
        int i = aocf.a | 2;
        aocf.a = i;
        if (aocn != null) {
            aocn.getClass();
            aocf.p = aocn;
            aocf.a = 32768 | i;
        }
        return (aocf) aucd.i();
    }

    public final void a(int i, int i2, int i3) {
        aucd o = aobh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobh aobh = (aobh) o.b;
        aobh.b = i - 1;
        aobh.a |= 1;
        aobh aobh2 = (aobh) o.b;
        aobh2.c = i2 - 1;
        aobh2.a |= 2;
        aobh aobh3 = (aobh) o.b;
        aobh3.d = i3 - 1;
        aobh3.a |= 4;
        aobh aobh4 = (aobh) o.i();
        aocf a2 = a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 8;
        int i4 = aocf.a | 2;
        aocf.a = i4;
        if (aobh4 != null) {
            aobh4.getClass();
            aocf.o = aobh4;
            aocf.a = i4 | FragmentTransaction.TRANSIT_EXIT_MASK;
        }
        a((aocf) aucd.i());
    }

    public final void a(int i, int i2, int i3, int i4) {
        aucd o = aobn.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobn aobn = (aobn) o.b;
        aobn.b = i - 1;
        aobn.a |= 1;
        aobn aobn2 = (aobn) o.b;
        aobn2.c = i2 - 1;
        aobn2.a |= 2;
        if (i3 != 0) {
            aobn aobn3 = (aobn) o.b;
            aobn3.d = i3 - 1;
            aobn3.a |= 4;
        }
        aobn aobn4 = (aobn) o.b;
        aobn4.a |= 8;
        aobn4.e = i4;
        aobn aobn5 = (aobn) o.i();
        aocf a2 = a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 11;
        int i5 = aocf.a | 2;
        aocf.a = i5;
        if (aobn5 != null) {
            aobn5.getClass();
            aocf.q = aobn5;
            aocf.a = 65536 | i5;
        }
        a((aocf) aucd.i());
    }

    public final void a(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        aucd o = aobz.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobz aobz = (aobz) o.b;
        int i8 = aobz.a | 2;
        aobz.a = i8;
        aobz.c = i2;
        int i9 = i8 | 1;
        aobz.a = i9;
        aobz.b = i;
        int i10 = i9 | 4;
        aobz.a = i10;
        aobz.d = i3;
        int i11 = i10 | 8;
        aobz.a = i11;
        aobz.e = i4;
        int i12 = i11 | 16;
        aobz.a = i12;
        aobz.f = i5;
        int i13 = i12 | 32;
        aobz.a = i13;
        aobz.g = z;
        aobz.h = i6 - 1;
        int i14 = i13 | 64;
        aobz.a = i14;
        aobz.i = i7 - 1;
        aobz.a = i14 | 128;
        aobz aobz2 = (aobz) o.i();
        aocf a2 = a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 5;
        int i15 = aocf.a | 2;
        aocf.a = i15;
        if (aobz2 != null) {
            aobz2.getClass();
            aocf.l = aobz2;
            aocf.a = i15 | 1024;
        }
        a((aocf) aucd.i());
    }

    public final void a(int i, boolean z, long j) {
        aucd o = aobk.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aobk aobk = (aobk) o.b;
        aobk.b = i - 1;
        int i2 = aobk.a | 1;
        aobk.a = i2;
        int i3 = i2 | 2;
        aobk.a = i3;
        aobk.c = z;
        aobk.a = i3 | 4;
        aobk.d = j;
        aobk aobk2 = (aobk) o.i();
        aocf a2 = a();
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aocf aocf = (aocf) aucd.b;
        aocf aocf2 = aocf.s;
        aocf.c = 12;
        int i4 = aocf.a | 2;
        aocf.a = i4;
        if (aobk2 != null) {
            aobk2.getClass();
            aocf.r = aobk2;
            aocf.a = 131072 | i4;
        }
        a((aocf) aucd.i());
    }

    public final void a(aocf aocf) {
        synchronized (this) {
            while (this.h.size() >= 50) {
                this.h.remove();
            }
            this.h.add(aocf);
        }
        if (azbk.a.a().t()) {
            akhj akhj = this.c;
            aucd o = anui.p.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anui anui = (anui) o.b;
            anui.b = 4;
            int i = anui.a | 1;
            anui.a = i;
            if (aocf != null) {
                aocf.getClass();
                anui.f = aocf;
                anui.a = i | 16;
            }
            akhj.a((anui) o.i());
        }
    }

    public final synchronized void a(PrintWriter printWriter) {
        if (!this.h.isEmpty()) {
            printWriter.println("\nPlace Inference Clearcut Logs:");
            for (aocf k : this.h) {
                printWriter.print(" ");
                printWriter.println(jhy.c(k.k()));
            }
        }
    }
}
