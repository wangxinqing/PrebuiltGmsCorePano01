package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: fvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fvp implements Comparator {
    public static final Comparator a = new fvp();

    private fvp() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).b.compareTo(((Scope) obj2).b);
    }
}
