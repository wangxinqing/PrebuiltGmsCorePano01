package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahdh implements aoqa {
    private final ahdo a;
    private final aorr b;
    private final aorr c;

    public ahdh(ahdo ahdo, aorr aorr, aorr aorr2) {
        this.a = ahdo;
        this.b = aorr;
        this.c = aorr2;
    }

    public final aorr a() {
        ahdo ahdo = this.a;
        aorr aorr = this.b;
        aorr aorr2 = this.c;
        Uri uri = (Uri) aorl.a((Future) aorr);
        Set<String> set = (Set) aorl.a((Future) aorr2);
        ahdn ahdn = new ahdn(set);
        for (String str : set) {
            Intent intent = new Intent();
            intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
            intent.setData(uri);
            intent.setPackage(str);
            intent.setFlags(268435456);
            ahdo.b.sendOrderedBroadcast(intent, (String) null, ahdn, ahdo.d, -1, (String) null, (Bundle) null);
        }
        amsn b2 = amsn.b(ampt.a);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Integer num = (Integer) ahdo.e.a();
        Class<TimeoutException> cls = TimeoutException.class;
        aorr a2 = aooz.a((aorr) (aoqw) aorl.a(aoqw.c(ahdn.a), (long) num.intValue(), ahdo.f, ahdo.g), (Class) cls, (amqy) new ahdj(atomicBoolean), (Executor) aoqm.a);
        aorl.a(a2, new ahdk(ahdo, atomicBoolean, set, b2, ahdn, num), aoqm.a);
        return a2;
    }
}
