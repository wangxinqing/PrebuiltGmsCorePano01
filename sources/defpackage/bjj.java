package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.IntentService;

/* renamed from: bjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjj extends Handler {
    final /* synthetic */ IntentService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjj(IntentService intentService, Looper looper) {
        super(looper);
        this.a = intentService;
    }

    public final void handleMessage(Message message) {
        this.a.onHandleIntent((Intent) message.obj);
        this.a.stopSelf(message.arg1);
    }
}
