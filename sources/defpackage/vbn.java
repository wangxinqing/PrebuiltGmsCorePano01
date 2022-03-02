package defpackage;

import java.util.Comparator;
import java.util.List;

/* renamed from: vbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vbn implements Comparator {
    final /* synthetic */ vbp a;

    public vbn(vbp vbp) {
        this.a = vbp;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (this.a.f.a((List) ((avae) obj).d) > this.a.f.a((List) ((avae) obj2).d) ? 1 : (this.a.f.a((List) ((avae) obj).d) == this.a.f.a((List) ((avae) obj2).d) ? 0 : -1));
    }
}
