package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: nth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nth {
    public final int a;
    public final boolean b;
    public final ntx c;
    public final Bundle d;
    public final Messenger e;
    private final int f;

    public nth(Message message, int i) {
        Bundle data = message.getData();
        this.a = message.what;
        this.b = data.getBoolean("oneWay", false);
        this.c = ntx.a(data.getString("pkg"), i);
        this.f = message.arg1;
        this.d = data.getBundle("data");
        this.e = message.replyTo;
    }

    public final void a(Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = this.a;
        obtain.arg1 = this.f;
        obtain.setData(bundle);
        try {
            this.e.send(obtain);
        } catch (RemoteException e2) {
            int i = this.f;
            StringBuilder sb = new StringBuilder(47);
            sb.append("Failed sending response to request: ");
            sb.append(i);
            Log.w("GCM", sb.toString());
        }
    }
}
