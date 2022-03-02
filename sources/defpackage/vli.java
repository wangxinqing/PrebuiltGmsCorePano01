package defpackage;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vli implements Callable {
    private final vmt a;
    private final MarkContactAsSelectedParams b;

    public vli(vmt vmt, MarkContactAsSelectedParams markContactAsSelectedParams) {
        this.a = vmt;
        this.b = markContactAsSelectedParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        MarkContactAsSelectedParams markContactAsSelectedParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        Contact contact = markContactAsSelectedParams.a;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.b.a(contact));
    }
}
