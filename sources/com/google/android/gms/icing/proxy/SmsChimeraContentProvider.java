package com.google.android.gms.icing.proxy;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmsChimeraContentProvider extends plj {
    public static final dvg a;
    private static final String[] b = {"_id", "type", "thread_id", "address", "date", "subject", "body", "read", "content_type", "media_uri"};

    static {
        Uri.parse("content://com.google.android.gms.icing.proxy.sms/appdatasearch/sms");
        dvi a2 = dvj.a();
        a2.b("mmssms");
        a2.a("sms");
        a2.a("uri", false);
        a2.g = "score";
        a2.h = "date";
        if (!TextUtils.isEmpty("mmssms_tag")) {
            a2.d = "mmssms_tag";
            if (!TextUtils.isEmpty("tag")) {
                a2.f = "tag";
                for (String str : b) {
                    a2.a(str, str);
                }
                a = new dvg("com.google.android.gms.icing.proxy.sms", new dvj[]{a2.a()});
                return;
            }
            throw new IllegalArgumentException("A valid tagCol must be supplied");
        }
        throw new IllegalArgumentException("A valid tagTableName must be supplied");
    }

    public final Cursor a(Uri uri, String[] strArr) {
        return null;
    }

    public final boolean c() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final dvg d() {
        return a;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String e() {
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public final dvf a() {
        poq a2;
        synchronized (this) {
            a2 = poq.a(getContext(), a);
        }
        return a2;
    }
}
