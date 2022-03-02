package defpackage;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: owo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class owo extends ppr {
    final /* synthetic */ isv a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ owp e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owo(owp owp, aonk aonk, String str, isv isv, String str2, int i, int i2) {
        super(aonk, 1, str);
        this.e = owp;
        this.a = isv;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        owx owx;
        osf b2 = this.e.a.b();
        if (!b2.d()) {
            try {
                oso.e("IndexManager failed to initialize. AppIndex.API is unavailable.");
                this.a.a(16, (IBinder) null, new Bundle());
            } catch (Throwable th) {
                oso.a(th, "Service broker callback failed");
                b2.r.a("postinit_failed");
            }
        } else {
            if (axsm.b()) {
                if (b2.g.b.getBoolean("predefined-typeconfigs-update-in-progress", false)) {
                    b2.r.b(6014);
                    oso.e("Running maintenance to deploy predefined typeconfig schema changes again");
                    oxg.a(b2);
                }
            }
            String str = this.b;
            ppp ppp = this.e.a.c;
            if (b2.q == null) {
                z = true;
            } else {
                z = false;
            }
            synchronized (owp.b) {
                owx owx2 = (owx) owp.b.get(str);
                if (owx2 == null) {
                    owx owx3 = new owx(ppp, str, z);
                    owp.b.put(str, owx3);
                    owx = owx3;
                } else {
                    owx = owx2;
                }
            }
            isv isv = this.a;
            prm prm = this.e.a;
            String str2 = this.b;
            int i = this.c;
            isv.a(0, (IBinder) new apms(prm, prm.b().r, new oyt(prm.b), oxx.a(prm.b), str2, i, owx, prm.b().m.a(this.d, str2, i)), (Bundle) null);
        }
        return null;
    }
}
