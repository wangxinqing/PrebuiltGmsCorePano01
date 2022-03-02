package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: odo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class odo implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ods c;

    public odo(ods ods, String str, Uri uri) {
        this.c = ods;
        this.a = str;
        this.b = uri;
    }

    public void onClick(View view) {
        okg.a((nzu) this.c.o, 161, this.a);
        this.c.o.s().a(this.b, 1);
    }
}
