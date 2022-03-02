package defpackage;

import android.app.PendingIntent;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mth implements amqy {
    private final mtk a;
    private final AtomicInteger b;
    private final String c;
    private final avbh d;
    private final String e;
    private final DeviceDetailsLinks f;

    public mth(mtk mtk, AtomicInteger atomicInteger, String str, avbh avbh, String str2, DeviceDetailsLinks deviceDetailsLinks) {
        this.a = mtk;
        this.b = atomicInteger;
        this.c = str;
        this.d = avbh;
        this.e = str2;
        this.f = deviceDetailsLinks;
    }

    public final Object a(Object obj) {
        mtk mtk = this.a;
        AtomicInteger atomicInteger = this.b;
        String str = this.c;
        avbh avbh = this.d;
        String str2 = this.e;
        DeviceDetailsLinks deviceDetailsLinks = this.f;
        int andIncrement = atomicInteger.getAndIncrement();
        asom asom = asom.FAST_PAIR_DEVICE_COMPANION_OOBE_CLICKED;
        byte[] a2 = deviceDetailsLinks.a();
        return mtk.a(andIncrement, asom, str, avbh, str2, a2, (PendingIntent) obj);
    }
}
