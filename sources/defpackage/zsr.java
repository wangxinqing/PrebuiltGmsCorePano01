package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.R;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsr {
    private final Context a;

    public zsr(Context context) {
        this.a = context;
    }

    public final Set a() {
        BufferedReader bufferedReader;
        IOException e;
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
                } catch (IOException e2) {
                    e = e2;
                    try {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                        sb.append("Failed to read blacklist from file ");
                        sb.append(valueOf);
                        Log.e("LoadBlacklist", sb.toString());
                        jjt.a((Closeable) bufferedReader);
                        return hashSet;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                    }
                }
            }
        } catch (IOException e3) {
            IOException iOException = e3;
            bufferedReader = null;
            e = iOException;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
            sb2.append("Failed to read blacklist from file ");
            sb2.append(valueOf2);
            Log.e("LoadBlacklist", sb2.toString());
            jjt.a((Closeable) bufferedReader);
            return hashSet;
        } catch (Throwable th2) {
            th = th2;
            jjt.a((Closeable) bufferedReader2);
            throw th;
        }
        jjt.a((Closeable) bufferedReader);
        return hashSet;
    }
}
