package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Random;

/* renamed from: jlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlm {
    static boolean a = false;
    public final String[] b;
    private final Context c;
    private final Random d;

    public jlm(Context context) {
        Context applicationContext = context.getApplicationContext();
        Random random = new Random();
        this.c = applicationContext;
        this.d = random;
        String d2 = axdg.a.a().d();
        if (!TextUtils.isEmpty(d2)) {
            this.b = d2.split(",");
        } else {
            this.b = new String[0];
        }
    }

    public static final boolean b() {
        boolean z;
        if (!axdg.b() || a) {
            return false;
        }
        int a2 = (int) axdj.a.a().a();
        if (a2 == 1) {
            z = true;
        } else {
            z = false;
        }
        a = z;
        if (a2 == 3 || (a2 == 2 && axdj.a.a().b() < System.currentTimeMillis())) {
            return true;
        }
        return false;
    }

    public final PendingIntent a() {
        return PendingIntent.getActivity(this.c, 0, new Intent().setClassName(this.c, "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity"), 134217728);
    }

    public final void a(int i) {
        if (((double) this.d.nextFloat()) < axdg.a.a().e()) {
            aucd o = aohl.u.o();
            aucd o2 = aohw.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aohw aohw = (aohw) o2.b;
            aohw.b = i - 1;
            aohw.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aohl aohl = (aohl) o.b;
            aohw aohw2 = (aohw) o2.i();
            aohw2.getClass();
            aohl.n = aohw2;
            aohl.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            hoi a2 = iwt.a().b(this.c).a((audx) (aohl) o.i());
            a2.b(15);
            a2.b();
        }
    }
}
