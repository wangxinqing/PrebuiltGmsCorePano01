package defpackage;

/* renamed from: lid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lid implements lgu {
    final /* synthetic */ lih a;
    private lgx b;

    public lid(lih lih) {
        this.a = lih;
    }

    public final synchronized lgw a() {
        lgw lgw;
        lgx lgx = this.b;
        if (lgx == null) {
            lih.a.c("PinnedContentDownloader", "Connection state is not initialized.");
            lgw = lgw.DISCONNECTED;
        } else {
            lgw = lgx.a;
        }
        return lgw;
    }

    public final synchronized boolean b() {
        boolean z;
        lgx lgx = this.b;
        if (lgx == null) {
            lih.a.c("PinnedContentDownloader", "Connection state is not initialized.");
            z = false;
        } else {
            z = lgx.b;
        }
        return z;
    }

    public final /* bridge */ /* synthetic */ void a(lgv lgv) {
        lgx lgx = (lgx) lgv;
        synchronized (this) {
            if (this.b != null && lgx.b) {
                lih lih = this.a;
                lih.e.submit(lih.d);
            }
            this.b = lgx;
        }
        synchronized (this.a.g) {
            for (lif a2 : this.a.g.values()) {
                a2.a();
            }
        }
    }
}
