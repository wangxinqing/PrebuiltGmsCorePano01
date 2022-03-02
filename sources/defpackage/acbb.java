package defpackage;

import android.os.Handler;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: acbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acbb implements tdb {
    private final Handler a;
    public final tdb e;

    public acbb(tdb tdb) {
        this.e = tdb;
        this.a = null;
    }

    public final void a() {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new acaw(this));
        } else {
            this.e.a();
        }
    }

    public void b() {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new acaz(this));
        } else {
            this.e.b();
        }
    }

    public acbb(tdb tdb, Handler handler) {
        this.e = tdb;
        this.a = handler;
    }

    public void a(int i) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new acax(this, i));
        } else {
            this.e.a(i);
        }
    }

    public void b(String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new acba(this, str));
        } else {
            this.e.b(str);
        }
    }

    public void a(Device device, byte[] bArr) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new acav(this, device, bArr));
        } else {
            this.e.a(device, bArr);
        }
    }

    public final void a(String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new acay(this, str));
        } else {
            this.e.a(str);
        }
    }
}
