package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: alei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alei extends icn {
    final /* synthetic */ aleo a;

    public alei(aleo aleo) {
        this.a = aleo;
    }

    public final void a(Status status) {
        aleo aleo = this.a;
        alen alen = aleo.e;
        alek alek = aleo.f;
        if (alek != null) {
            aldp aldp = ((aldu) alek).b;
            aldp.f = false;
            aldp.as();
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void b(icl icl) {
        rhr<ilq> rhr = (rhr) icl;
        ArrayList arrayList = new ArrayList(rhr.a());
        try {
            for (ilq r : rhr) {
                arrayList.add(r.r());
            }
            rhr.c();
            aleo aleo = this.a;
            aleo.l = arrayList;
            alen alen = aleo.e;
            if (alen != null) {
                ((alee) alen).b.a(arrayList);
            }
            alek alek = aleo.f;
            if (alek != null) {
                ((aldu) alek).b.a(arrayList);
            }
        } catch (Throwable th) {
            rhr.c();
            throw th;
        }
    }
}
