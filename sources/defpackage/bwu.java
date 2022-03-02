package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: bwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwu extends bwp {
    public String c;
    public Runnable d;
    private final jxf e;
    private final ContextManagerClientInfo f;
    private final ContextFenceStub g;
    private final jvm h = new bwr(this);
    private boolean i;

    public bwu(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, ContextFenceStub contextFenceStub) {
        super("EvaluateFenceOperation");
        this.e = jxf;
        this.f = contextManagerClientInfo;
        this.g = contextFenceStub;
        this.i = false;
        this.c = null;
        this.d = null;
    }

    private final jwz b() {
        return jwz.a((idg) new bwt(this), (jwt) null);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.f.b()) {
            a(7504, (FenceStateImpl) null);
            return;
        }
        String uuid = UUID.randomUUID().toString();
        this.c = uuid;
        ContextFenceStub contextFenceStub = this.g;
        cbi.n().a(b(), this.f, new FenceUpdateRequestImpl(new ArrayList(Arrays.asList(new UpdateFenceOperation[]{new UpdateFenceOperation(ContextFenceRegistrationStub.a(uuid, 0, contextFenceStub), this.h), new UpdateFenceOperation(6, (ContextFenceRegistrationStub) null, (grc) null, (PendingIntent) null, this.c, 0, awuz.p())}))));
    }

    public final void a(int i2, FenceStateImpl fenceStateImpl) {
        atnn atnn;
        int i3 = i2;
        if (!this.i) {
            this.i = true;
            bwf.a(this.e, i3, fenceStateImpl);
            btx G = cbi.G();
            ContextManagerClientInfo contextManagerClientInfo = this.f;
            ContextFenceStub contextFenceStub = this.g;
            aucd a = btx.a(contextManagerClientInfo, 10, i3);
            if (btx.a(contextFenceStub) != null) {
                aucd o = atnn.c.o();
                atnm a2 = btx.a(contextFenceStub);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atnn atnn2 = (atnn) o.b;
                a2.getClass();
                atnn2.b = a2;
                atnn2.a = 1 | atnn2.a;
                atnn = (atnn) o.i();
            } else {
                atnn = atnn.c;
            }
            if (a.c) {
                a.c();
                a.c = false;
            }
            atnj atnj = (atnj) a.b;
            atnj atnj2 = atnj.o;
            atnn.getClass();
            atnj.m = atnn;
            atnj.a |= 2048;
            G.a((atnj) a.i());
            bwg n = cbi.n();
            jwz b = b();
            ContextManagerClientInfo contextManagerClientInfo2 = this.f;
            grd grd = new grd();
            grd.a(this.c);
            String str = this.c;
            iva.c(str);
            ArrayList arrayList = grd.a;
            UpdateFenceOperation updateFenceOperation = r6;
            UpdateFenceOperation updateFenceOperation2 = new UpdateFenceOperation(7, (ContextFenceRegistrationStub) null, (grc) null, (PendingIntent) null, str, -1, -1);
            arrayList.add(updateFenceOperation);
            n.a(b, contextManagerClientInfo2, grd.a());
            if (this.d != null) {
                cbi.k().a(this.d);
            }
        }
    }
}
