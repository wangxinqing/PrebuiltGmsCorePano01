package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.List;
import java.util.Map;

/* renamed from: omh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class omh implements Runnable {
    final /* synthetic */ omi a;

    public omh(omi omi) {
        this.a = omi;
    }

    public final void run() {
        omi omi = this.a;
        Context applicationContext = omi.b.getApplicationContext();
        HelpConfig helpConfig = omi.c;
        aoru aoru = omi.d;
        okc okc = omi.f;
        String str = omi.a;
        if (str == null) {
            str = "";
        }
        omf a2 = omg.a(applicationContext, helpConfig, aoru, okc, str);
        int i = 0;
        if (!a2.e()) {
            if (omi.c.B()) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                for (Map.Entry value : a2.b.entrySet()) {
                    oab oab = (oab) value.getValue();
                    if (!oab.w()) {
                        String valueOf2 = String.valueOf(valueOf);
                        String valueOf3 = String.valueOf(oab.b);
                        oab.b = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
                    } else {
                        List list = oab.s;
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            String valueOf4 = String.valueOf(valueOf);
                            String valueOf5 = String.valueOf((String) list.get(i2));
                            list.set(i2, valueOf5.length() == 0 ? new String(valueOf4) : valueOf4.concat(valueOf5));
                        }
                    }
                }
                okg.a(omi.b, omi.c, omi.f, true);
            }
            a2.a(omi.e.a(a2.c(), omi.c.b));
            ohg.a(omi.b, omi.c);
            while (true) {
                if (i >= a2.a()) {
                    break;
                }
                oab a3 = a2.a(i);
                if (a3 != null && a3.n) {
                    nzp a4 = new nzr(omi.b, omi.c).a();
                    a4.a("promoted_content_title", a3.d);
                    a4.a("promoted_content_snippet", a3.r());
                    a4.a("promoted_content_url", a3.e);
                    a4.a("promoted_content_image_base64", a3.o);
                    a4.a("promoted_content_external_link_text", a3.p);
                    a4.a("promoted_content_version", a3.v);
                    a4.a("promoted_content_placement", a3.x().d);
                    a4.a();
                    a2.b.remove(a3.b);
                    break;
                }
                i++;
            }
            omi.e.a(a2, omi.c.b);
        } else if (omi.c.B()) {
            okg.a(omi.b, omi.c, omi.f, false);
        }
        GoogleHelpChimeraService.a(omi.c);
    }
}
