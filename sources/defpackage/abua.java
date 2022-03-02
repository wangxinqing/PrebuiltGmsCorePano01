package defpackage;

import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.io.UnsupportedEncodingException;

/* renamed from: abua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abua extends tim {
    final /* synthetic */ abuc a;

    public abua(abuc abuc) {
        this.a = abuc;
    }

    public final void a(String str) {
        abuc abuc = this.a;
        acau acau = abuc.k;
        if (abuc.g != null && acau != null) {
            abuc.a.b("Disconnected from source device. %s", str);
            aucd aucd = this.a.d.g.b;
            int i = ((anxn) aucd.b).f + 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anxn anxn = (anxn) aucd.b;
            anxn anxn2 = anxn.i;
            anxn.a |= 16;
            anxn.f = i;
            abuc abuc2 = this.a;
            abuc2.j = null;
            abuc2.g = null;
            abuc2.l = false;
            acau.a();
            this.a.k = null;
        }
    }

    public final void a(String str, til til) {
        abuc.a.b("Incoming connection request from %s", str);
        if (this.a.f != null) {
            abuc.a.b("Stop fastpair advertising.", new Object[0]);
            this.a.f.a();
            this.a.f.b();
        }
        String str2 = til.a;
        abuc abuc = this.a;
        acby acby = null;
        try {
            try {
                acby acby2 = new acby(Base64.decode(str2.getBytes("UTF-8"), 0));
                if (acby2.a.length <= 3) {
                    acby = acby2;
                }
            } catch (IllegalArgumentException e) {
            }
        } catch (UnsupportedEncodingException e2) {
        }
        abuc.i = acby;
        acby acby3 = this.a.i;
        if (acby3 != null) {
            abuc.a.a("With name: %s", acby3);
            acan acan = this.a.d;
            int a2 = aceh.a((int) acby3.a[2]);
            aucd aucd = acan.h;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anvp anvp = (anvp) aucd.b;
            anvp anvp2 = anvp.h;
            anvp.g = a2 - 1;
            anvp.a |= 32;
        } else {
            abuc.a.a("With name: %s", str2);
        }
        abuc abuc2 = this.a;
        if (abuc2.g != null) {
            abuc.a.b("Connection to %s already in progress", this.a.g);
            this.a.e.a(str);
            return;
        }
        acbs acbs = abuc2.h;
        acau acau = abuc2.k;
        if (acau != null && acbs != null) {
            abuc2.g = str;
            String str3 = til.b;
            String a3 = acbz.a(str3, acbs.b().a());
            abuc abuc3 = this.a;
            byte[] bArr = abuc3.p;
            if (bArr != null) {
                abuc3.q = abwg.a(1, str3, bArr);
            }
            abuc abuc4 = this.a;
            abuc4.j = a3;
            abuc4.e.a(str, (tjd) new acbm(abuc4.r, abuc4.t));
            acar acar = this.a.d.g;
            aucd aucd2 = acar.b;
            int a4 = aoog.a(SystemClock.elapsedRealtime() - acar.a);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anxn anxn = (anxn) aucd2.b;
            anxn anxn2 = anxn.i;
            anxn.a |= 2;
            anxn.c = a4;
            acby acby4 = this.a.i;
            if (acby4 == null || !acby4.a()) {
                iwd iwd = abuc.a;
                StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 42);
                sb.append("Forwarding pin (");
                sb.append(a3);
                sb.append(") to bootstrap controller.");
                iwd.a(sb.toString(), new Object[0]);
                acau.a(a3);
            }
        }
    }

    public final void a(String str, tip tip) {
        acby acby;
        if (!str.equals(this.a.g)) {
            abuc.a.a("Unexpected endpoint (%s) result %s", str, tip.a);
            return;
        }
        acau acau = this.a.k;
        if (acau != null) {
            Status status = tip.a;
            if (!status.c()) {
                abuc.a.d("Connection to %s rejected (%d)", str, Integer.valueOf(status.i));
                acau.a(status.i);
                aucd aucd = this.a.d.g.b;
                int i = ((anxn) aucd.b).e + 1;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anxn anxn = (anxn) aucd.b;
                anxn anxn2 = anxn.i;
                anxn.a |= 8;
                anxn.e = i;
                this.a.g = null;
                return;
            }
            abuc.a.b("Connected to source device %s", str);
            acar acar = this.a.d.g;
            aucd aucd2 = acar.b;
            int a2 = aoog.a(SystemClock.elapsedRealtime() - acar.a);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anxn anxn3 = (anxn) aucd2.b;
            anxn anxn4 = anxn.i;
            anxn3.a |= 4;
            anxn3.d = a2;
            this.a.e.a();
            TargetConnectionArgs targetConnectionArgs = new TargetConnectionArgs();
            SourceDevice sourceDevice = new SourceDevice();
            abuc abuc = this.a;
            sourceDevice.c = !abuc.b.a() ? abuc.b.b() ? (byte) 2 : 0 : 1;
            sourceDevice.a.add(3);
            targetConnectionArgs.b = sourceDevice;
            targetConnectionArgs.a.add(2);
            abuc abuc2 = this.a;
            abuc2.l = true;
            if (abuc2.q == null || (acby = abuc2.i) == null || !acby.a()) {
                acau.a(new abvu(this.a.e, str), targetConnectionArgs);
                return;
            }
            abuc.a.a("Attempting to connect to source with out-of-band", new Object[0]);
            this.a.a(str);
        }
    }
}
