package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.List;

/* renamed from: adam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adam {
    public static final jjg a = jjg.a();
    public final adaq b;
    public final Context c;

    public adam(Context context) {
        this.c = context;
        this.b = adaq.a(context);
    }

    public final List a(String str) {
        int i;
        try {
            adaq adaq = this.b;
            synchronized (adaq.b) {
                adaq.c();
                i = adaq.b.getInt(adaq.a(str), 0);
            }
            return eim.b(this.c, i, str);
        } catch (eif | IOException e) {
            ((anih) ((anih) a.b()).a("adam", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error getting account change events.");
            return null;
        }
    }
}
