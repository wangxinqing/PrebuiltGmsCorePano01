package defpackage;

import java.util.ArrayList;

/* renamed from: aexj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexj extends awem {
    private final awef b;

    public aexj(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aexj.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        ArrayList arrayList = new ArrayList();
        amzy amzy = ((afcd) obj).a;
        int size = amzy.size();
        int i = 0;
        while (i < size) {
            aulg aulg = (aulg) amzy.get(i);
            aucd o = aukq.f.o();
            auay auay = aulg.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aukq aukq = (aukq) o.b;
            auay.getClass();
            int i2 = aukq.a | 4;
            aukq.a = i2;
            aukq.d = auay;
            long j = aulg.d;
            aukq.a = i2 | 1;
            aukq.b = j;
            aucd o2 = aukc.e.o();
            aulf a = aulf.a(aulg.b);
            if (a == null) {
                a = aulf.UNKNOWN;
            }
            if (a.ordinal() == 1) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aukc aukc = (aukc) o2.b;
                aukc.d = 4;
                aukc.a = 1 | aukc.a;
                aukq aukq2 = (aukq) o.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aukc aukc2 = (aukc) o2.b;
                aukq2.getClass();
                aukc2.c = aukq2;
                aukc2.b = 4;
                arrayList.add((aukc) o2.i());
                i++;
            } else {
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("Don't know what local Footprints change type ");
                sb.append(valueOf);
                sb.append(" means");
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        return aorl.a((Object) arrayList);
    }
}
