package defpackage;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* renamed from: vlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vlg implements Callable {
    private final vmt a;
    private final SetAccountParams b;

    public vlg(vmt vmt, SetAccountParams setAccountParams) {
        this.a = vmt;
        this.b = setAccountParams;
    }

    public final Object call() {
        vmt vmt = this.a;
        SetAccountParams setAccountParams = this.b;
        NearbySharingChimeraService nearbySharingChimeraService = vmt.c;
        Account account = setAccountParams.a;
        Charset charset = NearbySharingChimeraService.a;
        return Integer.valueOf(nearbySharingChimeraService.a(account));
    }
}
