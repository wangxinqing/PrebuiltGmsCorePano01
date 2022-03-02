package defpackage;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlh implements Callable {
    private final vmt a;
    private final UnmarkContactAsSelectedParams b;

    public vlh(vmt vmt, UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        this.a = vmt;
        this.b = unmarkContactAsSelectedParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        UnmarkContactAsSelectedParams unmarkContactAsSelectedParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        Contact contact = unmarkContactAsSelectedParams.a;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.b.b(contact));
    }
}
