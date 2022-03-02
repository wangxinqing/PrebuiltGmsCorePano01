package defpackage;

import java.util.List;

/* renamed from: aewm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewm extends awem {
    private final awef b;
    private final awef c;

    public aewm(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aewm.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aukd aukd;
        List list = (List) obj;
        int i = 0;
        aukh aukh = (aukh) list.get(1);
        aucx aucx = ((auke) list.get(0)).a;
        int size = aucx.size();
        while (true) {
            if (i < size) {
                aukd = (aukd) aucx.get(i);
                aukh aukh2 = aukd.c;
                if (aukh2 == null) {
                    aukh2 = aukh.c;
                }
                i++;
                if (aukh.equals(aukh2)) {
                    break;
                }
            } else {
                aukd = aukd.h;
                break;
            }
        }
        return aorl.a((Object) aukd);
    }
}
