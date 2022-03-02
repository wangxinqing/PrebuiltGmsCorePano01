package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import com.google.android.gms.R;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: aany  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aany {
    public final int a;
    private final Context b;

    public aany(Context context) {
        this.b = context;
        this.a = aann.b(context, "com.android.vending") ? aann.a(context) : -1;
    }

    public static String a(Context context, long j) {
        aanr a2 = aans.a(context, System.currentTimeMillis(), j);
        if (a2 == null) {
            return null;
        }
        int i = a2.a;
        if (i == 1) {
            return context.getString(R.string.verify_apps_last_scanned, new Object[]{a2.b});
        } else if (i == 2) {
            return context.getString(R.string.verify_apps_last_scanned_yesterday, new Object[]{a2.b});
        } else if (i != 3) {
            return context.getString(R.string.verify_apps_last_scanned_date, new Object[]{a2.b});
        } else {
            Resources resources = context.getResources();
            int i2 = a2.c;
            return resources.getQuantityString(R.plurals.verify_apps_last_scanned_days_ago, i2, new Object[]{Integer.valueOf(i2)});
        }
    }

    public final aanv a(boolean z, long j, TimeUnit timeUnit) {
        int i = this.a;
        aanv aanv = null;
        if (i >= 80770500) {
            Intent intent = new Intent("com.google.android.vending.verifier.ACTION_PACKAGE_VERIFICATION_API").setPackage("com.android.vending");
            aanx aanx = new aanx(this.b, this.a, z);
            jca.a().a(this.b, intent, aanx.f, 1);
            try {
                if (!aanx.a.await(j, timeUnit)) {
                    try {
                        jca.a().a(aanx.b, (ServiceConnection) aanx.f);
                    } catch (RuntimeException e) {
                    }
                    return aanv;
                }
                aanv = aanx.e;
                jca.a().a(aanx.b, (ServiceConnection) aanx.f);
                return aanv;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                jca.a().a(aanx.b, (ServiceConnection) aanx.f);
            } catch (Throwable th) {
                try {
                    jca.a().a(aanx.b, (ServiceConnection) aanx.f);
                } catch (RuntimeException e3) {
                }
                throw th;
            }
        } else if (i < 80700200) {
            return null;
        } else {
            try {
                aanv[] aanvArr = {null};
                CountDownLatch countDownLatch = new CountDownLatch(1);
                aand.a(this.b, new aand(this.b, new aant(aanvArr, countDownLatch)).a.c);
                if (countDownLatch.await(j, timeUnit)) {
                    return aanvArr[0];
                }
                return null;
            } catch (Exception e4) {
                return null;
            }
        }
    }
}
