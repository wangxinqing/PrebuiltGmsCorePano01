package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: jpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jpq implements DialogInterface.OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public jpq(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.b;
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
    }
}
