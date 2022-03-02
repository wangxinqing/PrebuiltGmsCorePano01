package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: asbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asbv implements ashj {
    public static final /* synthetic */ int e = 0;
    public final asda a;
    public final asfg b;
    public final asfp c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        Collections.singleton(avch.BLUETOOTH_CLASSIC_NAME);
    }

    public asbv(Context context, asfg asfg, asfp asfp) {
        this.a = (asda) thl.a(context, asda.class);
        this.b = asfg;
        this.c = asfp;
    }

    public static void a(Context context, asep asep) {
        int i;
        asfg asfg = asep.d;
        if (asfg == null) {
            asfg = asfg.c;
        }
        asfp asfp = asep.c;
        if (asfp == null) {
            asfp = asfp.c;
        }
        if (!(asfg == null || (asfg.a & 1) == 0)) {
            asfh asfh = asfg.b;
            if (asfh == null) {
                asfh = asfh.d;
            }
            if (!((asfh.a & 1) == 0 || asfh.b.length() <= 0 || asfp == null || (asfp.a & 1) == 0 || ((asfh.a & 2) != 0 && (i = asfh.c) != 0 && i != asfp.b.a()))) {
                asda asda = (asda) thl.b(context, asda.class);
                if (asda == null || !asda.a()) {
                    throw new asjk(asda.class, asbv.class);
                }
                return;
            }
        }
        throw new asji("Data to advertise on bluetooth name is not correctly set");
    }

    public final /* bridge */ /* synthetic */ audx a() {
        return aseq.c;
    }

    public final void a(asgs asgs, asiz asiz) {
        this.a.a((asiz) new asbu(this, asiz));
    }

    public final void a(asiz asiz) {
        if (this.d.compareAndSet(true, false)) {
            asda asda = this.a;
            jjg jjg = asil.a;
            asdu asdu = asda.h;
            asda.a((asiz) null, asdu.m, asdu.o);
        }
        this.a.b(asiz);
    }
}
