package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.util.Log;

/* renamed from: akwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akwl extends qvy {
    final /* synthetic */ akwm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akwl(akwm akwm) {
        super("places");
        this.a = akwm;
    }

    public final void a(ComponentName componentName) {
        this.a.c = null;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof akve) {
            this.a.c = (akvf) ((akve) iBinder).a.get();
            this.a.b.countDown();
        } else if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "onServiceConnected returned unexpected binder object. Most likely cause is multiple instances of the com.google.android.gms.persistent process");
        }
    }
}
