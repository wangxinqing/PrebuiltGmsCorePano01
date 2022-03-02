package defpackage;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;

/* renamed from: zup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zup implements zub {
    private final ContentResolver a;
    private final List b;
    private final ztx c;
    private final String[] d;
    private final String e;
    private zub f;
    private boolean g;
    private int h;
    private int i = 0;

    public zup(ContentResolver contentResolver, Resources resources, List list) {
        this.a = contentResolver;
        this.b = list;
        this.c = new ztx(resources);
        this.f = new zuw();
        Set set = this.c.c;
        set.add("contact_id");
        set.add("lookup");
        set.add("photo_thumb_uri");
        set.add("display_name");
        set.add("phonetic_name");
        set.add("times_contacted");
        set.add("last_time_contacted");
        set.add("raw_contact_id");
        this.d = (String[]) set.toArray(new String[0]);
        this.e = "contact_id,is_super_primary DESC,is_primary DESC,raw_contact_id";
        this.g = true;
    }

    private final void c() {
        Cursor cursor;
        if (!this.f.hasNext() && this.h < this.b.size()) {
            zsg zsg = zux.a;
            this.f.a();
            int min = Math.min(this.h + 25, this.b.size());
            List subList = this.b.subList(this.h, min);
            String format = String.format("contact_id IN (%s)", new Object[]{TextUtils.join(",", subList)});
            this.h = min;
            new Object[1][0] = subList;
            try {
                cursor = this.a.query(ContactsContract.Data.CONTENT_URI, this.d, format, (String[]) null, this.e);
            } catch (SQLiteException e2) {
                if (azfa.g()) {
                    zux.a.a((Throwable) e2, "ContentResolver.query threw an exception");
                } else {
                    zux.a.e("ContentResolver.query threw an exception", e2);
                }
                this.g = false;
                cursor = null;
            }
            this.i++;
            if (cursor == null) {
                zux.a.c("Could not query ContactsProvider; disabled? Give up.");
                this.f = new zuw();
                this.h = this.b.size();
                return;
            }
            this.f = new zuc(cursor, this.c);
        }
    }

    public final void a() {
        zsg zsg = zux.a;
        this.f.a();
    }

    public final boolean b() {
        return this.g && this.f.b();
    }

    public final boolean hasNext() {
        c();
        return this.f.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        c();
        return (zua) this.f.next();
    }
}
