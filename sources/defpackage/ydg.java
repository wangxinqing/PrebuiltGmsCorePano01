package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.R;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ydg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydg {
    private final Context a;

    public ydg(Context context) {
        this.a = context;
    }

    public final Set a() {
        BufferedReader bufferedReader;
        Throwable e;
        HashSet hashSet = new HashSet();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.a.getResources().openRawResource(R.raw.romanesco_backup_contacts_blacklist_account_types)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    hashSet.add(readLine);
                } catch (Resources.NotFoundException | IOException e2) {
                    e = e2;
                    try {
                        Log.e("LoadBlacklist", "Failed to read blacklist from file.", e);
                        jjt.a((Closeable) bufferedReader);
                        return hashSet;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        jjt.a((Closeable) bufferedReader2);
                        throw th;
                    }
                }
            }
        } catch (Resources.NotFoundException | IOException e3) {
            Throwable th2 = e3;
            bufferedReader = null;
            e = th2;
            Log.e("LoadBlacklist", "Failed to read blacklist from file.", e);
            jjt.a((Closeable) bufferedReader);
            return hashSet;
        } catch (Throwable th3) {
            th = th3;
            jjt.a((Closeable) bufferedReader2);
            throw th;
        }
        jjt.a((Closeable) bufferedReader);
        return hashSet;
    }
}
