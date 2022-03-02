package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* renamed from: lzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class lzl extends lzo {
    private final lzi a = new lzi();
    final /* synthetic */ lzm b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lzl(lzm lzm, String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        super(str, droidGuardResultsRequest);
        this.b = lzm;
    }

    public final Object a() {
        iva.b("This method must not be called on the main thread.");
        lzt lzt = this.b.a;
        this.e.a(2, maf.COARSE);
        lzt.a.offer(this);
        lzt.c.post(lzt);
        try {
            Object a2 = this.a.a((long) this.d.a());
            if (a2 != null) {
                return a2;
            }
            int a3 = this.d.a();
            StringBuilder sb = new StringBuilder(23);
            sb.append("timeout: ");
            sb.append(a3);
            sb.append(" ms");
            return a(sb.toString());
        } catch (InterruptedException e) {
            int a4 = this.d.a();
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("takeWithTimeout(");
            sb2.append(a4);
            sb2.append(") got interrupted");
            return a(sb2.toString());
        }
    }

    public abstract Object a(String str);

    public abstract Object a(lya lya);

    /* access modifiers changed from: protected */
    public final void b(lya lya) {
        this.a.a(a(lya));
    }
}
