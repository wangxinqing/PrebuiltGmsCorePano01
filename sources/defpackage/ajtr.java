package defpackage;

import android.os.Bundle;
import android.view.View;

/* renamed from: ajtr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajtr extends oz {
    final /* synthetic */ ajtu b;

    public ajtr(ajtu ajtu) {
        this.b = ajtu;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        if (this.b.a) {
            qsVar.a(1048576);
            qsVar.f(true);
            return;
        }
        qsVar.f(false);
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            ajtu ajtu = this.b;
            if (ajtu.a) {
                ajtu.cancel();
                return true;
            }
        }
        return super.a(view, i, bundle);
    }
}
