package defpackage;

/* renamed from: acvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvi implements Runnable {
    final /* synthetic */ acwa a;
    final /* synthetic */ acvj b;

    public acvi(acvj acvj, acwa acwa) {
        this.b = acvj;
        this.a = acwa;
    }

    public final void run() {
        try {
            acwa acwa = (acwa) this.b.a.a(this.a);
            if (acwa != null) {
                acwa.a(acwg.b, (acvv) this.b);
                acwa.a(acwg.b, (acvs) this.b);
                acwa.a(acwg.b, (acvm) this.b);
                return;
            }
            this.b.a((Exception) new NullPointerException("Continuation returned null"));
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
