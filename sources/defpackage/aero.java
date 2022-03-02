package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: aero  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aero implements amsv {
    private final awdn a;
    private final amsv b;
    private final amsv c;
    private final Object d = new Object();
    private String e;
    private Integer f;
    private aorr g;
    private final aerw h;

    public aero(awdn awdn, amsv amsv, amsv amsv2, aerw aerw) {
        this.a = awdn;
        this.b = amsv;
        this.c = amsv2;
        this.h = aerw;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aorr aorr;
        synchronized (this.d) {
            String str = (String) this.b.a();
            Integer num = (Integer) this.c.a();
            amrl.a((Object) str);
            amrl.a((Object) num);
            if (!num.equals(this.f) || !str.equals(this.e)) {
                aorr aorr2 = this.g;
                if (aorr2 != null) {
                    try {
                        if (aorr2.get() instanceof azzs) {
                            azzs azzs = (azzs) this.g.get();
                            azzs.c();
                            amrl.b(azzs.a(TimeUnit.SECONDS), (Object) "The channel has not been closed after timeout");
                        }
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        ((pia) this.a.a()).c("Exception during closing the channel", e2, new Object[0]);
                    } catch (Exception e3) {
                        ((pia) this.a.a()).c("Exception during closing the channel", e3, new Object[0]);
                    }
                }
                this.e = str;
                this.f = num;
                aerw aerw = this.h;
                int intValue = num.intValue();
                awdn awdn = aerw.a;
                Executor executor = aerw.b;
                ((pia) awdn.a()).a("[ProdGrpcChannelModule] Binding to %s:%d with OkHttp", str, Integer.valueOf(intValue));
                bami a2 = bami.a(str, intValue);
                a2.transportExecutor(executor);
                this.g = aorl.a((Object) a2.b());
            }
            aorr = this.g;
        }
        return aorr;
    }
}
