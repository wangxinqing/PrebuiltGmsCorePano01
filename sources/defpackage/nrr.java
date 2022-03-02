package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.gcm.DozeChangeReceiver;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;

/* renamed from: nrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nrr {
    private static nrr m;
    private static Boolean n;
    protected nsh a;
    public nsm b;
    public ntj c;
    protected nva d;
    public HeartbeatChimeraAlarm e;
    protected nrj f;
    public nsa g;
    protected nys h;
    public nuk i;
    protected nyn j;
    protected nut k;
    public ntv l;

    public nrr() {
    }

    public static synchronized nrr a() {
        nrr nrr;
        synchronized (nrr.class) {
            if (m == null) {
                n = Boolean.valueOf(aekv.a(ihs.b()));
                m = new nrr((byte[]) null);
            }
            nrr = m;
        }
        return nrr;
    }

    public static synchronized boolean b() {
        boolean equals;
        synchronized (nrr.class) {
            if (axkn.e()) {
                iva.a((Object) n);
            }
            equals = Boolean.TRUE.equals(n);
        }
        return equals;
    }

    public final nsh c() {
        iva.a(nqw.c());
        return this.a;
    }

    public final nva d() {
        iva.a(nqw.c());
        return this.d;
    }

    public final nyn e() {
        iva.a(nqw.c());
        return this.j;
    }

    public final nrj f() {
        iva.a(nqw.c());
        return this.f;
    }

    public final nut g() {
        iva.a(nqw.c());
        return this.k;
    }

    public final nys h() {
        iva.a(nqw.c());
        return this.h;
    }

    public nrr(byte[] bArr) {
        ntw ntw;
        ihs b2 = ihs.b();
        nrq.e(b2);
        nqw.a((Context) b2);
        this.a = new nsh();
        this.b = new nsm(b2);
        this.c = new ntj();
        this.l = new ntv(b2);
        if (nqw.c()) {
            jiu jiu = jiu.a;
            hol hol = new hol(b2, "GCM", (String) null);
            this.g = new nsa(hol, new hph(hol, "GCM_COUNTERS", 1024), qwq.a((Context) b2));
            nqw.a();
            if (nqw.a) {
                ntw = new ntw();
            } else {
                ntw = null;
            }
            nts nts = new nts(b2);
            nub nub = new nub(b2, this.g);
            nsb nsb = new nsb(b2, this.g);
            nuk nuk = new nuk(b2, qwq.a((Context) b2), nsb, jiu);
            this.i = nuk;
            this.d = new nva(b2, jiu, nuk, nyn.a);
            this.e = new HeartbeatChimeraAlarm(b2, this.d, this.i, new nui(b2, "GCM_HB_ALARM", "com.google.android.gms.gcm.HEARTBEAT_ALARM"));
            nua nua = new nua(new nvp(nrq.c(b2)));
            nuh nuh = new nuh(b2, new nvq(b2), nub, this.g.a, nsb);
            nud nud = new nud(this.a, nub, nua, nuh);
            opc opc = new opc(b2, "Android-GCM/1.5", false);
            nyi nyi = new nyi(b2, this.l, nua);
            this.j = new nyn(b2, opc, this.b, nyi, this.c);
            ntn ntn = new ntn(b2, nua, nsb);
            aoru b3 = jfm.b(10);
            nva nva = this.d;
            nyn nyn = this.j;
            ntj ntj = this.c;
            hph hph = this.g.a;
            ntv ntv = this.l;
            nvt nvt = new nvt(ntv, ntn);
            nrj nrj = r1;
            ntn ntn2 = ntn;
            nyi nyi2 = nyi;
            nuh nuh2 = nuh;
            nsb nsb2 = nsb;
            ntn ntn3 = ntn2;
            nts nts2 = nts;
            nrj nrj2 = new nrj(b2, b3, ntw, nva, nts, nyn, nyi, ntj, nud, nuh, ntn3, nub, hph, ntv, nvt);
            nrj nrj3 = nrj;
            this.f = nrj3;
            nyn nyn2 = this.j;
            nsh nsh = this.a;
            nyj nyj = new nyj(nrj3, nyn2, nyi2);
            nsh.a(nyj, nyj.a);
            nuj nuj = new nuj();
            nvc nvc = new nvc(nuj);
            ihs ihs = b2;
            nur nur = new nur(ihs);
            nys nys = new nys(ihs);
            this.h = nys;
            this.k = new nvh(ihs, nur, nts2, this.e, this.d, this.f, ntw, this.b, nvc, nuj, nsb2, nys);
            this.a.a(new ntu(ihs, this.k, this.f, nuh2), jfm.b(10));
            if (jkr.b()) {
                DozeChangeReceiver dozeChangeReceiver = new DozeChangeReceiver();
                IntentFilter intentFilter = new IntentFilter();
                if (jkr.b()) {
                    intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                }
                if (jkr.c()) {
                    intentFilter.addAction("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED");
                }
                ihs.registerReceiver(dozeChangeReceiver, intentFilter);
            }
            Intent intent = new Intent();
            intent.setClassName(ihs, "com.google.android.gms.gcm.GcmService");
            ihs.startService(intent);
            return;
        }
        this.d = null;
        this.j = null;
        this.f = null;
        this.g = null;
        this.e = null;
        this.k = null;
        this.h = null;
        this.i = null;
    }
}
