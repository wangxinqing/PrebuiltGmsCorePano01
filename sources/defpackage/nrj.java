package defpackage;

import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.DataMessageManager$2;
import com.google.android.gms.gcm.DataMessageManager$BroadcastDoneReceiver;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: nrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nrj {
    public final Context a;
    public final ExecutorService b;
    public final ntw c;
    public final nva d;
    public final nts e;
    public final nyn f;
    public final nyi g;
    public final nud h;
    public final nuh i;
    public final ntn j;
    public final nub k;
    public final hph l;
    public final BroadcastReceiver m;
    public final ntv n;
    public final nvt o;
    public nut p;
    public List q = null;
    public final nsl r = new nsl();
    private final Object s = new Object();
    private final Handler t = new qvr(Looper.getMainLooper());
    private final acrz u;

    public nrj(Context context, ExecutorService executorService, ntw ntw, nva nva, nts nts, nyn nyn, nyi nyi, ntj ntj, nud nud, nuh nuh, ntn ntn, nub nub, hph hph, ntv ntv, nvt nvt) {
        DataMessageManager$2 dataMessageManager$2;
        ntw ntw2 = ntw;
        this.a = context;
        this.b = executorService;
        this.c = ntw2;
        this.d = nva;
        this.e = nts;
        this.f = nyn;
        this.g = nyi;
        this.h = nud;
        this.i = nuh;
        this.j = ntn;
        acrz acrz = new acrz(context, 1, "GOOGLE_C2DM", (String) null, "com.google.android.gms");
        this.u = acrz;
        acrz.a(true);
        this.k = nub;
        this.l = hph;
        if (ntw2 != null) {
            dataMessageManager$2 = new DataMessageManager$2(this, "gcm");
        } else {
            dataMessageManager$2 = null;
        }
        this.m = dataMessageManager$2;
        this.n = ntv;
        this.o = nvt;
        this.q = Arrays.asList(axlc.a.a().h().split(","));
        ntj.a(2, (nti) new nqx(this));
        if (nrr.b()) {
            return;
        }
        if (axlc.a.a().e()) {
            a(0, (String) null);
            executorService.execute(new nqy(this));
            return;
        }
        c();
    }

    public static final String a(int i2) {
        return i2 != 5 ? i2 != 10 ? i2 != 17 ? "UNKNOWN" : "REDUCED" : "HIGH" : "NORMAL";
    }

    public static boolean d() {
        return axkq.c() == 1;
    }

    public static boolean e() {
        int c2 = (int) axkq.c();
        return c2 == 1 || c2 == 2;
    }

    public final String b() {
        return !aekv.a(this.a) ? "com.google.android.c2dm.intent.RECEIVE" : "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    }

    public final void c() {
        this.i.a(this.a, this);
    }

    public static void a(amnb amnb, String str, String str2) {
        if (str2 != null) {
            aucd o2 = ammv.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ammv ammv = (ammv) o2.b;
            str.getClass();
            int i2 = ammv.a | 1;
            ammv.a = i2;
            ammv.b = str;
            str2.getClass();
            ammv.a = i2 | 2;
            ammv.c = str2;
            amnb.a(o2);
        }
    }

    public final void b(amnc amnc) {
        a((nri) new nrb(this, amnc));
    }

    public static void a(nri nri) {
        if (!axlc.a.a().m()) {
            nri.a();
            return;
        }
        quu a2 = qut.a();
        try {
            nri.a().a(nrd.a, (acvp) new nre(a2));
        } catch (Exception e2) {
            a2.close();
            throw e2;
        }
    }

    public final acwa a(amnc amnc, long j2, boolean z) {
        Integer num;
        nvr a2 = nvr.a(amnc);
        String str = null;
        if (!TextUtils.isEmpty(a2.b)) {
            Intent intent = new Intent(b());
            if (a2.b()) {
                str = a2.b;
            } else if (a2.c()) {
                str = "com.google.android.gsf.subscribedfeeds";
            }
            if (str != null) {
                intent.addCategory(str);
            }
            if (jkr.e() || str == null) {
                intent.setPackage(a2.a());
            }
            intent.putExtras(nvs.a(amnc));
            acwa a3 = a(intent, amnc, a2);
            if (!z) {
                nud nud = this.h;
                if (nud.a && ((amnc.a & 32768) == 0 || amnc.l != 0)) {
                    ntx a4 = ntx.a(amnc);
                    String str2 = amnc.h;
                    if (!TextUtils.isEmpty(a4.a) && !TextUtils.isEmpty(str2)) {
                        nua nua = nud.c;
                        synchronized (nua) {
                            num = (Integer) nua.b.get(a4);
                        }
                        if (num != null) {
                            try {
                                if (nua.d(a4) == num.intValue()) {
                                    nud.d.a(amnc, j2);
                                    nud.a();
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                            }
                        }
                    }
                }
            }
            for (amnc amnc2 : this.r.a()) {
                ntx a5 = ntx.a(amnc2);
                if (a5.a != null) {
                    if (this.g.b(a5)) {
                        String valueOf = String.valueOf(a5);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Retrying expired message for: ");
                        sb.append(valueOf);
                        Log.w("GCM", sb.toString());
                        this.t.post(new nrf(this, amnc2));
                    } else {
                        String valueOf2 = String.valueOf(a5);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                        sb2.append("Unregistering due to expired message: ");
                        sb2.append(valueOf2);
                        Log.w("GCM", sb2.toString());
                        a(a5);
                        this.g.a(a5);
                    }
                }
            }
            return a3;
        }
        Log.e("GCM", "processPackage: received msg w/o category, dropping");
        return acws.a((Object) null);
    }

    public final acwa a(Intent intent, amnc amnc, nvr nvr) {
        int i2 = nvr.c.b;
        if (axlc.a.a().a()) {
            intent.addFlags(32);
        }
        DataMessageManager$BroadcastDoneReceiver dataMessageManager$BroadcastDoneReceiver = new DataMessageManager$BroadcastDoneReceiver(this, intent, amnc, SystemClock.elapsedRealtime());
        String concat = (!nvr.b() || nvr.a.contains(nvr.b)) ? null : String.valueOf(nvr.b).concat(".permission.C2D_MESSAGE");
        aucx aucx = amnc.g;
        int size = aucx.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            ammv ammv = (ammv) aucx.get(i3);
            String str = ammv.b;
            String str2 = ammv.c;
            i3++;
            if (str.equals("google.aia")) {
                if ("1".equals(str2) || Boolean.valueOf(str2).booleanValue()) {
                    return acws.a((Object) null);
                }
            }
        }
        this.t.postDelayed(new nrh(dataMessageManager$BroadcastDoneReceiver), 5000);
        a(i2, intent.getPackage());
        int i4 = amnc.q;
        if (i4 == 10 || (i4 == 17 && axlc.a.a().ay())) {
            intent.addFlags(268435456);
            if (jkr.b() && axkt.b() > 0) {
                ntx a2 = ntx.a(intent.getPackage(), i2);
                if (a2.a != null) {
                    Context context = this.a;
                    long b2 = axkt.b();
                    nqw.a();
                    if (jkr.b()) {
                        UserHandle userHandle = (UserHandle) nqw.c(a2.b);
                        if (userHandle == null) {
                            int i5 = a2.b;
                            StringBuilder sb = new StringBuilder(51);
                            sb.append("Failed to convert user serial ");
                            sb.append(i5);
                            sb.append(" to handle");
                            Log.e("GCM", sb.toString());
                        } else if (axlc.v()) {
                            try {
                                nqw.d.invoke(nqw.c, new Object[]{a2.a, Long.valueOf(b2), userHandle});
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                            }
                        } else {
                            try {
                                ((UsageStatsManager) context.getSystemService(UsageStatsManager.class)).whitelistAppTemporarily(a2.a, b2, userHandle);
                            } catch (IllegalArgumentException | SecurityException e3) {
                                String valueOf = String.valueOf(e3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 43);
                                sb2.append("Error whitelisting app for waking in doze: ");
                                sb2.append(valueOf);
                                Log.w("GCM", sb2.toString());
                            }
                        }
                    }
                }
            }
        }
        if (i2 <= 0) {
            this.a.sendOrderedBroadcast(intent, concat, dataMessageManager$BroadcastDoneReceiver, this.t, 0, (String) null, (Bundle) null);
        } else {
            if (!nqw.d(i2)) {
                StringBuilder sb3 = new StringBuilder(54);
                sb3.append("Attempting to send message to stopped user ");
                sb3.append(i2);
                Log.w("GCM", sb3.toString());
            }
            nqw.a(this.a, i2, intent, (String) null, dataMessageManager$BroadcastDoneReceiver, this.t);
        }
        return dataMessageManager$BroadcastDoneReceiver.a.a;
    }

    public final void a() {
        synchronized (this.s) {
            this.u.c();
        }
    }

    public final void a(int i2, String str) {
        if (str == null) {
            str = "com.google.android.gms";
        }
        synchronized (this.s) {
            this.u.c(jlr.a(this.n.b(i2), str));
            this.u.b();
        }
    }

    public final void a(amnc amnc) {
        a((nri) new nra(this, amnc));
    }

    /* access modifiers changed from: package-private */
    public final void a(amnc amnc, String str) {
        Intent intent = new Intent(b());
        intent.setPackage(amnc.e);
        intent.putExtra("error", str);
        intent.putExtra("message_type", "send_error");
        if ((amnc.a & 2) != 0) {
            intent.putExtra("google.message_id", amnc.b);
        }
        a(intent, amnc, nvr.a(amnc));
    }

    public final void a(ntx ntx) {
        if (ntx.a == null) {
            return;
        }
        if (!axkn.c() || !aekv.a(this.a)) {
            String valueOf = String.valueOf(ntx);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Unregister application ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            this.f.a((Runnable) new nrg(this, ntx));
        }
    }
}
