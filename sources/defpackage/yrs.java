package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrs {
    private static final Bundle b;
    public final zdb a;
    private final izb c;

    static {
        Bundle bundle = new Bundle();
        b = bundle;
        bundle.putBoolean("force", true);
    }

    public yrs(izb izb, zdb zdb) {
        this.c = izb;
        this.a = zdb;
        izb.g = 6400;
    }

    public static String a() {
        return String.format("people/%1$s/moments/%2$s", new Object[]{a("me"), a("vault")});
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    public static final void a(Context context, ClientContext clientContext, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", a());
        contentValues.put("packageName", clientContext.f);
        contentValues.put("accountName", clientContext.b());
        contentValues.put("payload", str);
        contentResolver.insert(yty.a, contentValues);
        ContentResolver.requestSync(new Account(clientContext.b(), "com.google"), "com.google.android.gms.plus.action", b);
    }

    public final void a(ClientContext clientContext, String str, String str2) {
        try {
            this.c.a(clientContext, -1, str, new JSONObject(str2));
        } catch (JSONException e) {
            Log.e("FramesAgent", "Error parsing JSON", e);
        }
    }
}
