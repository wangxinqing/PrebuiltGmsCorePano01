package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;

/* renamed from: xvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class xvx {
    public final Uri a;
    public final xwp b;
    private final yaz c;

    public xvx(Uri uri, xwp xwp, yaz yaz) {
        this.a = uri;
        this.b = xwp;
        this.c = yaz;
    }

    public final int a(Uri uri, ContentValues contentValues, Long l, Integer num, boolean z) {
        ContentProviderOperation.Builder withValues = ContentProviderOperation.newInsert(uri).withValues(contentValues);
        if (l != null) {
            withValues.withValue("raw_contact_id", l);
        }
        if (num != null) {
            withValues.withValueBackReference("raw_contact_id", num.intValue());
        }
        int a2 = this.b.a(withValues, z);
        ((ybh) this.c).a.stats.numInserts++;
        return a2;
    }

    public final int a(Uri uri, ContentValues contentValues, boolean z) {
        String[] strArr = xvw.a;
        return a(uri, contentValues, (Long) null, (Integer) null, z);
    }

    public final void a(Uri uri, long j, String str, Long l) {
        this.b.a(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(uri, j)).withValue(str, l).withExpectedCount(1), false);
    }

    public final void a(Uri uri, Long l, ContentValues contentValues, boolean z) {
        a(uri, l, contentValues, z, true);
    }

    public final void a(Uri uri, Long l, ContentValues contentValues, boolean z, boolean z2) {
        ContentProviderOperation.Builder withValues = ContentProviderOperation.newUpdate(uri).withValues(contentValues);
        if (l != null) {
            String valueOf = String.valueOf(l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
            sb.append("_id=");
            sb.append(valueOf);
            String sb2 = sb.toString();
            String[] strArr = xvw.a;
            withValues.withSelection(sb2, (String[]) null);
        }
        this.b.a(withValues, z);
        if (z2) {
            ((ybh) this.c).a.stats.numUpdates++;
        }
    }

    public final void a(Uri uri, String str, Long l) {
        a(uri, str, l, false);
    }

    public final void a(Uri uri, String str, Long l, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str, Integer.valueOf(z ? 1 : 0));
        xip.a();
        a(uri, l, contentValues, ((Boolean) xfu.a.a()).booleanValue());
    }

    public final void a(Uri uri, String str, String str2) {
        this.b.a(ContentProviderOperation.newAssertQuery(uri).withSelection(str.concat("=?"), new String[]{str2}).withExpectedCount(0), false);
    }

    public final void a(Long l, ContentValues contentValues) {
        a(this.a, l, contentValues, false);
    }

    public final void a(Long l, boolean z) {
        this.b.a(ContentProviderOperation.newDelete(ContentUris.withAppendedId(this.a, l.longValue())), z);
        ((ybh) this.c).a.stats.numDeletes++;
    }
}
