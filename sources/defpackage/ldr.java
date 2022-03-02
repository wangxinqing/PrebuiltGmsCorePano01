package defpackage;

import com.android.volley.VolleyError;
import java.util.Collections;

/* renamed from: ldr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ldr extends Thread {
    final /* synthetic */ int a;
    final /* synthetic */ ldt b;
    final /* synthetic */ kep c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ldr(ldt ldt, String str, int i, kep kep) {
        super(str);
        this.b = ldt;
        this.a = i;
        this.c = kep;
    }

    public final void run() {
        ldt ldt;
        lds lds;
        lds lds2 = new lds(false, Collections.EMPTY_LIST);
        try {
            ldt = this.b;
            int i = this.a;
            ith ith = ldt.a;
            ldu ldu = new ldu(ldt.c, ldt.e, ldt.d, i);
            lea lea = new lea(ldt.b, ldt.c, ldu.b());
            ldu.a(lea, lnk.a, ldt.f);
            lea.a(ldt.f, true);
            ldu.a(ldt.f);
            lds = ldt.a(true);
        } catch (VolleyError | InterruptedException | leo e) {
            ldt.a.c("PreparedSearch", "Full text search error.", e);
            lds = ldt.a(false);
        } catch (Throwable th) {
            this.c.a(lds2);
            throw th;
        }
        this.c.a(lds);
    }
}
