package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.GetMetadataRequest;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgc extends key {
    private static final ith f = new ith("GetMetadataOperation", "");
    private final GetMetadataRequest g;

    public kgc(kec kec, GetMetadataRequest getMetadataRequest, kwg kwg) {
        super("GetMetadataOperation", kec, kwg, 10);
        this.g = getMetadataRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.g, "Invalid get metadata request: no request");
        njc.a((Object) this.g.a, "Invalid get metadata request: no id");
        kec kec = this.a;
        GetMetadataRequest getMetadataRequest = this.g;
        MetadataBundle a = kec.a(getMetadataRequest.a, getMetadataRequest.b);
        this.c.a((jzr) new kuj(a));
        try {
            this.b.a(new OnMetadataResponse(a));
        } catch (RemoteException e) {
            jhg.a(e);
            f.b("GetMetadataOperation", "Cannot pass complete response over binder!");
            a(Status.c);
        }
    }
}
