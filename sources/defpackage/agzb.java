package defpackage;

import android.system.Os;
import java.util.concurrent.Callable;

/* renamed from: agzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agzb implements Callable {
    private final String a;

    public agzb(String str) {
        this.a = str;
    }

    public final Object call() {
        return Os.lstat(this.a);
    }
}
