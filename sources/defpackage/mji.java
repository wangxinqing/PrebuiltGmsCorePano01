package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: mji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mji implements DialogInterface.OnClickListener {
    final /* synthetic */ mhg a;
    final /* synthetic */ mjk b;

    public mji(mjk mjk, mhg mhg) {
        this.b = mjk;
        this.a = mhg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((apkr) this.a.a).e)));
        this.b.a.r.a(3, 2);
        this.b.a.c(-5);
    }
}
