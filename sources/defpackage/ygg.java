package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ygg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygg {
    public static final /* synthetic */ int a = 0;
    private static final jjg b = jjg.a(iyc.PHENOTYPE);
    private final yey c;
    private final Context d;

    public ygg(yey yey, Context context) {
        this.c = yey;
        this.d = context;
    }

    private final int c() {
        try {
            return ModuleManager.get(this.d).getCurrentModule().moduleVersion;
        } catch (Exception e) {
            anih anih = (anih) b.b();
            anih.a((Throwable) e);
            ((anih) anih.a("ygg", "c", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Problem to get module version");
            return 1;
        }
    }

    public final void a() {
        Context context = this.d;
        if (aekv.a()) {
            context = this.d.createDeviceProtectedStorageContext();
        }
        new yfb(this.c, "com.google.android.gms.phenotype", context.getSharedPreferences("com.google.android.gms.phenotype", 0)).a("");
    }

    public final void b() {
        int i;
        yey yey = this.c;
        try {
            i = ModuleManager.get(this.d).getCurrentModule().moduleVersion;
        } catch (Exception e) {
            anih anih = (anih) b.b();
            anih.a((Throwable) e);
            ((anih) anih.a("ygg", "c", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Problem to get module version");
            i = 1;
        }
        try {
            acws.a(yey.a("com.google.android.gms.phenotype", i, new String[]{"PHENOTYPE", "PHENOTYPE_COUNTERS"}, new int[0]), ayzv.f(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            anih anih2 = (anih) b.b();
            anih2.a(e2);
            ((anih) anih2.a("ygg", "b", 99, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Phenotype registration failed");
        }
    }

    public final void a(String str) {
        if (str == null || str.equals("com.google.android.gms.phenotype")) {
            a();
        }
    }
}
