package defpackage;

import java.util.Iterator;

/* renamed from: ajvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvn implements ajvu {
    final /* synthetic */ ajvo a;

    public ajvn(ajvo ajvo) {
        this.a = ajvo;
    }

    public final void a(Object obj) {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((ajvu) it.next()).a(obj);
        }
    }
}
