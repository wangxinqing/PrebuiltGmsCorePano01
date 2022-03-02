package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

/* renamed from: cyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cyu implements DialogInterface.OnShowListener {
    private final Dialog a;
    private final Uri b;

    public cyu(Dialog dialog, Uri uri) {
        this.a = dialog;
        this.b = uri;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Dialog dialog = this.a;
        Uri uri = this.b;
        TextView textView = (TextView) dialog.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (awgy.c()) {
                qb.a((View) textView, (oz) new cyz(uri));
            }
        }
    }
}
