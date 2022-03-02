package defpackage;

import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: qpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpz extends awem {
    private final awef b;

    public qpz(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(qpz.class), bapu);
        this.b = aweu.a(awef);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        Uri contentUri = MediaStore.Files.getContentUri("external");
        qsd a = qse.a();
        a.f = 1;
        a.c = contentUri;
        a.d = new String[]{"_id", "media_type"};
        a.a = 0L;
        return aorl.a((Object) ((qsf) obj).a(a.a()));
    }
}
