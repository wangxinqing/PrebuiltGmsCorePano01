package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: twa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twa extends twf {
    private final tyw a;
    private final boolean b;

    public twa(Context context, ttg ttg, byte[] bArr) {
        super(context, ttg);
        this.a = (tyw) thl.a(context, tyw.class);
        byte[] n = ttg.n();
        boolean z = false;
        if (!(n == null || bArr == null)) {
            z = true;
        }
        this.b = z;
    }

    /* access modifiers changed from: protected */
    public final aspb a() {
        return !this.b ? aspb.MAGIC_PAIR_START : aspb.SUBSEQUENT_PAIR_START;
    }

    /* access modifiers changed from: protected */
    public final aspb b() {
        return !this.b ? aspb.MAGIC_PAIR_END : aspb.SUBSEQUENT_PAIR_END;
    }

    public final void d() {
        super.d();
        tyw tyw = this.a;
        jjg jjg = tsp.a;
        ((arwg) thl.a(tyw.c, arwg.class)).e(tyw.d);
    }

    public final String a(aeha aeha, byte[] bArr, arxt arxt, String str) {
        String a2 = super.a(aeha, bArr, arxt, str);
        thp.a(this.a.c, new Intent("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE").putExtra("FINISHED_STATE", "SUCCESS"));
        return a2;
    }

    public final void a(Throwable th) {
        super.a(th);
        thp.a(this.a.c, new Intent("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE").putExtra("FINISHED_STATE", "FAIL"));
    }
}
