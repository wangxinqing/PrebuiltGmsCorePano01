package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: djg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class djg extends akaw {
    final /* synthetic */ djh a;

    public djg(djh djh) {
        this.a = djh;
    }

    public final void a(akax akax) {
        synchronized (djh.e) {
            WeakReference weakReference = this.a.b;
            if (weakReference != null && weakReference.get() == akax) {
                this.a.b.clear();
                WeakReference weakReference2 = this.a.c;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((akax) obj);
    }
}
