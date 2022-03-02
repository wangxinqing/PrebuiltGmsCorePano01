package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;

/* renamed from: duk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class duk extends CursorWrapper {
    final /* synthetic */ Bundle a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public duk(Cursor cursor, Bundle bundle) {
        super(cursor);
        this.a = bundle;
    }

    public final Bundle getExtras() {
        return this.a;
    }
}
