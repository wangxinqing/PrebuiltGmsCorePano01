package defpackage;

import android.os.Bundle;

/* renamed from: qic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class qic extends qfd {
    final /* synthetic */ qij c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qic(qij qij, String str) {
        super(str);
        this.c = qij;
    }

    public abstract Bundle a(Bundle bundle);

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        if (jkr.e()) {
            return new Bundle();
        }
        qij qij = this.c;
        if (qfc.a == qij.b || qij.f.b(qfc.a) || qij.f.a(qfc.a)) {
            return a(bundle);
        }
        return null;
    }
}
