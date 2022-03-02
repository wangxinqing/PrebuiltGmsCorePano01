package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: elg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elg {
    private final Random a = new Random();
    private final goj b;

    public elg(Context context) {
        this.b = new goj(context);
        long a2 = jhg.a(context);
        if (a2 != 0) {
            this.a.setSeed(a2);
        }
    }

    public final void a(iwd iwd, anpx anpx) {
        String str;
        int a2 = anpu.a(anpx.c);
        if (a2 == 0) {
            a2 = 1;
        }
        int b2 = anpw.b(anpx.b);
        if (b2 == 0) {
            b2 = 1;
        }
        if (a2 == 2) {
            String a3 = anpw.a(b2);
            iwd.c(a3.length() == 0 ? new String("Sync is success at ") : "Sync is success at ".concat(a3), new Object[0]);
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = anpw.a(b2);
            switch (a2) {
                case 1:
                    str = "UNKNOWN_RESULT";
                    break;
                case 2:
                    str = "SUCCESS";
                    break;
                case 3:
                    str = "MISSING_ACCOUNT_ID";
                    break;
                case 4:
                    str = "ACCOUNT_NOT_FOUND";
                    break;
                case 5:
                    str = "MISSING_ACTION";
                    break;
                case 6:
                    str = "UNRECOGNIZED_ACTION";
                    break;
                case 7:
                    str = "MISSING_EXTRAS";
                    break;
                case 8:
                    str = "NETWORK_ERROR";
                    break;
                default:
                    str = "EMPTY_RESULT";
                    break;
            }
            objArr[1] = str;
            iwd.d(String.format("Failed to sync at %s due to %s.", objArr), new Object[0]);
        }
        if (this.a.nextDouble() < awly.a.a().c()) {
            aucd o = anon.v.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon = (anon) o.b;
            anon.c = 48;
            anon.a = 1 | anon.a;
            anpx.getClass();
            anon.u = anpx;
            anon.b |= 16384;
            this.b.b((anon) o.i());
        }
    }
}
