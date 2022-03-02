package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: qly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qly extends jba {
    private final qlx a;
    private final ifu d;
    private final PackageInfo e;

    public qly(qlx qlx, ifu ifu, PackageInfo packageInfo) {
        super(121, "DeleteAppStorageOperation");
        this.a = qlx;
        this.d = ifu;
        this.e = packageInfo;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        try {
            this.a.a(this.e.packageName);
            this.d.a(Status.a);
        } catch (IOException e2) {
            qmb.a.b(e2, "Delete failed.", new Object[0]);
            this.d.a(Status.c);
        }
    }
}
