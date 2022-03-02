package defpackage;

import java.util.List;

/* renamed from: vit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vit implements ax {
    private final vuk a;

    public vit(vuk vuk) {
        this.a = vuk;
    }

    public final void a(Object obj) {
        ct ctVar = (ct) obj;
        bx bxVar = this.a.a;
        if (ctVar != null) {
            if (bxVar.f == null && bxVar.g == null) {
                bxVar.e = ctVar.c();
            } else if (ctVar.c() != bxVar.e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = bxVar.h + 1;
        bxVar.h = i;
        ct ctVar2 = bxVar.f;
        if (ctVar != ctVar2) {
            ct ctVar3 = bxVar.g;
            if (ctVar == null) {
                int a2 = bxVar.a();
                ct ctVar4 = bxVar.f;
                if (ctVar4 != null) {
                    ctVar4.a(bxVar.i);
                    bxVar.f = null;
                } else if (bxVar.g != null) {
                    bxVar.g = null;
                }
                bxVar.a.b(0, a2);
                bxVar.b();
            } else if (ctVar2 == null && ctVar3 == null) {
                bxVar.f = ctVar;
                ctVar.a((List) null, bxVar.i);
                bxVar.a.a(0, ctVar.size());
                bxVar.b();
            } else {
                if (ctVar2 != null) {
                    ctVar2.a(bxVar.i);
                    bxVar.g = (ct) bxVar.f.g();
                    bxVar.f = null;
                }
                ct ctVar5 = bxVar.g;
                if (ctVar5 == null || bxVar.f != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                bxVar.b.a.execute(new bw(bxVar, ctVar5, (ct) ctVar.g(), i, ctVar));
            }
        }
    }
}
