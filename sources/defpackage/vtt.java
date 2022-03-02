package defpackage;

import android.os.Bundle;
import com.google.android.gms.nearby.sharing.TextAttachment;

/* renamed from: vtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vtt {
    public int a = 0;
    private final String b;
    private final int c;

    public vtt(String str) {
        this.b = str;
        this.c = str.getBytes().length;
    }

    public final TextAttachment a() {
        return new TextAttachment(this.b, this.a, (long) this.c, new Bundle());
    }
}
