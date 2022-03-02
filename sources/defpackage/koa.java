package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: koa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class koa extends kqq {
    public lcq a;
    public Long b;
    private final long c;

    public koa(kqg kqg, long j, long j2, lcp lcp, String str, Long l, long j3) {
        super(kqg, kod.a, j);
        boolean z;
        boolean z2 = true;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        iva.a((Object) lcp);
        iva.b(j3 < 0 ? false : z2);
        a(str, l, j3);
        this.c = j2;
        this.a = lcq.a(lcp, str, j3);
        this.b = l;
    }

    public static koa a(kqg kqg, Cursor cursor) {
        lcs lcs;
        long j;
        HashSet hashSet;
        boolean z;
        long longValue = koc.ACCOUNT_ID.g.b(cursor).longValue();
        String a2 = koc.NEXT_PAGE_TOKEN.g.a(cursor);
        Long b2 = koc.CLIP_TIME.g.b(cursor);
        long c2 = koc.NUM_PAGES_RETRIEVED.g.c(cursor);
        String a3 = koc.FEED_TYPE.g.a(cursor);
        String a4 = koc.FEED_PARAMETERS.g.a(cursor);
        lcr[] values = lcr.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            lcr lcr = values[i];
            if (!lcr.f.equals(a3)) {
                i++;
            } else {
                int ordinal = lcr.ordinal();
                if (ordinal == 0) {
                    iva.a((Object) a4);
                    String[] split = TextUtils.split(a4, ":");
                    if (split.length != 1) {
                        try {
                            JSONObject jSONObject = new JSONObject(a4);
                            j = jSONObject.getLong("changeStamp");
                            JSONArray jSONArray = jSONObject.getJSONArray("sortedAppIds");
                            hashSet = new HashSet();
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                hashSet.add(jSONArray.getString(i2));
                            }
                        } catch (JSONException e) {
                            throw new RuntimeException("JSON encoding failed", e);
                        }
                    } else {
                        j = Long.parseLong(split[0]);
                        hashSet = new HashSet();
                    }
                    lcs = new lcn(j, hashSet);
                } else if (ordinal == 1) {
                    iva.a((Object) a4);
                    String[] split2 = TextUtils.split(a4, ":");
                    if (split2.length != 1) {
                        try {
                            z = new JSONObject(a4).getBoolean("foldersOnly");
                        } catch (JSONException e2) {
                            throw new RuntimeException("JSON encoding failed", e2);
                        }
                    } else {
                        z = Boolean.parseBoolean(split2[0]);
                    }
                    lcs = new lco(z);
                } else if (ordinal == 2) {
                    iva.a((Object) a4);
                    lcs = lct.a(a4);
                } else if (ordinal == 3) {
                    iva.a((Object) a4);
                    lcs = new lcm(anax.a((Object[]) TextUtils.split(a4, ",")));
                } else if (ordinal == 4) {
                    iva.a((Object) a4);
                    lcs = new lcs();
                } else {
                    throw null;
                }
                return new koa(kqg, kod.a.a.b(cursor).longValue(), longValue, lcs, a2, b2, c2);
            }
        }
        String valueOf = String.valueOf(a3);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown FeedType value: ") : "Unknown FeedType value: ".concat(valueOf));
    }

    public final lcp b() {
        return this.a.a;
    }

    public final boolean c() {
        return this.a.c();
    }

    public final long d() {
        return this.a.b;
    }

    public final String toString() {
        return String.format(Locale.US, "PartialFeed[accountSqlId=%s, clipTime=%s, sqlId=%s, feedState=%s", new Object[]{Long.valueOf(this.c), this.b, Long.valueOf(this.m), this.a});
    }

    private static void a(String str, Long l, long j) {
        boolean z = true;
        if ((str == null && j > 0) != (l == null)) {
            z = false;
        }
        String valueOf = String.valueOf(l);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid nextUri=");
        sb.append(str);
        sb.append(", clipTime=");
        sb.append(valueOf);
        iva.b(z, sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(koc.ACCOUNT_ID.g.a(), Long.valueOf(this.c));
        contentValues.put(koc.FEED_TYPE.g.a(), this.a.a.c.f);
        contentValues.put(koc.FEED_PARAMETERS.g.a(), this.a.a.a());
        contentValues.put(koc.NEXT_PAGE_TOKEN.g.a(), this.a.a());
        contentValues.put(koc.CLIP_TIME.g.a(), this.b);
        contentValues.put(koc.NUM_PAGES_RETRIEVED.g.a(), Long.valueOf(this.a.b));
    }

    public final void a(String str, Long l) {
        a(str, l, this.a.b + 1);
        this.a = lcq.a(this.a, str);
        this.b = l;
    }
}
