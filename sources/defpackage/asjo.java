package defpackage;

import java.io.IOException;

/* renamed from: asjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asjo implements ashq {
    final /* synthetic */ asjp a;

    public asjo(asjp asjp) {
        this.a = asjp;
    }

    public final void a() {
    }

    public final void run() {
        try {
            asjp asjp = this.a;
            ashv ashv = asjp.b;
            asfp asfp = asjp.a.c;
            if (asfp == null) {
                asfp = asfp.c;
            }
            ashv.a(asfp.b.k());
        } catch (IOException e) {
            throw new RuntimeException("Error sending payload.", e);
        }
    }
}
