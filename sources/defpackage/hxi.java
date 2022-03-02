package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: hxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hxi extends qvr {
    final /* synthetic */ hxj a;
    private final Context b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hxi(hxj hxj, Context context) {
        super(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.a = hxj;
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int b2 = this.a.b(this.b);
        if (hxz.b(b2)) {
            this.a.a(this.b, b2);
        }
    }
}
