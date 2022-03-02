package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: idk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class idk extends LifecycleCallback implements DialogInterface.OnCancelListener {
    private final Handler a = new qvr(Looper.getMainLooper());
    public volatile boolean b;
    public final AtomicReference c = new AtomicReference((Object) null);
    protected final hxj d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected idk(ify ify) {
        super(ify);
        hxj hxj = hxj.a;
        this.d = hxj;
    }

    private static final int a(idh idh) {
        if (idh != null) {
            return idh.a;
        }
        return -1;
    }

    public void a() {
        this.b = true;
    }

    /* access modifiers changed from: protected */
    public abstract void a(ConnectionResult connectionResult, int i);

    public void b() {
        this.b = false;
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public final void d() {
        this.c.set((Object) null);
        c();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, (PendingIntent) null), a((idh) this.c.get()));
        d();
    }

    public final void b(Bundle bundle) {
        idh idh = (idh) this.c.get();
        if (idh != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", idh.a);
            bundle.putInt("failed_status", idh.b.c);
            bundle.putParcelable("failed_resolution", idh.b.d);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        idh idh = (idh) this.c.get();
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else {
                int b2 = this.d.b(f());
                if (b2 != 0) {
                    z = false;
                }
                if (idh == null) {
                    return;
                }
                if (idh.b.c == 18 && b2 == 18) {
                    return;
                }
            }
        } else if (i2 != -1) {
            if (i2 != 0) {
                z = false;
            } else if (idh != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                idh idh2 = new idh(new ConnectionResult(i3, (PendingIntent) null, idh.b.toString()), a(idh));
                this.c.set(idh2);
                idh = idh2;
                z = false;
            } else {
                return;
            }
        }
        if (z) {
            d();
        } else if (idh != null) {
            a(idh.b, idh.a);
        }
    }

    public final void b(ConnectionResult connectionResult, int i) {
        idh idh = new idh(connectionResult, i);
        if (this.c.compareAndSet((Object) null, idh)) {
            this.a.post(new idj(this, idh));
        }
    }

    public final void a(Bundle bundle) {
        idh idh;
        if (bundle != null) {
            AtomicReference atomicReference = this.c;
            if (bundle.getBoolean("resolving_error", false)) {
                idh = new idh(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                idh = null;
            }
            atomicReference.set(idh);
        }
    }
}
