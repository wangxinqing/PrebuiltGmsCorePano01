package defpackage;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: twd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twd {
    public final tsq a;
    private final Context b;

    public twd(Context context) {
        izd izd = new izd(context, aymt.a.a().av(), (int) aymt.a.a().aw(), context.getApplicationInfo().uid, 9731, (byte[]) null);
        this.b = context;
        this.a = new tsq(izd);
    }

    static long b(String str) {
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException e) {
            throw new twc(str, e);
        }
    }

    public final asqq a(String str) {
        try {
            long b2 = b(str);
            try {
                aucd o = asqp.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ((asqp) o.b).a = b2;
                String language = Locale.getDefault().getLanguage();
                String country = Locale.getDefault().getCountry();
                StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country).length());
                sb.append(language);
                sb.append("-");
                sb.append(country);
                String sb2 = sb.toString();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                sb2.getClass();
                ((asqp) o.b).c = sb2;
                int i = !((arxg) thl.a(this.b, arxg.class)).a() ? 3 : 4;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ((asqp) o.b).b = i - 2;
                if (aymw.o()) {
                    jjg jjg = tsp.a;
                    long dimensionPixelSize = (long) this.b.getResources().getDimensionPixelSize(!aymw.E() ? R.dimen.fast_pair_notification_small_image_size : R.dimen.fast_pair_halfsheet_mid_image_size);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    ((asqp) o.b).d = dimensionPixelSize;
                }
                tsq tsq = this.a;
                ClientContext a2 = a();
                asqp asqp = (asqp) o.i();
                if (tsq.b == null) {
                    tsq.b = baaj.a(baai.UNARY, "location.nearby.v1.NearbyDevicesService/GetObservedDevice", baoq.a(asqp.e), baoq.a(asqq.d));
                }
                return (asqq) tsq.a.a(tsq.b, a2, asqp, 10000, TimeUnit.MILLISECONDS);
            } catch (babk | eif e) {
                anih anih = (anih) tsp.a.c();
                anih.a(e);
                anih.a("FastPair: Failed to get observed device %s", b2);
                return null;
            }
        } catch (twc e2) {
            anih anih2 = (anih) tsp.a.c();
            anih2.a((Throwable) e2);
            anih2.a("FastPair: Failed to parse model ID.");
            return null;
        }
    }

    public final ClientContext a() {
        ClientContext clientContext = new ClientContext();
        clientContext.b = Process.myUid();
        clientContext.e = this.b.getPackageName();
        clientContext.f = this.b.getPackageName();
        return clientContext;
    }
}
