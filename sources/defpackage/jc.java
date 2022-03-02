package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;

/* renamed from: jc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jc {
    final Bundle a;
    public final js[] b;
    public boolean c;
    boolean d;
    @Deprecated
    public int e;
    public CharSequence f;
    public PendingIntent g;
    private IconCompat h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jc(int r10, java.lang.CharSequence r11, android.app.PendingIntent r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x000b
            java.lang.String r1 = ""
            android.support.v4.graphics.drawable.IconCompat r0 = android.support.v4.graphics.drawable.IconCompat.a(r0, r1, r10)
            r2 = r0
            goto L_0x000c
        L_0x000b:
            r2 = r0
        L_0x000c:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r6 = 0
            r7 = 1
            r8 = 1
            r1 = r9
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.<init>(int, java.lang.CharSequence, android.app.PendingIntent):void");
    }

    public final IconCompat a() {
        int i;
        if (this.h == null && (i = this.e) != 0) {
            this.h = IconCompat.a((Resources) null, "", i);
        }
        return this.h;
    }

    public jc(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, js[] jsVarArr, boolean z, boolean z2) {
        this.d = true;
        this.h = iconCompat;
        if (iconCompat != null && iconCompat.a() == 2) {
            this.e = iconCompat.c();
        }
        this.f = je.a(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.b = jsVarArr;
        this.c = z;
        this.d = z2;
    }
}
