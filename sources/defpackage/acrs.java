package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

/* renamed from: acrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acrs implements Runnable {
    private final acrz a;

    public acrs(acrz acrz) {
        this.a = acrz;
    }

    public final void run() {
        acrz acrz = this.a;
        synchronized (acrz.a) {
            if (acrz.e()) {
                acrz.g = true;
                acrz.d();
                if (acrz.e()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - acrz.e;
                    Context context = acrz.m;
                    String str = acrz.j;
                    String str2 = acrz.k;
                    String str3 = acrz.l;
                    int i = acrz.i;
                    List a2 = acrz.a();
                    boolean z = acrz.f;
                    if (jds.a()) {
                        jds.a(new WakeLockEvent(System.currentTimeMillis(), 16, str, i, jdl.a(a2), (String) null, elapsedRealtime, jiy.a(context), str2, jdl.a(context.getPackageName()), jiy.e(context), 0, str3, z));
                    }
                    acrz.b = 1;
                    acrz.f();
                }
            }
        }
    }
}
