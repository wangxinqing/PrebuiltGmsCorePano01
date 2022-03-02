package defpackage;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: aknr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknr implements akni, afiz {
    public boolean a = true;
    private final afhs b;
    private final afjc c;
    private final akma d;
    private volatile boolean e;
    private akki f = null;

    public aknr(afif afif, Executor executor, String str, akma akma) {
        this.d = akma;
        this.b = afif.a(new Account(str, "com.google"), 333, 108026902, atta.e);
        this.c = new afjc(this, this.b, "MdhBroadcastPersonalPlaceInfoSource", executor);
    }

    public final void a() {
        afjc afjc = this.c;
        afhs afhs = afjc.b;
        String str = afjc.d;
        synchronized (((afij) afhs).e) {
            afiu a2 = ((afij) afhs).a(str);
            if (((afij) afhs).e.containsKey(a2)) {
                ((afij) afhs).b.unregisterReceiver((BroadcastReceiver) ((afij) afhs).e.get(a2));
                ((afij) afhs).e.remove(a2);
            }
            afit afit = ((afij) afhs).c;
            afiu a3 = ((afij) afhs).a(str);
            synchronized (((afic) afit).b) {
                ((afic) afit).b.remove(a3);
                Executor executor = ((afic) afit).a;
                rza rza = ((afic) afit).c;
                MdhBroadcastListenerKey a4 = afhz.a(a3);
                sbb sbb = rza.a;
                iha b2 = ihb.b();
                b2.a = new ryx(a4);
                b2.b = new Feature[]{oqd.c};
                afin.a(executor, sbb.a(b2.a()));
            }
        }
        this.f = null;
        this.e = false;
    }

    public final void a(akki akki) {
        aorr a2;
        if (!this.e) {
            this.f = akki;
            this.a = true;
            if (!azbq.a.a().f()) {
                this.b.a(aepj.i, afhr.c);
            } else {
                afhs afhs = this.b;
                aepi i = aepj.i();
                aepl c2 = aepm.c();
                c2.a((int) azbq.a.a().d(), TimeUnit.SECONDS);
                i.a(c2.a());
                i.a(Integer.valueOf((int) azbq.a.a().c()));
                i.a(!azbq.a.a().a());
                i.b(!azbq.a.a().b());
                afhs.a(i.a(), afhr.c);
            }
            this.e = true;
            afjc afjc = this.c;
            afhs afhs2 = afjc.b;
            afhr afhr = afjc.c;
            String str = afjc.d;
            synchronized (((afij) afhs2).e) {
                afiu a3 = ((afij) afhs2).a(str);
                if (((afij) afhs2).e.containsKey(a3)) {
                    ((afij) afhs2).b.unregisterReceiver((BroadcastReceiver) ((afij) afhs2).e.get(a3));
                    ((afij) afhs2).e.remove(a3);
                }
                afiv afiv = new afiv();
                afiv.a = afhr;
                afis afis = new afis(afiv.a);
                afiy afiy = new afiy(((afij) afhs2).c, afjc, a3, afis, ((afij) afhs2).a);
                ((afij) afhs2).b.registerReceiver(afiy, afiy.b);
                ((afij) afhs2).e.put(a3, afiy);
                afit afit = ((afij) afhs2).c;
                synchronized (((afic) afit).b) {
                    ((afic) afit).b.add(a3);
                    a2 = ((afic) afit).a(a3, afis);
                }
            }
            aorl.a(a2, new afja(afjc), afjc.e);
        }
    }

    public final void a(atta atta, int i, int i2) {
        akki akki = this.f;
        if (akki != null) {
            aucx aucx = atta.b;
            astz[] astzArr = (astz[]) aucx.toArray(new astz[aucx.size()]);
            aucx aucx2 = atta.a;
            astv[] astvArr = (astv[]) aucx2.toArray(new astv[aucx2.size()]);
            aklz.a();
            int length = astvArr.length;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Got ");
            sb.append(length);
            sb.append(" personalized places from MDH.");
            sb.toString();
            a(astvArr, astzArr, i, i2, this.a, 1);
            this.a = false;
            akki.a(astvArr, astzArr);
            return;
        }
        aklz.a().b("Got ContextData but callback null");
    }

    public final void a(Throwable th) {
        a();
        aklz.a().a("Failure registering MDH broadcast listener.", th);
        a(this.a);
    }

    public final void a(boolean z) {
        this.d.a(0, 0, 0, 0, 0, z, 3, 2);
    }

    public final void a(astv[] astvArr, astz[] astzArr, int i, int i2, boolean z, int i3) {
        int seconds;
        astv[] astvArr2 = astvArr;
        int i4 = 0;
        for (astv astv : astvArr2) {
            aucx aucx = astv.d;
            int size = aucx.size();
            for (int i5 = 0; i5 < size; i5++) {
                astm astm = (astm) aucx.get(i5);
                if (astm.d.size() > 0 && (seconds = (int) TimeUnit.MICROSECONDS.toSeconds(astm.d.a(0))) > i4) {
                    i4 = seconds;
                }
            }
        }
        this.d.a(astvArr2.length, astzArr.length, i2, i, i4, z, i3, 2);
    }
}
