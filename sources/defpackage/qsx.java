package defpackage;

import android.database.Cursor;

/* renamed from: qsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsx {
    static final String[] a = {"_ID", "MEDIA_TYPE"};
    public static final /* synthetic */ int c = 0;
    public final jjj b;

    public qsx(jjj jjj) {
        iva.a((Object) jjj);
        this.b = jjj;
    }

    public final Cursor a() {
        return this.b.getReadableDatabase().query(false, "IntermediateStore", a, (String) null, (String[]) null, (String) null, (String) null, "_ID DESC", (String) null);
    }
}
