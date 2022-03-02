package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.Collections;

/* renamed from: tsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tsb extends thn {
    public final void a(Context context, Class cls, thl thl) {
        Object obj;
        if (cls.equals(tsm.class)) {
            thl.a(tsm.class, (Object) new tsm(context));
        } else if (cls.equals(ttf.class)) {
            thl.a(ttf.class, (Object) new ttf(context));
        } else if (cls.equals(arxg.class)) {
            thl.a(arxg.class, (Object) new arxg(context));
        } else if (cls.equals(jiq.class)) {
            thl.a(jiq.class, (Object) jiu.a);
        } else if (cls.equals(udk.class)) {
            thl.a(udk.class, (Object) new udk(context));
        } else if (cls.equals(ubv.class)) {
            thl.a(ubv.class, (Object) new ubv(context));
        } else if (cls.equals(arwg.class)) {
            thl.a(arwg.class, (Object) arwg.a("NearbyDiscovery"));
        } else if (cls.equals(DiscoveryChimeraService.class)) {
            thl.a(DiscoveryChimeraService.class, (Object) (DiscoveryChimeraService) context);
        } else if (cls.equals(arxk.class)) {
            thl.a(arxk.class, (Object) new arxk(context));
        } else if (cls.equals(udf.class)) {
            thl.a(udf.class, (Object) new udf(context));
        } else if (cls.equals(udc.class)) {
            thl.a(udc.class, (Object) new udc(context));
        } else if (cls.equals(uan.class)) {
            thl.a(uan.class, (Object) new uan(context));
        } else if (cls.equals(tsu.class)) {
            thl.a(tsu.class, (Object) new tsu(context));
        } else if (cls.equals(tst.class)) {
            thl.a(tst.class, (Object) new tst(context));
        } else if (cls.equals(thb.class)) {
            thl.a(thb.class, (Object) thb.a(context));
        } else if (cls.equals(uap.class)) {
            thl.a(uap.class, (Object) new uap(context));
        } else if (cls.equals(twg.class)) {
            thl.a(twg.class, (Object) new twg(context));
        } else if (cls.equals(txb.class)) {
            thl.a(txb.class, (Object) new txb(context));
        } else if (cls.equals(txd.class)) {
            thl.a(txd.class, (Object) new txd(context));
        } else if (cls.equals(twd.class)) {
            thl.a(twd.class, (Object) new twd(context));
        } else if (cls.equals(tya.class)) {
            thl.a(tya.class, (Object) new tya(context));
        } else if (cls.equals(tvs.class)) {
            thl.a(tvs.class, (Object) new tvs(context));
        } else if (cls.equals(tws.class)) {
            thl.a(tws.class, (Object) new tws(context));
        } else if (cls.equals(txr.class)) {
            thl.a(txr.class, (Object) new txr(context));
        } else if (cls.equals(rxy.class)) {
            thl.a(rxy.class, (Object) rxu.a(context));
        } else if (cls.equals(ahcn.class)) {
            thl.a(ahcn.class, (Object) agzx.a(context).a());
        } else if (cls.equals(tza.class)) {
            thl.a(tza.class, (Object) new tza(context));
        } else if (cls.equals(tzr.class)) {
            thl.a(tzr.class, (Object) new tzr(context));
        } else if (cls.equals(tso.class)) {
            thl.a(tso.class, (Object) new tso(context));
        } else if (cls.equals(tvg.class)) {
            thl.a(tvg.class, (Object) new tvg(context));
        } else if (cls.equals(aryx.class)) {
            thl.a(aryx.class, (Object) new aryx(context, amzy.a((Object) 2, (Object) 1)));
        } else if (cls.equals(udb.class)) {
            thl.a(udb.class, (Object) new udb(context));
        } else if (cls.equals(arxt.class)) {
            thl.a(arxt.class, (Object) new arxt(context, ((arwg) thl.a(context, arwg.class)).c()));
        } else if (cls.equals(tzs.class)) {
            if (!aymw.a.a().aU()) {
                obj = new tzu(context);
            } else {
                obj = new tzt();
            }
            thl.a(tzs.class, obj);
        } else if (cls.equals(tyw.class)) {
            thl.a(tyw.class, (Object) new tyw(context));
        } else if (cls.equals(tuh.class)) {
            thl.a(tuh.class, (Object) new tuh());
        }
    }

    public final void a(Class cls, Object obj) {
        if (cls.equals(arwg.class) && !aymq.i()) {
            ((arwg) obj).a();
        } else if (cls.equals(ubv.class)) {
            ((ubv) obj).b.a(Collections.emptyList());
        } else if (cls.equals(ttf.class)) {
            ttf ttf = (ttf) obj;
            ttf.b.b();
            ttf.c.b();
            ttf.d.b();
            ttf.f();
        } else if (cls.equals(aryx.class)) {
            ((aryx) obj).b();
        } else if (cls.equals(txr.class)) {
            txr txr = (txr) obj;
            txr.a.b();
            txr.evictAll();
        }
    }
}
