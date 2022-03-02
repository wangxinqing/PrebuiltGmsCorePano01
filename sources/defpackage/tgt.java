package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: tgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tgt implements Callable {
    private final Cursor a;
    private final int b;

    public tgt(Cursor cursor, int i) {
        this.a = cursor;
        this.b = i;
    }

    public final Object call() {
        return this.a.getString(this.b);
    }
}
