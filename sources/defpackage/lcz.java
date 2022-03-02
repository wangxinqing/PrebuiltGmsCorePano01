package defpackage;

import com.android.volley.VolleyError;

/* renamed from: lcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcz extends Thread {
    final /* synthetic */ int a;
    final /* synthetic */ lcx b;
    final /* synthetic */ lda c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lcz(lda lda, String str, int i, lcx lcx) {
        super(str);
        this.c = lda;
        this.a = i;
        this.b = lcx;
    }

    public final void run() {
        String str;
        ley ley;
        lcy lcy;
        lcy lcy2 = new lcy(false, 0, false);
        try {
            lda lda = this.c;
            int i = this.a;
            ith ith = lda.a;
            str = lda.d.a;
            ley = lda.c.j;
            ley.a(str);
            try {
                ldb ldb = new ldb(lda.d, lda.f, lda.e, i);
                lea lea = new lea(lda.c, lda.d, ldb.b());
                ldb.a(lea, lnk.a, lda.g);
                lea.a(lda.g, false);
                ldb.a(lda.g);
                lcy = lda.a(true);
                ley.b(str);
            } catch (VolleyError | InterruptedException | leo e) {
                lda.a.c("PreparedSyncMoreImpl", "Error syncing more.", e);
                ley.b(str);
                lcy = lda.a(false);
            }
            this.b.a(lcy);
        } catch (Throwable th) {
            this.b.a(lcy2);
            throw th;
        }
    }
}
