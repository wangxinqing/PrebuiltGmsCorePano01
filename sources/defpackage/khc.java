package defpackage;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: khc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khc extends kez {
    private final RealtimeDocumentSyncRequest f;
    private final lkm g;
    private final lku h;

    public khc(kec kec, RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, kwg kwg) {
        super("SyncRealtimeDocumentsOperation", kec, kwg);
        this.f = realtimeDocumentSyncRequest;
        lsm lsm = kec.c;
        this.g = lni.a(lsm.b, lsm).a;
        this.h = lsm.w;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL);
    }

    /* JADX INFO: finally extract failed */
    public final void d(Context context) {
        khq b = b();
        lkm lkm = this.g;
        List list = this.f.a;
        ArrayList<DriveId> arrayList = new ArrayList<>(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(DriveId.a((String) list.get(i)));
        }
        lkm.a.b();
        try {
            for (DriveId ljt : arrayList) {
                kpf b2 = lkm.b(new ljt(ljt, b));
                b2.f = true;
                b2.t();
            }
            lkm.a.f();
            lkm.a.d();
            lkm lkm2 = this.g;
            List list2 = this.f.b;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(new ljt(DriveId.a((String) list2.get(i2)), b));
            }
            lkm2.a((List) arrayList2);
            this.h.a();
            this.b.b();
        } catch (Throwable th) {
            lkm.a.d();
            throw th;
        }
    }
}
