package defpackage;

import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: bxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bxg extends bva {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Set b;
    final /* synthetic */ bxh c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bxg(bxh bxh, String str, Object[] objArr, ArrayList arrayList, Set set) {
        super(str, objArr);
        this.c = bxh;
        this.a = arrayList;
        this.b = set;
    }

    public final void a(Exception exc) {
        this.c.a(7508);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ick ick = (ick) obj;
        if (!ick.e().isEmpty()) {
            byt byt = new byt(ick);
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
                atjt a2 = new bzk(updateFenceOperation.b.b.c()).a(byt);
                if (a2 != null) {
                    updateFenceOperation.b.b = new ContextFenceStub(a2);
                    i++;
                } else {
                    this.c.a(7509);
                    return;
                }
            }
            this.b.remove(6);
            this.c.a(this.b);
            return;
        }
        this.c.a(7508);
    }
}
