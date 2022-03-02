package defpackage;

import android.content.DialogInterface;

/* renamed from: gld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gld implements DialogInterface.OnClickListener {
    final /* synthetic */ glf a;

    public gld(glf glf) {
        this.a = glf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b.a();
        this.a.b().b(glf.a, true);
    }
}
