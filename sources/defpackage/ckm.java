package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: ckm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ckm extends cbm {
    private final bsz a;
    private final ArrayList b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ckm(bsz bsz, SparseArray sparseArray) {
        super("SyncServerInterestRecordsOperation", "WriteInterestRecord", new Object[0]);
        this.a = bsz;
        this.b = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            cay cay = (cay) sparseArray.valueAt(i);
            this.b.add(new ckl(cay, cay.e));
        }
    }

    public final void a(int i) {
        super.a(i);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ckl) arrayList.get(i2)).a.e = 1;
        }
        cbi.z().b(awuz.e());
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atrc atrc = (atrc) obj;
        bsz bsz = this.a;
        atpp[] atppArr = (atpp[]) atrc.c.toArray(new atpp[0]);
        aucx aucx = atrc.b;
        atqk atqk = atrc.a;
        if (atqk == null) {
            atqk = atqk.c;
        }
        atpr atpr = atqk.b;
        if (atpr == null) {
            atpr = atpr.b;
        }
        cju.a(bsz, atppArr, aucx, atpr, 11);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ckl ckl = (ckl) arrayList.get(i);
            cay cay = ckl.a;
            cay.f = ckl.b;
            cay.e = 1;
        }
    }
}
