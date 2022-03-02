package defpackage;

import android.os.DropBoxManager;

/* renamed from: gxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gxj {
    private final StringBuilder a = new StringBuilder();
    private final int b;
    private final DropBoxManager c;

    public gxj(DropBoxManager dropBoxManager, int i) {
        this.c = dropBoxManager;
        this.b = i;
    }

    public final void a() {
        String sb = this.a.toString();
        if (sb.length() > 0) {
            this.c.addText("event_log", sb);
        }
        this.a.setLength(0);
    }

    public final void a(String str) {
        if (this.a.length() + str.length() > this.b) {
            a();
        }
        this.a.append(str);
    }
}
