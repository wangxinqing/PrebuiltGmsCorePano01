package defpackage;

import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import java.util.ArrayList;

/* renamed from: aov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aov {
    private final SliceSpec a;
    public anr f;

    protected aov(anr anr, SliceSpec sliceSpec) {
        this(anr, sliceSpec, (byte[]) null);
    }

    protected static final ArrayList a(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            arrayList.add("no_tint");
        }
        if (i == 2 || i == 4) {
            arrayList.add("large");
        }
        if (i == 3 || i == 4) {
            arrayList.add("raw");
        }
        if (z) {
            arrayList.add("partial");
        }
        return arrayList;
    }

    public abstract void a(anr anr);

    public Slice c() {
        anr anr = this.f;
        anr.b = this.a;
        a(anr);
        return this.f.a();
    }

    protected aov(anr anr, SliceSpec sliceSpec, byte[] bArr) {
        this.f = anr;
        this.a = sliceSpec;
    }
}
