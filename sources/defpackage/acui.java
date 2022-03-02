package defpackage;

import com.google.android.gms.subscribedfeeds.FeedsGcmReceiverChimeraService;
import java.util.concurrent.Callable;

/* renamed from: acui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acui implements Callable {
    private final FeedsGcmReceiverChimeraService a;
    private final String b;

    public acui(FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService, String str) {
        this.a = feedsGcmReceiverChimeraService;
        this.b = str;
    }

    public final Object call() {
        FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService = this.a;
        ((ahgz) feedsGcmReceiverChimeraService.a.b.a()).b(this.b);
        return null;
    }
}
