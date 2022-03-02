package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: knl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class knl extends kqq {
    public final knc a;
    public List b;
    public kns c;
    public kns d;
    public kns e;
    private Map f;
    private Map g;
    private Map h;

    public knl(kqg kqg, knc knc, long j) {
        super(kqg, knv.a, j);
        this.b = new ArrayList();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.c = null;
        this.d = null;
        this.e = null;
        iva.a((Object) knc);
        this.a = knc;
        a(knu.STARRED_VALUE, knu.STARRED_ACTION_ID);
        a(knu.VIEWED_VALUE, knu.VIEWED_ACTION_ID);
        a(knu.IN_DRIVE_SPACE_VALUE, knu.IN_DRIVE_SPACE_ACTION_ID);
        a(knu.CAN_EDIT_VALUE, knu.CAN_EDIT_ACTION_ID);
        a(knu.SHARED_VALUE, knu.SHARED_ACTION_ID);
        a(knu.WRITERS_CAN_SHARE_VALUE, knu.WRITERS_CAN_SHARE_ACTION_ID);
        b(knu.CREATION_DATE_VALUE, knu.CREATION_DATE_ACTION_ID);
        b(knu.LAST_MODIFIED_DATE_VALUE, knu.LAST_MODIFIED_DATE_ACTION_ID);
        b(knu.LAST_VIEWED_BY_ME_DATE_VALUE, knu.LAST_VIEWED_BY_ME_DATE_ACTION_ID);
        b(knu.MODIFIED_BY_ME_DATE_VALUE, knu.MODIFIED_BY_ME_DATE_ACTION_ID);
        b(knu.SHARED_WITH_ME_DATE_VALUE, knu.SHARED_WITH_ME_DATE_ACTION_ID);
        c(knu.DESCRIPTION_VALUE, knu.DESCRIPTION_ACTION_ID);
        c(knu.FOLDER_COLOR_RGB_VALUE, knu.FOLDER_COLOR_RGB_ACTION_ID);
        c(knu.MIME_TYPE_VALUE, knu.MIME_TYPE_ACTION_ID);
        c(knu.TITLE_VALUE, knu.TITLE_ACTION_ID);
        c(knu.USER_ROLE_VALUE, knu.USER_ROLE_ACTION_ID);
        kns d2 = kns.d(knu.TRASHED_VALUE, knu.TRASHED_ACTION_ID);
        this.c = d2;
        this.b.add(d2);
        kns e2 = kns.e(knu.QUOTA_BYTES_USED_VALUE, knu.QUOTA_BYTES_USED_ACTION_ID);
        this.d = e2;
        this.b.add(e2);
        kns f2 = kns.f(knu.OWNER_NAMES_VALUE, knu.OWNER_NAMES_ACTION_ID);
        this.e = f2;
        this.b.add(f2);
    }

    public static knl a(kqg kqg, Cursor cursor) {
        return new knl(kqg, knc.a(knu.ENTRY_ID.O.b(cursor).longValue()), cursor);
    }

    private final void b(knu knu, knu knu2) {
        kns b2 = kns.b(knu, knu2);
        this.g.put(knu, b2);
        this.b.add(b2);
    }

    private final void c(knu knu, knu knu2) {
        kns c2 = kns.c(knu, knu2);
        this.h.put(knu, c2);
        this.b.add(c2);
    }

    public final kns d() {
        return (kns) this.h.get(knu.TITLE_VALUE);
    }

    public final kns e() {
        return (kns) this.h.get(knu.USER_ROLE_VALUE);
    }

    public final kns f() {
        return (kns) this.f.get(knu.STARRED_VALUE);
    }

    public final kns g() {
        return (kns) this.h.get(knu.DESCRIPTION_VALUE);
    }

    public final kns h() {
        return (kns) this.g.get(knu.LAST_VIEWED_BY_ME_DATE_VALUE);
    }

    public final kns i() {
        return (kns) this.f.get(knu.VIEWED_VALUE);
    }

    public final kns j() {
        return (kns) this.f.get(knu.IN_DRIVE_SPACE_VALUE);
    }

    public final kns k() {
        return (kns) this.f.get(knu.CAN_EDIT_VALUE);
    }

    public final kns l() {
        return (kns) this.f.get(knu.SHARED_VALUE);
    }

    public final kns m() {
        return (kns) this.g.get(knu.SHARED_WITH_ME_DATE_VALUE);
    }

    public final kns n() {
        return (kns) this.f.get(knu.WRITERS_CAN_SHARE_VALUE);
    }

    public final kns o() {
        return (kns) this.g.get(knu.LAST_MODIFIED_DATE_VALUE);
    }

    public final kns p() {
        return (kns) this.g.get(knu.MODIFIED_BY_ME_DATE_VALUE);
    }

    public final kns q() {
        return (kns) this.g.get(knu.CREATION_DATE_VALUE);
    }

    public final String toString() {
        return String.format(Locale.US, "GenoaValues [entrySpec=%s]", new Object[]{this.a});
    }

    private final void a(knu knu, knu knu2) {
        kns a2 = kns.a((lsb) knu, (lsb) knu2);
        this.f.put(knu, a2);
        this.b.add(a2);
    }

    public final kns b() {
        return (kns) this.h.get(knu.FOLDER_COLOR_RGB_VALUE);
    }

    public final kns c() {
        return (kns) this.h.get(knu.MIME_TYPE_VALUE);
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((kns) list.get(i)).b(contentValues);
        }
        contentValues.put(knu.ENTRY_ID.O.a(), Long.valueOf(this.a.a));
    }

    private knl(kqg kqg, knc knc, Cursor cursor) {
        this(kqg, knc, knv.a.a.b(cursor).longValue());
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((kns) list.get(i)).b(cursor);
        }
    }
}
