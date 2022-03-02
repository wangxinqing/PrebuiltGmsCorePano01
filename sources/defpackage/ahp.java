package defpackage;

import android.view.View;
import java.util.Comparator;

/* renamed from: ahp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahp implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float B = qb.B((View) obj);
        float B2 = qb.B((View) obj2);
        if (B <= B2) {
            return B < B2 ? 1 : 0;
        }
        return -1;
    }
}
