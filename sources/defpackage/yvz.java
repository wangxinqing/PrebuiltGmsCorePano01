package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Post;

/* renamed from: yvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvz extends irq {
    private final ConnectionResult a;
    private final Post b;

    public yvz(ywg ywg, yus yus, ConnectionResult connectionResult, Post post) {
        super(ywg, yus);
        this.a = connectionResult;
        this.b = post;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yus) obj).a(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
