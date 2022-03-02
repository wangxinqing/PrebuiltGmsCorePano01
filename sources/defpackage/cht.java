package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: cht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cht extends jxh implements niz {
    private final bwg a = cbi.n();
    private ContextManagerClientInfo b;

    public cht(ContextManagerClientInfo contextManagerClientInfo) {
        this.b = contextManagerClientInfo;
    }

    private final int a(String str, String str2, String str3, int i) {
        if (this.b == null) {
            hya.a(cbi.f()).a(str);
            this.b = new ContextManagerClientInfo(str2, str, Binder.getCallingUid(), str3, 0, 1, Binder.getCallingPid());
        }
        if (TextUtils.isEmpty(str2)) {
            return 7504;
        }
        if (TextUtils.isEmpty(str3)) {
            return 7500;
        }
        if (!TextUtils.equals(str2, this.b.a)) {
            return 7510;
        }
        if (!TextUtils.equals(str3, this.b.d)) {
            return 7511;
        }
        if (i == 0 && this.b.e()) {
            return 7512;
        }
        return Binder.getCallingUid() != this.b.c ? 7513 : 0;
    }

    private static boolean a(int i) {
        return i == 0;
    }

    public final void b(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        int a2 = a(str, str2, str3, 0);
        if (!a(a2)) {
            bwf.a(jxf, a2, (DataHolder) null);
        } else if (contextDataFilterImpl != null) {
            bwg bwg = this.a;
            ContextManagerClientInfo contextManagerClientInfo = this.b;
            new Object[1][0] = contextManagerClientInfo;
            bwg.a(new bwz(jxf, contextManagerClientInfo, contextDataFilterImpl), bvq.a("Read", bwg.a, contextManagerClientInfo.b));
        } else {
            bwf.a(jxf, 0, (DataHolder) null);
        }
    }

    public final void a(jxf jxf, String str, String str2, String str3, SnapshotRequest snapshotRequest) {
        int a2 = a(str, str2, str3, 1);
        if (!a(a2)) {
            bwf.a(jxf, a2, (Snapshot) null);
            return;
        }
        bwg bwg = this.a;
        ContextManagerClientInfo contextManagerClientInfo = this.b;
        new Object[1][0] = contextManagerClientInfo;
        bwg.a(new cif(jxf, contextManagerClientInfo, snapshotRequest), bvq.a("GetSnapshot", bwg.a, contextManagerClientInfo.b));
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextFenceStub contextFenceStub) {
        int a2 = a(str, str2, str3, 0);
        if (!a(a2)) {
            bwf.a(jxf, a2, (FenceStateImpl) null);
            return;
        }
        bwg bwg = this.a;
        ContextManagerClientInfo contextManagerClientInfo = this.b;
        new Object[1][0] = contextFenceStub;
        bwg.a(new bwu(jxf, contextManagerClientInfo, contextFenceStub), bvq.a("evaluateFence", bwg.a, contextManagerClientInfo.b));
    }

    public final void a(jxf jxf, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl) {
        int a2 = a(str, str2, str3, 1);
        if (!a(a2)) {
            bwf.a(jxf, a2, (FenceStateMapImpl) null);
            return;
        }
        bwg bwg = this.a;
        ContextManagerClientInfo contextManagerClientInfo = this.b;
        new Object[1][0] = fenceQueryRequestImpl;
        bwg.a(new bwy(jxf, contextManagerClientInfo, fenceQueryRequestImpl), bvq.a("queryFences", bwg.a, contextManagerClientInfo.b));
    }

    public final void a(jxf jxf, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        int a2 = a(str, str2, str3, 1);
        if (!a(a2)) {
            bwf.a(jxf, a2);
        } else {
            this.a.a(jxf, this.b, fenceUpdateRequestImpl);
        }
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        int a2 = a(str, str2, str3, 0);
        if (!a(a2)) {
            bwf.b(jxf, a2, (DataHolder) null);
            return;
        }
        bwg bwg = this.a;
        ContextManagerClientInfo contextManagerClientInfo = this.b;
        new Object[1][0] = contextManagerClientInfo;
        bwg.a(new bwx(jxf, contextManagerClientInfo, contextDataFilterImpl), bvq.a("GetCurrentContext", bwg.a, contextManagerClientInfo.b));
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, jxc jxc) {
        a(jxf, str, str2, str3, contextDataFilterImpl, jxc, (PendingIntent) null);
    }

    public final void a(jxf jxf, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, jxc jxc, PendingIntent pendingIntent) {
        int a2 = a(str, str2, str3, 0);
        if (!a(a2)) {
            bwf.a(jxf, a2);
        } else if (contextDataFilterImpl != null) {
            bwg bwg = this.a;
            ContextManagerClientInfo contextManagerClientInfo = this.b;
            new Object[1][0] = contextManagerClientInfo;
            bwg.a(new bxd(jxf, contextManagerClientInfo, new bvu(contextManagerClientInfo, jxc, pendingIntent, contextDataFilterImpl)), bvq.a("RegisterContextListener", bwg.a, contextManagerClientInfo.b));
        } else {
            bwf.a(jxf, 0);
        }
    }

    public final void a(jxf jxf, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl) {
        int a2 = a(str, str2, str3, 0);
        if (!a(a2)) {
            bwf.a(jxf, a2);
        } else if (interestUpdateBatchImpl != null) {
            bwg bwg = this.a;
            ContextManagerClientInfo contextManagerClientInfo = this.b;
            new Object[1][0] = contextManagerClientInfo;
            bwg.a(new bxi(jxf, contextManagerClientInfo, interestUpdateBatchImpl), bvq.a("UpdateInterests", bwg.a, contextManagerClientInfo.b));
        } else {
            bwf.a(jxf, 0);
        }
    }

    public final void a(jxf jxf, String str, String str2, String str3, WriteBatchImpl writeBatchImpl) {
        int a2 = a(str, str2, str3, 0);
        if (!a(a2)) {
            bwf.a(jxf, a2, (WriteBatchImpl) null);
        } else if (writeBatchImpl != null) {
            bwg bwg = this.a;
            ContextManagerClientInfo contextManagerClientInfo = this.b;
            new Object[1][0] = contextManagerClientInfo;
            bwg.a(new bxj(jxf, contextManagerClientInfo, writeBatchImpl), bvq.a("WriteBatch", bwg.a, contextManagerClientInfo.b));
        } else {
            bwf.a(jxf, 0, (WriteBatchImpl) null);
        }
    }

    public final void a(jxf jxf, String str, String str2, String str3, jxc jxc) {
        a(jxf, str, str2, str3, jxc, (PendingIntent) null);
    }

    public final void a(jxf jxf, String str, String str2, String str3, jxc jxc, PendingIntent pendingIntent) {
        int a2 = a(str, str2, str3, 0);
        if (!a(a2)) {
            bwf.a(jxf, a2);
            return;
        }
        bwg bwg = this.a;
        ContextManagerClientInfo contextManagerClientInfo = this.b;
        new Object[1][0] = contextManagerClientInfo;
        bwg.a(new bxe(jxf, contextManagerClientInfo, new bvu(contextManagerClientInfo, jxc, pendingIntent, (ContextDataFilterImpl) null)), bvq.a("UnregisterContextListener", bwg.a, contextManagerClientInfo.b));
    }
}
