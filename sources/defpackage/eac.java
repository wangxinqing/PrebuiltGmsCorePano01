package defpackage;

import android.view.View;

/* renamed from: eac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eac extends eaj {
    public eac(String str) {
        super(str);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        ((View) obj).setBottom(i);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((View) obj).getBottom());
    }
}
