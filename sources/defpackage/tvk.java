package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: tvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tvk {
    static String a(Context context, aeha aeha, ttg ttg, String str) {
        if (!aymw.u()) {
            return null;
        }
        String a = aeha.a();
        if (a == null) {
            a = a(context, ttg);
            aeha.a(a);
        }
        arww.a(str, a);
        return a;
    }

    static String a(Context context, ttg ttg) {
        String a = ((twg) thl.a(context, twg.class)).a();
        String replaceAll = ttg.k().replaceAll("^\\([0-9]+\\)\\s", "");
        jjg jjg = tsp.a;
        ttg.k();
        if (!aymw.r() || a == null) {
            return replaceAll;
        }
        return context.getString(R.string.fast_pair_device_name, new Object[]{a, replaceAll});
    }

    static synchronized void a(Context context, String str, tzi tzi) {
        synchronized (tvk.class) {
            tzi a = ((ttf) thl.a(context, ttf.class)).a(tzi.b);
            if (a == null) {
                jjg jjg = tsp.a;
                return;
            }
            jjg jjg2 = tsp.a;
            a(context, a, str);
        }
    }

    private static void a(Context context, tzi tzi, String str) {
        boolean z;
        Throwable e;
        ((anih) tsp.a.d()).a("FastPair: writeAliasNameToProvider");
        ttu ttu = new ttu(tzi.k, tzi.b, context);
        ttu.a(aspb.UPDATE_PROVIDER_NAME_START);
        tts f = ttt.f();
        f.a(aspb.UPDATE_PROVIDER_NAME_END);
        try {
            aehy a = tvt.a();
            ((anih) tsp.a.d()).a("FastPair: writeAliasNameToProvider create connection");
            z = new aeha(context, str, a.a(), new tue(ttu)).a(tzi.c.k(), arww.b(tzi.b));
            try {
                ttu.a(f.a());
            } catch (BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e2) {
                e = e2;
            }
        } catch (BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e3) {
            e = e3;
            z = false;
            anih anih = (anih) tsp.a.b();
            anih.a(e);
            anih.a("FastPair: Error with write alias name to provider");
            if (ttu.a()) {
                ttu.a(e);
            }
            f.a = e;
            ttu.a(f.a());
            ((arwg) thl.a(context, arwg.class)).a((arwm) new tvj("UpdateStoredFastPairItem", z, context, tzi));
        }
        try {
            ((arwg) thl.a(context, arwg.class)).a((arwm) new tvj("UpdateStoredFastPairItem", z, context, tzi));
        } catch (InterruptedException e4) {
            anih anih2 = (anih) tsp.a.c();
            anih2.a((Throwable) e4);
            anih2.a("Error to update cache items with name status.");
        }
    }
}
