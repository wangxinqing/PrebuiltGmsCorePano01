package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: bwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwq extends bwp {
    private final bsz c;

    public bwq(bsz bsz) {
        super("DeleteAccountOperation");
        this.c = bsz;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        cbi.y().c(this.c);
        cjd p = cbi.p();
        ContextManagerClientInfo a = cbi.a(this.c, "DeleteAccountOperation");
        cjr cjr = p.a;
        bsz a2 = a.a();
        cjr.a(a2);
        cbi.o().b(a2);
        cjo q = cbi.q();
        juk juk = new juk(this.c);
        juu juu = new juu();
        juu.b();
        TimeFilterImpl a3 = juu.a();
        for (int a4 : jui.a) {
            juk.a(a4, a3);
        }
        q.b(juk.a());
        byd E = cbi.E();
        bsz bsz = this.c;
        if (bsz != null) {
            E.e();
            byg byg = E.b;
            iva.a((Object) bsz);
            ArrayList arrayList = new ArrayList();
            for (bwa bwa : byg.c.keySet()) {
                if (bsz.equals(bwa.a())) {
                    arrayList.add(bwa);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                E.a((bwa) arrayList.get(i));
            }
        }
        cbi.r().a(this.c, (bvt) null);
    }
}
