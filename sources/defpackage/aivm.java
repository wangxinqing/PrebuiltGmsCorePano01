package defpackage;

import android.net.Uri;
import android.os.Handler;

/* renamed from: aivm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivm extends qvv {
    final /* synthetic */ aivu a;
    private final ajcl b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aivm(aivu aivu, Handler handler, ajcl ajcl) {
        super("location", "MyContentObserver", handler);
        this.a = aivu;
        this.b = ajcl;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        this.a.b(this.b);
    }
}
