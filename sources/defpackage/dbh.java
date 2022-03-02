package defpackage;

import android.content.Intent;

/* renamed from: dbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dbh implements cyh {
    final /* synthetic */ dbi a;

    public dbh(dbi dbi) {
        this.a = dbi;
    }

    public final void a(cyf cyf) {
        if (!cyf.e) {
            Intent intent = cyf.f;
            if (intent != null) {
                this.a.startActivityForResult(intent, 9);
                return;
            }
            return;
        }
        dfx dfx = this.a.a;
        dfx.b.a(((dff) dfx.a).a);
    }
}
