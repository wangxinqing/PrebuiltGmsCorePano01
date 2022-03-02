package defpackage;

import android.content.Context;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;

/* renamed from: mep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mep extends iby {
    private static final ibq a = new ibq("FacsInternalSync.API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new mem();

    public mep(Context context, mei mei) {
        super(context, a, (ibm) mei, ibx.a);
    }

    public final acwa a(FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        iha b2 = ihb.b();
        b2.a = new mel(facsInternalSyncCallOptions);
        return a(b2.a());
    }
}
