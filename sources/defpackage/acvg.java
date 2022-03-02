package defpackage;

/* renamed from: acvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvg implements Runnable {
    final /* synthetic */ acwa a;
    final /* synthetic */ acvh b;

    public acvg(acvh acvh, acwa acwa) {
        this.b = acvh;
        this.a = acwa;
    }

    public final void run() {
        if (((acwi) this.a).d) {
            this.b.b.g();
            return;
        }
        try {
            this.b.b.a(this.b.a.a(this.a));
        } catch (acvy e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.a((Exception) e.getCause());
            } else {
                this.b.b.a((Exception) e);
            }
        } catch (Exception e2) {
            this.b.b.a(e2);
        }
    }
}
