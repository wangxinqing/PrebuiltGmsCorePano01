package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: snq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snq {
    public static void a(Context context, String str, String str2) {
        AsyncTask.SERIAL_EXECUTOR.execute(new snp(context, str, str2));
    }

    public static void b(Context context, String str, String str2) {
        acwa a = adyr.c(context).a(str, str2, (byte[]) null);
        try {
            acws.a(a, 10000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException | TimeoutException e) {
            snn.a(e, str2.length() == 0 ? new String("Unable to send message ") : "Unable to send message ".concat(str2), new Object[0]);
        } catch (InterruptedException e2) {
            return;
        }
        if (!a.b()) {
            snn.a(a.e(), str2.length() == 0 ? new String("Unable to send message ") : "Unable to send message ".concat(str2), new Object[0]);
        }
    }
}
