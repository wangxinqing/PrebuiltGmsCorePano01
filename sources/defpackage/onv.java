package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: onv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onv extends ons {
    private final HelpConfig f;
    private final aoru g;
    private final okc h;

    public onv(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, HelpConfig helpConfig, aoru aoru) {
        super("GetSuggestionsOperation", googleHelpChimeraService, str, ojq);
        this.f = helpConfig;
        this.g = aoru;
        this.h = googleHelpChimeraService.a();
    }

    private final void b(Context context) {
        a(context, 22);
        this.e.f();
    }

    public final void a(Context context) {
        Map map = omg.a(context.getApplicationContext(), this.f, this.g, this.h, "").b;
        if (map == null || map.isEmpty()) {
            Log.e("gH_GetSuggestionsOp", "Nothing returned from server");
            b(context);
            return;
        }
        ArrayList arrayList = new ArrayList(map.values());
        for (int i = 0; i < arrayList.size(); i++) {
            oab oab = (oab) arrayList.get(i);
            if (!oab.w() && !oab.g()) {
                a(context, 21);
                ojq ojq = this.e;
                aucd o = avol.e.o();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    oab oab2 = (oab) arrayList.get(i2);
                    aucd o2 = avok.i.o();
                    String r = oab2.r();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    avok avok = (avok) o2.b;
                    r.getClass();
                    int i3 = avok.a | 16;
                    avok.a = i3;
                    avok.d = r;
                    String str = oab2.e;
                    str.getClass();
                    int i4 = i3 | 8;
                    avok.a = i4;
                    avok.c = str;
                    String str2 = oab2.d;
                    str2.getClass();
                    int i5 = i4 | 4;
                    avok.a = i5;
                    avok.b = str2;
                    int i6 = oab2.c;
                    int i7 = 7;
                    if (i6 == 0 || i6 == 1) {
                        i7 = 3;
                    } else if (i6 == 7) {
                        i7 = 6;
                    } else if (i6 != 8) {
                        i7 = i6 != 9 ? i6 != 11 ? 1 : 12 : 10;
                    }
                    avok.e = i7 - 1;
                    avok.a = i5 | 32;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avol avol = (avol) o.b;
                    avok avok2 = (avok) o2.i();
                    avok2.getClass();
                    if (!avol.b.a()) {
                        avol.b = aucj.a(avol.b);
                    }
                    avol.b.add(avok2);
                }
                ojq.a(((avol) o.i()).k());
                return;
            }
        }
        Log.e("gH_GetSuggestionsOp", "No content returned from server");
        b(context);
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, int i) {
        MetricsIntentOperation.a(context, this.f.e, this.d, 125, i, false);
    }
}
