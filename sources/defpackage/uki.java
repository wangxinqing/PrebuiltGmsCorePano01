package defpackage;

import android.content.Context;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

/* renamed from: uki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uki extends urq {
    public final Context a;
    public final String b;
    public final url c;
    public int d = 0;
    public uqr e;
    private final SecureRandom f;
    private final tfw i;

    public uki(Context context, String str, url url, SecureRandom secureRandom, tfw tfw, int i2) {
        super(37, tfw);
        this.a = context;
        this.b = str;
        this.c = url;
        this.f = secureRandom;
        this.i = tfw;
        if (ukz.f()) {
            this.d = i2;
        }
    }

    public final int b() {
        ukh ukh = new ukh(this);
        arzi arzi = new arzi(aymi.a.a().F() + ((long) this.f.nextInt((int) aymi.a.a().E())));
        arzi.a = this.i.c();
        uqr uqr = (uqr) arzk.a((Callable) ukh, "ConnectBleSocket", arzi.a());
        this.e = uqr;
        if (uqr != null) {
            return a(38);
        }
        return 3;
    }
}
