package defpackage;

import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: cux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cux implements Runnable {
    private final RepositoryDatabase a;
    private final ExecutorService b;
    private final amsv c;

    public cux(RepositoryDatabase repositoryDatabase, ExecutorService executorService, amsv amsv) {
        this.a = repositoryDatabase;
        this.b = executorService;
        this.c = amsv;
    }

    public final void run() {
        RepositoryDatabase repositoryDatabase = this.a;
        ExecutorService executorService = this.b;
        ((crr) this.c.a()).a.h();
        if (!executorService.isShutdown()) {
            executorService.shutdown();
            try {
                executorService.awaitTermination(2000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
            }
        }
        repositoryDatabase.d();
    }
}
