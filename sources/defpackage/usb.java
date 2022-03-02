package defpackage;

import android.app.PendingIntent;
import java.util.Map;
import java.util.Set;

/* renamed from: usb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class usb {
    private static usb a;
    private final Map b = new nz();
    private final Map c = new nz();
    private final Map d = new nz();
    private final Map e = new nz();

    private usb() {
    }

    public static synchronized usb a() {
        usb usb;
        synchronized (usb.class) {
            if (a == null) {
                a = new usb();
            }
            usb = a;
        }
        return usb;
    }

    public final synchronized Set b() {
        return new ob(this.c.values());
    }

    public final synchronized byte[] c(String str) {
        return (byte[]) this.c.get(str);
    }

    public final synchronized void a(String str) {
        PendingIntent pendingIntent = (PendingIntent) this.b.get(str);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("usb", "a", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error sending PendingIntent %s", (Object) pendingIntent);
            }
        }
    }

    public final synchronized void b(String str) {
        this.c.remove(str);
        this.d.remove(str);
        this.e.remove(str);
    }

    public final synchronized void a(String str, PendingIntent pendingIntent) {
        this.b.put(str, pendingIntent);
    }

    public final synchronized void a(String str, String str2, byte[] bArr) {
        tqk tqk = (tqk) this.e.get(str);
        if (tqk != null) {
            tqk.b.a((Runnable) new tqj(tqk, str2, bArr));
        }
    }

    public final synchronized void a(String str, tqk tqk, asmk asmk, ulm ulm) {
        this.c.put(str, asmk.k());
        this.d.put(str, ulm);
        this.e.put(str, tqk);
    }

    public final synchronized boolean a(String str, usa usa) {
        boolean z;
        if (this.c.containsKey(str)) {
            ulm ulm = (ulm) this.d.get(str);
            uls uls = ulm.a;
            uls.a((Runnable) new ulp(uls, ulm.b, usa));
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
