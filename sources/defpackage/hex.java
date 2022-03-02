package defpackage;

import android.content.Context;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.config.InvalidConfigException;
import java.nio.charset.CharacterCodingException;

/* renamed from: hex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hex {
    public boolean a = false;

    public final boolean a(Context context, Throwable th) {
        if ((!(th instanceof Exception) || (th instanceof InvalidConfigException)) && (!th.getClass().equals(Error.class) || !(th.getCause() instanceof CharacterCodingException))) {
            return false;
        }
        if (!this.a) {
            jis.a(context, th, JGCastService.FLAG_PRIVATE_DISPLAY);
            this.a = true;
        }
        return true;
    }
}
