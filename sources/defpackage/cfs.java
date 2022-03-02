package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import java.util.Comparator;

/* renamed from: cfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfs implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((ContextData) obj).j().c() - ((ContextData) obj2).j().c());
    }
}
