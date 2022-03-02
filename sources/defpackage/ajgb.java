package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/* renamed from: ajgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajgb extends ajgs {
    private final Context a;
    private final Random b;
    private final ajgc c;
    private ajga d;
    private aiby e;

    static {
        jjg.a("EAlert");
    }

    public ajgb(Context context, Random random, ajgc ajgc) {
        super("EARegion");
        this.a = context;
        this.b = random;
        this.c = ajgc;
    }

    static void a(Context context) {
        if (ayab.a.a().alwaysCheckStaleFile()) {
            try {
                arpd b2 = aiby.a(context, ayab.f()).b(context);
                if (b2 != null && System.currentTimeMillis() - b2.b > ayab.k()) {
                    aiby.c(context);
                }
            } catch (aicb e2) {
            }
        }
    }

    public final void b() {
        if (this.e != null) {
            try {
                aiby.c(this.a);
            } catch (aicb e2) {
            }
            this.e = null;
        }
        this.d = null;
    }

    public final void a() {
        this.d = new ajga(this.b, (int) ayab.a.a().numSupplementalRegions(), (int) ayab.l());
        try {
            this.e = aiby.a(this.a, ayab.f());
            this.h.b.a(6, 0);
            this.h.b.a(3, 0);
        } catch (aicb e2) {
            this.h.b();
        }
    }

    public final boolean a(Message message) {
        ArrayList arrayList;
        int i = message.what;
        if (i == 3) {
            Location d2 = this.c.d();
            if (d2 != null) {
                ajga ajga = this.d;
                long a2 = aema.a(aema.a(d2.getLatitude(), d2.getLongitude()), ajga.b);
                if (a2 != ajga.c || (arrayList = ajga.d) == null) {
                    HashSet<Long> hashSet = new HashSet<>(ajga.a + 1);
                    hashSet.add(Long.valueOf(a2));
                    while (hashSet.size() < ajga.a + 1) {
                        hashSet.add(Long.valueOf(aema.a(aema.a(ajga.a(90.0d), ajga.a(180.0d)), ajga.b)));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Long longValue : hashSet) {
                        String valueOf = String.valueOf(aema.d(longValue.longValue()));
                        arrayList2.add(valueOf.length() == 0 ? new String("ea.") : "ea.".concat(valueOf));
                    }
                    arrayList2.toString();
                    ajga.c = a2;
                    ajga.d = arrayList2;
                    arrayList = arrayList2;
                }
                try {
                    this.e.a(this.a, (List) arrayList);
                } catch (aicb e2) {
                }
            }
            this.h.b.a(3, ayab.a.a().regionSupplierIntervalMillis());
            return true;
        } else if (i != 6) {
            return false;
        } else {
            a(this.a);
            this.h.b.a(6, ayab.k());
            return true;
        }
    }
}
