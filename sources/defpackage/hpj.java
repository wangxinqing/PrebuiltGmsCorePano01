package defpackage;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* renamed from: hpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hpj implements ikd {
    static final ikd a = new hpj();

    private hpj() {
    }

    public final boolean a(Object obj, Object obj2) {
        CountDownLatch countDownLatch = hpk.a;
        return amqx.a(Boolean.valueOf(((Intent) obj).getBooleanExtra("bootCountUpdated", false)), Boolean.valueOf(((Intent) obj2).getBooleanExtra("bootCountUpdated", false)));
    }
}
