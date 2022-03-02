package defpackage;

import com.google.android.pano.widget.ScrollAdapterView;

/* renamed from: akgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgo extends akhh {
    final /* synthetic */ ScrollAdapterView a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akgo(ScrollAdapterView scrollAdapterView) {
        super(2);
        this.a = scrollAdapterView;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        int size = this.a.v.size();
        for (int i = 0; i < size; i++) {
            akgp akgp = (akgp) this.a.v.get(i);
            b(akgp.c, akgp.a);
        }
    }
}
