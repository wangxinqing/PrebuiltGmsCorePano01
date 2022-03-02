package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.settings.LocationOffWarningIntentOperation;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: rne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rne extends rhb implements rng {
    private Context a;
    private rns b;

    public final void a() {
        rns rns = this.b;
        if (rns != null) {
            rns.a((rng) this);
        }
    }

    public final void a(int i, int i2) {
        boolean z;
        if (i != 0 && i2 == 0) {
            Context context = this.a;
            Intent startIntent = IntentOperation.getStartIntent(context, LocationOffWarningIntentOperation.class, "com.google.android.gms.location.settings.SHOW_LOWD");
            if (startIntent != null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            startIntent.putExtra("EXTRA_OLD_LOCATION_MODE", i);
            context.startService(startIntent);
        }
    }

    public final void a(Context context) {
        this.a = context;
        if (aydl.b()) {
            rns f = rns.f(context);
            this.b = f;
            f.a((rng) this, Looper.getMainLooper());
        }
    }

    public final void a(PrintWriter printWriter) {
        long b2 = rlt.b(this.a);
        printWriter.print("last displayed: ");
        if (b2 > 0) {
            printWriter.println(ajqm.a(b2));
        } else {
            printWriter.println("never");
        }
        printWriter.print("backoff duration: ");
        printWriter.print(TimeUnit.MILLISECONDS.toSeconds(rlt.c(this.a)));
        printWriter.println("s");
    }
}
