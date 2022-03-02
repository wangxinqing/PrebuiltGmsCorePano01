package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: tuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tuv implements Runnable {
    private final Context a;
    private final arxt b;
    private final List c;

    public tuv(Context context, arxt arxt, List list) {
        this.a = context;
        this.b = arxt;
        this.c = list;
    }

    public final void run() {
        int i;
        Context context = this.a;
        arxt arxt = this.b;
        List list = this.c;
        amzt amzt = new amzt();
        for (Account account : jgu.d(context, context.getPackageName())) {
            try {
                aryq aryq = aryq.a;
                amzt.b((Iterable) (List) aopr.a(arxt.d(account).a(afhr.c), arxm.a, (Executor) aoqm.a).get());
            } catch (InterruptedException | ExecutionException e) {
                ((anih) tsp.a.c()).a("FastPair: RemoveInvalidDevice: Read exception from account %s", (Object) account.name);
            }
        }
        amzy a2 = amzt.a();
        jjg jjg = tsp.a;
        a2.size();
        if (!a2.isEmpty()) {
            amzt amzt2 = new amzt();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tzi tzi = (tzi) it.next();
                byte[] c2 = arxt.c(anln.d().a(aooa.a(tzi.c.k(), aeez.a(tzi.b))).b());
                anhk i2 = a2.listIterator();
                while (true) {
                    if (i2.hasNext()) {
                        if (Arrays.equals(((tzj) i2.next()).d.k(), c2)) {
                            amzt2.c(tzi);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            amzy a3 = amzt2.a();
            ((anih) tsp.a.d()).a("FastPair: RemoveInvalidDevice: invalid device number=%s.", a3.size());
            int size = a3.size();
            for (i = 0; i < size; i++) {
                tzi tzi2 = (tzi) a3.get(i);
                ((anih) tsp.a.d()).a("FastPair: RemoveInvalidDevice: Remove device %s by cloud sync", (Object) tzi2.b);
                context.startService(DiscoveryChimeraService.a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR").putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", tzi2.b).putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", tzi2.c.k()));
            }
        }
    }
}
