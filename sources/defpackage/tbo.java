package defpackage;

import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.DeleteFileRequest;
import java.util.concurrent.Callable;

/* renamed from: tbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tbo implements Callable {
    private final tbt a;
    private final Uri b;

    public tbo(tbt tbt, Uri uri) {
        this.a = tbt;
        this.b = uri;
    }

    public final Object call() {
        tbt tbt = this.a;
        Uri uri = this.b;
        iby iby = tbt.a;
        DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri);
        iha b2 = ihb.b();
        b2.a(new tcd(deleteFileRequest));
        b2.b = new Feature[]{oqd.f};
        return (Void) acws.a(iby.a(b2.a()));
    }
}
