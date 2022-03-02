package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: avq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avq extends Paint {
    public avq() {
    }

    public final void setTextLocales(LocaleList localeList) {
    }

    public avq(int i) {
        super(i);
    }

    public avq(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public avq(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
