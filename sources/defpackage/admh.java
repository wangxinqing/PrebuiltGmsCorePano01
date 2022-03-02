package defpackage;

import android.os.RecoverySystem;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: admh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class admh implements Callable {
    private final admj a;

    public admh(admj admj) {
        this.a = admj;
    }

    public final Object call() {
        admj admj = this.a;
        try {
            RecoverySystem.installPackage(admj.i, new File((String) admj.a(admj.e)));
            return null;
        } catch (Exception e) {
            admj.a(e);
            return null;
        }
    }
}
