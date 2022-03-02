package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: gkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkg implements DialogInterface.OnClickListener {
    final /* synthetic */ SourceChimeraActivity a;

    public gkg(SourceChimeraActivity sourceChimeraActivity) {
        this.a = sourceChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.l.b((Object) true);
        SourceChimeraActivity sourceChimeraActivity = this.a;
        if (!sourceChimeraActivity.f && !sourceChimeraActivity.c.isEnabled()) {
            this.a.b();
        }
    }
}
