package defpackage;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.ArrayList;

/* renamed from: aot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aot extends aov {
    public aop a;
    public SliceItem b;
    public SliceItem c;
    public Slice d;
    public final ArrayList e = new ArrayList();

    public aot(anr anr) {
        super(anr, (SliceSpec) null);
    }

    public final void a(anr anr) {
        Slice slice = this.d;
        if (slice != null) {
            anr.a(slice);
        }
        SliceItem sliceItem = this.b;
        if (sliceItem != null) {
            anr.a(sliceItem);
        }
        SliceItem sliceItem2 = this.c;
        if (sliceItem2 != null) {
            anr.a(sliceItem2);
        }
        for (int i = 0; i < this.e.size(); i++) {
            anr.a((Slice) this.e.get(i));
        }
        aop aop = this.a;
        if (aop != null) {
            aop.a(anr);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return (this.b == null && this.c == null) ? false : true;
    }
}
