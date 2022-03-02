package defpackage;

import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;

/* renamed from: akmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akmm implements aknh {
    final /* synthetic */ akmn a;
    private final long b;

    public akmm(akmn akmn, long j) {
        this.a = akmn;
        this.b = j;
    }

    public final void a() {
        this.a.e.a(5, 5, 1, 0);
        akof a2 = aklz.a();
        StringBuilder sb = new StringBuilder(58);
        sb.append("Failed to download model weights. Status code: 7");
        a2.b(sb.toString());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        akma akma = this.a.e;
        long j2 = elapsedRealtime - j;
        aobv b2 = akun.b();
        aucd aucd = (aucd) b2.c(5);
        aucd.a((aucj) b2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv = (aobv) aucd.b;
        aobv aobv2 = aobv.j;
        int i = 3;
        aobv.c = 3;
        aobv.a |= 2;
        akun akun = (akun) akma;
        int c = akun.c();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv3 = (aobv) aucd.b;
        aobv3.e = c - 1;
        int i2 = aobv3.a | 8;
        aobv3.a = i2;
        aobv3.a = i2 | 4;
        aobv3.d = (int) j2;
        int d = akun.d();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv4 = (aobv) aucd.b;
        aobv4.h = d - 1;
        aobv4.a |= 128;
        if (!azda.e()) {
            i = 2;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv5 = (aobv) aucd.b;
        aobv5.i = i - 1;
        aobv5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        akun.a(akun.a((aobv) aucd.i()));
        this.a.b = 0;
    }

    public final void a(assl assl) {
        akmd akmd;
        int i;
        aklz.a();
        int i2 = assl.U;
        if (i2 == -1) {
            i2 = aueh.a.a((Object) assl).b(assl);
            assl.U = i2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Downloaded models. Bytes: ");
        sb.append(i2);
        sb.toString();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        akma akma = this.a.e;
        long j2 = elapsedRealtime - j;
        int i3 = assl.U;
        if (i3 == -1) {
            i3 = aueh.a.a((Object) assl).b(assl);
            assl.U = i3;
        }
        aobv b2 = akun.b();
        aucd aucd = (aucd) b2.c(5);
        aucd.a((aucj) b2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv = (aobv) aucd.b;
        aobv aobv2 = aobv.j;
        aobv.c = 1;
        aobv.a |= 2;
        akun akun = (akun) akma;
        int c = akun.c();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv3 = (aobv) aucd.b;
        aobv3.e = c - 1;
        int i4 = aobv3.a | 8;
        aobv3.a = i4;
        aobv3.a = i4 | 4;
        aobv3.d = (int) j2;
        aucd o = aocg.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aocg aocg = (aocg) o.b;
        aocg.a |= 1;
        aocg.b = i3;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv4 = (aobv) aucd.b;
        aocg aocg2 = (aocg) o.i();
        aocg2.getClass();
        aobv4.g = aocg2;
        aobv4.a |= 64;
        int d = akun.d();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv5 = (aobv) aucd.b;
        aobv5.h = d - 1;
        aobv5.a |= 128;
        int i5 = !azda.e() ? 2 : 3;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aobv aobv6 = (aobv) aucd.b;
        aobv6.i = i5 - 1;
        aobv6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        akun.a(akun.a((aobv) aucd.i()));
        try {
            if (assl.c.size() == 1) {
                asve[] asveArr = {(asve) assl.c.get(0)};
                akmd a2 = akmo.a((auac[]) asveArr, akuo.d());
                akmn akmn = this.a;
                if (a2 != null && ((akmd = akmn.d) == null || (i = akmd.e) == 0 || a2.e != i)) {
                    akmn.e.a(5, 2, 2, a2.e);
                    if (!azbh.b()) {
                        this.a.a(a2);
                        akmn akmn2 = this.a;
                        akmn2.f.execute(new akmh(akmn2, asveArr));
                        return;
                    }
                    this.a.a((auac[]) asveArr);
                    akmn akmn3 = this.a;
                    akmn3.a(new akml(akmn3, 0));
                    return;
                }
                akmn.f.execute(new akmg(akmn));
                return;
            }
            throw new IOException("Invalid response");
        } catch (IOException e) {
            this.a.e.a(5, 4, 1, 0);
            aklz.a().b("Failed to parse downloaded model weights");
            this.a.b = 0;
        }
    }
}
