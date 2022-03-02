package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: wjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjm {
    public final iyn a;

    public wjm(Context context) {
        iyn iyn;
        if (aynw.b()) {
            iyn = new iyn(context, aynw.a.a().a(), aynw.a.a().c(), aynw.a.a().d(), aynw.a.a().g(), aynw.a.a().b(), "");
        } else {
            iyn = new iyn(context, aynt.a.a().w(), aynt.a.a().v(), aynt.a.a().t(), aynt.a.a().x(), aynt.a.a().s(), aynt.a.a().u());
        }
        this.a = iyn;
        iyn.g = 6403;
    }

    public static ClientContext a(Context context, String str) {
        String str2;
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        ClientContext clientContext = new ClientContext(myUid, str, str, packageName, packageName);
        if (aynw.b()) {
            str2 = aynw.a.a().i();
        } else {
            str2 = "https://www.googleapis.com/auth/plus.me";
        }
        clientContext.d(str2);
        return clientContext;
    }

    public static String a(String str, String str2) {
        if (aynw.b()) {
            return aynw.a.a().f() ? Uri.parse(str2).buildUpon().appendQueryParameter("$trace", "true").toString() : str2;
        }
        return str;
    }

    public final void a(Context context, String str, String str2, amhf amhf) {
        ClientContext a2 = a(context, str);
        aucd o = amhb.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amhb amhb = (amhb) o.b;
        amhf.getClass();
        amhb.c = amhf;
        amhb.a |= 2;
        amgy a3 = wju.a(context, str2, auuv.a((int) aynt.d()));
        if (o.c) {
            o.c();
            o.c = false;
        }
        amhb amhb2 = (amhb) o.b;
        a3.getClass();
        amhb2.b = a3;
        amhb2.a |= 1;
        if (((amhc) this.a.a(a2, 1, a("/gmsgnotssetreadstates?alt=proto", aynw.a.a().j()), ((amhb) o.i()).k(), (Object) amhc.b)).a == null) {
            amhh amhh = amhh.a;
        }
    }
}
