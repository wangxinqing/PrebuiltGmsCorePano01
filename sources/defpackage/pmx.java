package defpackage;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;

/* renamed from: pmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pmx implements pmt {
    private final ContentResolver a;
    private final List b;
    private final pmm c;
    private final String[] d;
    private final String e;
    private pmt f;
    private boolean g;
    private int h;
    private int i = 0;
    private long j = Long.MAX_VALUE;
    private long k;
    private long l;

    public pmx(ContentResolver contentResolver, Resources resources, List list) {
        this.a = contentResolver;
        this.b = list;
        this.c = new pmm(resources);
        this.f = new pne();
        Set set = this.c.b;
        set.add("contact_id");
        set.add("lookup");
        set.add("photo_thumb_uri");
        set.add("display_name");
        set.add("phonetic_name");
        set.add("times_contacted");
        set.add("last_time_contacted");
        set.add("raw_contact_id");
        this.d = (String[]) set.toArray(new String[set.size()]);
        this.e = "contact_id,is_super_primary DESC,is_primary DESC,raw_contact_id";
        this.g = true;
    }

    /* JADX INFO: finally extract failed */
    private final void d() {
        Cursor cursor;
        if (!this.f.hasNext() && this.h < this.b.size()) {
            try {
                if (pnz.a()) {
                    if (this.i > 0) {
                        long b2 = this.f.b();
                        this.j = Math.min(this.j, b2);
                        this.k = Math.max(this.k, b2);
                        this.l += b2;
                        String valueOf = String.valueOf(poz.a(b2));
                        pnz.d(valueOf.length() == 0 ? new String("Closing cursor of size ") : "Closing cursor of size ".concat(valueOf));
                    }
                }
                pnz.d("Closing current iterator");
                this.f.a();
                int min = Math.min(this.h + 25, this.b.size());
                List subList = this.b.subList(this.h, min);
                String format = String.format("contact_id IN (%s)", new Object[]{TextUtils.join(",", subList)});
                this.h = min;
                String valueOf2 = String.valueOf(subList);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 13);
                sb.append("Reading IDs: ");
                sb.append(valueOf2);
                pnz.d(sb.toString());
                try {
                    cursor = this.a.query(ContactsContract.Data.CONTENT_URI, this.d, format, (String[]) null, this.e);
                } catch (SQLiteException e2) {
                    pnz.a((Throwable) e2, "ContentResolver.query threw an exception", new Object[0]);
                    this.g = false;
                    cursor = null;
                }
                this.i++;
                if (cursor == null) {
                    pnz.e("Could not query ContactsProvider; disabled? Give up.");
                    this.f = new pne();
                    this.h = this.b.size();
                    return;
                }
                this.f = new pnf(cursor, this.c);
            } catch (Throwable th) {
                pnz.d("Closing current iterator");
                this.f.a();
                throw th;
            }
        }
    }

    public final void a() {
        pnz.d("BatchingIterator.close()");
        try {
            if (pnz.a() && this.i > 0) {
                this.l += this.f.b();
                String a2 = poz.a(this.j);
                String a3 = poz.a(this.k);
                String a4 = poz.a(this.l / ((long) this.i));
                String a5 = poz.a(this.l);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 42 + String.valueOf(a3).length() + String.valueOf(a4).length() + String.valueOf(a5).length());
                sb.append("Cursor size stats:  min=");
                sb.append(a2);
                sb.append(", max=");
                sb.append(a3);
                sb.append(", avg=");
                sb.append(a4);
                sb.append(", tot=");
                sb.append(a5);
                pnz.a(sb.toString());
            }
        } finally {
            this.f.a();
        }
    }

    public final long b() {
        return this.l;
    }

    public final boolean c() {
        return this.g && this.f.c();
    }

    public final boolean hasNext() {
        d();
        return this.f.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        d();
        return (pms) this.f.next();
    }
}
