package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: xbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xbx extends xbw {
    private static final String[] o = {"contact_id"};

    public xbx(Context context, xbf xbf, Bundle bundle) {
        super(context, xbf, bundle);
    }

    /* access modifiers changed from: protected */
    public final xbp a(xbv xbv, xbv xbv2, Cursor cursor) {
        String str;
        String str2;
        xbv xbv3 = xbv;
        Cursor cursor2 = cursor;
        iva.a((Object) xbv);
        iva.a((Object) cursor);
        ych ych = new ych();
        ych ych2 = new ych();
        HashMap hashMap = new HashMap();
        this.e.a("people-map start");
        xbw.a(xbv3, hashMap);
        this.e.a("people-map finish");
        ycu ycu = new ycu();
        ycg ycg = new ycg();
        HashMap hashMap2 = new HashMap();
        xbw.b(xbv2, hashMap2);
        this.e.a("contact-map start");
        xbw.a(cursor2, ycu, ycg, hashMap2);
        this.e.a("contact-map finish");
        this.e.a("merge start");
        xbv3.c = 0;
        cursor2.moveToPosition(0);
        ArrayList a = jhx.a();
        while (true) {
            int i = 1;
            boolean z = !(xbv3.c >= xbv3.b);
            boolean z2 = !cursor.isAfterLast();
            if (!z && !z2) {
                this.e.a("merge finish");
                return new xbp(xbv3.a, cursor, this.b, ych.a(), ych, ych2, a, hashMap2, this.c);
            }
            if (z) {
                str = xbv3.a("name");
            } else {
                str = null;
            }
            if (z2) {
                str2 = cursor2.getString(1);
            } else {
                str2 = null;
            }
            if (!z || !z2) {
                if (z) {
                    i = -1;
                }
            } else if (TextUtils.isEmpty(str)) {
                i = TextUtils.isEmpty(str2) ? 0 : -1;
            } else if (!TextUtils.isEmpty(str2)) {
                i = this.m.compare(str, str2);
            }
            if (i <= 0) {
                int i2 = xbv3.c;
                String a2 = xbv3.a("gaia_id");
                ych.a(i2);
                a.add(a2);
                if (a2 == null || ycu.a(a2) == 0) {
                    ych2.b();
                } else {
                    ych2.a(ycu, a2);
                }
                xbv.a();
            }
            if (i >= 0) {
                int position = cursor.getPosition();
                int a3 = ycg.a(position);
                if (a3 == 0) {
                    ych.b();
                    ych2.a(position);
                    a.add((Object) null);
                } else {
                    for (int i3 = 0; i3 < a3; i3++) {
                        String a4 = ycg.a(position, i3);
                        if (!hashMap.containsKey(a4)) {
                            ych.b();
                            ych2.a(position);
                            a.add(a4);
                        }
                    }
                }
                xbr.a(cursor);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final Cursor b() {
        String str;
        Cursor cursor;
        if (this.d) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact_id IN(");
            ContentResolver contentResolver = this.b.getContentResolver();
            Uri uri = ContactsContract.Data.CONTENT_URI;
            String[] strArr = o;
            iva.a(this.d);
            DataHolder dataHolder = this.i;
            iva.a((Object) dataHolder);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("data1 IN(");
            xbv xbv = new xbv(dataHolder);
            boolean z = true;
            boolean z2 = true;
            while (xbv.a()) {
                if (!z2) {
                    sb2.append(",");
                }
                DatabaseUtils.appendEscapedSQLString(sb2, xbv.a("value"));
                z2 = false;
            }
            sb2.append(")");
            Cursor query = contentResolver.query(uri, strArr, sb2.toString(), (String[]) null, (String) null);
            if (query == null) {
                str = null;
            } else {
                while (query.moveToNext()) {
                    try {
                        if (!z) {
                            sb.append(",");
                        }
                        sb.append(query.getLong(0));
                        z = false;
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                sb.append(")");
                query.close();
                str = sb.toString();
            }
        } else {
            str = "";
        }
        if (str == null) {
            return null;
        }
        if (xbw.l) {
            int i = Build.VERSION.SDK_INT;
            Uri build = xbq.a.buildUpon().appendQueryParameter("visible_contacts_only", "true").build();
            ycr ycr = new ycr();
            ycr.b(xbr.a());
            ycr.b(str);
            ycr.b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.b.getContentResolver().query(build, xbr.a, ycr.toString(), (String[]) null, "display_name COLLATE LOCALIZED,contact_id");
        } else {
            ycr ycr2 = new ycr();
            xbr.a(ycr2, this.b);
            xbr.a(ycr2);
            ycr2.b(str);
            ycr2.b("(data1 IS NOT NULL AND data1!='')");
            cursor = this.b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, xbr.a, ycr2.toString(), (String[]) null, "display_name COLLATE LOCALIZED,contact_id");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        return cursor;
    }
}
