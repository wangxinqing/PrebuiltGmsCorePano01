package defpackage;

import android.widget.Toast;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: gkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkd implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ SourceChimeraActivity b;

    public gkd(SourceChimeraActivity sourceChimeraActivity, int i) {
        this.b = sourceChimeraActivity;
        this.a = i;
    }

    public final void run() {
        Toast.makeText(this.b, this.a, 1).show();
    }
}
