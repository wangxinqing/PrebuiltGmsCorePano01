package defpackage;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ucr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ucr extends arwm {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ udb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucr(udb udb, String str, AtomicReference atomicReference) {
        super(str);
        this.b = udb;
        this.a = atomicReference;
    }

    public final void run() {
        amzy amzy;
        Set<BluetoothDevice> bondedDevices;
        udb udb = this.b;
        if (aymw.a.a().ax()) {
            uac.b(udb.e);
        }
        udb udb2 = this.b;
        if (!aymw.k() || !aymw.H()) {
            ((anih) tsp.a.d()).a("FastPairEventStream: Skip initialize event stream, flagConnect=%s, flagInitialize=%s", aymw.k(), aymw.H());
        } else {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                ((anih) tsp.a.d()).a("FastPairEventStream: Skip initialize event stream, adapter is null");
            } else {
                ((anih) tsp.a.d()).a("FastPairEventStream: Initialize event stream");
                for (BluetoothDevice next : defaultAdapter.getBondedDevices()) {
                    if (udb2.m.a(next.getAddress(), (List) amzy.a((Object) 2, (Object) 1)) != null) {
                        ((anih) tsp.a.d()).a("FastPairEventStream: Establish event stream for %s (init)", (Object) next);
                        udb2.a(next, udb2.b.a(next.getAddress()));
                    }
                }
            }
        }
        Context context = this.b.e;
        if (aymw.ac() && aymw.a.a().u() && jkr.h() && BluetoothAdapter.getDefaultAdapter() != null && (bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices()) != null && !bondedDevices.isEmpty()) {
            ttf ttf = (ttf) thl.a(context, ttf.class);
            anab h = anaf.h();
            for (BluetoothDevice next2 : bondedDevices) {
                tzi a2 = ttf.a(next2.getAddress());
                if (!(a2 == null || (a2.a & 1024) == 0)) {
                    h.a(next2, a2);
                }
            }
            tvd.a((Runnable) new tuo(context, h));
        }
        AtomicReference atomicReference = this.a;
        udb udb3 = this.b;
        if (aymw.c()) {
            amzt amzt = new amzt();
            Context context2 = udb3.e;
            for (Account account : jgu.d(context2, context2.getPackageName())) {
                amzt.c(udb3.g.a((afht) new uda(udb3, account), account));
            }
            amzy = amzt.a();
        } else {
            amzy = amzy.h();
        }
        atomicReference.set(amzy);
    }
}
