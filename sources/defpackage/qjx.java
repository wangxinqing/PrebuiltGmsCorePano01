package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.instantapps.routing.DomainFilterUpdateChimeraService;
import java.util.List;

/* renamed from: qjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjx implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ DomainFilterUpdateChimeraService b;

    public qjx(DomainFilterUpdateChimeraService domainFilterUpdateChimeraService, Intent intent) {
        this.b = domainFilterUpdateChimeraService;
        this.a = intent;
    }

    public final void run() {
        this.b.a(new qxz(DomainFilterUpdateChimeraService.a(this.a.getIntExtra("domain_filter_request_type", 0)), (Bundle) null, (List) null));
        this.b.stopSelf();
    }
}
