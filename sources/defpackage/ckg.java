package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.contextmanager.service.ReportServerFenceStateIntentOperation;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: ckg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckg extends cbm implements bve {
    private final jwz a = jwz.a((idg) new ckf(), (jwt) null);
    private final bsz b;

    public ckg(bsz bsz) {
        super("ReadServerFenceUpdatesOperation", "receive server fence updates", new Object[0]);
        iva.a((Object) bsz);
        this.b = bsz;
    }

    private static void a(Map map, bsz bsz, UpdateFenceOperation updateFenceOperation) {
        ArrayList arrayList = (ArrayList) map.get(bsz);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(bsz, arrayList);
        }
        arrayList.add(updateFenceOperation);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ckg) {
            return this.b.equals(((ckg) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final Future a() {
        iva.a(!isDone());
        cbi.w().b(this.b, cbi.E().f(), this, cbi.k(), bvq.a("ReadServerFenceUpdatesOperation"));
        return this;
    }

    public final void a(atqn atqn) {
        HashMap hashMap = new HashMap();
        aucx aucx = atqn.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            atrj atrj = (atrj) aucx.get(i);
            if (atrj.b.isEmpty()) {
                ((anih) ((anih) bxk.a.b()).a("ckg", "a", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ReadServerFenceUpdatesOperation] Received FenceUpdateOperation with no account specified!");
            } else {
                int a2 = atri.a(atrj.c);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i2 = a2 - 1;
                if (i2 == 1) {
                    Object[] objArr = new Object[2];
                    atre atre = atrj.a;
                    if (atre == null) {
                        atre = atre.d;
                    }
                    objArr[0] = atre;
                    atjt atjt = atrj.d;
                    if (atjt == null) {
                        atjt = atjt.z;
                    }
                    objArr[1] = atjt;
                    bsz bsz = new bsz(atrj.b);
                    bsz bsz2 = new bsz(atrj.b);
                    atre atre2 = atrj.a;
                    if (atre2 == null) {
                        atre2 = atre.d;
                    }
                    String str = atre2.b;
                    atre atre3 = atrj.a;
                    if (atre3 == null) {
                        atre3 = atre.d;
                    }
                    long j = atre3.c;
                    atjt atjt2 = atrj.d;
                    if (atjt2 == null) {
                        atjt2 = atjt.z;
                    }
                    ContextFenceStub contextFenceStub = new ContextFenceStub(atjt2);
                    byd E = cbi.E();
                    ContextManagerClientInfo a3 = cbi.a(bsz, "SERVER_FENCE_MODULE_ID");
                    Intent startIntent = IntentOperation.getStartIntent(cbi.f(), ReportServerFenceStateIntentOperation.class, "com.google.android.contextmanager.REPORT_SERVER_FENCE_STATE");
                    startIntent.putExtra("client_info_package_name", a3.b);
                    startIntent.putExtra("client_info_account_name", a3.a);
                    startIntent.putExtra("client_info_module_id", a3.d);
                    a(hashMap, bsz2, UpdateFenceOperation.a(str, j, contextFenceStub, PendingIntent.getService(E.a, bsz.hashCode(), startIntent, 134217728)));
                } else if (i2 != 2) {
                    new Object[1][0] = atrj;
                } else {
                    Object[] objArr2 = new Object[1];
                    atre atre4 = atrj.a;
                    if (atre4 == null) {
                        atre4 = atre.d;
                    }
                    objArr2[0] = atre4;
                    bsz bsz3 = new bsz(atrj.b);
                    atre atre5 = atrj.a;
                    if (atre5 == null) {
                        atre5 = atre.d;
                    }
                    a(hashMap, bsz3, UpdateFenceOperation.a(atre5.b));
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            cbi.n().a(this.a, byd.a((bsz) entry.getKey()), new FenceUpdateRequestImpl(new ArrayList((Collection) entry.getValue())));
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        HashMap hashMap = new HashMap();
        aucx aucx = ((atqn) obj).b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            atrj atrj = (atrj) aucx.get(i);
            if (atrj.b.isEmpty()) {
                ((anih) ((anih) bxk.a.b()).a("ckg", "a", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ReadServerFenceUpdatesOperation] Received FenceUpdateOperation with no account specified!");
            } else {
                int a2 = atri.a(atrj.c);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i2 = a2 - 1;
                if (i2 == 1) {
                    Object[] objArr = new Object[2];
                    atre atre = atrj.a;
                    if (atre == null) {
                        atre = atre.d;
                    }
                    objArr[0] = atre;
                    atjt atjt = atrj.d;
                    if (atjt == null) {
                        atjt = atjt.z;
                    }
                    objArr[1] = atjt;
                    bsz bsz = new bsz(atrj.b);
                    bsz bsz2 = new bsz(atrj.b);
                    atre atre2 = atrj.a;
                    if (atre2 == null) {
                        atre2 = atre.d;
                    }
                    String str = atre2.b;
                    atre atre3 = atrj.a;
                    if (atre3 == null) {
                        atre3 = atre.d;
                    }
                    long j = atre3.c;
                    atjt atjt2 = atrj.d;
                    if (atjt2 == null) {
                        atjt2 = atjt.z;
                    }
                    ContextFenceStub contextFenceStub = new ContextFenceStub(atjt2);
                    byd E = cbi.E();
                    ContextManagerClientInfo a3 = cbi.a(bsz, "SERVER_FENCE_MODULE_ID");
                    Intent startIntent = IntentOperation.getStartIntent(cbi.f(), ReportServerFenceStateIntentOperation.class, "com.google.android.contextmanager.REPORT_SERVER_FENCE_STATE");
                    startIntent.putExtra("client_info_package_name", a3.b);
                    startIntent.putExtra("client_info_account_name", a3.a);
                    startIntent.putExtra("client_info_module_id", a3.d);
                    a(hashMap, bsz2, UpdateFenceOperation.a(str, j, contextFenceStub, PendingIntent.getService(E.a, bsz.hashCode(), startIntent, 134217728)));
                } else if (i2 != 2) {
                    new Object[1][0] = atrj;
                } else {
                    Object[] objArr2 = new Object[1];
                    atre atre4 = atrj.a;
                    if (atre4 == null) {
                        atre4 = atre.d;
                    }
                    objArr2[0] = atre4;
                    bsz bsz3 = new bsz(atrj.b);
                    atre atre5 = atrj.a;
                    if (atre5 == null) {
                        atre5 = atre.d;
                    }
                    a(hashMap, bsz3, UpdateFenceOperation.a(atre5.b));
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            cbi.n().a(this.a, byd.a((bsz) entry.getKey()), new FenceUpdateRequestImpl(new ArrayList((Collection) entry.getValue())));
        }
    }
}
