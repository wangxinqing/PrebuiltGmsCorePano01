package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: twi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twi extends twf {
    private final arxt a;
    private final tyw b;

    public twi(Context context, ttg ttg, arxt arxt, tyw tyw) {
        super(context, ttg);
        this.a = arxt;
        this.b = tyw;
    }

    /* access modifiers changed from: protected */
    public final aspb a() {
        return aspb.RETROACTIVE_PAIR_START;
    }

    /* access modifiers changed from: protected */
    public final aspb b() {
        return aspb.RETROACTIVE_PAIR_END;
    }

    public final String a(aeha aeha, byte[] bArr, arxt arxt, String str) {
        return tvk.a(this.c, aeha, this.d, str);
    }

    public final void a(aehy aehy) {
        super.a(aehy);
        aehy.n(true);
        aehy.i(aymw.u());
    }

    public final byte[] a(byte[] bArr, aeha aeha, aegz aegz) {
        byte[] a2 = super.a(bArr, aeha, aegz);
        if (a2 != null || (a2 = aegz.a()) == null || this.a.d() == null) {
            return a2;
        }
        tyw tyw = this.b;
        String str = this.a.d().name;
        Intent b2 = aeha.b(a2);
        ttg ttg = this.d;
        synchronized (tyw.b) {
            if (tyw.b.get(ttg.m()) == null) {
                tyw.b.put(ttg.m(), tyw.a());
            }
        }
        int intValue = ((Integer) tyw.b.get(ttg.m())).intValue();
        if (tyw.a.a(intValue)) {
            jjg jjg = tsp.a;
        } else {
            Intent className = new Intent().setClassName(tyw.c, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity");
            className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", tvq.b(ttg.b).k());
            className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", true);
            className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_CLOUD_SYNC_INTENT", b2);
            className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_ACCOUNT_NAME", str);
            className.setFlags(268435456);
            tyw.a.a(intValue, 2);
            tyw.c.startActivity(className);
        }
        return a2;
    }
}
