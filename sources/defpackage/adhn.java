package defpackage;

import android.app.PendingIntent;
import java.util.concurrent.ExecutionException;

/* renamed from: adhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhn {
    public static Object a(aorr aorr) {
        try {
            return aorr.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new nja(14, "Operation thread interrupted!", (PendingIntent) null, e);
        } catch (ExecutionException e2) {
            throw new nja(13, "Operation failed with an execution exception!", (PendingIntent) null, e2);
        }
    }
}
