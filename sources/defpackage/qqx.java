package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqx extends awem {
    private final awef b;
    private final awef c;
    private final bapu d;
    private final bapu e;
    private final awef f;
    private final awef g;
    private final awef h;

    public qqx(bapu bapu, bapu bapu2, awef awef, awef awef2, bapu bapu3, bapu bapu4, awef awef3, awef awef4, awef awef5) {
        super(bapu2, awey.a(qqx.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = bapu3;
        this.e = bapu4;
        this.f = aweu.a(awef3);
        this.g = aweu.a(awef4);
        this.h = aweu.a(awef5);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.f.b(), this.g.b(), this.h.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        Throwable th;
        List list = (List) obj;
        int i = 0;
        HashMap hashMap = (HashMap) list.get(0);
        Long l = (Long) list.get(1);
        bapu bapu = this.d;
        bapu bapu2 = this.e;
        qrg qrg = (qrg) list.get(2);
        qrd qrd = (qrd) list.get(3);
        Executor executor = (Executor) list.get(4);
        Long a = qrg.a();
        ArrayList arrayList = new ArrayList();
        qqv qqv = new qqv(qrg, new qrf(l, a));
        if (axvz.e()) {
            for (Integer intValue : hashMap.values()) {
                i += intValue.intValue();
            }
            if (((long) i) >= axvz.m() || hashMap.containsKey(2)) {
                qri qri = new qri(5);
                qri.c();
                qrd.a(qri);
                qrz b2 = ((qqi) bapu).a();
                qrm b3 = ((qqh) bapu2).a();
                qsj a2 = b2.a(l, (Long) null);
                try {
                    aorr a3 = b3.a((qsg) a2, qri);
                    if (a2 != null) {
                        a2.close();
                    }
                    aorl.a(a3, qqv, executor);
                    arrayList.add(a3);
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
        }
        return aopr.a(aorl.a((Iterable) arrayList), (amqy) new qqu(), executor);
        throw th;
    }
}
