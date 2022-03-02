package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.chimera.container.DexOptIntentOperation;
import com.google.android.gms.chimera.container.FileApkIntentOperation;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: her  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class her implements Runnable {
    private final Intent a;
    private final Context b;
    private final bpq c;
    private final ExecutorService d;

    public her(Intent intent, Context context, bpq bpq, ExecutorService executorService) {
        this.a = intent;
        this.b = context;
        this.c = bpq;
        this.d = executorService;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        Intent intent = this.a;
        Context context = this.b;
        bpq bpq = this.c;
        ExecutorService executorService = this.d;
        boolean z4 = false;
        boolean booleanExtra = intent.getBooleanExtra("DEXOPT_ALL_MODULES", false);
        boolean booleanExtra2 = intent.getBooleanExtra("ON_BOOT_OR_UPGRADE", false);
        blu a2 = blu.a(context);
        boolean booleanValue = ((Boolean) heg.a.c()).booleanValue();
        bkn.b();
        boolean h = hei.h();
        if (FileApkIntentOperation.a(intent)) {
            z3 = true;
            z2 = false;
            z = false;
        } else if (booleanExtra2) {
            z3 = !booleanValue;
            z2 = true;
            z = true;
        } else {
            z3 = false;
            z2 = true;
            z = false;
        }
        boolean z5 = booleanExtra;
        while (true) {
            if (!z3) {
                if (!z2) {
                    break;
                }
                hey.a();
                z5 = a2.a(hey.d(context), bpq, z) | z5;
                z2 = false;
            } else {
                z5 |= a2.a(bpq);
            }
            if (h) {
                a2.a(z3);
            }
            hey.a(false);
            z3 = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        executorService.execute(new hes(countDownLatch));
        do {
            try {
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } while (!countDownLatch.await(60, TimeUnit.SECONDS));
        if (h) {
            return;
        }
        if (z5 || booleanValue) {
            if (booleanExtra && Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 28 && awxs.f()) {
                z4 = true;
            }
            DexOptIntentOperation.a(context, z4);
        }
    }
}
