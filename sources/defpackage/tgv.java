package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: tgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tgv implements Callable {
    private final Cursor a;
    private final int b;

    public tgv(Cursor cursor, int i) {
        this.a = cursor;
        this.b = i;
    }

    public final Object call() {
        return Boolean.valueOf(this.a.getInt(this.b) != 0);
    }
}
