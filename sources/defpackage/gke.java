package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: gke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gke implements DialogInterface.OnCancelListener {
    final /* synthetic */ SourceChimeraActivity a;

    public gke(SourceChimeraActivity sourceChimeraActivity) {
        this.a = sourceChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.l.b((Object) false);
        this.a.d();
    }
}
