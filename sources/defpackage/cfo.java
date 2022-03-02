package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.TimeZone;

/* renamed from: cfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cfo extends ccy {
    public static final ccj b = new ccj(new cfn(), "TimePropertyProducer", new int[]{45}, (int[]) null);
    private atuq k;

    public cfo(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    private final void a(String str, long j) {
        aucd o = atuq.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atuq atuq = (atuq) o.b;
        str.getClass();
        atuq.a |= 1;
        atuq.b = str;
        this.k = (atuq) o.i();
        jti jti = new jti(10, 45, 1);
        jti.a(jut.b(j));
        jti.a(atuq.d, this.k);
        d(jti.a());
    }

    static final String j() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        a(j(), cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        super.a(j);
        this.k = null;
    }

    public final void a(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
            String j = j();
            if (!g()) {
                ((anih) ((anih) bxk.a.c()).a("cfo", "a", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimePropertyProducer] No ongoing data (timeZoneId=%s)", (Object) j);
                a(j, cbi.i().a());
            } else if (TextUtils.equals(this.k.b, j)) {
                ((anih) ((anih) bxk.a.c()).a("cfo", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimePropertyProducer] Got same value as before for time zone=%s", (Object) j);
            } else {
                long a = cbi.i().a();
                a(a);
                a(j, a + 1);
            }
        }
    }
}
