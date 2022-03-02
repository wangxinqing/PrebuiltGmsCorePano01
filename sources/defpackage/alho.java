package defpackage;

import android.util.Log;
import android.view.View;

/* renamed from: alho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alho implements Runnable {
    final /* synthetic */ alhp a;

    public alho(alhp alhp) {
        this.a = alhp;
    }

    public final void run() {
        View peekDecorView = this.a.b.peekDecorView();
        if (peekDecorView == null) {
            alhp alhp = this.a;
            int i = alhp.c - 1;
            alhp.c = i;
            if (i < 0) {
                String valueOf = String.valueOf(alhp.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Cannot get decor view of window: ");
                sb.append(valueOf);
                Log.w("SystemBarHelper", sb.toString());
                return;
            }
            alhp.a.post(alhp.e);
            return;
        }
        this.a.d.a(peekDecorView);
    }
}
