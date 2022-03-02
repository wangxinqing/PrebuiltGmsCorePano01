package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.cast.JGCastService;

/* renamed from: bix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bix extends Handler {
    final /* synthetic */ JGCastService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bix(JGCastService jGCastService, Looper looper) {
        super(looper);
        this.a = jGCastService;
    }

    public final void handleMessage(Message message) {
        biy biy = this.a.mListener;
        int i = message.what;
        int i2 = message.arg1;
        int i3 = message.arg2;
        Object obj = message.obj;
        biy.a(i, i2);
    }
}
