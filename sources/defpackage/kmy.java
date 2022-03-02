package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Date;
import org.json.JSONException;

/* renamed from: kmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kmy extends kqi {
    public static final Date a = new Date(0);
    private static final ith ap = new ith("EntryRow", "");
    public String A;
    public String B;
    public String C;
    public String D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public Date L;
    public Date M;
    public amzy N;
    public kpd O;
    public String P;
    public String Q;
    public String R;
    public kpy S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public String ai;
    public long aj;
    public long ak;
    public boolean al;
    public Date b;
    public Date c;
    public Date d;
    public Date e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public kmy(kqg kqg, long j2, boolean z2) {
        super(kqg, knf.a, z2);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.l = null;
        this.m = null;
        this.y = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = 0;
        this.K = 0;
        Date date = a;
        this.L = date;
        this.M = date;
        this.N = amzy.h();
        this.O = kpd.UNPINNED;
        this.P = "";
        this.Q = "owner";
        this.R = null;
        this.S = kpy.UNTRASHED;
        this.ae = j2;
    }

    public final kqy a() {
        return kne.ENTRY_ID.aB.e(this.ae);
    }

    /* access modifiers changed from: protected */
    public final void b(ContentValues contentValues) {
        boolean z2;
        Long l2;
        Long l3;
        Long l4;
        if (this.ae >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2, (Object) "Must set entry ID before persisting");
        contentValues.put(kne.ENTRY_ID.aB.a(), Long.valueOf(this.ae));
        contentValues.put(kne.DELETED_ON_SERVER_TIME.aB.a(), this.f);
        contentValues.put(kne.SEQUENCE_NUMBER.aB.a(), Long.valueOf(this.aj));
        contentValues.put(kne.LAST_SYNC_SEQUENCE_NUMBER.aB.a(), Long.valueOf(this.ak));
        contentValues.put(kne.SUBSCRIBED.aB.a(), Boolean.valueOf(this.I));
        contentValues.put(kne.APPDATA_OWNER_SDK_APP_ID.aB.a(), this.x);
        contentValues.put(kne.IN_DRIVE_SPACE.aB.a(), Boolean.valueOf(this.Z));
        contentValues.put(kne.IN_PHOTOS_SPACE.aB.a(), Boolean.valueOf(this.aa));
        contentValues.put(kne.IS_DELETED.aB.a(), Boolean.valueOf(this.E));
        contentValues.put(kne.IS_DELETED_ACTION_ID.aB.a(), this.h);
        contentValues.put(kne.TITLE.aB.a(), this.P);
        contentValues.put(kne.STARRED.aB.a(), Boolean.valueOf(this.H));
        contentValues.put(kne.SHARED.aB.a(), Boolean.valueOf(this.G));
        contentValues.put(kne.TRASHED.aB.a(), Long.valueOf(this.S.d));
        contentValues.put(kne.PINNED.aB.a(), Long.valueOf(this.O.d));
        contentValues.put(kne.IS_DOWNLOADABLE.aB.a(), Boolean.valueOf(this.W));
        contentValues.put(kne.CAN_EDIT.aB.a(), Boolean.valueOf(this.T));
        contentValues.put(kne.CREATION_DATE.aB.a(), Long.valueOf(this.L.getTime()));
        contentValues.put(kne.LAST_MODIFIED_DATE.aB.a(), Long.valueOf(this.M.getTime()));
        Date date = this.b;
        Long l5 = null;
        if (date != null) {
            l2 = Long.valueOf(date.getTime());
        } else {
            l2 = null;
        }
        Date date2 = this.e;
        if (date2 != null) {
            l3 = Long.valueOf(date2.getTime());
        } else {
            l3 = null;
        }
        Date date3 = this.c;
        if (date3 != null) {
            l4 = Long.valueOf(date3.getTime());
        } else {
            l4 = null;
        }
        Date date4 = this.d;
        if (date4 != null) {
            l5 = Long.valueOf(date4.getTime());
        }
        contentValues.put(kne.LAST_VIEWED_BY_ME_DATE.aB.a(), l2);
        contentValues.put(kne.SHARED_WITH_ME_DATE.aB.a(), l3);
        contentValues.put(kne.MODIFIED_BY_ME_DATE.aB.a(), l4);
        contentValues.put(kne.RECENCY.aB.a(), l5);
        contentValues.put(kne.RECENCY_REASON.aB.a(), this.y);
        contentValues.put(kne.MIME_TYPE.aB.a(), this.R);
        contentValues.put(kne.ALTERNATE_LINK.aB.a(), this.m);
        contentValues.put(kne.OWNER_NAMES.aB.a(), lbx.a((Collection) this.N));
        contentValues.put(kne.MD5_CHECKSUM.aB.a(), this.v);
        contentValues.put(kne.DESCRIPTION.aB.a(), this.n);
        contentValues.put(kne.IS_COPYABLE.aB.a(), Boolean.valueOf(this.U));
        contentValues.put(kne.EMBED_LINK.aB.a(), this.o);
        contentValues.put(kne.FILE_EXTENSION.aB.a(), this.p);
        contentValues.put(kne.FILE_SIZE.aB.a(), Long.valueOf(this.af));
        contentValues.put(kne.GENOA_FILE_SIZE.aB.a(), this.g);
        contentValues.put(kne.FOLDER_COLOR_RGB.aB.a(), this.q);
        contentValues.put(kne.IS_VIEWED.aB.a(), Boolean.valueOf(this.ac));
        contentValues.put(kne.IS_RESTRICTED.aB.a(), Boolean.valueOf(this.ab));
        contentValues.put(kne.ORIGINAL_FILENAME.aB.a(), this.w);
        contentValues.put(kne.QUOTA_BYTES_USED.aB.a(), Long.valueOf(this.ah));
        contentValues.put(kne.WEB_CONTENT_LINK.aB.a(), this.A);
        contentValues.put(kne.WEB_VIEW_LINK.aB.a(), this.B);
        contentValues.put(kne.HAS_THUMBNAIL.aB.a(), Boolean.valueOf(this.V));
        contentValues.put(kne.USER_ROLE.aB.a(), this.Q);
        contentValues.put(kne.CUSTOM_PROPERTIES_COUNT.aB.a(), Integer.valueOf(this.J));
        contentValues.put(kne.HEAD_REVISION_ID.aB.a(), this.r);
        contentValues.put(kne.UNIQUE_IDENTIFIER.aB.a(), this.C);
        contentValues.put(kne.UNIQUE_IDENTIFIER_VERSION.aB.a(), this.D);
        contentValues.put(kne.LOCAL_CONTENT_HASH.aB.a(), this.ai);
        contentValues.put(kne.LOCAL_CONTENT_SIGNATURE.aB.a(), this.u);
        contentValues.put(kne.INSYNC_CONTENT_HASH.aB.a(), this.s);
        contentValues.put(kne.INSYNC_REVISION_ID.aB.a(), this.t);
        contentValues.put(kne.LAST_CONTENT_ACTION_ID.aB.a(), this.i);
        contentValues.put(kne.SINGLETON_CREATOR_SDK_APP_ID.aB.a(), this.z);
        contentValues.put(kne.SHARING_USER.aB.a(), this.k);
        contentValues.put(kne.LAST_MODIFYING_USER.aB.a(), this.j);
        contentValues.put(kne.WRITERS_CAN_SHARE.aB.a(), Boolean.valueOf(this.ad));
        contentValues.put(kne.UNSUBSCRIBED_ON_SERVER_TIME.aB.a(), this.l);
        contentValues.put(kne.HAS_GENOA_VALUES.aB.a(), Boolean.valueOf(this.F));
        contentValues.put(kne.VERSION.aB.a(), Long.valueOf(this.K));
        contentValues.put(kne.IS_GOOGLE_PHOTOS.aB.a(), Boolean.valueOf(this.X));
        contentValues.put(kne.IS_GOOGLE_PHOTOS_ROOT_FOLDER.aB.a(), Boolean.valueOf(this.Y));
        contentValues.put(kne.PERMISSION_VERSION.aB.a(), Long.valueOf(this.ag));
    }

    public final boolean b() {
        return this.x != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.f != null;
    }

    public final boolean e() {
        return this.R.equals("application/vnd.google-apps.folder");
    }

    public final void a(String str) {
        iva.a((Object) str);
        this.R = str;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f = Long.valueOf(System.currentTimeMillis());
    }

    public final void a(String str, String str2) {
        boolean z2;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (str2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (isEmpty == z2) {
            this.C = str;
            this.z = str2;
            return;
        }
        throw new IllegalArgumentException(String.format("An entry must have both uniqueIdentifier & singletonCreatorSdkAppId or none, provided values: %s & %s", new Object[]{str, str2}));
    }

    public kmy(kqg kqg, Cursor cursor) {
        this(kqg, kne.ENTRY_ID.aB.b(cursor).longValue(), true);
        amzy amzy;
        a(kne.MIME_TYPE.aB.a(cursor));
        this.P = kne.TITLE.aB.a(cursor);
        this.L = new Date(kne.CREATION_DATE.aB.b(cursor).longValue());
        this.m = kne.ALTERNATE_LINK.aB.a(cursor);
        try {
            Collection a2 = lbx.a(kne.OWNER_NAMES.aB.a(cursor));
            if (a2 != null) {
                amzy = amzy.a(a2);
            } else {
                amzy = null;
            }
            this.N = amzy;
        } catch (JSONException e2) {
            ap.b("EntryRow", "Invalid JSON ownerNames string array for row:%d", Long.valueOf(this.ae));
            this.N = null;
        }
        this.M = new Date(kne.LAST_MODIFIED_DATE.aB.b(cursor).longValue());
        Long b2 = kne.LAST_VIEWED_BY_ME_DATE.aB.b(cursor);
        Long b3 = kne.SHARED_WITH_ME_DATE.aB.b(cursor);
        Long b4 = kne.MODIFIED_BY_ME_DATE.aB.b(cursor);
        Long b5 = kne.RECENCY.aB.b(cursor);
        if (b2 != null) {
            this.b = new Date(b2.longValue());
        }
        if (b3 != null) {
            this.e = new Date(b3.longValue());
        }
        if (b4 != null) {
            this.c = new Date(b4.longValue());
        }
        if (b5 != null) {
            this.d = new Date(b5.longValue());
        }
        this.y = kne.RECENCY_REASON.aB.a(cursor);
        this.H = kne.STARRED.aB.d(cursor).booleanValue();
        this.G = kne.SHARED.aB.d(cursor).booleanValue();
        a(kpy.a(kne.TRASHED.aB.b(cursor).longValue()));
        long longValue = kne.PINNED.aB.b(cursor).longValue();
        for (kpd kpd : kpd.values()) {
            if (kpd.d == longValue) {
                a(kpd);
                this.W = kne.IS_DOWNLOADABLE.aB.d(cursor).booleanValue();
                this.T = kne.CAN_EDIT.aB.d(cursor).booleanValue();
                this.aj = kne.SEQUENCE_NUMBER.aB.c(cursor);
                this.ak = kne.LAST_SYNC_SEQUENCE_NUMBER.aB.c(cursor);
                this.v = kne.MD5_CHECKSUM.aB.a(cursor);
                this.ai = kne.LOCAL_CONTENT_HASH.aB.a(cursor);
                this.u = kne.LOCAL_CONTENT_SIGNATURE.aB.a(cursor);
                this.n = kne.DESCRIPTION.aB.a(cursor);
                this.U = kne.IS_COPYABLE.aB.f(cursor);
                this.o = kne.EMBED_LINK.aB.a(cursor);
                this.p = kne.FILE_EXTENSION.aB.a(cursor);
                this.af = kne.FILE_SIZE.aB.c(cursor);
                this.g = kne.GENOA_FILE_SIZE.aB.b(cursor);
                this.q = kne.FOLDER_COLOR_RGB.aB.a(cursor);
                this.ac = kne.IS_VIEWED.aB.f(cursor);
                this.ab = kne.IS_RESTRICTED.aB.f(cursor);
                this.w = kne.ORIGINAL_FILENAME.aB.a(cursor);
                this.ah = kne.QUOTA_BYTES_USED.aB.b(cursor).longValue();
                this.A = kne.WEB_CONTENT_LINK.aB.a(cursor);
                this.B = kne.WEB_VIEW_LINK.aB.a(cursor);
                this.V = kne.HAS_THUMBNAIL.aB.f(cursor);
                this.x = kne.APPDATA_OWNER_SDK_APP_ID.aB.a(cursor);
                b(kne.USER_ROLE.aB.a(cursor));
                this.E = kne.IS_DELETED.aB.e(cursor);
                this.h = kne.IS_DELETED_ACTION_ID.aB.b(cursor);
                this.J = kne.CUSTOM_PROPERTIES_COUNT.aB.b(cursor).intValue();
                this.r = kne.HEAD_REVISION_ID.aB.a(cursor);
                this.s = kne.INSYNC_CONTENT_HASH.aB.a(cursor);
                this.t = kne.INSYNC_REVISION_ID.aB.a(cursor);
                this.i = kne.LAST_CONTENT_ACTION_ID.aB.b(cursor);
                a(kne.UNIQUE_IDENTIFIER.aB.a(cursor), kne.SINGLETON_CREATOR_SDK_APP_ID.aB.a(cursor));
                this.D = kne.UNIQUE_IDENTIFIER_VERSION.aB.a(cursor);
                this.k = kne.SHARING_USER.aB.b(cursor);
                this.j = kne.LAST_MODIFYING_USER.aB.b(cursor);
                this.ad = kne.WRITERS_CAN_SHARE.aB.e(cursor);
                this.F = kne.HAS_GENOA_VALUES.aB.e(cursor);
                this.K = kne.VERSION.aB.b(cursor).longValue();
                this.X = kne.IS_GOOGLE_PHOTOS.aB.e(cursor);
                this.Y = kne.IS_GOOGLE_PHOTOS_ROOT_FOLDER.aB.e(cursor);
                this.Z = kne.IN_DRIVE_SPACE.aB.e(cursor);
                this.aa = kne.IN_PHOTOS_SPACE.aB.e(cursor);
                this.f = kne.DELETED_ON_SERVER_TIME.aB.b(cursor);
                this.I = kne.SUBSCRIBED.aB.d(cursor).booleanValue();
                this.l = kne.UNSUBSCRIBED_ON_SERVER_TIME.aB.b(cursor);
                this.ag = kne.PERMISSION_VERSION.aB.b(cursor).longValue();
                return;
            }
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Unaccepted PinnedState sql value ");
        sb.append(longValue);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(kpd kpd) {
        iva.a((Object) kpd);
        this.O = kpd;
    }

    public final void a(kpy kpy) {
        iva.a((Object) kpy);
        this.S = kpy;
    }

    public final void b(String str) {
        if (str == null || str.equals("owner") || str.equals("reader") || str.equals("writer")) {
            this.Q = str;
            return;
        }
        throw new IllegalArgumentException(str.length() == 0 ? new String("Unaccepted user role value ") : "Unaccepted user role value ".concat(str));
    }
}
