package defpackage;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: ctv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctv extends ej {
    public ctv() {
        super(5, 6);
    }

    public final void a(di diVar) {
        diVar.b("CREATE TABLE IF NOT EXISTS `per_device_dismissed_onboarding_flow` (`dismissalId` INTEGER NOT NULL, PRIMARY KEY(`dismissalId`))");
        Cursor a = diVar.a("SELECT * FROM `dismissed_onboarding_flow`");
        while (a.moveToNext()) {
            Long valueOf = Long.valueOf(a.getLong(a.getColumnIndex("dismissalId")));
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissalId", valueOf);
            diVar.a.insertWithOnConflict("per_device_dismissed_onboarding_flow", (String) null, contentValues, 4);
        }
        a.close();
    }
}
