package defpackage;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: alfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfx {
    public static final long a = TimeUnit.SECONDS.toMillis(150);

    public static alfw a(Context context, String str, iby iby, long j) {
        int i;
        if (!a(context, str)) {
            return new alfw((Location) null, 13);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference((Object) null);
        try {
            iby.f().a((acvp) new alfv(new alfu(atomicReference, countDownLatch), iby, j));
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                Location location = (Location) atomicReference.get();
                if (location != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                return new alfw(location, i);
            }
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Timed out waiting for a location for getCurrentPlace");
            }
            return new alfw((Location) null, 15);
        } catch (InterruptedException e) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Interrupted while waiting for a location for getCurrentPlace.");
            }
            return new alfw((Location) null, 14);
        }
    }

    public static boolean a(Context context, String str) {
        return jhr.a(context).c("android:fine_location", jhg.i(context, str), str) == 0;
    }
}
