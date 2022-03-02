package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* renamed from: bahu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahu extends azxj {
    azyx a;

    public final void a(int i, String str) {
        throw null;
    }

    public final void a(int i, String str, Object... objArr) {
        azyx azyx = this.a;
        Level a2 = badt.a(i);
        if (badu.a.isLoggable(a2)) {
            badu.a(azyx, a2, MessageFormat.format(str, objArr));
        }
    }
}
