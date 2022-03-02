package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: qqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqy extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public qqy(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(qqy.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        Throwable th;
        Long l;
        long j;
        long j2;
        List list = (List) obj;
        int i = 0;
        Long l2 = (Long) list.get(0);
        qrg qrg = (qrg) list.get(1);
        new Object[1][0] = l2;
        qsl b2 = ((qsb) list.get(2)).b(l2, (Long) null);
        try {
            HashMap hashMap = new HashMap();
            if (b2 != null) {
                long j3 = Long.MIN_VALUE;
                long j4 = Long.MAX_VALUE;
                while (true) {
                    if (!b2.a()) {
                        break;
                    }
                    qsu qsu = (qsu) b2.b();
                    if (qsu != null && qsu.c().booleanValue()) {
                        if (axvz.h()) {
                            l = qsu.b().booleanValue() ? qsu.g : null;
                        } else {
                            l = qsu.a().booleanValue() ? qsu.f : null;
                        }
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = Long.MIN_VALUE;
                        }
                        long max = Math.max(j3, j);
                        if (l != null) {
                            j2 = l.longValue();
                        } else {
                            j2 = Long.MAX_VALUE;
                        }
                        j4 = Math.min(j4, j2);
                        Integer num = qsu.h;
                        if (hashMap.containsKey(num)) {
                            hashMap.put(num, Integer.valueOf(((Integer) hashMap.get(num)).intValue() + 1));
                        } else {
                            hashMap.put(num, 1);
                        }
                        j3 = max;
                    }
                    i++;
                    if (((long) i) >= axvz.m()) {
                        qrg.a(new qrf(l2, Long.valueOf(j4 - 1)));
                        break;
                    }
                }
                if (j3 > l2.longValue()) {
                    qrg.a(j3);
                }
                b2.close();
            }
            return aorl.a((Object) hashMap);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }
}
