package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: tsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tsm {
    public final ubv a;
    public final arwg b;
    public final arwm c = new tsd(this, "processBackgroundSubscribeQueue");
    public final uxh d = new tsj(this);
    public final Object e = new Object();
    public final Queue f = new ArrayDeque();
    private final Context g;
    private final arxg h;
    private final uxi i;

    public tsm(Context context) {
        this.g = context;
        this.b = (arwg) thl.a(context, arwg.class);
        this.a = (ubv) thl.a(context, ubv.class);
        this.h = (arxg) thl.a(context, arxg.class);
        uxj uxj = new uxj();
        uxj.a("0p:discoverer");
        uxj.d = 2;
        this.i = tcn.a(context, uxj.a());
    }

    private static acvs a(String str) {
        return new tsc(str);
    }

    public final void b() {
        jjg jjg = tsp.a;
        acwa e2 = this.i.e(DiscoveryChimeraService.b(this.g));
        e2.a(a("DiscoveryNearbyMessagesManager failed to background unsubscribe"));
        try {
            acws.a(e2, 1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            anih anih = (anih) tsp.a.b();
            anih.a(e3);
            anih.a("DiscoveryNearbyMessagesManager failed to background unsubscribe");
        }
    }

    public final void a() {
        Strategy strategy = Strategy.b;
        uyn uyn = new uyn();
        uyn.d = 59;
        arxg arxg = this.h;
        String language = arxk.d().getLanguage();
        if (arxg.a()) {
            language = String.valueOf(language).concat("-debug");
        }
        uxf uxf = new uxf();
        uzv uzv = new uzv();
        uzv.a = ttk.a;
        uxf.a(uzv.a());
        uzv uzv2 = new uzv();
        uzv2.b = 224;
        uzv2.c = new byte[]{0, 0, 0};
        uzv2.d = new byte[]{0, 0, -1};
        uxf.a(uzv2.a());
        uxf.a("com.google.nearby.discoverer", language);
        if (this.h.a() && aymw.w()) {
            uxf.a("com.google.nearby.discoverer", (String) anbs.a(amsk.a('-').a((CharSequence) language), 0));
        }
        uyn.b = uxf.a();
        uyn.a = strategy;
        tsk tsk = new tsk();
        iva.a((Object) tsk);
        uyn.c = tsk;
        uyo a2 = uyn.a();
        jjg jjg = tsp.a;
        acwa a3 = this.i.a(DiscoveryChimeraService.b(this.g), a2);
        a3.a(a("DiscoveryNearbyMessagesManager failed to background subscribe"));
        try {
            acws.a(a3, 1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            anih anih = (anih) tsp.a.b();
            anih.a(e2);
            anih.a("DiscoveryNearbyMessagesManager failed to background subscribe");
        }
    }
}
