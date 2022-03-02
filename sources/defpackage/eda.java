package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.audiomodem.AudioModemBroadcastReceiver;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: eda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eda implements eca, eer {
    public final qvr a;
    public final ecc b;
    public ees c;
    public boolean d;
    public eeo e;
    public boolean f;
    public final AudioModemBroadcastReceiver g;
    private final Context h;
    private final edz i = new edz();
    private final edz j = new edz();
    private final eew k;

    public eda(Context context, qvr qvr) {
        this.h = context;
        this.a = qvr;
        ecc ecc = new ecc();
        this.b = ecc;
        ecc.a((eca) this);
        this.g = new AudioModemBroadcastReceiver(context, qvr, this);
        this.k = (eew) thl.a(context, eew.class);
        edu.a(context);
    }

    public final boolean b() {
        if (!this.d) {
            if (!aymc.a.a().h()) {
                return false;
            }
            try {
                this.c = new ees(this.h, this);
                this.d = true;
            } catch (Exception e2) {
                anih anih = (anih) edx.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("eda", "b", 306, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to initialize token encoder");
                return false;
            }
        }
        return true;
    }

    public static void a(efb efb, int i2) {
        Status status = new Status(i2, (String) null, (PendingIntent) null);
        if (efb == null) {
            jjg jjg = edx.a;
            return;
        }
        try {
            efb.a(status);
            jjg jjg2 = edx.a;
        } catch (RemoteException e2) {
            anih anih = (anih) edx.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("eda", "a", 357, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send callback message");
        }
    }

    public static void a(efb efb, int i2, PendingIntent pendingIntent) {
        Status status = new Status(i2, (String) null, pendingIntent);
        if (efb == null) {
            jjg jjg = edx.a;
            return;
        }
        try {
            efb.a(status);
            jjg jjg2 = edx.a;
        } catch (RemoteException e2) {
            anih anih = (anih) edx.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("eda", "a", 357, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send callback message");
        }
    }

    static final /* synthetic */ void a(efi efi) {
        try {
            efi.b();
        } catch (RemoteException e2) {
            anih anih = (anih) edx.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("eda", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't close audio stream");
        }
    }

    public final void a(ecx ecx, Set set) {
        edy a2 = this.i.a(ecx, set);
        Iterator it = a2.a.iterator();
        while (true) {
            char c2 = 1;
            if (!it.hasNext()) {
                break;
            }
            eeq eeq = (eeq) it.next();
            this.k.a(ecx.e, 2, eeq);
            ees ees = this.c;
            int i2 = eeq.b.a;
            edn edn = ees.b;
            eeq[] eeqArr = edn.a;
            eeq eeq2 = eeqArr[i2];
            if (eeq2 == null) {
                eeqArr[i2] = eeq;
                c2 = 0;
            } else if (!eeq2.equals(eeq) && !edn.b[i2].contains(eeq)) {
                edn.b[i2].add(eeq);
                c2 = 2;
            }
            if (c2 == 0) {
                ees.b(i2);
            } else if (c2 == 2) {
                eeq.a.a(2);
            }
        }
        for (eeq eeq3 : a2.b) {
            this.k.a(ecx.e, 3, eeq3);
            ees ees2 = this.c;
            eeq3.f = 1;
            int i3 = eeq3.b.a;
            if (eeq3.equals(ees2.b.a(i3))) {
                ees2.a.b(i3);
            } else {
                ees2.b.a(i3, eeq3);
            }
        }
    }

    public final void a(ecy ecy, Set set) {
        edy a2 = this.j.a(ecy, set);
        for (eem eem : a2.a) {
            this.k.a(ecy.e, 5, eem);
            eeo eeo = this.e;
            if (eeo.c) {
                eeo.b();
            }
            eel a3 = eeo.a(eem.b);
            if (a3.a.a((Object) eem.a)) {
                eem.a.a(0);
                eeo.b.a(a3);
            }
        }
        for (eem eem2 : a2.b) {
            this.k.a(ecy.e, 6, eem2);
            eeo eeo2 = this.e;
            Encoding encoding = eem2.b;
            if (eeo2.a.containsKey(encoding)) {
                eel eel = (eel) eeo2.a.get(encoding);
                if (eel.a.b(eem2.a)) {
                    eem2.a.a(1);
                    if (eel.a.a()) {
                        eeo2.a.remove(encoding);
                        eeo2.b.b(eel);
                        eel.c();
                    }
                }
            }
        }
    }

    public final void a(edv edv) {
        if (this.a.getLooper().getThread().isAlive()) {
            this.a.post(new ecw(this, edv));
        }
    }

    public final void a(eeq eeq) {
        ecx ecx = eeq.a;
        this.k.a(ecx.e, 4, eeq);
        edz edz = this.i;
        if (edz.a.containsKey(ecx) && ((Set) edz.a.get(ecx)).remove(eeq) && ((Set) edz.a.get(ecx)).isEmpty()) {
            edz.a.remove(ecx);
            this.b.a((edv) ecx);
        }
    }

    public final void a(efl efl, String str, efb efb) {
        if (!b()) {
            a(efb, 6501);
            return;
        }
        ecx ecx = new ecx(efl, str);
        a(ecx, (Set) new HashSet());
        this.b.a((edv) ecx);
        a(efb, 0);
    }

    public final void a(efo efo, String str, efb efb) {
        if (!a()) {
            a(efb, 6500);
            return;
        }
        ecy ecy = new ecy(efo, str);
        a(ecy, (Set) new HashSet());
        this.b.a((edv) ecy);
        a(efb, 0);
    }

    public final boolean a() {
        if (!this.f) {
            if (!aymc.a.a().i()) {
                return false;
            }
            try {
                this.e = new eeo(this.h);
                this.f = true;
                AudioModemBroadcastReceiver audioModemBroadcastReceiver = this.g;
                if (!audioModemBroadcastReceiver.c) {
                    Context context = audioModemBroadcastReceiver.a;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
                    context.registerReceiver(audioModemBroadcastReceiver, intentFilter, (String) null, audioModemBroadcastReceiver.b);
                    audioModemBroadcastReceiver.c = true;
                }
            } catch (Exception e2) {
                anih anih = (anih) edx.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("eda", "a", 288, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to initialize token decoder");
                return false;
            }
        }
        return true;
    }
}
