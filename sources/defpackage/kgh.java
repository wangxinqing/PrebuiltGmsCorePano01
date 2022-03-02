package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.internal.ListParentsRequest;
import com.google.android.gms.drive.internal.OnListParentsResponse;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgh extends key {
    private static final ith f = new ith("ListParentsOperation", "");
    private final ListParentsRequest g;

    public kgh(kec kec, ListParentsRequest listParentsRequest, kwg kwg) {
        super("ListParentsOperation", kec, kwg, 12);
        this.g = listParentsRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.g, "Invalid getParents request: request must be provided");
        njc.a((Object) this.g.a, "Invalid getParents request: DriveId must be provided");
        kec kec = this.a;
        DriveId driveId = this.g.a;
        lfq lfq = this.c;
        kmp b = kec.b(driveId);
        lfq.a(b);
        kkf kkf = kec.e;
        kjr kjr = (kjr) kkf;
        lrw a = kjr.a(kec.d, DriveSpace.d, lrr.a(b.h()), (String) null, anfv.a, false, kec.l(), false);
        lbm.a(a.a, kec.k);
        OnListParentsResponse onListParentsResponse = new OnListParentsResponse(a.a);
        try {
            this.b.a(onListParentsResponse);
            if (!onListParentsResponse.a) {
                return;
            }
        } catch (RemoteException e) {
            jhg.a(e);
            f.b("ListParentsOperation", "Cannot pass complete response over binder!");
            a(Status.c);
        } catch (Throwable th) {
            a.a();
            throw th;
        }
        a.a();
    }
}
