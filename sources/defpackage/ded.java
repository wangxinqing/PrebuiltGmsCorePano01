package defpackage;

import android.content.Intent;

/* renamed from: ded  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ded implements cyh {
    final /* synthetic */ dee a;

    public ded(dee dee) {
        this.a = dee;
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
        dhy dhy = this.a.a;
        dhy.c.a(((dfk) dhy.a).a);
    }
}
