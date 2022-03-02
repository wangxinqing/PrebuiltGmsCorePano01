package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* renamed from: hdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdm extends hdr {
    public static final /* synthetic */ int c = 0;
    public final Handler b = new qvr(Looper.getMainLooper());
    private hdl d;
    private boolean e = false;

    private final hdl a() {
        if (this.d == null) {
            this.d = new hdl(this);
        }
        return this.d;
    }

    public final IBinder onBind(Intent intent) {
        IBinder a = a(intent);
        if (a != null) {
            return a;
        }
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        Log.w("GmsApiChimeraSvc", valueOf.length() == 0 ? new String("Failing connection to missing API ") : "Failing connection to missing API ".concat(valueOf));
        if (action == null || ish.a(awzi.a.a().b(), action)) {
            return null;
        }
        return awzi.a.a().a() ? new hdk(this, intent, a()) : a();
    }

    public final void onDestroy() {
        this.e = true;
        super.onDestroy();
    }

    public final IBinder a(Intent intent) {
        if (!this.e) {
            return super.onBind(intent);
        }
        return null;
    }
}
