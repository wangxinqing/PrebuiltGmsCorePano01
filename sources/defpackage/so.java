package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: so  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class so extends Handler {
    private final WeakReference a;

    public so(DialogInterface dialogInterface) {
        this.a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
