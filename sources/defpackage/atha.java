package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/* renamed from: atha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atha extends atgh {
    private final atgp a;

    public atha(atgp atgp) {
        this.a = atgp;
    }

    public final int a() {
        return 15;
    }

    public final void a(DataOutputStream dataOutputStream) {
    }

    public final boolean b() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final boolean a(DataInputStream dataInputStream) {
        long readLong = dataInputStream.readLong();
        atgp atgp = this.a;
        if (atfx.a(atgp.a, 4)) {
            String str = atgp.a;
            String valueOf = String.valueOf(Long.toHexString(readLong));
            Log.i(str, valueOf.length() == 0 ? new String("New GMM Server Cookie: ") : "New GMM Server Cookie: ".concat(valueOf));
        }
        synchronized (atgp) {
            atgp.c = Long.valueOf(readLong);
        }
        SharedPreferences.Editor edit = atgp.f.edit();
        edit.putLong("SessionID", readLong);
        StrictMode.ThreadPolicy b = atga.a.b();
        try {
            edit.commit();
            atga.a.a(b);
            return true;
        } catch (Throwable th) {
            atga.a.a(b);
            throw th;
        }
    }
}
