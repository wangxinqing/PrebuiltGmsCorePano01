package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: cyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cyz extends oz {
    final /* synthetic */ Uri b;

    public cyz(Uri uri) {
        this.b = uri;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        view.setLongClickable(false);
        view.setOnClickListener(new cyy(this.b));
    }
}
