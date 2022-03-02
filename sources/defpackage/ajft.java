package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import java.security.SecureRandom;

/* renamed from: ajft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajft {
    public static ajft b;
    public ajgu a;
    private final ihs c;
    private final SecureRandom d;
    private HandlerThread e;

    static {
        jjg.a("EAlert");
    }

    public ajft(ihs ihs) {
        SecureRandom secureRandom = new SecureRandom();
        this.c = ihs;
        this.d = secureRandom;
    }

    public static void a() {
        ajgb.a((Context) ihs.b());
        if (ajfs.d()) {
            synchronized (ajft.class) {
                if (b == null) {
                    ajft ajft = new ajft(ihs.b());
                    b = ajft;
                    HandlerThread handlerThread = new HandlerThread("EA", 9);
                    ajft.e = handlerThread;
                    handlerThread.start();
                    ajft.a = new ajgu("EA", ajft.e);
                    ajft.a.b(new ajgp("EAWatchSettings", new ajfs(ajft.c, ajft.a.a(1))));
                    ajgc ajfy = !ayab.a.a().useNewLocationApi() ? new ajfy(ajft.a.a(2), ajft.c) : new ajfw(ajft.a.a(2), ajft.c);
                    ajft.a.b(new ajgp("EALocation", ajfy));
                    if (ayab.e()) {
                        ajft.a.b(new ajfz(ajft.c, ajft.d, ajfy));
                    }
                    if (ayab.g()) {
                        ajft.a.b(new ajgb(ajft.c, ajft.d, ajfy));
                    }
                    ajft.a.a();
                }
            }
        }
    }
}
