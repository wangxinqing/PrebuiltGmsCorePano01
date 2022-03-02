package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: adkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkr {
    public static final adri a = new adrk("control.config_update.last_config_update_timestamp", 0L);
    public static final adqz b = new adkq();
    private static final iwd e = adnt.d("ConfigUpdateControl");
    private static final adrj f = new adrj("control.config_update.last_config_request_properties", avqm.e);
    private static final adrj g = new adrj("control.config_update.last_get_config_request", awfm.e);
    private static final adri h = new adrk("control.config_update.config_update_check_period", -1L);
    private static final adri i = new adrk("control.config_update.config_update_check_flex", -1L);
    public final aoru c = jfm.a(9);
    public final adrn d;
    private final adkv j = ((adkv) adkv.b.b());
    private final awfl k;
    private final String l;
    private final Context m;

    public adkr(Context context) {
        aucd o = awfl.f.o();
        String str = Build.DEVICE;
        if (o.c) {
            o.c();
            o.c = false;
        }
        str.getClass();
        ((awfl) o.b).a = str;
        String str2 = Build.FINGERPRINT;
        if (o.c) {
            o.c();
            o.c = false;
        }
        str2.getClass();
        ((awfl) o.b).b = str2;
        String str3 = Build.BOOTLOADER;
        if (o.c) {
            o.c();
            o.c = false;
        }
        str3.getClass();
        ((awfl) o.b).c = str3;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(Build.TIME);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((awfl) o.b).e = seconds;
        if (Build.getRadioVersion() != null) {
            String radioVersion = Build.getRadioVersion();
            if (o.c) {
                o.c();
                o.c = false;
            }
            radioVersion.getClass();
            ((awfl) o.b).d = radioVersion;
        }
        this.k = (awfl) o.i();
        int i2 = Build.VERSION.SDK_INT;
        this.l = Locale.getDefault().toLanguageTag();
        this.d = (adrn) adrn.a.b();
        this.m = context;
    }

    private static final avqn a(String str) {
        aucd o = avqn.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avqn avqn = (avqn) o.b;
        str.getClass();
        avqn.a |= 1;
        avqn.b = str;
        amri c2 = amri.c(amrk.c(SystemProperties.get(String.format("ro.%s.build.fingerprint", new Object[]{str}))));
        amri amri = ampu.a;
        try {
            String str2 = SystemProperties.get(String.format("ro.%s.build.date.utc", new Object[]{str}));
            if (!amrk.a(str2)) {
                amri = amri.b(Long.valueOf(Long.parseLong(str2)));
            }
        } catch (NumberFormatException e2) {
            amri = ampu.a;
        }
        if (c2.a()) {
            String str3 = (String) c2.b();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avqn avqn2 = (avqn) o.b;
            str3.getClass();
            avqn2.a |= 2;
            avqn2.c = str3;
        }
        if (amri.a()) {
            long longValue = ((Long) amri.b()).longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avqn avqn3 = (avqn) o.b;
            avqn3.a |= 4;
            avqn3.d = longValue;
        }
        return (avqn) o.i();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.c.execute(new adko(this));
    }

    public final void c() {
        if (ayox.d() != ((Long) this.d.b(h)).longValue() || ayox.c() != ((Long) this.d.b(i)).longValue()) {
            e.b("Scheduling config update check task with %d seconds period and %d seconds flex.", Long.valueOf(ayox.d()), Long.valueOf(ayox.c()));
            Context context = this.m;
            ChimeraGcmTaskService.a.c("Scheduling task: %s.", "CheckConfigUpdate");
            qxi qxi = new qxi();
            qxi.i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
            qxi.k = "CheckConfigUpdate";
            qxi.a = ayox.d();
            qxi.b = ayox.c();
            qxi.n = true;
            qxi.a(2);
            qxi.a(0, axcc.b() ? 1 : 0);
            qxi.b(1);
            qwq.a(context).a((qxx) qxi.b());
            this.d.a(h.b(Long.valueOf(ayox.d())));
            this.d.a(i.b(Long.valueOf(ayox.c())));
        }
    }

    public final babj d() {
        babj babj;
        aucd o = awfm.e.o();
        String a2 = aypg.a.a().a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        a2.getClass();
        ((awfm) o.b).b = a2;
        String b2 = aypg.a.a().b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        awfm awfm = (awfm) o.b;
        b2.getClass();
        awfm.a = b2;
        awfl awfl = this.k;
        awfl.getClass();
        awfm.d = awfl;
        String str = this.l;
        str.getClass();
        awfm.c = str;
        awfm awfm2 = (awfm) o.i();
        adjt adjt = new adjt(this.m, ayor.a.a().a(), (int) ayor.a.a().b());
        try {
            adjt.a.b("Sent GetConfigRequest: %s.", awfm2);
            adjs adjs = adjt.b;
            ClientContext clientContext = adjt.c;
            if (adjs.b == null) {
                adjs.b = baaj.a(baai.UNARY, "google.internal.android.ota.download.configdelivery.v1.ConfigDeliveryService/GetConfig", baoq.a(awfm.e), baoq.a(awfn.d));
            }
            awfn awfn = (awfn) adjs.a.a(adjs.b, clientContext, awfm2, 10000, TimeUnit.MILLISECONDS);
            awfp awfp = awfn.a;
            if (awfp == null) {
                awfp = awfp.e;
            }
            this.d.a(adke.a.a.b(awfp.a));
            this.d.a(adke.c.a.b(awfp.b));
            this.d.a(adke.e.a.b(awfp.d));
            this.d.a(adke.f.a.b(awfp.c));
            awfo awfo = awfn.b;
            if (awfo == null) {
                awfo = awfo.e;
            }
            this.d.a(adke.d.a.b(awfo.a));
            this.d.a(adke.i.a.b(awfo.c));
            this.d.a(adjx.f.a.b(awfo.d));
            this.d.a(adke.b.a.b(Long.valueOf(awfo.b)));
            awfk awfk = awfn.c;
            if (awfk == null) {
                awfk = awfk.l;
            }
            this.d.a(adki.e.a.b(Long.valueOf((long) awfk.a)));
            adrn adrn = this.d;
            adrc[] adrcArr = new adrc[1];
            adrcArr[0] = adke.g.a.b(!awfk.b ? "" : "yes");
            adrn.a(adrcArr);
            adrn adrn2 = this.d;
            adrc[] adrcArr2 = new adrc[1];
            adri adri = adke.h.a;
            awfk awfk2 = awfn.c;
            if (awfk2 == null) {
                awfk2 = awfk.l;
            }
            adrcArr2[0] = adri.b(Boolean.valueOf(awfk2.c));
            adrn2.a(adrcArr2);
            adrn adrn3 = this.d;
            adrc[] adrcArr3 = new adrc[1];
            adri adri2 = adjx.a.a;
            awfk awfk3 = awfn.c;
            if (awfk3 == null) {
                awfk3 = awfk.l;
            }
            adrcArr3[0] = adri2.b(Long.valueOf(awfk3.d));
            adrn3.a(adrcArr3);
            adrn adrn4 = this.d;
            adrc[] adrcArr4 = new adrc[1];
            adri adri3 = adjx.b.a;
            awfk awfk4 = awfn.c;
            if (awfk4 == null) {
                awfk4 = awfk.l;
            }
            adrcArr4[0] = adri3.b(Long.valueOf(awfk4.e));
            adrn4.a(adrcArr4);
            adrn adrn5 = this.d;
            adrc[] adrcArr5 = new adrc[1];
            adri adri4 = adjx.d.a;
            awfk awfk5 = awfn.c;
            if (awfk5 == null) {
                awfk5 = awfk.l;
            }
            adrcArr5[0] = adri4.b(Long.valueOf((long) awfk5.f));
            adrn5.a(adrcArr5);
            this.d.a(adjx.c.a.b(awfk.g));
            this.d.a(adka.b.a.b(Long.valueOf((long) awfk.h)));
            this.d.a(adka.c.a.b(Long.valueOf((long) awfk.i)));
            this.d.a(adjx.g.a.b(Long.valueOf((long) awfk.j)));
            this.d.a(adka.a.a.b(awfk.k));
            this.j.a(10);
            babj = babj.a(babg.OK);
            this.d.a(a.b(Long.valueOf(System.currentTimeMillis())));
            this.d.a(g.b(amri.b(awfm2)));
        } catch (babk e2) {
            e.e("Status exception when retrieving config.", e2, new Object[0]);
            babj = e2.a;
            this.d.a(g.b(amri.b(awfm2)));
        } catch (eif e3) {
            e.e("Auth exception when retrieving config.", e3, new Object[0]);
            babj = babj.a(babg.UNAUTHENTICATED).b(amrk.b(e3.getMessage()));
            this.d.a(g.b(amri.b(awfm2)));
        } catch (Throwable th) {
            this.d.a(g.b(amri.b(awfm2)));
            adjt.a();
            throw th;
        }
        adjt.a();
        e.c("Update config retrieval finished with status: %s.", babj);
        return babj;
    }

    public final avqm a(boolean z) {
        amri amri = (amri) this.d.b(g);
        amri amri2 = (amri) this.d.b(f);
        aucd o = avqm.e.o();
        if (amri.a() && amri2.a()) {
            awfl awfl = this.k;
            awfl awfl2 = ((awfm) amri.b()).d;
            if (awfl2 == null) {
                awfl2 = awfl.f;
            }
            if (awfl.equals(awfl2)) {
                z = z || ((avqm) amri2.b()).b;
            }
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avqm avqm = (avqm) o.b;
        avqm.a |= 1;
        avqm.b = z;
        avqn a2 = a("system");
        if (o.c) {
            o.c();
            o.c = false;
        }
        avqm avqm2 = (avqm) o.b;
        a2.getClass();
        avqm2.c = a2;
        avqm2.a |= 2;
        avqn a3 = a("vendor");
        if (o.c) {
            o.c();
            o.c = false;
        }
        avqm avqm3 = (avqm) o.b;
        a3.getClass();
        avqm3.d = a3;
        avqm3.a |= 4;
        return (avqm) o.i();
    }

    public final babj a() {
        return a(a(false));
    }

    public final babj a(avqm avqm) {
        yey a2 = yef.a(this.m);
        try {
            acws.a(a2.a("com.google.android.gms.update", avqm.k()));
            e.b("Set phenotype request property: %s.", avqm);
            yey yey = a2;
            Configurations configurations = (Configurations) acws.a(yey.a("com.google.android.gms.update", 201216073, new String[]{"ANDROID_OTA"}, avqm.k(), ""));
            e.b("Received new Phenotype snapshot: %s", configurations.a);
            acws.a(a2.a("com.google.android.gms.update", ""));
            e.b("Committed to latest snapshot: %s", configurations.a);
            this.d.a(f.b(amri.b(avqm)));
            return d();
        } catch (InterruptedException | ExecutionException e2) {
            e.e("Unable to sync latest phenotype config with user-initiated property.", e2, new Object[0]);
            this.d.a(f.b(amri.b(avqm)));
            return babj.a(babg.INTERNAL);
        } catch (Throwable th) {
            this.d.a(f.b(amri.b(avqm)));
            throw th;
        }
    }
}
