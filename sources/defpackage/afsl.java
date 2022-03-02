package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: afsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afsl implements Callable {
    private final afso a;
    private final Map b;
    private final Map c;
    private final AtomicLong d;
    private final int e;

    public afsl(afso afso, Map map, Map map2, AtomicLong atomicLong, int i) {
        this.a = afso;
        this.b = map;
        this.c = map2;
        this.d = atomicLong;
        this.e = i;
    }

    public final Object call() {
        afso afso = this.a;
        Map map = this.b;
        Map map2 = this.c;
        AtomicLong atomicLong = this.d;
        int i = this.e;
        aucd o = aokc.g.o();
        for (String str : map.keySet()) {
            List c2 = amsk.a("|").c(str);
            Integer num = (Integer) map2.get(str);
            if (num == null) {
                num = -1;
            }
            aucd o2 = aojg.g.o();
            String str2 = (String) c2.get(0);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojg aojg = (aojg) o2.b;
            str2.getClass();
            aojg.a |= 1;
            aojg.b = str2;
            String str3 = (String) c2.get(1);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojg aojg2 = (aojg) o2.b;
            str3.getClass();
            aojg2.a |= 4;
            aojg2.d = str3;
            int intValue = num.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojg aojg3 = (aojg) o2.b;
            aojg3.a |= 2;
            aojg3.c = intValue;
            aojg aojg4 = (aojg) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokc aokc = (aokc) o.b;
            aojg4.getClass();
            if (!aokc.b.a()) {
                aokc.b = aucj.a(aokc.b);
            }
            aokc.b.add(aojg4);
            afsn afsn = (afsn) map.get(str);
            long j = afsn.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokc aokc2 = (aokc) o.b;
            if (!aokc2.c.a()) {
                aokc2.c = aucj.a(aokc2.c);
            }
            aokc2.c.a(j);
            long j2 = afsn.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokc aokc3 = (aokc) o.b;
            if (!aokc3.d.a()) {
                aokc3.d = aucj.a(aokc3.d);
            }
            aokc3.d.a(j2);
        }
        long j3 = atomicLong.get();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokc aokc4 = (aokc) o.b;
        aokc4.a |= 1;
        aokc4.e = j3;
        long j4 = 0;
        try {
            Uri a2 = afsp.a(afso.e, afso.g);
            if (afso.c.c(a2)) {
                j4 = ((Long) afso.c.a(a2, ahcl.a(), new agzk[0])).longValue();
            }
        } catch (IOException e2) {
            afsh.a((Throwable) e2, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
            afso.f.a("Failed to call Mobstore to compute MDD Directory bytes used!", e2);
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokc aokc5 = (aokc) o.b;
        aokc5.a |= 2;
        aokc5.f = j4;
        afso.d.a((aokc) o.i(), i);
        return null;
    }
}
