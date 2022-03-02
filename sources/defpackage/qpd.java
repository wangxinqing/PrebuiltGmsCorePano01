package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: qpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpd extends awem {
    private final awef b;
    private final awef c;
    private final bapu d;
    private final bapu e;
    private final awef f;
    private final awef g;
    private final awef h;
    private final awef i;

    public qpd(bapu bapu, bapu bapu2, awef awef, awef awef2, bapu bapu3, bapu bapu4, awef awef3, awef awef4, awef awef5, awef awef6) {
        super(bapu2, awey.a(qpd.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = bapu3;
        this.e = bapu4;
        this.f = aweu.a(awef3);
        this.g = aweu.a(awef4);
        this.h = aweu.a(awef5);
        this.i = aweu.a(awef6);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.f.b(), this.g.b(), this.h.b(), this.i.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        Throwable th;
        Throwable th2;
        List list = (List) obj;
        qsb qsb = (qsb) list.get(1);
        bapu bapu = this.d;
        bapu bapu2 = this.e;
        int i2 = 2;
        Executor executor = (Executor) list.get(2);
        qrg qrg = (qrg) list.get(3);
        qrd qrd = (qrd) list.get(4);
        int i3 = 5;
        qrf qrf = (qrf) list.get(5);
        qrd.c();
        ArrayList arrayList = new ArrayList();
        for (qrf qrf2 : (Set) list.get(0)) {
            Long l = qrf2.a;
            Long l2 = qrf2.b;
            HashSet<Integer> hashSet = new HashSet<>();
            qsl b2 = qsb.b(l, l2);
            if (b2 != null) {
                while (b2.a()) {
                    try {
                        qsu qsu = (qsu) b2.b();
                        if (qsu != null && qsu.c().booleanValue()) {
                            hashSet.add(qsu.h);
                        }
                    } catch (Throwable th3) {
                        apev.a(th2, th3);
                    }
                }
            }
            if (b2 != null) {
                b2.close();
            }
            for (Integer intValue : hashSet) {
                if (intValue.intValue() == i2) {
                    if (!axvz.e()) {
                        i2 = 2;
                        i3 = 5;
                    } else if (qrf2.a.longValue() == 0) {
                        qri qri = new qri(i3);
                        qri.c();
                        qrd.a(qri);
                        qrz b3 = ((qqi) bapu).a();
                        qrm b4 = ((qqh) bapu2).a();
                        qsj a = b3.a(qrf2.a, qrf2.b);
                        try {
                            aorr a2 = aopr.a(b4.a((qsg) a, qri), (amqy) new qpb(qrf2), executor);
                            if (a != null) {
                                a.close();
                            }
                            arrayList.add(a2);
                            i2 = 2;
                            i3 = 5;
                        } catch (Throwable th4) {
                            apev.a(th, th4);
                        }
                    } else {
                        i2 = 2;
                        i3 = 5;
                    }
                }
            }
            i2 = 2;
            i3 = 5;
        }
        return aopr.a(aorl.a((Iterable) arrayList), (amqy) new qpa(qrf, qrg), executor);
        throw th2;
        throw th;
    }
}
