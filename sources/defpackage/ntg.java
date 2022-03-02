package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.GcmProxyIntentOperation;

/* renamed from: ntg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ntg extends qvr {
    final /* synthetic */ ntj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ntg(ntj ntj, Looper looper) {
        super(looper);
        this.a = ntj;
    }

    public final void handleMessage(Message message) {
        boolean z;
        ntj ntj = this.a;
        int i = message.sendingUid;
        if (message.what == 0) {
            if (message.what == 0) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z);
            if (!(message.obj instanceof Intent)) {
                Log.w("GCM", "Legacy message object not an intent");
                message = null;
            } else {
                Intent intent = (Intent) message.obj;
                Message obtain = Message.obtain();
                obtain.what = message.what;
                obtain.arg1 = 0;
                obtain.replyTo = nyq.b(intent);
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", false);
                bundle.putString("pkg", nyq.a(intent));
                bundle.putBundle("data", intent.getExtras());
                obtain.setData(bundle);
                message = obtain;
            }
            if (message == null) {
                return;
            }
        }
        String string = message.getData().getString("pkg");
        if (TextUtils.isEmpty(string)) {
            Log.w("GCM", "Invalid request, missing package name");
        } else if (!jni.b(ihs.b()).a(i, string)) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 28);
            sb.append("Invalid caller: ");
            sb.append(string);
            sb.append(" ");
            sb.append(i);
            Log.w("GCM", sb.toString());
        } else if (nqw.d() == 0) {
            ntj.a(message, 0);
        } else {
            Intent intent2 = new Intent("com.google.android.gms.gcm.MESSENGER_IPC_USER_FORWARD");
            intent2.putExtra("msg", message);
            GcmProxyIntentOperation.a((Context) ihs.b(), intent2);
        }
    }
}
