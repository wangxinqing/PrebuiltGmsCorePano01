package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: qru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qru {
    private static final Long d = Long.valueOf(axvz.a.a().H());
    protected final aplf a;
    protected final Executor b;
    public final qsx c;

    public qru(aplf aplf, Executor executor, qsx qsx) {
        this.a = aplf;
        this.b = executor;
        this.c = qsx;
    }

    private final void a(Map map, List list, qri qri) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Long l : map.keySet()) {
            qsv qsv = (qsv) map.get(l);
            aplu a2 = a(qsv);
            if (a2 != null) {
                arrayList.add(a2);
                arrayList2.add(new qsw(qsv.g, qsv.h));
            }
        }
        if (!arrayList.isEmpty()) {
            acwa a3 = this.a.a((aplu[]) arrayList.toArray(new aplu[0]));
            qri.d(arrayList.size());
            aosh f = aosh.f();
            a3.a(this.b, (acvv) new qrp(this, qri, arrayList2, f));
            a3.a(this.b, (acvs) new qrq(qri, f));
            list.add(f);
        }
        map.clear();
    }

    public abstract aorr a();

    /* access modifiers changed from: protected */
    public abstract aplu a(qsv qsv);

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final aorr a(acwa acwa, Integer num) {
        aosh f = aosh.f();
        acwa.a(this.b, (acvv) new qrr(this, f, num));
        acwa.a(this.b, (acvs) new qrs(f));
        return f;
    }

    public final aorr a(qsg qsg, qri qri) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (qsg.a()) {
            qsv b2 = qsg.b();
            if (b2 != null && b2.b().booleanValue() && b2.c().booleanValue()) {
                hashMap.put(b2.g, b2);
                i++;
                if (((long) hashMap.size()) >= d.longValue() || !qsg.a() || i >= Integer.MAX_VALUE) {
                    a(hashMap, arrayList, qri);
                }
                if (i >= Integer.MAX_VALUE) {
                    break;
                }
            }
        }
        if (!hashMap.isEmpty()) {
            a(hashMap, arrayList, qri);
        }
        qsg.close();
        return aopr.a(aorl.a((Iterable) arrayList), (amqy) new qrt(qri), this.b);
    }
}
