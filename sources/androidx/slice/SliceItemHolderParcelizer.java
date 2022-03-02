package androidx.slice;

import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SliceItemHolderParcelizer {
    private static anv sBuilder = new anv();

    public static SliceItemHolder read(atl atl) {
        SliceItemHolder sliceItemHolder;
        anv anv = sBuilder;
        if (anv.a.size() > 0) {
            ArrayList arrayList = anv.a;
            sliceItemHolder = (SliceItemHolder) arrayList.remove(arrayList.size() - 1);
        } else {
            sliceItemHolder = new SliceItemHolder(anv);
        }
        sliceItemHolder.c = atl.b(sliceItemHolder.c, 1);
        sliceItemHolder.d = atl.b(sliceItemHolder.d, 2);
        sliceItemHolder.e = atl.b(sliceItemHolder.e, 3);
        sliceItemHolder.f = atl.b(sliceItemHolder.f, 4);
        long j = sliceItemHolder.g;
        if (atl.b(5)) {
            j = atl.e();
        }
        sliceItemHolder.g = j;
        return sliceItemHolder;
    }

    public static void write(SliceItemHolder sliceItemHolder, atl atl) {
        atl.a(true, true);
        atq atq = sliceItemHolder.c;
        if (atq != null) {
            atl.a(atq, 1);
        }
        Parcelable parcelable = sliceItemHolder.d;
        if (parcelable != null) {
            atl.a(parcelable, 2);
        }
        String str = sliceItemHolder.e;
        if (str != null) {
            atl.a(str, 3);
        }
        int i = sliceItemHolder.f;
        if (i != 0) {
            atl.a(i, 4);
        }
        long j = sliceItemHolder.g;
        if (j != 0) {
            atl.c(5);
            atl.a(j);
        }
    }
}
