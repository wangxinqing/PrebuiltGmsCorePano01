package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;

/* renamed from: jst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jst extends jsv {
    final /* synthetic */ String a;
    final /* synthetic */ jsx b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jst(jsx jsx, jsw jsw, String str) {
        super(jsw);
        this.b = jsx;
        this.a = str;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jss(this.b.a, this.a);
    }
}
