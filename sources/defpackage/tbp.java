package defpackage;

import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.RenameRequest;
import java.util.concurrent.Callable;

/* renamed from: tbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tbp implements Callable {
    private final tbt a;
    private final Uri b;
    private final Uri c;

    public tbp(tbt tbt, Uri uri, Uri uri2) {
        this.a = tbt;
        this.b = uri;
        this.c = uri2;
    }

    public final Object call() {
        tbt tbt = this.a;
        Uri uri = this.b;
        Uri uri2 = this.c;
        iby iby = tbt.a;
        RenameRequest renameRequest = new RenameRequest(uri, uri2);
        iha b2 = ihb.b();
        b2.a(new tch(renameRequest));
        b2.b = new Feature[]{oqd.g};
        return (Void) acws.a(iby.a(b2.a()));
    }
}
