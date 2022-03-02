package defpackage;

import android.net.Uri;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import java.util.concurrent.Callable;

/* renamed from: tbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tbq implements Callable {
    private final tbt a;
    private final Uri b;
    private final int c;

    public tbq(tbt tbt, Uri uri, int i) {
        this.a = tbt;
        this.b = uri;
        this.c = i;
    }

    public final Object call() {
        tbt tbt = this.a;
        Uri uri = this.b;
        int i = this.c;
        iby iby = tbt.a;
        OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri, i);
        iha b2 = ihb.b();
        b2.a(new tcf(openFileDescriptorRequest));
        b2.b = i == 1 ? new Feature[]{oqd.f} : null;
        return ((OpenFileDescriptorResponse) acws.a(iby.a(b2.a()))).a;
    }
}
