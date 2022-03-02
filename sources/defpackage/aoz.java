package defpackage;

import android.content.Context;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.slice.SliceItemHolder;

/* renamed from: aoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoz implements anu {
    final /* synthetic */ Context a;

    public aoz(Context context) {
        this.a = context;
    }

    public final void a(SliceItemHolder sliceItemHolder, String str) {
        atq atq = sliceItemHolder.c;
        if (atq instanceof IconCompat) {
            IconCompat iconCompat = (IconCompat) atq;
            iconCompat.b(this.a);
            if (iconCompat.a() == 2 && iconCompat.c() == 0) {
                sliceItemHolder.c = null;
            }
        }
    }
}
