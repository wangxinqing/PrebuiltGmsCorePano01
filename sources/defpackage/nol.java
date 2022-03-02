package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.TimeZone;

/* renamed from: nol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nol {
    private static agzs a;

    public static Long a() {
        return Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")).getTime().getTime());
    }

    public static synchronized agzs b() {
        agzs agzs;
        synchronized (nol.class) {
            if (a == null) {
                a = new agzs(Arrays.asList(new ahcn[]{new aham()}), Arrays.asList(new ahcs[]{new ahcw()}), Collections.emptyList());
            }
            agzs = a;
        }
        return agzs;
    }

    public static nqf a(int i, byte[] bArr) {
        aucd o = nqf.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nqf nqf = (nqf) o.b;
        int i2 = i - 1;
        if (i != 0) {
            nqf.b = i2;
            nqf.a |= 1;
            if (bArr != null) {
                auay a2 = auay.a(bArr);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nqf nqf2 = (nqf) o.b;
                a2.getClass();
                nqf2.a |= 2;
                nqf2.c = a2;
            }
            return (nqf) o.i();
        }
        throw null;
    }

    public static void a(Context context, nqf nqf) {
        Intent startIntent;
        if (context != null && nqf != null && (startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.gass.GassIntentOperation", "com.google.android.gms.gass.ACTION_EXECUTE_TASK")) != null) {
            startIntent.putExtra("IntentParameter", nqf.k());
            context.startService(startIntent);
        }
    }
}
