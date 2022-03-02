package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.iid.MessengerCompat;

/* renamed from: ntj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntj {
    public final Messenger a;
    public final MessengerCompat b;
    private final Object c = new Object();
    private final SparseArray d = new SparseArray();

    public ntj() {
        Looper mainLooper = Looper.getMainLooper();
        int i = Build.VERSION.SDK_INT;
        this.a = new Messenger(new ntg(this, mainLooper));
        this.b = null;
    }

    public final void a(int i, nti nti) {
        boolean z;
        synchronized (this.c) {
            if (this.d.get(i) == null) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z, (Object) "Multiple callbacks registered for same what");
            this.d.put(i, nti);
        }
    }

    public final void a(Message message, int i) {
        nti nti;
        nth nth = new nth(message, i);
        if (!TextUtils.isEmpty(nth.c.a) && nth.d != null && nth.e != null) {
            synchronized (this.c) {
                nti = (nti) this.d.get(nth.a);
            }
            if (nti == null) {
                int i2 = nth.a;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Invalid request, no callback for what: ");
                sb.append(i2);
                Log.w("GCM", sb.toString());
                Bundle bundle = new Bundle();
                bundle.putBoolean("unsupported", true);
                nth.a(bundle);
                return;
            }
            nti.a(nth);
            if (nth.b) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("ack", true);
                nth.a(bundle2);
            }
        }
    }
}
