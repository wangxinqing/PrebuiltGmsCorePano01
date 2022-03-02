package defpackage;

import android.content.ContentValues;

/* renamed from: hjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjd extends hjc {
    public hjd(String str, hmj hmj) {
        super(2, str, hmj);
    }

    public final amri a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", this.b);
        contentValues.put("idx_origin", ((hmj) this.c).c);
        contentValues.put("idx_signon_realm", ((hmj) this.c).b);
        contentValues.put("idx_username", ((hmj) this.c).e);
        return amri.b(contentValues);
    }
}
