package defpackage;

import android.text.TextUtils;

/* renamed from: ycr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycr {
    private final StringBuilder a = new StringBuilder();
    private boolean b = false;

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.append(str);
        }
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.b) {
                this.a.append(" AND ");
            }
            this.a.append(str);
            this.b = true;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
