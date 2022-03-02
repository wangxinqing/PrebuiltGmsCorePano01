package defpackage;

import java.util.concurrent.ExecutorService;

@Deprecated
/* renamed from: hcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hcz extends hdd {
    protected final ExecutorService b;

    protected hcz(String str, hdb hdb) {
        this(str, hdb, 500);
    }

    public final void a(hdc hdc) {
        this.b.execute(hdc);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b.shutdown();
    }

    protected hcz(String str, hdb hdb, long j) {
        super(str, hdb, j);
        this.b = jfm.b(10);
    }

    protected hcz(String str, hdb hdb, long j, ExecutorService executorService) {
        super(str, hdb, j);
        this.b = executorService;
    }
}
