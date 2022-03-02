package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: abuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abuc implements abtz {
    public static final iwd a = acqa.a("D2D", "TargetDeviceConnectorNearbyConnections");
    public final acdw b;
    public final Context c;
    public final acan d;
    public final tiq e;
    public final acfu f;
    public String g;
    public acbs h;
    public acby i;
    public String j;
    public acau k;
    public boolean l;
    public boolean m = false;
    public String n;
    public byte[] o;
    public byte[] p;
    public abwg q;
    public final Handler r;
    public final tim s = new abua(this);
    public final tjd t = new abub(this);

    public abuc(abpo abpo) {
        tiq a2 = acec.a(abpo.a);
        this.c = abpo.a;
        this.e = a2;
        this.r = abpo.b;
        this.d = (acan) abpo.c;
        this.b = new acdw(this.c);
        int i2 = Build.VERSION.SDK_INT;
        abnb.e();
        this.f = new acfu(this.c);
    }

    public static byte[] b() {
        azkl.c();
        try {
            return abwg.b().getEncoded();
        } catch (NoSuchAlgorithmException e2) {
            a.e("AES key generator not supported.", e2, new Object[0]);
            return null;
        }
    }

    public final acwa a() {
        acfu acfu = this.f;
        if (acfu != null) {
            acfu.b();
            this.f.a();
        }
        if (this.k != null) {
            a.b("Stopping advertising.", new Object[0]);
            this.e.a();
        }
        this.k = null;
        String str = this.g;
        if (str == null) {
            return acws.a((Object) null);
        }
        if (!azjn.a.a().c() && !this.l) {
            a.b("Rejecting connection", new Object[0]);
            this.e.a(str);
        } else {
            a.b("Disconnecting from %s", str);
            this.e.g(str);
        }
        this.l = false;
        this.g = null;
        return acws.a((Object) null);
    }

    public final void a(String str) {
        try {
            abwg abwg = this.q;
            if (abwg != null) {
                this.e.a(str, tjc.a(abwg.a()));
                a.a("Sent encrypted auth token", new Object[0]);
                this.m = true;
            }
        } catch (GeneralSecurityException e2) {
            a.e("Encryption error", e2, new Object[0]);
        }
    }

    public final void a(byte[] bArr, String str) {
        try {
            this.m = false;
            abwg abwg = this.q;
            if (abwg != null) {
                abwg.a(bArr);
                a.a("Verified auth token", new Object[0]);
            }
            acau acau = this.k;
            if (acau != null) {
                acau.a(new abvu(this.e, str), new TargetConnectionArgs());
            }
        } catch (GeneralSecurityException e2) {
            a.e("Failed to validate authentication token", e2, new Object[0]);
            this.e.g(str);
        }
    }
}
