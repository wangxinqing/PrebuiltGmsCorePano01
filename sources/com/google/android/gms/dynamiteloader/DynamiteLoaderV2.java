package com.google.android.gms.dynamiteloader;

import android.content.Context;
import android.database.Cursor;
import android.os.StrictMode;
import android.util.Log;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DynamiteLoaderV2 extends mdc {
    static {
        bla.a((bkm) new mde(), false);
    }

    public mby loadModule(mby mby, String str, byte[] bArr) {
        Cursor b;
        Context context = (Context) mbz.a(mby);
        Context context2 = null;
        if (context == null) {
            return mbz.a((Object) null);
        }
        try {
            mdg a = mdg.a(context);
            StrictMode.ThreadPolicy a2 = jlg.a();
            try {
                b = mcx.b(a.a, str, false);
                if (b != null) {
                    if (b.moveToFirst()) {
                        if (!Arrays.equals(bArr, b.getBlob(1))) {
                            Log.e("DynamiteLoaderV2Impl", "Module configuration has changed.");
                            b.close();
                            StrictMode.setThreadPolicy(a2);
                            return mbz.a((Object) context2);
                        }
                        context2 = a.a(context, str, b.getInt(0), b);
                        b.close();
                        StrictMode.setThreadPolicy(a2);
                        return mbz.a((Object) context2);
                    }
                }
                Log.e("DynamiteLoaderV2Impl", "Failed to re-retrieve module.");
                if (b != null) {
                    b.close();
                }
                StrictMode.setThreadPolicy(a2);
                return mbz.a((Object) context2);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(a2);
                throw th;
            }
        } catch (Throwable th2) {
            if (!jim.a()) {
                jis.a(context, th2);
            }
            throw th2;
        }
        throw th;
    }

    public mby loadModule2(mby mby, String str, int i, mby mby2) {
        Context context = (Context) mbz.a(mby);
        if (context == null) {
            return mbz.a((Object) null);
        }
        try {
            return loadModule2NoCrashUtils(mby, str, i, mby2);
        } catch (Throwable th) {
            if (!jim.a()) {
                jis.a(context, th);
            }
            throw th;
        }
    }

    public mby loadModule2NoCrashUtils(mby mby, String str, int i, mby mby2) {
        Context context = (Context) mbz.a(mby);
        if (context == null) {
            return mbz.a((Object) null);
        }
        return mbz.a((Object) mdg.a(context).a(context, str, i, (Cursor) mbz.a(mby2)));
    }
}
