package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: dkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dkh extends dkd {
    private static List i = new ArrayList();
    public boolean c;
    public final Set d = new HashSet();
    public boolean e;
    private volatile boolean j;

    public dkh(dmd dmd) {
        super(dmd);
    }

    public static dkh a(Context context) {
        return dmd.a(context).d();
    }

    public final void b() {
    }

    public static void a() {
        synchronized (dkh.class) {
            if (i != null) {
                for (Runnable run : i) {
                    run.run();
                }
                i = null;
            }
        }
    }

    public final dlc a(String str) {
        dlc dlc;
        synchronized (this) {
            dlc = new dlc(this.a, str);
            dlc.r();
        }
        return dlc;
    }
}
