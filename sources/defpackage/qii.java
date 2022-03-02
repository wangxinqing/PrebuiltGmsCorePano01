package defpackage;

import android.os.Bundle;

/* renamed from: qii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class qii extends qfd {
    final /* synthetic */ qij c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qii(qij qij, String str) {
        super(str);
        this.c = qij;
    }

    public abstract Bundle a(Bundle bundle, String str);

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        if (jkr.e()) {
            return new Bundle();
        }
        String string = bundle.getString("packageName");
        if (this.c.a(qfc, string)) {
            return a(bundle, string);
        }
        return new Bundle();
    }
}
