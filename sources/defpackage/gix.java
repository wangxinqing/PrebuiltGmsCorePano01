package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.os.Handler;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallLoader$2;

/* renamed from: gix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gix extends Loader {
    public static final iwd a = ehv.a("AuthManaged", "PhoneskyDpcInstallLoader");
    private static final Intent h = new Intent().setPackage("com.android.vending").setAction("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");
    final ServiceConnection b = new giu(this, "auth_managed");
    final BroadcastReceiver c = new PhoneskyDpcInstallLoader$2(this, "auth_managed");
    final PackageInstaller.SessionCallback d = new giv(this);
    public final String e;
    public final PackageInstaller f;
    public cpw g;
    private final jca i;
    private Handler j;
    private int k = -4;
    private int l = 0;
    private boolean m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gix(Context context, String str) {
        super(context);
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        jca a2 = jca.a();
        iva.c(str);
        this.e = str;
        iva.a((Object) packageInstaller);
        this.f = packageInstaller;
        iva.a((Object) a2);
        this.i = a2;
    }

    public final void a(Integer num) {
        if (num.intValue() >= 0) {
            this.l = num.intValue();
        } else {
            this.k = num.intValue();
        }
        if (isStarted()) {
            this.j.post(new giw(this, num));
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        if (this.m) {
            this.i.a(getContext(), this.b);
            getContext().unregisterReceiver(this.c);
            this.f.unregisterSessionCallback(this.d);
            this.j = null;
            this.m = false;
        }
        this.k = -4;
        this.l = 0;
    }

    public final void onStartLoading() {
        if (!this.m) {
            this.j = new qvr();
            if (!this.i.a(getContext(), h, this.b, 1)) {
                a.e("Failed to bind install service.", new Object[0]);
                this.i.a(getContext(), this.b);
                a(-3);
                return;
            }
            this.f.registerSessionCallback(this.d);
            getContext().registerReceiver(this.c, new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS"));
            this.m = true;
            a(Integer.valueOf(this.k));
            a(Integer.valueOf(this.l));
        }
    }
}
