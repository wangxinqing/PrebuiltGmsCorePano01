package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: nib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nib extends qwf {
    private static final Object a = new Object();

    private final void a(int i) {
        nhz.a.a(getApplicationContext()).a(9, i, "com.google.android.gms.fonts.update");
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public static void a(nhz nhz, Context context) {
        try {
            qxi qxi = new qxi();
            if (nhz.n <= 0) {
                nhz.d();
            }
            qxi.a = nhz.n;
            qxi.b = TimeUnit.HOURS.toSeconds(6);
            qxi.n = true;
            qxi.i = "com.google.android.gms.fonts.update.UpdateSchedulerService";
            qxi.a(1, 1);
            qxi.a(1);
            qxi.b(1);
            qxi.k = "FontsUpdateCheck";
            qwq.a(context).a((qxx) qxi.b());
            ngz.c("FontsUpdateScheduler", "Update scheduled", new Object[0]);
        } catch (Exception e) {
            ngz.a("FontsUpdateScheduler", (Throwable) e, "Unable to schedule update check", new Object[0]);
            nhz.a(context).a(9, 23503, "com.google.android.gms.fonts.update");
        }
    }

    public final int a(qxz qxz) {
        ngo ngo;
        String str;
        int i = 2;
        if (nia.a()) {
            ngz.a("FontsUpdateScheduler", "Update Runner is already running", new Object[0]);
            return 2;
        } else if (!axir.d()) {
            ngz.a("FontsUpdateScheduler", "Update Runner fired but directory updates are not enabled", new Object[0]);
            return 2;
        } else {
            b();
            synchronized (a) {
                try {
                    int c = (int) axir.c();
                    nfv nfv = nhz.a.d(getApplicationContext()).a;
                    boolean z = true;
                    if (c <= nfv.b) {
                        ngz.a("FontsUpdateScheduler", "New version from GServices %d is less than or equal to current version %d", Integer.valueOf(c), Integer.valueOf(nfv.b));
                    } else {
                        String b = axir.b();
                        if (!amrk.a(b)) {
                            if (b.length() == 64) {
                                ngz.b("FontsUpdateScheduler", "Starting Update process", new Object[0]);
                                nhz nhz = nhz.a;
                                synchronized (nhz.b) {
                                    ngo = nhz.i;
                                }
                                if (ngo != null) {
                                    Context applicationContext = getApplicationContext();
                                    nfw a2 = nhu.a();
                                    if (nhz.a.c(applicationContext).b(a2.c)) {
                                        ngm c2 = nhz.c(applicationContext);
                                        nhm d = nhz.d(applicationContext);
                                        synchronized (nia.a) {
                                            if (nia.b == null) {
                                                nia.b = new nia(c2, ngo, a2, d, applicationContext);
                                            } else {
                                                z = false;
                                            }
                                            nia.b.b();
                                        }
                                        if (!z) {
                                            str = "failed";
                                        } else {
                                            str = "succeeded";
                                        }
                                        ngz.b("FontsUpdateScheduler", str.length() == 0 ? new String("Update scheduler ") : "Update scheduler ".concat(str), new Object[0]);
                                        if (z) {
                                            i = 0;
                                        }
                                    } else {
                                        ngz.a("FontsUpdateScheduler", "Not enough disk space to process update.", new Object[0]);
                                    }
                                } else {
                                    ngz.a("FontsUpdateScheduler", "No downloader, SharedState not initialized. Bailing out.", new Object[0]);
                                    a(23502);
                                }
                                try {
                                    return i;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        ngz.a("FontsUpdateScheduler", "gServices value for directory hash is invalid: %s", b);
                    }
                    ngz.b("FontsUpdateScheduler", "Did not start update", new Object[0]);
                    return 0;
                } catch (Exception e) {
                    ngz.a("FontsUpdateScheduler", (Throwable) e, "Update process failed due to an exception", new Object[0]);
                    a(23501);
                    return 2;
                }
            }
        }
    }
}
