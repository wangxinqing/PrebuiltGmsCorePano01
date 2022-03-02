package defpackage;

import java.util.ArrayList;

/* renamed from: aqgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqgt implements qup {
    public final ArrayList a = new ArrayList();
    protected int b = 1;

    public aqgt(aqjh aqjh) {
        ativ.a((Object) aqjh, (Object) "EvidenceListener can not be null!");
        this.a.add(aqjh);
    }

    public final void a(int i, long j) {
        if (i == this.b) {
            a(new aqjb(4, aqjs.a(j)));
        }
    }

    public final void a(aqjb aqjb) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aqjh) arrayList.get(i)).b(aqjb);
        }
    }
}
