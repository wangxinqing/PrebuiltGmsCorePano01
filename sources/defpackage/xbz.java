package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: xbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbz extends xbw {
    public static final String[] o = {"contact_id"};

    public xbz(Context context, xbf xbf, Bundle bundle) {
        super(context, xbf, bundle);
    }

    /* access modifiers changed from: protected */
    public final xbp a(xbv xbv, xbv xbv2, Cursor cursor) {
        iva.a((Object) xbv);
        iva.a((Object) cursor);
        ych ych = new ych();
        ych ych2 = new ych();
        HashMap hashMap = new HashMap();
        this.e.a("people-map start");
        xbw.a(xbv, hashMap);
        this.e.a("people-map finish");
        ycu ycu = new ycu();
        ycg ycg = new ycg();
        HashMap hashMap2 = new HashMap();
        xbw.b(xbv2, hashMap2);
        this.e.a("contact-map start");
        xbw.a(cursor, ycu, ycg, hashMap2);
        this.e.a("contact-map finish");
        this.e.a("merge start");
        ArrayList a = jhx.a();
        xbv.c = -1;
        while (xbv.a()) {
            int i = xbv.c;
            String a2 = xbv.a("gaia_id");
            ych.a(i);
            a.add(a2);
            if (a2 == null || ycu.a(a2) == 0) {
                ych2.b();
            } else {
                ych2.a(ycu, a2);
            }
        }
        cursor.moveToPosition(0);
        while (!cursor.isAfterLast()) {
            int position = cursor.getPosition();
            int a3 = ycg.a(position);
            if (a3 == 0) {
                ych.b();
                ych2.a(position);
                a.add((Object) null);
            } else {
                for (int i2 = 0; i2 < a3; i2++) {
                    String a4 = ycg.a(position, i2);
                    if (!hashMap.containsKey(a4)) {
                        ych.b();
                        ych2.a(position);
                        a.add(a4);
                    }
                }
            }
            xbr.a(cursor);
        }
        this.e.a("merge finish");
        return new xbp(xbv.a, cursor, this.b, ych.a(), ych, ych2, a, hashMap2, this.c);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Cursor b() {
        Cursor cursor;
        if (!xbw.l) {
            ycr ycr = new ycr();
            xbr.a(ycr, this.b);
            xbr.a(ycr);
            this.e.a("lookup start");
            Cursor query = this.b.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI.buildUpon().appendPath((String) null).appendQueryParameter("limit", Integer.toString(100)).build(), o, "(data1 IS NOT NULL AND data1!='')", (String[]) null, (String) null);
            Cursor query2 = this.b.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI.buildUpon().appendPath((String) null).appendQueryParameter("limit", Integer.toString(100)).build(), o, "(data1 IS NOT NULL AND data1!='')", (String[]) null, (String) null);
            MergeCursor mergeCursor = new MergeCursor(new Cursor[]{new xby(query), new xby(query2)});
            try {
                int count = mergeCursor.getCount();
                this.e.a("lookup finish");
                if (count != 0) {
                    ycr.b("contact_id IN (");
                    String str = "";
                    while (mergeCursor.moveToNext()) {
                        ycr.a(str);
                        ycr.a(Long.toString(mergeCursor.getLong(0)));
                        str = ",";
                    }
                    ycr.a(")");
                    mergeCursor.close();
                    cursor = this.b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, xbr.a, ycr.toString(), (String[]) null, "display_name COLLATE LOCALIZED,contact_id");
                } else {
                    mergeCursor.close();
                    return null;
                }
            } catch (Throwable th) {
                mergeCursor.close();
                throw th;
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            Uri build = xbq.b.buildUpon().appendPath((String) null).appendQueryParameter("visible_contacts_only", "true").build();
            ycr ycr2 = new ycr();
            ycr2.b(xbr.a());
            ycr2.b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.b.getContentResolver().query(build, xbr.a, ycr2.toString(), (String[]) null, "display_name COLLATE LOCALIZED,contact_id");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        return cursor;
    }
}
