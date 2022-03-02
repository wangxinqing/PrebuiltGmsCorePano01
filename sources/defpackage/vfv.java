package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;

/* renamed from: vfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfv extends thn {
    public final void a(Context context, Class cls, thl thl) {
        Class cls2;
        Object obj;
        if (cls.equals(uxd.class)) {
            thl.a(uxd.class, (Object) new uxd(context));
        } else if (cls.equals(ves.class)) {
            thl.a(ves.class, (Object) new ves(context));
        } else {
            if (cls.equals(jiq.class)) {
                cls2 = jiq.class;
                obj = jiu.a;
            } else if (cls.equals(uwr.class)) {
                thl.a(uwr.class, (Object) new uwr(context));
                return;
            } else if (cls.equals(vav.class)) {
                thl.a(vav.class, (Object) new vav(context));
                return;
            } else if (cls.equals(uwu.class)) {
                thl.a(uwu.class, (Object) new uwu(context));
                return;
            } else if (cls.equals(ved.class)) {
                thl.a(ved.class, (Object) new ved(context));
                return;
            } else if (cls.equals(vgw.class)) {
                thl.a(vgw.class, (Object) new vgw(context));
                return;
            } else if (cls.equals(uws.class)) {
                thl.a(uws.class, (Object) new vbb(context));
                return;
            } else if (cls.equals(uyz.class)) {
                thl.a(uyz.class, (Object) new uyz(context));
                return;
            } else if (cls.equals(arwg.class)) {
                thl.a(arwg.class, (Object) arwg.a("NearbyMessages"));
                return;
            } else if (cls.equals(vel.class)) {
                thl.a(vel.class, (Object) new vel(context));
                return;
            } else if (cls.equals(vei.class)) {
                thl.a(vei.class, (Object) new vei(context));
                return;
            } else if (cls.equals(vbp.class)) {
                thl.a(vbp.class, (Object) new vbp(context));
                return;
            } else if (cls.equals(uzb.class)) {
                thl.a(uzb.class, (Object) new uzb(context));
                return;
            } else if (cls.equals(vak.class)) {
                thl.a(vak.class, (Object) new vak(context));
                return;
            } else if (cls.equals(vbf.class)) {
                thl.a(vbf.class, (Object) new vbf(context));
                return;
            } else if (cls.equals(vef.class)) {
                thl.a(vef.class, (Object) new vef(context));
                return;
            } else if (cls.equals(uyj.class)) {
                thl.a(uyj.class, (Object) new uyj(context));
                return;
            } else if (cls.equals(uyt.class)) {
                thl.a(uyt.class, (Object) new uyt(context));
                return;
            } else if (cls.equals(vah.class)) {
                obj = new vah(context, (ClientAppIdentifier) null);
                cls2 = vah.class;
            } else if (cls.equals(uyc.class)) {
                thl.a(uyc.class, (Object) new uyc(context));
                return;
            } else if (cls.equals(rxy.class)) {
                thl.a(rxy.class, (Object) rxu.a(context));
                return;
            } else if (cls.equals(ahcn.class)) {
                thl.a(ahcn.class, (Object) agzx.a(context).a());
                return;
            } else {
                return;
            }
            thl.a(cls2, obj);
        }
    }

    public final void a(Class cls, Object obj) {
        if (cls.equals(uxd.class)) {
            uxd uxd = (uxd) obj;
            int i = Build.VERSION.SDK_INT;
            jjg jjg = tgc.a;
            uxd.c.unregisterComponentCallbacks(uxd.b);
            uxd.a.clear();
        } else if (cls.equals(arwg.class)) {
            ((arwg) obj).a();
        } else if (cls.equals(vbf.class)) {
            ((vbf) obj).d();
        } else if (cls.equals(vah.class)) {
            vah vah = (vah) obj;
            jjg jjg2 = tgc.a;
            vah.b();
            uyt uyt = vah.a;
            uys uys = vah.b;
            uyt.g.b();
            uyt.b.remove(uys);
            vah.c = true;
        } else if (cls.equals(vbp.class)) {
            vbp vbp = (vbp) obj;
            vbp.g.b();
            vbp.d.close();
        }
    }
}
