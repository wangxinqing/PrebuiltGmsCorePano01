package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: iok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iok extends imt {
    public iok() {
        super("CheckinFix", Math.max(axbk.a.a().d(), 60), TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));
    }

    public final boolean a(inb inb) {
        return axbk.a.a().c();
    }

    public final inb b(inb inb) {
        Context context = inb.b;
        gwp a = gwr.a(context);
        a.o = true;
        a.k = awyw.a.a().F();
        int i = 3;
        a.u = 3;
        a.a(21, 1, context.getPackageName(), iok.class.getName(), true);
        gwr a2 = a.a();
        int i2 = new gwa(context, new ioj(a2), new gvy(context)).a(a2).e;
        ina d = inb.d();
        if (i2 != 0) {
            i = 5;
        }
        d.a(this, i);
        return d.a();
    }
}
