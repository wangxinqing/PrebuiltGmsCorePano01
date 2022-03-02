package defpackage;

import android.content.Context;
import android.os.Process;

/* renamed from: agjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjt {
    public static basc a(String str, Context context) {
        aucd o = basc.f.o();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (o.c) {
            o.c();
            o.c = false;
        }
        basc basc = (basc) o.b;
        basc.a |= 1;
        basc.b = elapsedCpuTime;
        boolean b = agjs.b(context);
        if (o.c) {
            o.c();
            o.c = false;
        }
        basc basc2 = (basc) o.b;
        basc2.a |= 2;
        basc2.c = b;
        int activeCount = Thread.activeCount();
        if (o.c) {
            o.c();
            o.c = false;
        }
        basc basc3 = (basc) o.b;
        int i = basc3.a | 4;
        basc3.a = i;
        basc3.d = activeCount;
        if (str != null) {
            str.getClass();
            basc3.a = i | 8;
            basc3.e = str;
        }
        return (basc) o.i();
    }
}
