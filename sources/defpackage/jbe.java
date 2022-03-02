package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Random;

/* renamed from: jbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jbe implements Runnable {
    public final jba a;
    final /* synthetic */ jbf b;
    private final agif c = agfu.a().b();

    public jbe(jbf jbf, jba jba) {
        this.b = jbf;
        this.a = jba;
    }

    public final void run() {
        amkr a2;
        amkr a3;
        amky a4;
        agfu a5 = agfu.a();
        agif agif = this.c;
        int i = this.a.c;
        StringBuilder sb = new StringBuilder(31);
        sb.append(i);
        sb.append("-AsyncOp-Dispatching");
        a5.a(agif, sb.toString());
        Status status = Status.a;
        try {
            amkr a6 = amlv.a("AsyncOpTask");
            try {
                jbj jbj = this.b.e;
                synchronized (jbj.b) {
                    int i2 = jbj.a;
                    jbj.a = i2 + 1;
                    if (i2 == 0) {
                        if (jbj.c == null) {
                            iva.a((Object) jbj.d.getContainerService());
                            jbj.c = jhg.h(jbj.d.getContainerService().getClass().getName());
                        }
                        Intent intent = jbj.c;
                        try {
                            jbj.d.startService(intent);
                        } catch (IllegalStateException e) {
                            if (Build.VERSION.SDK_INT >= 26 && ((amrk.a(intent.getPackage()) || intent.getPackage().equals("com.google.android.gms")) && awxl.b() && ((double) new Random().nextFloat()) < awxl.c())) {
                                Log.e("LifecycleSync", "Google Play services is unable to start a service. Exiting.", e);
                                jhg.e();
                            }
                            throw e;
                        }
                    }
                }
                a2 = amlv.a("GlobalPreProcessing");
                for (jbm b2 : jbf.a) {
                    if (!b2.b()) {
                        this.b.e.a();
                        if (a2 != null) {
                            a2.close();
                        }
                        if (a6 != null) {
                            a6.close();
                            return;
                        }
                        return;
                    }
                }
                if (a2 != null) {
                    a2.close();
                }
                a3 = amlv.a("ServicePreProcessing");
                for (jbm b3 : this.b.f) {
                    if (!b3.b()) {
                        this.b.e.a();
                        if (a3 != null) {
                            a3.close();
                        }
                        if (a6 != null) {
                            a6.close();
                            return;
                        }
                        return;
                    }
                }
                if (a3 != null) {
                    a3.close();
                }
                a4 = nkf.b.a(amlv.a("AsyncOpImpl"));
                this.a.a(this.b.d);
                if (a4 != null) {
                    a4.close();
                }
                if (a6 != null) {
                    a6.close();
                }
                jbf.c.execute(amll.a((Runnable) new jbd(this)));
                return;
                throw th;
                throw th;
                throw th;
            } catch (Throwable th) {
                if (a6 != null) {
                    a6.close();
                }
                throw th;
            }
        } catch (jbk e2) {
            throw null;
        } catch (RemoteException e3) {
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
