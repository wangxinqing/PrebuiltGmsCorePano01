package defpackage;

import android.os.Bundle;

/* renamed from: ijn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijn {
    public String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (defpackage.jkr.d() != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ijn(java.lang.String r5, boolean r6, boolean r7, int r8, int r9) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "glif_light"
            r1 = 0
            if (r5 == 0) goto L_0x0009
            goto L_0x004a
        L_0x0009:
            awjm r5 = defpackage.awjm.a
            awjn r5 = r5.a()
            boolean r5 = r5.m()
            if (r5 == 0) goto L_0x0023
            java.lang.String r5 = "setupwizard.theme"
            java.lang.String r2 = ""
            java.lang.String r5 = defpackage.jli.a(r5, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x004a
        L_0x0023:
            awjm r5 = defpackage.awjm.a
            awjn r5 = r5.a()
            long r2 = r5.f()
            int r5 = (int) r2
            r2 = 1
            if (r5 == r2) goto L_0x0049
            r2 = 2
            if (r5 == r2) goto L_0x0047
            r2 = 3
            if (r5 == r2) goto L_0x0044
            r2 = 4
            if (r5 == r2) goto L_0x0041
            boolean r5 = defpackage.jkr.d()
            if (r5 == 0) goto L_0x0049
            goto L_0x0047
        L_0x0041:
            java.lang.String r5 = "glif_v3_light"
            goto L_0x004a
        L_0x0044:
            java.lang.String r5 = "glif_v2_light"
            goto L_0x004a
        L_0x0047:
            r5 = r0
            goto L_0x004a
        L_0x0049:
            r5 = r1
        L_0x004a:
            r4.a = r5
            r4.b = r6
            r4.c = r7
            r4.d = r8
            r4.e = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijn.<init>(java.lang.String, boolean, boolean, int, int):void");
    }

    public static ijn a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new ijn(bundle.getString("theme"), bundle.getBoolean("shown_on_keyguard", false), bundle.getBoolean("fixed_window_size", false), bundle.getInt("window_size_x", 0), bundle.getInt("window_size_y", 0));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("theme", this.a);
        bundle.putBoolean("shown_on_keyguard", this.b);
        bundle.putBoolean("fixed_window_size", this.c);
        bundle.putInt("window_size_x", this.d);
        bundle.putInt("window_size_y", this.e);
        return bundle;
    }
}
