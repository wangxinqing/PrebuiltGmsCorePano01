package defpackage;

import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import java.util.ArrayList;

/* renamed from: aboi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aboi implements acvv {
    private final CleanSharedSecretChimeraService a;

    public aboi(CleanSharedSecretChimeraService cleanSharedSecretChimeraService) {
        this.a = cleanSharedSecretChimeraService;
    }

    public final void a(Object obj) {
        CleanSharedSecretChimeraService cleanSharedSecretChimeraService = this.a;
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList != null && !arrayList.isEmpty()) {
            CleanSharedSecretChimeraService.c(cleanSharedSecretChimeraService);
        }
    }
}
