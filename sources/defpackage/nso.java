package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: nso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nso extends qvr {
    final /* synthetic */ nsp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nso(nsp nsp, Looper looper) {
        super(looper);
        this.a = nsp;
    }

    public final void handleMessage(Message message) {
        Handler handler;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("GCM", "Dropping invalid message");
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            nsp nsp = this.a;
            int i = nsp.e;
            nsp.d.add(intent);
            return;
        }
        nsp nsp2 = this.a;
        int i2 = nsp.e;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (!(stringExtra == null || (handler = (Handler) nsp2.c.remove(stringExtra)) == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            if (handler.sendMessage(obtain)) {
                return;
            }
        }
        intent.setPackage(this.a.b.getPackageName());
        this.a.b.sendBroadcast(intent);
    }
}
