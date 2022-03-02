package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: tgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tgu implements Callable {
    private final Cursor a;
    private final int b;

    public tgu(Cursor cursor, int i) {
        this.a = cursor;
        this.b = i;
    }

    public final Object call() {
        return Long.valueOf(this.a.getLong(this.b));
    }
}
