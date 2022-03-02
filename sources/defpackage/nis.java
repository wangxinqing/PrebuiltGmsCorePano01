package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutorService;

/* renamed from: nis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nis {
    public final String m;
    public final int n;

    public nis(int i, String str) {
        this.n = i;
        this.m = str;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context);

    /* access modifiers changed from: protected */
    public abstract void a(Status status);

    /* access modifiers changed from: protected */
    public ExecutorService j() {
        return null;
    }
}
