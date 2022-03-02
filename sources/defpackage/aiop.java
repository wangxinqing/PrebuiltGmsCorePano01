package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aiop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiop {
    public final Context a;
    public final AtomicInteger b = new AtomicInteger(((int) SystemClock.elapsedRealtime()) / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
    public final ExecutorService c = jfm.b(9);

    public aiop(Context context) {
        this.a = context;
    }
}
